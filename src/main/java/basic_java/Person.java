package basic_java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Person {

    private String name;
    private int age;

    private List<String> names = new ArrayList<>();


    public Person(String name, int age) {


        int size = names.size();


        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        int xyz;
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalStateException("age can't be negative");
        }
        this.age = age;
    }
}




