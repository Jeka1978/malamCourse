package zoo;

/**
 * @author Evgeny Borisov
 */
public class Fish implements Animal {
    @Override
    public void makeVoice() {
        throw new IllegalStateException("I'm not speaking");
    }
}
