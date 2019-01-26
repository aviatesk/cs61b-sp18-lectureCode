/**
 * Array based list.
 *
 * @author Josh Hug
 */

/**
 * Sample check
 * index:  0  1  2  3  4  5
 * items: [1, 2, 3, 4, 0, 0, ...]
 * size: 4
 * <p>
 * * Invariants
 * addLast: The next item will go into position size
 * getLast: The item to be returned is in position size - 1
 * size: The number of items in the list should be size
 */

public class AList<Item> {
    private Item[] items;
    private int size;

    /**
     * Creates an empty list.
     */
    public AList() {
        items = (Item[]) new Object[100];
        size = 0;
    }

    /**
     * Resizes the underlying array to the target capacity. *
     * (Note that this method works very slow.)
     */
    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /**
     * Inserts X into the back of the list.
     */
    public void addLast(Item x) {

        /* Resizes when the array's been full */
        if (size == items.length) {
            int newCapacity = size + 1;
            resize(newCapacity * 5);
        }

        items[size] = x;
        size += 1;
    }

    /**
     * Returns the item from the back of the list.
     */
    public Item getLast() {
        return items[size - 1];
    }

    /**
     * Gets the ith item in the list (0 is the front).
     */
    public Item get(int i) {
        return items[i];
    }

    /**
     * Returns the number of items in the list.
     */
    public int size() {
        return size;
    }

    /**
     * Deletes item from back of the list and
     * returns deleted item.
     */
    public Item removeLast() {
        Item returnItem = getLast();
        // Note that we don't need: `items[size - 1] = 0;`
        items[size - 1] = null; // Stop removed item from loitering
        size -= 1;
        return returnItem;
    }

} 