import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * An array based implementation of the Map61B class.
 */
public class ArrayMap<K, V> implements Map61B<K, V>, Iterable<K> {
    private K[] keys;
    private V[] values;
    int size;

    public ArrayMap() {
        keys = (K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }

    /** Returns the index of the given key if it exists,
     *  -1 otherwise. */
    private int keyIndex(K key) {
        for (int i = 0; i < size; i+= 1) {
            if (keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean containsKey(K key) {
        int index = keyIndex(key);
        return index > -1;
    }

    @Override
    public void put(K key, V value) {
        int index = keyIndex(key);
        if (index == -1) {
            keys[size] = key;
            values[size] = value;
            size += 1;
        } else {
            values[index] = value;
        }
    }

    @Override
    public V get(K key) {
        int index = keyIndex(key);
        return values[index];
    }

    @Override
    public int size() {
        return size;
    }

    public List<K> keys() {
        List<K> keyList = new ArrayList<>();
        for (int i = 0; i < keys.length; i += 1) {
            keyList.add(keys[i]);
        }
        return keyList;
    }

    public class KeyIterator implements Iterator<K> {

        private int wizardPosition;

        public KeyIterator() {
            wizardPosition = 0;
        }

        public boolean hasNext() {
            return wizardPosition < size;
        }

        public K next() {
            K returnVal = keys[wizardPosition];
            wizardPosition += 1;
            return returnVal;
        }

    }

    @Override
    public Iterator<K> iterator() {
        return new KeyIterator();
    }

    @Test
    public void test() {
        ArrayMap<Integer, Integer> am = new ArrayMap<>();
        am.put(2, 5);
        int expected = 5;
        assertEquals((Integer) expected, am.get(2));
    }

    public static void main(String[] args) {
        ArrayMap<String, Integer> m = new ArrayMap<>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("house", 10);
        System.out.println("test");
    }

}
