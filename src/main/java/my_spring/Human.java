package my_spring;

import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public class Human {

    @InjectRandomName
    private String name;

    private int age;

    @InjectRandomInt(min = 3, max = 10)
    private int power;

    @InjectRandomInt(min = 10, max = 25)
    private int speed;
}
