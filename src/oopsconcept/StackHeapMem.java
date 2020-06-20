package oopsconcept;

public class StackHeapMem {

	 //at this line the main meth will be added to stack memory
	public static void main(String[] args) {
		//1. primitive variables
		int age;
		age =12;
		doWork(); //at this line the method doWork will be added to Stack - and control goes to doWork
		
		//2. reference variables
		Human h1; //h1 is not the object - it is only reference variable
		h1 = new Human(); //new Human is the object - h1 has the address of where the actual object is located in Heap
		h1= new Human(); //now h1 will have address of the new Human object...the older object of Human is not available for use - and it can be garbage collected
		
		//3. instance variables
		Car myCar = new Car();
		myCar.hp = 120;
		Car myCar2 = new Car();
		myCar2.hp = 800;
		Engine bigEng=new Engine(); // there is a Engine object in Heap, bigengine - reference variable will be in Stack, 
		myCar.engine = bigEng;  //the instance variable myCar.engine - will have the address of the Engine object in Heap - created above
	}
	public static void doWork() {
		float weight = 120.30f;		
	} // at this line the do Work memory will be released from Stack

}

class Car{
	int hp;
	Engine engine;
}
class Engine{
	
}
