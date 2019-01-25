import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the the MySort class. */
public class MyTestSort {

    /** Test the MySort.sort method. */
    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        MySort.sort(input);

        assertArrayEquals(expected, input);
    }

    /** Test the MySort.findSmallest method */
    @Test
    public void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;
        int actual = MySort.findSmallest(input, 0);
        org.junit.Assert.assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "pigs"};
        int expected2 = 2;
        int actual2 = MySort.findSmallest(input2, 2);
        assertEquals(expected2, actual2);
    }

    /** Test the MySort.swap method */
    @Test
    public void testSwap() {
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an", "have", "i", "egg"};

        MySort.swap(input, a, b);
        assertArrayEquals(expected, input);
    }

}
