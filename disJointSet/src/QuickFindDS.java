import java.util.Map;
import java.util.HashMap;


public class QuickFindDS<T> implements DisJointSet<T> {

    Map<T, Integer> item2Id;

    public QuickFindDS(T[] items) {
        item2Id = new HashMap<>();
        int id = 0;
        for (T item : items) {
            item2Id.put(item, id);
            id += 1;
        }
    }

    @Override
    public void connect(T p, T q) {
        int pid = item2Id.get(p);
        int qid = item2Id.get(q);
        for (T item : item2Id.keySet()) {
            if (item2Id.get(item) == pid) {
                item2Id.replace(item, qid);
            }
        }
    }

    @Override
    public boolean isConnected(T p, T q) {
        return item2Id.get(p) == item2Id.get(q);
    }

}
