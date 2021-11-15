package chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class PersonValidatorImpl implements PersonValidator {

    private List<Validator> validators = new ArrayList<>();

    @Override
    public void validate(Person person) throws PersonValidationException {

        StringBuilder errorMessageBuilder = new StringBuilder();
        for (Validator validator : validators) {
            String msg = validator.validate(person);
            if (!msg.isEmpty()) {
                errorMessageBuilder.append(msg).append("\n");
            }
        }
        String message = errorMessageBuilder.toString();
        if (!message.isEmpty()) {
            throw new PersonValidationException(message);
        }
    }

    @Override
    public void addValidator(Validator validator) {
        validators.add(validator);
    }
}
