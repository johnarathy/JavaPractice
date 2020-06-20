package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException  {
//		for(int i=0; i<3;i++) {
//			Scanner input = new Scanner(System.in);
//			System.out.println("Enter some text: ");
//			String enteredText =  input.nextLine();
//			System.out.println(enteredText);
//		}
		File file = new File("myFile2.txt");
		System.out.println("Attempting to read from file in: "+file.getCanonicalPath());
		Scanner inputFile = new Scanner(file);
		while(inputFile.hasNextLine()) {
			String line = inputFile.nextLine();
			System.out.println(line);
		}
		inputFile.close();
		ExceptionUtil eutil = new ExceptionUtil();
		try {
			eutil.subtract10fromLargerNumber(8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
