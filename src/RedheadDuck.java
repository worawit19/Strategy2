
public class RedheadDuck extends Duck implements Flyable, Quackable {
	@Override
	public void quack() {
		System.out.println("Quack! Quack!");

	}

	@Override
	public void fly() {
		System.out.println("I'm flying");

	}

	@Override
	void display() {
		System.out.println("Look like a red head");

	}

}
