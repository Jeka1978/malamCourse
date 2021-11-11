package basic_java.contructor_chaining;

/**
 * @author Evgeny Borisov
 */
public class Employee extends Human {

    private int salary;


    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
}
