package javabasics;

public class LearningArrays {

	public static void main(String[] args) {
		
		int x=20;	//allowed
		//int y = 20,30,40;	//not allowed -- we need Arrays for this
		
		//Arrays
		int[] values = new int[100];
		
		values[2] = 20;	//the index positions are from 0 to size-1 (99)
		values[99]= 234;
		System.out.println(values[52]);    // all non-assigned indices will have value 0
		System.out.println(values[2]); 		// assigned indices will have the value given
		//System.out.println(values[100]); 	//out of index bound...as valid indices are from 0 to 99 - RTE
		
		//values[30] = "this is a string";	//type mismatch CTE - as values is an integer array - decided during declaration
		
		//since size of array is decided at assignment, if we have to create a bigger array we need to assign again, 
		//but previous data will be lost
		values = new int[200];
		System.out.println(values[2]);
		
		//we can also assign the values into the array directly
		values= new int[] {1,2,3,4,5};
		System.out.println(values.length);
		
	}

}
