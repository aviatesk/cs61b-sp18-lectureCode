public class MySort {
	/** Sorts strings destructively. */
	public static void sort(String[] x) {
        // Find the smallest item
		// Swap it for the front
		// Selection sort the rest (using recursion)
		sort(x, 0);
	}

	/** Destructively sorts x starting at position start */
	public static void sort(String[] x, int start) {
		if (start == x.length) {
			return;
		}
		int smallestIndex = findSmallest(x, start);
		swap(x, start, smallestIndex);
		sort(x, start + 1);
	}

	/** Return the index of smallest String in x, starting at start */
	public static int findSmallest(String[] x, int start) {
		int smallestIndex = start;
		for (int i = start; i < x.length; i+= 1) {
			int cmp = x[i].compareTo(x[smallestIndex]);
			// from the Internet, if x[i] < x[smallestIndex], cmp will be -1.
			if (cmp < 0) {
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}

	/** Swap item a with b */
	public static void swap(String[] x, int a, int b) {
		String tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
	}
}
