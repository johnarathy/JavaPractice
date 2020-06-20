package oopsconcept;

public class Earth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human(); //tom is  - a variable of Human, object, instance variable, reference variable
		Human h2 = new Human();	//h1,h2 are different Humans but have same name as the constructor is assigning same name,age to both
		h1.speak();
		h2.speak();
		
		Human joe = new Human("joe",60,12,"green");	
		Human johan = new Human("johan",72,20,"brown");
		joe.speak();
		johan.speak();
	}

}
