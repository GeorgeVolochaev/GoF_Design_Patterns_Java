
package creational.abstractFactory;

/**
 *
 * @author George Volochaev
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory(5);
        Shape circle = circleFactory.createShape();
        System.out.println("Circle area: " + circle.getArea());
    }
}
