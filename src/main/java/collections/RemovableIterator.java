package collections;

/**
 * @author Evgeny Borisov
 */
public interface RemovableIterator<T> extends JekaIterator<T> {

    void remove();
}
