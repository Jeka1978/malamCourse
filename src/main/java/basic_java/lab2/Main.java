package basic_java.lab2;

import basic_java.Person;
import zoo.Animal;
import zoo.Dog;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        Animal animal = new Dog();




        String str = new String("java");
        String str2 = new String("java");

        System.out.println(str.equals(str2));
        System.out.println(str==str2);

        String str3 = "java";

        System.out.println(str==str3);
        System.out.println(str2==str3);





/*

        Person person1 = new Person("Jeka",43);
        Person person2 = new Person("Jeka",43);
        Person person3 = person1;


        Set<Person> personSet = new HashSet<>();

        personSet.add(person1);
        personSet.add(person2);

        System.out.println(personSet.size());

        Person x = new Person("Masha", 21);

        System.out.println(x);
*/
    }
}
