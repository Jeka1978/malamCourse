package basic_java;

import lombok.Builder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Builder
public class Person {




    private String name;
    private int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
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




