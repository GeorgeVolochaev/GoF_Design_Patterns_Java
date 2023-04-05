

import creational.singleton.Singleton;
import static junit.framework.Assert.assertSame;
import org.junit.Test;


public class SingletonTest {

    @Test
    //verifies that the getInstance() method returns the same instance of SingletonTest every time it is called.
    public void testGetInstance() {
        var singleton1 = Singleton.getInstance();
        var singleton2 = Singleton.getInstance();

        assertSame(singleton1, singleton2);
    }

    @Test
    //verifies that the showMessage() method prints the expected message.
    public void testShowMessage() {
        var singleton = Singleton.getInstance();
        singleton.showMessage(); // should print "Hello SingletonTest!"
    }
}