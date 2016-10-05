import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C:\\Users\\jyothi\\Desktop\\tutorials\\RegressionTest.xlsx");
		
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		
		HSSFSheet s=wb.getSheet("Testdata");
		Iterator<Row> rowIt=s.iterator();
		
		while(rowIt.hasNext()) {
			System.out.println(rowIt.next().getCell(0).getNumericCellValue());
			
		}
		
	}

}
