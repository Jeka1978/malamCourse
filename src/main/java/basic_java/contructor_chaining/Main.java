package basic_java.contructor_chaining;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        MusicianTeacher musicianTeacher = new MusicianTeacher();
        musicianTeacher.improve(new Drummer());
    }
}
