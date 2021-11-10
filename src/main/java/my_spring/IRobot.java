package my_spring;

import java.rmi.dgc.DGC;

/**
 * @author Evgeny Borisov
 */
public class IRobot {

    //1 decide which speaker to use
    //2 to know how to create speaker
    //3 to know how to configure speaker
    //4 decide what clean impl should be used
    //5 to know how to create cleaner
    //6 to know how to configure cleaner
    //7 to clean the rooom

    private Speaker speaker = ObjectFactory.getInstance().createObject(Speaker.class);
    private Cleaner cleaner = ObjectFactory.getInstance().createObject(Cleaner.class);

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}







