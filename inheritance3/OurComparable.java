public interface OurComparable {

    /**
     * Returns negative number if this < o
     * Returns 0 if this eqeuals o
     * Returns positive number if this > o
     */
    int ourCompareTo(Object o); // the signature can be `public int compareTo(Comparable o);`

}
