package Demo_Excel_Test;

import java.io.IOException;
public class TC_01 extends TC_02{

	public static void main(String[] args) throws IOException 
	{
        TC_02.Excel_setup();
		TC_02.give_complete_column_data("Name");
	}

}
