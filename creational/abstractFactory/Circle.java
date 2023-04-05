
package creational.abstractFactory;

import lombok.*;

/**
 *
 * @author George Volochaev
 */
@Data
@AllArgsConstructor
public class Circle implements Shape{
    private double radius;
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
}
