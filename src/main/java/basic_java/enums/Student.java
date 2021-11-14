package basic_java.enums;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
public class Student {
    private String name;
    private MaritalStatus maritalStatus;
}
