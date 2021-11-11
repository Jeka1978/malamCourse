package basic_java.lab1;

import basic_java.Person;
import zoo.Animal;
import zoo.Cat;
import zoo.Fish;

import java.util.List;

import static basic_java.lab1.Constants.*;


/**
 * @author Evgeny Borisov
 */
public class Main {




    public static void main(String[] args) throws InterruptedException {
        MalamList<Animal> animals = new MalamListImpl<>();

        int x = WIDTH;

        animals.printAll();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("1111");
                }
            }
        });
        thread.setName("MALAM thread");
        thread.start();


        animals.add(new Fish());



        Animal animal = animals.get(0);
        animal.makeVoice();

        Thread.sleep(20000);


    }
}




