package chain_of_responsibility;

/**
 * @author Evgeny Borisov
 */
public class NameValidator implements Validator {
    @Override
    public String validate(Person person) {
        if (person.getName() == null || person.getName().isEmpty()) {
            return "name not initialized";
        }

        return "";
    }
}
