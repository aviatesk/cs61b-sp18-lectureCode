import java.util.Map;
import java.util.HashMap;


public class WeightedQuickUnionDS<T> implements DisJointSet<T> {

    Map<T, T> item2Parent;
    Map<T, Integer> item2Size;

    public WeightedQuickUnionDS(T[] items) {
        item2Parent = new HashMap<>();
        item2Size = new HashMap<>();
        for (T item : items) {
            T parent = item;
            item2Parent.put(item, parent);
            item2Size.put(item, 1);
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
        int pSize = item2Size.get(pParent);
        int qSize = item2Size.get(qParent);
        if (pSize < qSize) {    // Connect p's tree to q's root
            item2Parent.replace(pParent, qParent);
            item2Size.replace(qParent, pSize + qSize);
        } else {                // Connect q's tree to p's root
            item2Parent.replace(qParent, pParent);
            item2Size.replace(pParent, pSize + qSize);
        }
    }

    @Override
    public boolean isConnected(T p, T q) {
        return findParent(p) == findParent(q);
    }

}
