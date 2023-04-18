
package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George Volochaev
 */
public class CompositeDrawing implements InterfaceShape{
    private List<InterfaceShape> shapes = new ArrayList<>();

    public void add(InterfaceShape shape) {
        shapes.add(shape);
    }

    public void remove(InterfaceShape shape) {
        shapes.remove(shape);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Drawing");
        for (InterfaceShape shape : shapes) {
            shape.draw();
        }
    }
}
