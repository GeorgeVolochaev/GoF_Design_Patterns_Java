
package creational.singleton;

/**
 *
 * @author George Volochaev
 */
public class Singleton {
    private static Singleton instance = null;
    
    // Create a private constructor to prevent external instantiation
    private Singleton() {}
    
    public static Singleton getInstance() {
        // If the instance doesn't exist yet, create it
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    // Add any methods or variables you need for the Singleton here
    public void showMessage() {
        System.out.println("Hello Singleton!");
    }
}

/**In this example, the Singleton class has a private instance variable, 
 * a private constructor, and a public static method to get the instance. 
 * The static getInstance() method checks whether the Singleton instance already exists
 * and creates it if it doesn't. 
 * Finally, the showMessage() method is an example of a method 
 * you might add to the Singleton.
 */