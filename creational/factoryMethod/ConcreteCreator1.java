
package creational.factoryMethod;

import lombok.Data;

/**
 *
 * @author George Volochaev
 */
@Data
public class ConcreteCreator1 implements Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }

    @Override
    public String someOperation() {
        Product product = factoryMethod();
        return String.format("ConcreteCreator1: %s", product.operation());
    }
    
    
}
