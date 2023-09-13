package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {

	public static void data() throws Exception {
		File f = new File("C:\\Users\\Admin\\git\\newcode\\Baseclasses\\Testdata\\Book 11.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(2);
		 CellType Type = c.getCellType();
		String value = null;
		if(Type==CellType.STRING) {
			value = c.getStringCellValue();
		}
		else if(Type==CellType.NUMERIC) {
			if(DateUtil.isCellDateFormatted(c)) {
				Date dt = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
				value =sim.format(dt);
			}
			
		}
		else {
			long v = (long) c.getNumericCellValue();
			value = String.valueOf(v);
		}
		 System.out.println(value);
	}
	
}
