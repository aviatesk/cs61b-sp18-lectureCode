public class IterationDemo {

    public static void main(String[] args) {
        ArrayMap<String, Integer> am = new ArrayMap<String, Integer>();
        am.put("hello", 5);
        am.put("syrups", 10);
        am.put("kingdom", 15);

        /* Wired wizard way */
        ArrayMap.KeyIterator ami = am.new KeyIterator();
        while (ami.hasNext()) {
            System.out.println(ami.next());
        }

        /* Use Iterator API */
        for (String s : am) {
            System.out.println(s);
        }
    }

}
