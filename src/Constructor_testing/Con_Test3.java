package Constructor_testing;

public class Con_Test3 {
	int i;
	String str;
	
	public void data1()
	{
		System.out.println("data1");
	}
	
	public Con_Test3(int a,String s) //parametrized constructor
	{
		System.out.println("Creating a parametrized constructor");
		this.i=a;
		this.str =s;
	}
	
	public Con_Test3() //default constructor
	{
		System.out.println("Creating a parametrized constructor");
	}
	
	
	public static void main(String[] args) {
		
		Con_Test3 obj = new Con_Test3(5,"data___test");
		Con_Test3 obj1 = new Con_Test3();
		System.out.println("Print parametrized i-->"+obj.i); // printing parameterized  value of i as initialized by constructor
		System.out.println("Print parametrized str-->"+obj.str);// printing parameterized value of str as initialized by constructor

		
		System.out.println("Print default i-->"+obj1.i); // printing default  value of i as initialized by constructor
		System.out.println("Print default str-->"+obj1.str);// printing default value of str as initialized by constructor

	}

}
