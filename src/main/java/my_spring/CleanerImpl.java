package my_spring;

/**
 * @author Evgeny Borisov
 */
public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min = 3,max = 7)
    private int repeat;

    @InjectRandomName
    private String name;


    @Override
    public void clean() {
        System.out.println("cleaner which name is: "+name+" loves you!");
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVVVVvvvvvvvvvvvvvvvvvv");
        }
    }
}
