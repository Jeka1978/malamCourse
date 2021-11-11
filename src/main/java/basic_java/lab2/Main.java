package basic_java.lab2;

import basic_java.Person;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Jeka",43);
        Person person2 = new Person("Jeka",43);
        Person person3 = person1;


        Set<Person> personSet = new HashSet<>();

        personSet.add(person1);
        personSet.add(person2);

        System.out.println(personSet.size());

        Person x = new Person("Masha", 21);

        System.out.println(x);
    }
}
