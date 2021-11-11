package basic_java.contructor_chaining;

/**
 * @author Evgeny Borisov
 */
public class MusicianTeacher {

    public void improve(Musician musician) {

        if (musician instanceof Drummer) {
            musician.playMusic();
        } else {
            musician.playMusic();
            musician.playMusic();
            musician.playMusic();
        }


    }
}
