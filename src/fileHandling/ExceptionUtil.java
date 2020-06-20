package fileHandling;

public class ExceptionUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int subtract10fromLargerNumber(int number) throws FooRuntimeException{
		if(number < 10) {
			throw new FooRuntimeException("Number passed was smaller than 10");
		}
		return number-10;
	}
	
	public class FooRuntimeException extends Exception{
		public FooRuntimeException(String message) {
			super(message);
		}
	}

}
