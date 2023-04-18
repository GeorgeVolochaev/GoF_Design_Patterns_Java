package creationalTests;


import creational.builder.Pizza;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;


public class BuilderTest {

    @Test
    //verifies that the Pizza builder creates a Pizza object with the expected name and toppings.
    public void testPizzaBuilder() {
        var pizza = Pizza.builder()
                .name("Pepperoni")
                .toppings(List.of("Pepperoni", "Mozzarella", "Tomato sauce"))
                .build();

        assertEquals("Pepperoni", pizza.getName());
        assertEquals(List.of("Pepperoni", "Mozzarella", "Tomato sauce"), pizza.getToppings());
    }

    @Test
    //verifies that the Pizza object has the expected name.
    public void testPizzaName() {
        var pizza = Pizza.builder()
                .name("Margherita")
                .toppings(List.of("Mozzarella", "Tomato sauce"))
                .build();

        assertEquals("Margherita", pizza.getName());
    }

    @Test
    //verifies that the Pizza object has the expected toppings.
    public void testPizzaToppings() {
        var pizza = Pizza.builder()
                .name("Hawaiian")
                .toppings(List.of("Ham", "Pineapple", "Mozzarella", "Tomato sauce"))
                .build();

        assertEquals(List.of("Ham", "Pineapple", "Mozzarella", "Tomato sauce"), pizza.getToppings());
    }
}
