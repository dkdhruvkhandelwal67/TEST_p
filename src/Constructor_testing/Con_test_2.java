package Constructor_testing;

public class Con_test_2 {
	int i;
	String str;
	
	public void data1()
	{
		System.out.println("data1");
	}
	
	public Con_test_2(int a,String s) //parametrized constructor
	{
		System.out.println("Creating a parametrized constructor");
		this.i=a;
		this.str =s;
	}
	
	
	public static void main(String[] args) {
		
		Con_test_2 obj = new Con_test_2(5,"data___test");
		
		System.out.println("Print parametrized i-->"+obj.i); // printing parameterized  value of i as initialized by constructor
		System.out.println("Print parametrized str-->"+obj.str);// printing parameterized value of str as initialized by constructor

	}

}
