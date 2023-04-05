
package creational.objectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import lombok.*;

/**
 *
 * @author George Volochaev
 */

@Getter
@Setter
public abstract class ObjectPool<T> {
    private BlockingQueue<T> objects;

    public ObjectPool(int size) {
        objects = new LinkedBlockingQueue<>(size);
        for (int i = 0; i < size; i++) {
            objects.offer(create());
        }
    }

    protected abstract T create();

    public T acquire() throws InterruptedException {
        return objects.take();
    }

    public void release(T object) {
        objects.offer(object);
    }
}
