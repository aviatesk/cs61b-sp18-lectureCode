/**
    An MySLList is a list of integers, which hides the terrible truth of the nakedness within
 */
public class MySLList {
    private static class IntNode {
        int item;
        IntNode next;

        IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /** The first node (if it exists) is at sentinel.next */
    private IntNode sentinel;
    private int size;

    /** Creates an empty list */
    public MySLList() {
        sentinel = new IntNode(63, null);
        size = 0;
    }

    public MySLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /**
     * Adds x to the front of the list
     */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /**
        Returns the first item in the list
     */
    public int getFirst() {
        return sentinel.next.item;
    }

    /** Adds a IntNode with item x if IntNode p has no next IntNode */
    private static void addLast(int x, IntNode p) {
        if (p.next == null) {
            p.next = new IntNode(x, null);
        } else {
            MySLList.addLast(x, p.next);
        }
    }
    /**
     * Adds x to the last of the list - Recursively
     */
    public void addLast(int x) {
        MySLList.addLast(x, sentinel);
        size += 1;
    }

    /**
     * Adds x to the last of the list - Iteratively
     */
    public void addLastIterative(int x) {
        IntNode p = sentinel;

        /** Move p until it reaches the end of the list */
        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
        size += 1;
    }


    /** Returns the size of the list that starts at IntNode p */
    private static int size(IntNode p) {
        if (p.next == null) {
            return 0;
        } else {
            return 1 + MySLList.size(p.next);
        }
    }
    /**
     * Returns the size of the list - Recursively
     */
    public int size() {
        return MySLList.size(sentinel);
    }

    /**
     * Returns the size of the list - Iteratively
     */
    public int sizeIterative() {
        int s = 0;
        IntNode p = sentinel;
        while (p.next != null) {
            s += 1;
            p = p.next;
        }
        return s;
    }

    /**
     * Returns the size of the list - Caching
     */
    public int sizeCache() {
        return size;
    }

    public static void main(String[] args) {
        MySLList L = new MySLList(2); // no need to specify null !
        L.addFirst(1);
        L.addFirst(0);
        int x = L.getFirst();
        int s = L.size();
        System.out.println("first item: " + x);
        System.out.println("size: " + s);

        L.addLast(3);
        L.addLastIterative(4);
        x = L.getFirst();
        s = L.sizeIterative();
        System.out.println("first item: " + x);
        System.out.println("size: " + s);
        s = L.sizeCache();
        System.out.println("size: " + s);

        MySLList nullL = new MySLList(); // initialize an empty list
        nullL.addLast(1);
        nullL.addFirst(0);
        x = nullL.getFirst();
        s = nullL.size();
        System.out.println("first item: " + x);
        System.out.println("size: " + s);
    }
}
