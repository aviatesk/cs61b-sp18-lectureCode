public interface DisJointSet<T> {

    /** Connects two items `p` and `q` */
    void connect(T p, T q);

    /** Checks to see if two items are connected */
    boolean isConnected(T p, T q);

}
