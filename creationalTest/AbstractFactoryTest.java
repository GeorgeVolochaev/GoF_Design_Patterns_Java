package creationalTests;


import creational.abstractFactory.CircleFactory;
import creational.abstractFactory.Shape;
import creational.abstractFactory.ShapeFactory;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author George Volochaev
 */
public class AbstractFactoryTest {
    @Test
    public void testCircleFactory() {
        ShapeFactory circleFactory = new CircleFactory(5);
        Shape circle = circleFactory.createShape();
        assertEquals(Math.PI * 25, circle.getArea(), 0.01);
    }
}
