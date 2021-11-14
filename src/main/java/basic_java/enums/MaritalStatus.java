package basic_java.enums;

import lombok.Getter;

/**
 * @author Evgeny Borisov
 */
@Getter
public enum MaritalStatus {

    SINGLE(1, "רווק"),
    MARRIED(2, "נשוי"),
    DIVORCED(7, "גרוש"),
    WIDOW(9, "אלמן");

    private int dbCode;
    private String hebrewDesc;

    MaritalStatus(int dbCode, String hebrewDesc) {
        this.dbCode = dbCode;
        this.hebrewDesc = hebrewDesc;
        System.out.println(dbCode);
    }
}



