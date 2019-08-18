package Inheritence_poly;

public class Parent {

	protected int i =7; 
	int data=4;
	String str = "Test";
	
	
	public void test_01()
	{
		
		System.out.println("First method in parent class");
	}
	
	public int test_02(int a,int b)//Polymorphism...(overloading)
	{
		System.out.println("Second method in parent class");
		return a+b;
	}
	
	public static void test_02()
	{
		System.out.println("Third method in parent class");
	}
	
	 public void test_04()
		{
			System.out.println("Fourth method in parent class");
		}
}
