package Constructor_testing;

public class Con_Test {
	int i;
	String str;
	
	public void data1()
	{
		System.out.println("data1");
	}
	
	public Con_Test() //Default constructor
	{
		System.out.println("Creating a constructor");
	}
	
	
	public static void main(String[] args) {
		
		Con_Test obj = new Con_Test();
		
		System.out.println("Print default i-->"+obj.i); // printing default value of i as initialized by constructor
		System.out.println("Print default str-->"+obj.str);// printing default value of str as initialized by constructor

	}

}
