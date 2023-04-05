
package creational.factoryMethod;

import lombok.Data;

/**
 *
 * @author George Volochaev
 */
@Data
public class ConcreteCreator2 implements Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }

    @Override
    public String someOperation() {
        Product product = factoryMethod();
        return String.format("ConcreteCreator2: %s", product.operation());
    }
    
    
}