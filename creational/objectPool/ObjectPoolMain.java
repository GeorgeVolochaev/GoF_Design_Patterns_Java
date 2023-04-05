
package creational.objectPool;

/**
 *
 * @author George Volochaev
 */
public class ObjectPoolMain {
    public static void main(String[] args) throws InterruptedException {
        // Get an instance of MyClass from the object pool
        MyClass myInstance = MyClass.getInstance();

        // Use the instance
        //myInstance.doSomething();

        // Release the instance back to the object pool
        myInstance.releaseInstance();

        // Get another instance from the object pool
        MyClass anotherInstance = MyClass.getInstance();

        // Use the second instance
        //anotherInstance.doSomethingElse();

        // Release the second instance back to the object pool
        anotherInstance.releaseInstance();
    }
    
    
}

/**In this example, the main method first calls the getInstance method on MyClass
to get an instance from the object pool. It then uses the instance by calling 
some method, doSomething(), for example. 
After it's done using the instance, it calls the releaseInstance method 
to return the instance to the pool.

The main method then gets another instance from the pool and uses it, 
similar to the first instance. Finally, it releases the second instance back 
to the pool.

Note that the getInstance method can block if no instances are available in the pool.
You might want to handle this by catching the InterruptedException that 
it throws, or by using a timeout or other strategy to avoid blocking indefinitely.*/