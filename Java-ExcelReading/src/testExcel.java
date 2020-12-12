import org.openqa.selenium.*;
import org.apache.log4j.Logger;

public class testExcel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Logger log = Logger.getLogger("devpinoyLogger");
		
		ExcelReader excel = new ExcelReader("test.xlsx");
		String sheetName = "Sheet2";
		
		log.debug("Getting the row count");
		
		System.out.println(excel.getRowCount(sheetName));
		
		log.debug("Getting the column count");
		System.out.println(excel.getColumnCount(sheetName));
		log.debug("Getting the data");
		System.out.println(excel.getCellData(sheetName, "uname", 2));
		log.debug("Entering the data");
		excel.setCellData(sheetName, "uname", 3, "jlopez");
		log.debug("Entering the data");

		excel.setCellData(sheetName, "pass", 3, "sdfdsfd");

	}

}
