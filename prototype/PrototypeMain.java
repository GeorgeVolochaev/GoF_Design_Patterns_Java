
package creational.prototype;

/**
 *
 * @author George Volochaev
 */
public class PrototypeMain {
    public static void main(String[] args) {
        Person person1 = Person.builder()
                          .firstName("John")
                          .lastName("Doe")
                          .age(30)
                          .email("john.doe@example.com")
                          .build();
        Person person2 = person1.clone();

        person2.setAge(45);
        System.out.println(person2);
    
    }
}
