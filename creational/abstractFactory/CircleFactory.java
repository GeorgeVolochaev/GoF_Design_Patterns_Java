
package creational.abstractFactory;

import lombok.AllArgsConstructor;

/**
 *
 * @author George Volochaev
 */
@AllArgsConstructor
public class CircleFactory implements ShapeFactory{
    private double radius;
    
    @Override
    public Shape createShape() {
        return new Circle(radius);
    }
    
    
}
