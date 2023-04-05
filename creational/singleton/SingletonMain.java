
package creational.singleton;

/**
 *
 * @author George Volochaev
 */
public class SingletonMain {
    
    public static void main(String[] args) {
        var singleton = Singleton.getInstance();
        singleton.showMessage();
    }
    
}
