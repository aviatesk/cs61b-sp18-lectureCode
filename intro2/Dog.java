public class Dog {
	public int weightInPounds;
	public static String binomen = "Canis familiaris";

	/** One integer constructor for Dogs */
	public Dog(int w) {
		weightInPounds = w;
	}
	/** In a case of makoing the parameter names the same as the instance variable names, we have to use "this" keyword appropriately */
	// public Dog(int weightInPounds) {
	// 	this.weightInPounds = weightInPounds;
	// }

	public void makeNoise() {
		if (weightInPounds < 10) {
			System.out.println("yip!");
		} else if (weightInPounds < 30) {
			System.out.println("bark!");
		} else {
			System.out.println("woooof!");
		}
	}

	public static Dog maxDog(Dog d1, Dog d2) {
		if (d1.weightInPounds > d2.weightInPounds) {
			return d1;
		} else {
			return d2;
		}
	}

	public Dog maxDog(Dog d) {
		if (weightInPounds > d.weightInPounds) {
			return this;
		} else {
			return d;
		}
	}

}
