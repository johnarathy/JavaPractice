package oopsconcept;

public class Bird extends Animal{
	public Bird(int age, String gender, int weight) {
		super(age, gender, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("flapping wings...");
		
	}

//	we are removing fly method from Bird as there are many birds which doesnt fly
// so we will implement the Flyable interface	
//	public void fly() {
//		System.out.println("flying...");
//	}
}
