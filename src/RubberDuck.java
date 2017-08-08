
public class RubberDuck extends Duck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Squack! Squack!");

	}

	@Override
	void display() {
		System.out.println("Look like a rubber");

	}
}
