public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (rest == null) {
			return 1;
		} else {
			return 1 + this.rest.size();
		}
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	/** Returns the ith value in this list. */
	public int get(int i) {
		if (i == 0) {
			return this.first;
		} else {
			if (this.rest != null) {
				return this.rest.get(i - 1);
			} else {
				System.out.print("The array has no enough length. Exiting ...");
				return 0;
			}
		}
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println("Size: " + L.size());
		System.out.println("Size: " + L.iterativeSize() + " (iterative)");
		System.out.println("0th value: "+ L.get(0));
		System.out.println("1st value: "+ L.get(1));
		L.get(10);
	}
}
