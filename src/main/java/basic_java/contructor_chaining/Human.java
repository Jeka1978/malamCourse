package basic_java.contructor_chaining;

/**
 * @author Evgeny Borisov
 */

public class Human {
    private String name;
    private int age;




    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
