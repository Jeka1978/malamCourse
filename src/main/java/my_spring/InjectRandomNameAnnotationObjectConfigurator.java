package my_spring;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomNameAnnotationObjectConfigurator implements ObjectConfigurator {
    private DataFactory factory = new DataFactory();

    @SneakyThrows
    @Override
    public void configure(Object t) {

        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomName.class)) {
                field.setAccessible(true);
                field.set(t,factory.getFirstName());

            }

        }
    }
}
