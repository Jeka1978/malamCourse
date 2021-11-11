package basic_java;

/**
 * @author Evgeny Borisov
 */
public class Main {


    public static void main(String[] args) {


        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println(arg);
        }

        for (String arg : args) {
            System.out.println(arg);
        }

        Person person = new Person("Moshe", 12);


        person.setAge(-12);
        person.setName("Jeka");


        System.out.println("hello " + 12 + " " + person.getName());

    }
}
