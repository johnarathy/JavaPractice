package javabasics;

public class StringsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello";
		String b="there";
		if(a=="hello") {
			//this is not correct way to compare values - compares objects
			System.out.println("loop 1");
		}
		if(a.equals("hello")) {
			System.out.println("a value");
		}
		if(b.equalsIgnoreCase("There")) {
			System.out.println("b value - case ignore");
		}
		System.out.println(a.indexOf("l")); // first occurence
		System.out.println(a.lastIndexOf("l"));
	}

}
