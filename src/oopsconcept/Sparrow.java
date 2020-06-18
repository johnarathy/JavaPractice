package oopsconcept;

//since fly meth is removed from Bird - Sparrow not able to Fly - so we should implement flyable
public class Sparrow extends Bird implements Flyable{

	public Sparrow(int age, String gender, int weight) {
		super(age, gender, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Sparrow flying...");
		
	}

}
