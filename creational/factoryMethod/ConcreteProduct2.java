
package creational.factoryMethod;

import lombok.Data;

/**
 *
 * @author George Volochaev
 */

@Data
public class ConcreteProduct2 implements Product {
    @Override
    public String operation() {
        return "ConcreteProduct2 operation";
    }
}
