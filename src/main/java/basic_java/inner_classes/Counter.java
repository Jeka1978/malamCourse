package basic_java.inner_classes;

/**
 * @author Evgeny Borisov
 */
public class Counter {
    private int amount;

    public Counter(int amount) {
        this.amount = amount;
    }

    public void inc() {
        amount++;
    }

    public int getAmount() {
        return amount;
    }
}
