public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        IntList newL = new IntList(L.first + x, null);
        if (L.rest == null) {
            return newL;
        } else {
            newL.rest = incrList(L.rest, x);
            return newL;
        }
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        IntList currentL = L;
        currentL.first += x;
        while (currentL.rest != null) {
            currentL = currentL.rest;
            currentL.first += x;
        }
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println("    L: " + L);
        System.out.println("0th value: " + L.get(0));
        System.out.println("1st value: " + L.get(1));
        System.out.println("2nd value: " + L.get(2));

        IntList newL1 = incrList(L, 3);
        System.out.println("newL1: " + newL1);
        System.out.println("0th value: " + newL1.get(0));
        System.out.println("1st value: " + newL1.get(1));
        System.out.println("2nd value: " + newL1.get(2));

        IntList newL2 = dincrList(L, 3);
        System.out.println("newL2: " + newL2);
        System.out.println("0th value: " + newL2.get(0));
        System.out.println("1st value: " + newL2.get(1));
        System.out.println("2nd value: " + newL2.get(2));
    }
}
