package Loops_list;

public class Demo_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//For Loop ..............
		int y=1;
		int k=1;
		for(int i=0;i<=5;i++)  //i++ means i+1 , 
		{
			System.out.println("We are testing for loop--->" + i);
		}
		
		//While Loop ..............
		
		while(y<=5)
		{
			System.out.println("Test while loop ---->"+y);
			y++;
		}
		
		// Do while loop............
		
		do {
			System.out.println("Test do while loop--->" + k);
			k++;
		}
		while(k<=5);
				 
		int m = 0;
		//continue and break 
		//break : when we use a break statement in a loop we come out of the loop 
		// when we use continue control goes to the start of the loop
		while(m<=5)
		{
			System.out.println("break ---->"+m); //print m which is 0 initially 
			m++; // increment by 1 m = 0+1 =1
			break; //come out of the loop
		}
		
		int l=0;
		while(l<=5)
		{
			System.out.println("continue ---->"+l); //print m which is 0 initially 
			l++;
			continue; //execution will start from loop condition again
		}
	}

}
