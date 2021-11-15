package my_spring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {

    private static ObjectFactory instance = new ObjectFactory();
    private Config config = new JavaConfig();
    private List<ObjectConfigurator> configurators = new ArrayList<>();
    private Reflections scanner = new Reflections("my_spring");

    @SneakyThrows
    private ObjectFactory() {
        Set<Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> aClass : classes) {
            ObjectConfigurator objectConfigurator = create(aClass);
            configurators.add(objectConfigurator);
        }

    }

    public static ObjectFactory getInstance() {
        return instance;
    }



    @SneakyThrows
    public <T> T createObject(Class<T> type) {

        type = resolveImpl(type);

        T t = create(type);

        for (ObjectConfigurator configurator : configurators) {
            configurator.configure(t);
        }


        return t;
    }

    private <T> T create(Class<T> type) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        T t = type.getDeclaredConstructor().newInstance();
        return t;
    }

    private <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }
        return type;
    }


}
