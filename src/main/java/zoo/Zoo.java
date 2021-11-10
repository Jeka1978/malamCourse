package zoo;

import heroes.King;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class Zoo {
    private List<Animal> animals = new ArrayList<>();


    public Zoo() throws Exception {


        Reflections scanner = new Reflections("zoo");
        Set<Class<? extends Animal>> types = scanner.getSubTypesOf(Animal.class);
        for (Class<? extends Animal> type : types) {

            Constructor<? extends Animal> constructor = type.getDeclaredConstructor();
            Animal animal = constructor.newInstance();
            animals.add(animal);
        }


    }

    public void makeNoice() {
        System.out.println("starting the noice...");
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}
