package chain_of_responsibility;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Evgeny Borisov
 */
public class BirthdayValidator implements Validator {
    @Override
    public String validate(Person person) {
        if (person.getBirthday().isAfter(LocalDate.now())) {
            return "not born yet!";
        }
        if (ChronoUnit.YEARS.between(person.getBirthday(), LocalDate.now()) > 120) {
            return "the person already dead or almost dead";
        }

        return "";
    }
}
