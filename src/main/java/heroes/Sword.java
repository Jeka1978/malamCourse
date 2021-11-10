package heroes;

/**
 * @author Evgeny Borisov
 */
public class Sword implements Weapon {
    @Override
    public void kickStrategy() {
        System.out.println("sword is sharp");
    }
}
