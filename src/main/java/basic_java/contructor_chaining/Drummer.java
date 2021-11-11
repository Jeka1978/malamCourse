package basic_java.contructor_chaining;

/**
 * @author Evgeny Borisov
 */
public class Drummer implements Musician {
    @Override
    public void playMusic() {
        System.out.println("bum bum");
    }


    public void throwSticks() {
        System.out.println("here my sticks!!!");
    }

}
