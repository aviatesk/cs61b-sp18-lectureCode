import java.util.Map;
import java.util.HashMap;


public class QuickUnionDS<T> implements DisJointSet<T> {

    Map<T, T> item2Parent;

    public QuickUnionDS(T[] items) {
        item2Parent = new HashMap<>();
        for (T item : items) {
            T parent = item;
            item2Parent.put(item, parent);
        }
    }

    private T findParent(T item) {
        while (item != item2Parent.get(item)) {
            item = item2Parent.get(item);
        }
        return item;
    }

    @Override
    public void connect(T p, T q) {
        T pParent = findParent(p);
        T qParent = findParent(q);
        item2Parent.replace(pParent, qParent);
    }

    @Override
    public boolean isConnected(T p, T q) {
        return findParent(p) == findParent(q);
    }

}
