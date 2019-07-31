package Demo_2;

public class Child extends Parent{

public void cars()
	
	{
		System.out.println("Cars from child");
	}
	
public void print_car()
{
     this.cars();
     super.cars();
}

	public static void main(String[] args) {
		
		Child ch = new Child();
		
		ch.print_car();
		
	}

}
