/** The DogLauncher class will 'test drive' the Dog class */
public class DogLauncher {
	public static void main(String[] args) {
		Dog d1 = new Dog(25);
		System.out.print("d1(25lb): ");
		d1.makeNoise();

		Dog d2 = new Dog(50);
		System.out.print("d2(50lb): ");
		d2.makeNoise();

		Dog bigger1 = Dog.maxDog(d1, d2);
		System.out.print("static maxDog: ");
		bigger1.makeNoise();

		Dog bigger2 = d1.maxDog(d2);
		System.out.print("instance maxDog: ");
		bigger2.makeNoise();

		// System.out.println(d1.binomen); // Warning
		System.out.println(Dog.binomen);
	}
}
