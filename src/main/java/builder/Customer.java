package builder;

import lombok.Builder;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */

@Data
@Builder
public class Customer {
    private int age;
    private int numberOfAccidents;
    private int yearsOfExperience;

    public Customer(int age, int numberOfAccidents, int yearsOfExperience) {
        this.age = age;
        this.numberOfAccidents = numberOfAccidents;
        this.yearsOfExperience = yearsOfExperience;
    }




}
