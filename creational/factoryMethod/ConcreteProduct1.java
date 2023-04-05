
package creational.factoryMethod;

import lombok.Data;

/**
 *
 * @author George Volochaev
 */

@Data
public class ConcreteProduct1 implements Product {
    @Override
    public String operation() {
        return "ConcreteProduct1 operation";
    }
}
