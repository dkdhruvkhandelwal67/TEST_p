package Interface_class;

public interface Interface_test {
	
	//in interface we can only define code logic for default and static methods
	public static void test_01() {
		
		System.out.println("TEST first");
	}
	
	  default void test_02() {
		
		System.out.println("TEST second");
	}
	
	public void test_03(); // method are by default abstract in nature
	
	public void test_04(); // method are by default abstract in nature
	
	public void test_05(); // method are by default abstract in nature

	public void test_06(); // method are by default abstract in nature

	public void test_07(); // method are by default abstract in nature


}
