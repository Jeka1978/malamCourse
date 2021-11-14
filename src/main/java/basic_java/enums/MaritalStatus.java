package basic_java.enums;

import basic_java.Person;
import lombok.Getter;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;

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


    public static MaritalStatus findByDbCode(int dbCode) {

        MaritalStatus[] maritalStatuses = values();
        for (MaritalStatus maritalStatus : maritalStatuses) {
            if (maritalStatus.dbCode == dbCode) {
                return maritalStatus;
            }
        }
        throw new IllegalStateException(dbCode + " not supported");
    }


    @SneakyThrows
    public void addToFile(File file) {
        if (file.exists()) {
            FileOutputStream fileOutputStream = null;
            fileOutputStream = new FileOutputStream(file);
        }


    }


}



