
package creational.objectPool;

/**
 *
 * @author George Volochaev
 */
public class MyClass {
    private static final ObjectPool<MyClass> objectPool = new ObjectPool<MyClass>(10) {
        @Override
        protected MyClass create() {
            return new MyClass();
        }
    };

    public static MyClass getInstance() throws InterruptedException {
        return objectPool.acquire();
    }

    public void releaseInstance() {
        objectPool.release(this);
    }
}
