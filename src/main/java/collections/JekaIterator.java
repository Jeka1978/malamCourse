package collections;

/**
 * @author Evgeny Borisov
 */
public interface JekaIterator<T> {
    T next();

    boolean hasNext();
}
