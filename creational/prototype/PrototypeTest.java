
import creational.prototype.Person;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;



/**
 *
 * @author George Volochaev
 */
public class PrototypeTest {
    @Test
    public void testClone() {
        Person person1 = Person.builder()
                              .firstName("John")
                              .lastName("Doe")
                              .age(30)
                              .email("john.doe@example.com")
                              .build();
        Person person2 = person1.clone();
        assertEquals(person1.getFirstName(), person2.getFirstName());
        assertEquals(person1.getLastName(), person2.getLastName());
        assertEquals(person1.getAge(), person2.getAge());
        assertEquals(person1.getEmail(), person2.getEmail());
    }

    @Test
    //We create a Person object using the builder method and use assertEquals() 
    //to verify that the object has the expected values.
    public void testBuilder() {
        Person person = Person.builder()
                              .firstName("John")
                              .lastName("Doe")
                              .age(30)
                              .email("john.doe@example.com")
                              .build();
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals(30, person.getAge());
        assertEquals("john.doe@example.com", person.getEmail());
    }
}
