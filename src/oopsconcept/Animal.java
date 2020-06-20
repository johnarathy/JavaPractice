package oopsconcept;

public abstract class Animal {
	int age;
	String gender;
	int weight;
	
	//example for use of Super
	public Animal(int age, String gender, int weight) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}
	public void eat() {
		System.out.println("eating...");
	}
	public void sleep() {
		System.out.println("sleeping...");
	}
	public abstract void move(); // each animal moves differently

}
