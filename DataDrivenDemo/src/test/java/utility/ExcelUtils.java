package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWbook;
	private static XSSFCell Cell;
	private static XSSFRow Row;

	public static void setExcelFile(String path, String sheetName) throws Exception {
		try {
			FileInputStream excelFileInputStream = new FileInputStream(path);
		} catch (Exception e) {
			throw e;
		}
	}

	public static Object[][] getTableArray(String FilePath, String SheetName , int testCaseRow ) throws Exception
	{
		String [][] tabArray = null;
		try {
			FileInputStream ExcelFile = new FileInputStream(FilePath);
			ExcelWbook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWbook.getSheet(SheetName);
			int startRows = 1;
			int startCols = 1;
			int ci,cj;
			int totalRows = ExcelWSheet.getLastRowNum();
			int totalCols = 2;
			tabArray = new String[totalRows][totalCols];
			ci = 0;
		/*	for(int i = startRows; i<=totalRows; i++,ci++)
			{*/
				cj = 0;
				for(int j = startCols;j<=totalCols; j++,cj++)
				{
					tabArray[ci][cj] = getCellData(testCaseRow, j);
					System.out.println(tabArray[ci][cj]);
				
				//}
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return (tabArray);
	}

	public static String getCellData(int rowNum, int colNum) throws Exception {
		try {
			Cell = ExcelWSheet.getRow(rowNum).getCell(colNum);

			String CellData = Cell.getStringCellValue();
			return CellData;
		} catch (Exception e) {
			throw (e);

		}
	}

	public static String getTestCaseName(String testCase) throws Exception {
		String value = testCase;
		try {
			int position = value.indexOf("@");
			value = value.substring(0, position);
			position = value.lastIndexOf(".");
			value = value.substring(position + 1);
			return value;
		} catch (Exception e) {
			throw (e);
		}
	}

	public static int getRowUsed() throws Exception {
		try {
			int rowCount = ExcelWSheet.getLastRowNum();
			System.out.println(rowCount);
			return rowCount;
		} catch (Exception e) {
			throw (e);
		}
	}

	public static int getRowContent(String testCaseName, int colNum) throws Exception {
		int i;
		try {
			int rowCount = ExcelUtils.getRowUsed();
			for (i = 0; i <= rowCount; i++) {
				if (ExcelUtils.getCellData(i, colNum).equalsIgnoreCase(testCaseName)) {
					break;
				}
			}
			return i;
		} catch (Exception e) {
			throw (e);
		}

	}
}
