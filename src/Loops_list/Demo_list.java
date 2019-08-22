package Loops_list;

import java.util.ArrayList;
import java.util.List;

public class Demo_list {

	//List in java is an interface which is implemented using  class ArrayList its a part of Collections in java
	//list is used to store data, its very usefull when number of data you want to store keeps changing
	
	public static void main(String[] args)
	{
	List<String> Lst = new ArrayList<>();  //ArrayList class implement interface List
	List<Integer> Lst2 = new ArrayList<>();  //ArrayList class implement interface List
	List<Object> Lst3 = new ArrayList<>();  //object is parent clas in java list of type object store all data types

	//store data in list 
	Lst.add("Rita"); //index 0
	Lst.add("Pooja");//index 1
	Lst.add("Tanu");//index 2
	Lst.add("Dhruv");//index 3
	Lst.add("Test");//index 4
	Lst.add("Astha");//index 5
	
	Lst2.add(1);
	Lst2.add(3);
	Lst2.add(12232);
	
	Lst3.add("tetstss");
	Lst3.add(34334);
	
	for(int i=0;i<Lst.size();i++)  //Lst.size()-- get size of list (integer value)
	{
		System.out.println("Value of data in list is --->>" +Lst.get(i));
	}
	}

}
