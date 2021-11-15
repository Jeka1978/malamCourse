package chain_of_responsibility;

import java.time.LocalDate;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Person person = Person.builder().birthday(LocalDate.of(2225, 1, 1)).email("abx").build();

        PersonValidator personValidator = new PersonValidatorImpl();
        personValidator.addValidator(new EmailValidator());
        personValidator.addValidator(new NameValidator());
        personValidator.addValidator(new BirthdayValidator());


        personValidator.validate(person);

    }
}
