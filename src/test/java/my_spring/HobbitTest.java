package my_spring;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Evgeny Borisov
 */
public class HobbitTest {



    @Test
    public void getPower() {

        Human human = ObjectFactory.getInstance().createObject(Human.class);
        System.out.println(human);


        Assert.assertTrue(human.getPower() > 0);
        Assert.assertTrue(human.getSpeed() > 0);
        Assert.assertNotNull(human.getName());

    }
}