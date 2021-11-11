package basic_java.lab1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class MalamListImpl<T> implements MalamList<T> {

    private List<T> objects = new ArrayList<>();


    @Override
    public void add(T o) {
        objects.add(o);
    }

    @Override
    public T get(int index) {
        return objects.get(index);
    }

    @Override
    public int size() {
        return objects.size();
    }

    @Override
    public void printAll() {

        for (T t : objects) {
            System.out.println(t);
        }
    }
}


