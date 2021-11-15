package chain_of_responsibility;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.time.LocalDate;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Person person = Person.builder().birthday(LocalDate.of(2225, 1, 1)).email("abx").build();

        PersonValidator personValidator = new PersonValidatorImpl();


        Reflections scanner = new Reflections("chain_of_responsibility");

        Set<Class<? extends Validator>> classes = scanner.getSubTypesOf(Validator.class);
        for (Class<? extends Validator> aClass : classes) {
            Constructor<? extends Validator> constructor = aClass.getDeclaredConstructor();
            personValidator.addValidator(constructor.newInstance());

        }



        personValidator.validate(person);

    }
}





