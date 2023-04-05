
package creational.prototype;

import lombok.Builder;
import lombok.Data;
import lombok.SneakyThrows;

/**
 *
 * @author George Volochaev
 */
@Data
@Builder(toBuilder = true)
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    @Override
    public Person clone() {
        return this.toBuilder().build();
    }
}

/**We use the @Builder annotation to generate a builder method in the Person class. 
We also implement the Cloneable interface and override the clone() method 
to call the toBuilder() method and create a new Person object 
with the same values as the original.
 */   
    

