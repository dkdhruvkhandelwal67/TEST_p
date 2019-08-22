package Error_exception;

public class Exceptions_test {

	public static void main(String[] args) {

		
		//Exception 1 ArithmeticException
		
		try {
		int a = 30, b = 0;
		int c = a/b; // cannot divide by zero
		System.out.println ("Result = " + c);
		}
		catch(ArithmeticException e)
		{
			System.out.println ("Can't divide a number by 0");
		}
		
		//Exception 2 NullPointer Exception Demo
		
		try {
		String a = null; //null value
		System.out.println(a.charAt(0));}
		
		catch(NullPointerException e) {
			System.out.println("You are using a null values for your string");
			
			}
		
		//Exception 3 StringIndexOutOfBound demo
		
		try {
		String a = "This is like chipping "; // length is 22
		char c = a.charAt(24); // accessing 25th element
		System.out.println(c);}
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("You are trying to fetch an index value at does not exist (out of bound)");
			}
		
		
		//Exception 4 ArrayIndexOutOfBoundException demo
		try{
			int arra[] = new int[5];
			arra[6] = 9; // accessing 7th element in an array of
			// size 5
			}
			catch(ArrayIndexOutOfBoundsException e){
			System.out.println ("Array Index is Out Of Bounds");}
		
		
	}

}
