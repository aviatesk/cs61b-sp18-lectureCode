public class Maximizer {

	public static OurComparable ourMax(OurComparable[] items) {
		int maxDex = 0;
		for (int i = 0; i < items.length; i += 1) {
		    int cmp = items[i].ourCompareTo(items[maxDex]);
			if (cmp > 0) {
				maxDex = i;
			}
		}
		return items[maxDex];
	}

	public static Comparable max(Comparable[] items) {
		int maxDex = 0;
		for (int i = 0; i < items.length; i += 1) {
		    int cmp = items[i].compareTo(items[maxDex]);
			if (cmp > 0) {
				maxDex = i;
			}
		}
		return items[maxDex];
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("Elyse", 3);
        Dog d2 = new Dog("Sture", 9);
        Dog d3 = new Dog("Benjamin", 15);
        Dog[] dogs = new Dog[]{d1, d2, d3};
		Dog ourMaxDog = (Dog) ourMax(dogs);
		Dog maxDog = (Dog) max(dogs);
		ourMaxDog.bark(); // Benjamin should bark
		maxDog.bark(); // Benjamin should bark
	}

}
