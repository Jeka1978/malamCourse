package heroes;

/**
 * @author Evgeny Borisov
 */
public class Knife implements Weapon {
    @Override
    public void kickStrategy() {
        System.out.println("Knife is kicking you");
    }
}
