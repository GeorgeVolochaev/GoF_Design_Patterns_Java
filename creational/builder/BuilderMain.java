
package creational.builder;

import java.util.List;

/**
 *
 * @author George Volochaev
 */
public class BuilderMain {
    public static void main(String[] args) {
        var pizza = Pizza.builder()
                .name("Pepperoni")
                .toppings(List.of("Pepperoni", "Mozzarella", "Tomato sauce"))
                .build();
        System.out.println(pizza);
    }
}

/**The Builder pattern is a creational design pattern that allows you 
to create complex objects step by step. 

The main idea is to separate the construction of a complex object 
from its representation so that the same construction process 
can create different representations.*/