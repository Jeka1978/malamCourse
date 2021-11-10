package tdd;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ObjectAnalyzer {


    public void runAllTestsOfFolder(String directoryName) {
        String[] fileNames = new File(directoryName).list();

    }

    public void runAllTestsOfAllClasses(List<String> classNames) throws Exception {
        for (String className : classNames) {
            runAllTestsForClassName(className);
        }
    }


    public void runAllTestsForClassName(String className) throws Exception{
        Class<?> type = Class.forName(className);
        runAllTestsForClass(type);
    }

    public void runAllTestsForClass(Class<?> type) throws Exception {
        Constructor<?> constructor = type.getDeclaredConstructor();
        Object o = constructor.newInstance();
        runAllTests(o);
    }


    public void runAllTests(Object o) throws Exception {
        Class<?> type = o.getClass();
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            if (methodName.startsWith("test")) {
                method.invoke(o);
            }
        }
    }


    public void analyze(Object o) {
        Class<?> type = o.getClass();
        System.out.println(type.getSimpleName());
        Method[] methods = type.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}






