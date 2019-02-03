import java.util.Comparator;

public class Dog implements OurComparable, Comparable<Dog> {

    public String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }

    /**
     * Returns negative number if this dog is less than the dog pointed at by o
     * Returns 0 if same
     * Returns positive number if larger
     */
    @Override
    public int ourCompareTo(Object obj) {
        /** Warning, cast can cause runtime error ! */
        Dog comparedDog = (Dog) obj;
        return this.size - comparedDog.size;
        // The more verbose version below
        /* if (this.size < uddaDog.size) {
            return -1;
        } else if (this.size == uddaDog.size) {
            return 0;
        } else {
            return 1;
        } */
    }

    @Override
    public int compareTo(Dog comparedDog) {
        return this.size - comparedDog.size;
    }

    private static class SizeComparator implements Comparator<Dog> {
        public int compare(Dog a, Dog b) {
            return a.compareTo(b);
        }
    }
    private static class NameComparator implements Comparator<Dog> {
        public int compare(Dog a, Dog b) {
            return a.name.compareTo(b.name);
        }
    }

    public static Comparator<Dog> getSizeComparator() {
        return new SizeComparator();
    }
    public static Comparator<Dog> getNameComparator() {
        return new NameComparator();
    }

}
