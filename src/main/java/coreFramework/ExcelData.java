/**
 * 
 */
package coreFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import cucumber.api.java.it.Data;

/**
 * @author kaviag
 *
 */
public class ExcelData {

	public static String filename = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\DataSheet.xlsx";
	// public static String sheetName = "Sanity"
	public static FileInputStream fis = null;
	public static FileOutputStream fileOut = null;
	private static Map<String, String> map = new HashMap<>();
	private static XSSFWorkbook workbook = null;
	private static XSSFSheet worksheet = null;
	private static XSSFRow row = null;
	private static XSSFCell cell = null;

	public ExcelData(String path) {
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			worksheet = workbook.getSheetAt(0);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * public String get(String testcasename,String columnname) throws
	 * IOException { int k =0; try { fis = new FileInputStream(filename);
	 * workbook = new XSSFWorkbook(fis); worksheet =
	 * workbook.getSheet(sheetName); int rows =
	 * worksheet.getPhysicalNumberOfRows(); int row_Count =
	 * worksheet.getLastRowNum()+1;
	 * 
	 * for(int i=0;i<rows;i++){ int column =
	 * worksheet.getRow(0).getPhysicalNumberOfCells(); for (int j = 0; j <
	 * column; j++) {
	 * if(worksheet.getRow(i).getCell(j,Row.CREATE_NULL_AS_BLANK).toString().
	 * replace(".0", ""). equalsIgnoreCase(columnname)){ k=j; }
	 * map.put(worksheet.getRow(i).getCell(0,Row.CREATE_NULL_AS_BLANK).toString(
	 * ).replace(".0", ""),
	 * worksheet.getRow(i).getCell(k,Row.CREATE_NULL_AS_BLANK).toString().
	 * replace(".0", "")); } } }catch (Exception e){e.printStackTrace(); }
	 * return map.get(testcasename); }
	 **/

	public static String getData(String TestCaseName, String columnName) throws IOException {

		ExcelData data = new ExcelData(filename);
		int rowFlag = 0;
		int colnFlag = 0;

		// String testDataWorkSheetName=ORUtil.getConfigValue("SheetName");
		try {
			int index = workbook.getSheetIndex(ORUtil.getConfigValue("SheetName"));
			worksheet = workbook.getSheetAt(index);

			int rowCount = worksheet.getLastRowNum() + 1;
			int columnCount = worksheet.getRow(0).getLastCellNum();

			for (int row = 1; row <= rowCount; row++) {
				String testNameInExcelRow = data.get(TestCaseName, 0, row);
				if (testNameInExcelRow.equals(TestCaseName)) {
					rowFlag = row;
					break;
				}
			}

			for (int col = 0; col <= columnCount; col++) {
				String testNameInExcelColn = data.get(TestCaseName, col, 1);
				if (testNameInExcelColn.equals(columnName)) {
					colnFlag = col;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return data.get(TestCaseName, colnFlag, rowFlag);

	}

	public static String get(String testcasename, int columnNum, int rowNum) throws IOException {
		try {
			int index = workbook.getSheetIndex(ORUtil.getConfigValue("SheetName"));
			worksheet = workbook.getSheetAt(index);

			row = worksheet.getRow(rowNum - 1);
			cell = row.getCell(columnNum);
			if (cell == null) {
				return "";
			}
			return cell.getStringCellValue();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return map.get(testcasename);
	}

	public static boolean setData(String TestCaseName, String columnName, String value) throws IOException {

		ExcelData dataTable = null;
		int rowFlag = 0;
		try {
			dataTable = null;
			dataTable = new ExcelData(filename);
			rowFlag = 0;

			int index = workbook.getSheetIndex(ORUtil.getConfigValue("SheetName"));
			worksheet = workbook.getSheetAt(index);

			int rowCount = worksheet.getLastRowNum() + 1;

			for (int row = 1; row <= rowCount; row++) {
				String testNameInExcelRow = ExcelData.get(TestCaseName, 0, row);
				if (testNameInExcelRow.equals(TestCaseName)) {
					rowFlag = row;
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataTable.set(TestCaseName, columnName, rowFlag, value);

	}

	public boolean set(String testcasename, String columnName, int rowNum, String value) throws IOException {
		try {
			fis = new FileInputStream(filename);
			workbook = new XSSFWorkbook(fis);
			workbook.setForceFormulaRecalculation(true);
			int index = workbook.getSheetIndex(ORUtil.getConfigValue("SheetName"));
			worksheet = workbook.getSheetAt(index);
			row = worksheet.getRow(0);
			int colNum = -1;
			for (int j = 0; j < row.getLastCellNum(); j++) {
				if (row.getCell(j).getStringCellValue().trim().equals(columnName))
					colNum = j;
			}
			worksheet.autoSizeColumn(colNum);
			row = worksheet.getRow(rowNum - 1);
			if (row == null)
				row = worksheet.createRow(rowNum - 1);

			cell = row.getCell(colNum);
			if (cell == null)
				cell = row.createCell(colNum);

			cell.setCellValue(value);

			fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
			fileOut.close();
			System.out.println("DATA SET TO EXCEL " + value);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List getExcelData() {
		List excelData = new ArrayList();
		List datalist = new ArrayList();
		;
		try {

			// HashMap<Integer, Data> mp= new HashMap<Integer, Data>();

			fis = new FileInputStream(filename);
			workbook = new XSSFWorkbook(fis);
			int index = workbook.getSheetIndex(ORUtil.getConfigValue("SheetName"));
			worksheet = workbook.getSheetAt(index);
			// Iterator<Row> rowIterator = worksheet.iterator();
			// Iterator<Cell> cellIterator = row.cellIterator();

			Iterator rows = worksheet.rowIterator();
			while (rows.hasNext()) {
				row = (XSSFRow) rows.next();
				Iterator cells = row.cellIterator();

				List cellData = new ArrayList();
				while (cells.hasNext()) {
					cell = (XSSFCell) cells.next();
					cellData.add(cell);
				}

				excelData.add(cellData);
			}

			for (int rowNum = 1; rowNum < excelData.size(); rowNum++) {

				List list = (List) excelData.get(rowNum);
				int cellNum = 0;
				// for (int cellNum = 0; cellNum < list.size(); cellNum++) {

				cell = (XSSFCell) list.get(cellNum);

				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
					System.out.print(cell.getRichStringCellValue().getString() + " ");
					datalist.add(cell.getRichStringCellValue().getString());

				} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
					System.out.print(cell.getNumericCellValue() + " ");
					datalist.add(cell.getNumericCellValue());
				} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
					System.out.println(cell.getBooleanCellValue() + " ");
					datalist.add(cell.getBooleanCellValue());
				}
				// }
				// System.out.println("\n data from excel " +excelData);
			}

			fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
			fileOut.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return datalist;
	}

}
