
package structural.composite;

/**
 *
 * @author George Volochaev
 */
public class MainComposite {
    public static void main(String[] args) {
        var circle = new LeafCircle();
        var square = new LeafSquare();

        var drawing = new CompositeDrawing();
        drawing.add(circle);
        drawing.add(square);

        drawing.draw();
    }
}
