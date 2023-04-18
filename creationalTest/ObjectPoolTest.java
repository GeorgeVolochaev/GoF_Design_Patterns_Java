package creationalTests;

import creational.objectPool.MyClass;

import org.junit.Test;

public class ObjectPoolTest {

    @Test
    public void testObjectPool() throws InterruptedException {
        // Test that the object pool works as expected

        // Get 10 instances from the pool
        MyClass[] instances = new MyClass[10];
        for (int i = 0; i < instances.length; i++) {
            instances[i] = MyClass.getInstance();
        }

        // Try to get one more instance, should block
        Thread t = new Thread(() -> {
            try {
                MyClass.getInstance();
            } catch (InterruptedException e) {
                // ignore
            }
        });
        t.start();

        // Release the instances back to the pool
        for (MyClass instance : instances) {
            instance.releaseInstance();
        }
        t.join();

        // Get one more instance, should be the same as the first
        MyClass instance = MyClass.getInstance();
        //instance.doSomething();
        instance.releaseInstance();
    }
}
