package basic_java.enums;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
     /*   Student itzik = new Student("Itzik", MaritalStatus.SINGLE);
        itzik.setMaritalStatus(MaritalStatus.MARRIED);
        System.out.println("aaaaaaaaaaaaaaaa");
        System.out.println(itzik.getMaritalStatus().getHebrewDesc());*/

        try {
            MaritalStatus maritalStatus = MaritalStatus.findByDbCode(9);
            System.out.println(maritalStatus.getHebrewDesc());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("ending the program!!! This is very important");
    }
}
