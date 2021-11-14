package basic_java.enums;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Student itzik = new Student("Itzik", MaritalStatus.SINGLE);
        itzik.setMaritalStatus(MaritalStatus.MARRIED);
        System.out.println("aaaaaaaaaaaaaaaa");
        System.out.println(itzik.getMaritalStatus().getHebrewDesc());
    }
}
