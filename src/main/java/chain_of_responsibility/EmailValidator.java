package chain_of_responsibility;

/**
 * @author Evgeny Borisov
 */
public class EmailValidator implements Validator {
    @Override
    public String validate(Person person) {
        String email = person.getEmail();
        if (email == null) {
            return "email not initialised";
        }
        if (!email.contains("@")) {
            return "@ not exists";
        }
        if (!email.contains("\\.")) {
            return ". not exists";
        }

        if (email.indexOf("@") > email.indexOf("\\.")) {
            return "@ must come before .";
        }
        return "";
    }
}
