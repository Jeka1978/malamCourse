package chain_of_responsibility;

/**
 * @author Evgeny Borisov
 */
public interface PersonValidator {
    void validate(Person person) throws PersonValidationException;

    void addValidator(Validator validator);
}
