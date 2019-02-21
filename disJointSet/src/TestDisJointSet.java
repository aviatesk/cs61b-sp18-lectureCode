import org.junit.Test;
import static org.junit.Assert.*;

public class TestDisJointSet {

    private static String[] countries = new String[]{"Mexico", "USA", "Canada", "Ukraine", "Estonia"};

    @Test
    public void TestQuickFindDS() {
        QuickFindDS<String> qfds = new QuickFindDS<>(countries);

        qfds.connect("USA", "Mexico");
        qfds.connect("USA", "Canada");
        qfds.connect("Ukraine", "Estonia");
        assertTrue(qfds.isConnected("Mexico", "Canada"));
        assertTrue(qfds.isConnected("Ukraine", "Estonia"));
        assertFalse(qfds.isConnected("Estonia", "USA"));
        for (String country : qfds.item2Id.keySet()) {
            System.out.println(country + " " + qfds.item2Id.get(country));
        }

        qfds.connect("USA", "Ukraine");
        assertTrue(qfds.isConnected("Estonia", "USA"));
        for (String country : qfds.item2Id.keySet()) {
            System.out.println(country + " " + qfds.item2Id.get(country));
        }

    }

    @Test
    public void TestQuickUnionDS() {
        QuickUnionDS<String> quds = new QuickUnionDS<>(countries);

        quds.connect("USA", "Mexico");
        quds.connect("USA", "Canada");
        quds.connect("Ukraine", "Estonia");
        assertTrue(quds.isConnected("Mexico", "Canada"));
        assertTrue(quds.isConnected("Ukraine", "Estonia"));
        assertFalse(quds.isConnected("Estonia", "USA"));
        for (String country : quds.item2Parent.keySet()) {
            System.out.println(country + " " + quds.item2Parent.get(country));
        }

        quds.connect("USA", "Ukraine");
        assertTrue(quds.isConnected("Estonia", "USA"));
        for (String country : quds.item2Parent.keySet()) {
            System.out.println(country + " " + quds.item2Parent.get(country));
        }
    }
    
    @Test
    public void TestWeightedQuickUnionDS() {
        WeightedQuickUnionDS<String> wquds = new WeightedQuickUnionDS<>(countries);

        wquds.connect("USA", "Mexico");
        wquds.connect("USA", "Canada");
        wquds.connect("Ukraine", "Estonia");
        assertTrue(wquds.isConnected("Mexico", "Canada"));
        assertTrue(wquds.isConnected("Ukraine", "Estonia"));
        assertFalse(wquds.isConnected("Estonia", "USA"));
        for (String country : wquds.item2Parent.keySet()) {
            System.out.println(country + " " + wquds.item2Parent.get(country));
        }

        wquds.connect("USA", "Ukraine");
        assertTrue(wquds.isConnected("Estonia", "USA"));
        for (String country : wquds.item2Parent.keySet()) {
            System.out.println(country + " " + wquds.item2Parent.get(country));
        }
    }

    @Test
    public void TestWeightedQuickUnionDSWithPathCompression() {
        WeightedQuickUnionDSWithPathCompression<String> qqudswpc = new WeightedQuickUnionDSWithPathCompression<>(countries);

        qqudswpc.connect("USA", "Mexico");
        qqudswpc.connect("USA", "Canada");
        qqudswpc.connect("Ukraine", "Estonia");
        assertTrue(qqudswpc.isConnected("Mexico", "Canada"));
        assertTrue(qqudswpc.isConnected("Ukraine", "Estonia"));
        assertFalse(qqudswpc.isConnected("Estonia", "USA"));
        for (String country : qqudswpc.item2Parent.keySet()) {
            System.out.println(country + " " + qqudswpc.item2Parent.get(country));
        }

        qqudswpc.connect("USA", "Ukraine");
        assertTrue(qqudswpc.isConnected("Estonia", "USA"));
        for (String country : qqudswpc.item2Parent.keySet()) {
            System.out.println(country + " " + qqudswpc.item2Parent.get(country));
        }
    }


}
