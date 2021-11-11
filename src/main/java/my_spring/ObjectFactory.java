package my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {

    private static ObjectFactory instance = new ObjectFactory();
    private Config config = new JavaConfig();

    private ObjectFactory() {
    }

    public static ObjectFactory getInstance() {
        return instance;
    }


    @SneakyThrows
    public <T> T createObject(Class<T> type) {


        type = resolveImpl(type);

        T t = create(type);


        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
                int value = random.nextInt(max-min)+min;
                field.setAccessible(true);
                field.set(t,666);

            }
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
