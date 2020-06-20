package oopsconcept;

//class is a blueprint to how a Human should be
public class Human {
	String name;
	int age;
	int heightInInches;
	String eyeColour;
	//constructors help is to create the object
	//smae name as class, no return type
	public Human() {
		name = "tomy";
		age = 15;
	}
	
	public Human(String name, int age, int heightInInches, String eyeColour) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColour = eyeColour;
	}

	public void speak() {
		System.out.println("Hi, my name is : "+name);
		System.out.println("I am "+age);
	}
	public void eat() {
		System.out.println("eating.........");
	}
	public void walk() {
		System.out.println("walking............");
	}
}
