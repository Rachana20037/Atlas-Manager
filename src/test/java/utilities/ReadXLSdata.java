package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXLSdata {

	@DataProvider(name = "login_testdata")
	public Object[][] getData() throws IOException {
	    File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\LoginData.xlsx");
	    FileInputStream fis = new FileInputStream(f);
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet("LoginTest");

	    int totalRows = sheet.getLastRowNum();     
	    int totalCols = sheet.getRow(0).getLastCellNum();  

	    // ⚠️ Ensure only 2 columns are read (username, password)
	    if (totalCols > 2) {
	        totalCols = 2;
	    }

	    Object[][] testData = new Object[totalRows][totalCols];
	    DataFormatter format = new DataFormatter();

	    for (int i = 1; i <= totalRows; i++) {
	        for (int j = 0; j < totalCols; j++) {
	            testData[i - 1][j] = format.formatCellValue(sheet.getRow(i).getCell(j));
	        }
	    }

	    wb.close();
	    fis.close();
	    return testData;
	}
}
