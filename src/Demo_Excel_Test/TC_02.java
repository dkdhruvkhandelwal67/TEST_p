package Demo_Excel_Test;

//Imported packages..............................................
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TC_02 {

	//Variables used..............................................
	static Sheet sheet=null;
	static Workbook work_book = null ;
	static String current =null;
	static String file_path =null ;
	static File file =null;
	static FileInputStream read_data =null;
	static String file_extension =null;
	static Row row ;
	static int row_count;
	static Object row_data ;
	static Cell cell ;
	static int j = 0;
	static List<Object> excel_data_fetched = new ArrayList<>();
	//Variables used..............................................


	//Method used.................................................
	public static List<Object> get_excel_data_ondemand(String data_needed)
	{
		//Local variables .....
		boolean status=false;
		List<Object> ls = new ArrayList<>();
		boolean status2=false;
		//Local variables .....

		for(int i=0;i<row_count+1;i++)
		{
			row = sheet.getRow(i);

			for( j = 0;j<row.getLastCellNum();j++)
			{
				cell = row.getCell(j);
				if(cell.getStringCellValue().equalsIgnoreCase(data_needed))
				{
					System.out.println(cell.getStringCellValue());
					status =true;
					break;
				}
			}

			if(status ==true)
			{break;}
			}
		
		System.out.println("Value of column::"+ j);

		for(int i=1;i<row_count+1;i++)
		{
			row = sheet.getRow(i);
			cell = row.getCell(j);
			try {
			ls.add(cell.getStringCellValue());
			}
			catch(IllegalStateException e)
			{
				ls.add(Integer.parseInt(cell.getStringCellValue()));
			}
		}
		return ls;
	}

	public static void give_complete_column_data(String Column_head_name)
	{
		//fetch excel column data and store in a list and prints 
		int column_no=0;
		List<Object> Lst = new ArrayList<>();
		Lst =TC_02.get_excel_data_ondemand(Column_head_name);//this method returns a list of data of a column 

		for(int x=0;x<Lst.size();x++)
		{
			if(Lst.get(x).toString()=="")
			{break;}
			int counter =x+1;
			System.out.println("Excel data for respective column head:"+ " " +Column_head_name + "  ." + counter +" " +Lst.get(x).toString() );
		}
	}


	public static void Excel_setup() throws IOException
	{
		current = System.getProperty("user.dir");
		file_path ="Data_resouce\\Data.xlsx";
		file = new File(file_path);
		//Print the path of setpath and excel relative path........
		System.out.println(file);
		System.out.println(current);
		//Create an object of FileInputStream class to read excel file
		read_data = new FileInputStream(current+ "\\"+file);
		//Find the file extension by splitting file name in substring  and getting only extension
		file_extension = file_path.substring(file_path.indexOf("."));
		//Check condition if the file is xlsx file
		if(file_extension.equals(".xlsx")){
			work_book = new XSSFWorkbook(read_data);
		}
		//Check condition if the file is xls file
		else if(file_extension.equals(".xls")){
			work_book = new HSSFWorkbook(read_data);}
		//Read the sheet
		sheet = work_book.getSheet("test_data");	
		row_count = sheet.getLastRowNum() - sheet.getFirstRowNum();
		System.out.println("Total data rows present in the excel:-->"+ row_count);
	}
	//Method used.................................................

}
