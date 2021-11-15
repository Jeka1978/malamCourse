package chain_of_responsibility;

/**
 * @author Evgeny Borisov
 */
public interface Validator {
    String validate(Person person);
}
