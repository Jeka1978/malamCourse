package heroes;

/**
 * @author Evgeny Borisov
 */
public class King implements Hero {
    private Weapon weapon = new Sword();

    private int power = 3;


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void kick() {
        power--;
        if (power < 1) {
            setWeapon(new Axe());
        }
        weapon.kickStrategy();
    }
}
