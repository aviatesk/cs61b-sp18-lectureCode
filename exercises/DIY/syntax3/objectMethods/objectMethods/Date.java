package objectMethods;

public class Date {
    private final int month;
    private final int day;
    private final int year;

    public Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }

        Date uddaDate = (Date) o;
        if (month != uddaDate.month) {
            return false;
        }
        if (day != uddaDate.day) {
            return false;
        }
        if (year != uddaDate.year) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Date object: " + year + "-" + month + "-" + day;
    }

    public static void main(String[] args) {
        Date d = new Date(2, 9, 2019);
        System.out.println(d);

        int[] x = new int[]{0, 1, 2, 3, 4};
        int[] y = new int[]{0, 1, 2, 3, 4};
        System.out.println("x == y: " + (x == y));
        System.out.println("x.equals(y): " + (x.equals(y)));
        System.out.println("java.util.Arrays.equals(x, y): " + (java.util.Arrays.equals(x, y)));
    }

}