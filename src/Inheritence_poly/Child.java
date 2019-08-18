package Inheritence_poly;

public class Child extends Parent{ //inheriting parent class using Extends

	 static Child ch = new Child();
	 int data=9;
	 
	 public void test_04()
		{
			System.out.println("Fourth method in child class");
		}
	 
	 public void overriding()
		{
		  this.test_04();
		  super.test_04();
		  
		  System.out.println("Parent --->"+ super.data);
		  System.out.println("Child --->"+ this.data);

		}
	
	public static void main(String[] args) {
		int Process_Data;

//		ch.test_01(); //classing method from parent class using a child class object
//		Child.test_02();//classing method from parent class using a child class name
//		Parent.test_02();//classing method from parent class using a parent class name
//		Process_Data = ch.test_02(2, 5); //===> 7 store in variable processdata
//		System.out.println("Print-->"+ Process_Data);
		
		//Polymorphism...(overriding)
		
		ch.overriding();
		
		
		
	}

}
