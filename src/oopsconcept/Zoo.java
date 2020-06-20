package oopsconcept;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal a1 = new Animal(12, "F", 20); - once Animal is made abstract we cannot instantiate - can only be extended
//		a1.eat();
		//a1.fly(); - gives CTE as Animal object doesnt have fly method - a1 will only have methods from Animal class or its partents - not Child
		
		Bird b1 = new Bird(3, "M", 10);
		//b1.fly();
		b1.eat();
		
		Chicken c1 =  new Chicken(4, "M", 3);
		//c1.fly();
		
		Sparrow s1 = new Sparrow(2, "F", 1);
		s1.move();
		Fish f1 = new Fish(1, "M", 5);
		f1.move();
		
		
		Animal s2 = new Sparrow(2, "F", 1);
		s1.eat();
		s1.fly();
		s1.move();
		s1.sleep();
			s2.eat();
			//s2.fly(); -- gives error as Animal object does not have visibility to Sparrow's methods
			s2.move();
			s2.sleep();
			
		Animal f2 = new Fish(1, "M", 5);
		moveAnimal(f2);
		moveAnimal(s2);
		String str = "abcdfe";
		
		System.out.println(str.substring(3));
		Flyable fly1 = new Sparrow(2, "M", 2);
		fly1.fly(); // only fly method is available
		//Flyable fly2 = new Bird(1, "F", 2); - gives CTE as Bird class does not implement Flyable
		
	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
