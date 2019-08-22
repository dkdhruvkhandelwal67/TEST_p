package Error_exception;

public class Error_testing {
	
	public static int sum(int a,int b)
	{
		return a-b;
	}

	public static void main(String[] args) {

		//syntax error...................

		/*      int y=2
				System.out.println(y);   */

		//Semantic error...................

		/*   int i;
		     i++;   */
		
//		logical error.....................
		
		System.out.println(Error_testing.sum(9, 5));

	}

	

}
