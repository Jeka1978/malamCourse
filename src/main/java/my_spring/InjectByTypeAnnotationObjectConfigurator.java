package my_spring;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {

        }
    }
}
