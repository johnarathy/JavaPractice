package javabasics;

//import is only for classes from other packages
import utility.ClassAccessModifier;

/*Access modifiers can be for methods or classes
 * 
 * 
 */

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utils.callFns();
		ClassAcsModfr.doSomethin(); //default classes are accessible within same package
		ClassAccessModifier.main(null);
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	private static void sub(int a,int b) {	//gives warning that it is not used locally
		System.out.println(a-b);
	}

}

//only 1 public class is allowed in 1 file
class Utils{
	public static void callFns() {
		AccessModifiers.add(10, 20);
		//AccessModifiers.sub(20, 10); -- sub is a private method so cannot be accessed
	}
}
