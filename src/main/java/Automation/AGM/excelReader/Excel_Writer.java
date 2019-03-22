package Automation.AGM.excelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Excel_Writer {

		public FileOutputStream fileout;
		public String path;
		public FileInputStream fis;
		public XSSFWorkbook workbook;
		public XSSFSheet sheet;
		public XSSFRow row;
		public XSSFCell cell;


		public Excel_Writer()
		{
			//this.path = path;
			try
			{
				//fileout = new FileOutputStream(path);
				workbook = new XSSFWorkbook();
				sheet = workbook.createSheet("Results");
			}

			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		public void writedata(String casenum, String claimnumber, String passfail) throws FileNotFoundException, IOException
		{
			Map <String, Object[]> info = new TreeMap<String, Object[]>();
			
			int counter = 0;
			while (claimnumber != null || !claimnumber.equals("false"))
			{
				info.put(casenum, new Object[] {claimnumber, passfail});
			}
			info.put(casenum, new Object[] {claimnumber, passfail});
			System.out.println("DEBUG: " + claimnumber + " ====");
			
			Set<String> keyid = info.keySet();
			int rowid = 0;
			
			for (String key : keyid)
			{
		
				row = sheet.createRow(rowid++);
		        Object [] objectArr = info.get(key);
		        int cellid = 0;
		         
		        for (Object obj : objectArr)
		        {
		           Cell cell = row.createCell(cellid++);
		           cell.setCellValue((String)obj);
		         }
			}	
		}
		
		public void output() throws IOException {
			FileOutputStream out = new FileOutputStream(
			new File("T:/jmilkey/WritesheetTest.xlsx"));
					      
			workbook.write(out);
			out.close();
			System.out.println("WritesheetTest.xlsx written successfully");
		}	
	}
