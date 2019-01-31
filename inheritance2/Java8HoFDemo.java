import java.util.function.Function;

public class Java8HoFDemo {

    public static int tenX(int x) {
        return 10 * x;
    }

    public static int doTwice(Function<Integer, Integer> f, int x) {
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        int result = doTwice(Java8HoFDemo::tenX, 2);
        System.out.println(result);
    }
}
