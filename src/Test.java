
public class Test {

	public static void main(String[] args) {
		System.out.println("----Mallard-----");
		MallardDuck md = new MallardDuck();
		md.display();
		md.fly();
		md.quack();
		md.swim();
		
		System.out.println("----RedheadDuck-----");
		
		RedheadDuck rd = new RedheadDuck();
		rd.display();
		rd.fly();
		rd.quack();
		rd.swim();
		
		System.out.println("----RubberDuck-----");
		
		RubberDuck rud = new RubberDuck();
		rud.display();
		rud.quack();
		rud.swim();
		
		System.out.println("-----DecoyDuck----");
		DecoyDuck dd = new DecoyDuck();
		dd.display();
		dd.swim();
		
	}

}
