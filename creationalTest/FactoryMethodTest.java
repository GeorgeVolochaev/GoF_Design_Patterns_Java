package creationalTests;


import creational.factoryMethod.*;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author George Volochaev
 */
public class FactoryMethodTest {
    
    @Test
    public void testConcreteCreator1() {
        Creator creator = new ConcreteCreator1();
        String expected = "ConcreteCreator1: ConcreteProduct1 operation";
        assertEquals(expected, creator.someOperation());
    }

    
    @Test
    public void testConcreteCreator2() {
        Creator creator = new ConcreteCreator2();
        String expected = "ConcreteCreator2: ConcreteProduct2 operation";
        assertEquals(expected, creator.someOperation());
    }

}
