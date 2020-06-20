package oopsconcept;

public class Fish extends Animal{

	public Fish(int age, String gender, int weight) {
		super(age, gender, weight);
		// TODO Auto-generated constructor stub
	}
	public void swim() {
		System.out.println("Swimming...");
	}
	@Override
	public void move() {
		System.out.println("fish is swimming...");
		
	}

}
