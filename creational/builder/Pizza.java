
package creational.builder;

import java.util.List;
import lombok.*;

/**
 *
 * @author George Volochaev
 */

@Value
@Builder
public class Pizza {
    private final String name;
    private final List<String> toppings;
}
