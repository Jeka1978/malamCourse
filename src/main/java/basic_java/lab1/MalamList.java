package basic_java.lab1;

/**
 * @author Evgeny Borisov
 */
public interface MalamList<T> {

    void add(T o);

    T get(int index);

    int size();

    void printAll();

    //todo write implementation of this!
}
