public class WordUtils {

    /** Returns the length of the longest word. */
    public static String longest(List61B<String> list) {
        int maxDex = 0;
        for (int i = 0; i < list.size(); i += 1) {
            String longestString = list.get(maxDex);
            String thisString = list.get(i);
            if (thisString.length() > longestString.length()) {
                maxDex = i;
            }
        }
        return list.get(maxDex);
    }

    public static void main(String[] args) {

        System.out.println("--- SLList version ----");
        SLList<String> sllist = new SLList<String>();
        sllist.addLast("elk");
        sllist.addLast("are");
        sllist.addLast("watching");
        System.out.println(longest(sllist));
        sllist.print();

        System.out.println("--- AList version ---");
        AList<String> alist = new AList<>();
        alist.addLast("elk");
        alist.addLast("are");
        alist.addLast("watching");
        System.out.println(longest(alist));
        alist.print();

        System.out.println("--- Confusing version ---");
        System.out.println("`List61B<String> list = new SLList<String>();`");
        List61B<String> list = new SLList<String>();
        list.addLast("elk");
        list.addLast("are");
        list.addLast("watching");
        System.out.println(longest(list));
        list.print();
    }

}
