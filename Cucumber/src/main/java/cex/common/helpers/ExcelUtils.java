package cex.common.helpers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FilenameUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static Logger log = LogManager.getLogger(ExcelUtils.class.getName());

	private static String path;

	private static FileInputStream fis = null;
	private static FileOutputStream fileOut = null;
	private static Workbook ExcelWBook = null;
	private static Sheet ExcelWSheet;
	private static Cell Cell;
	private static Row Row;

	public static void setExcelFile(String Path, String SheetName) {

		path = Constant.Path_TestData + Path;
		try {

			fis = new FileInputStream(path);

			if (FilenameUtils.getExtension(Path).equalsIgnoreCase("XLS")) {
				ExcelWBook = new HSSFWorkbook(fis);
			} else if (FilenameUtils.getExtension(Path).equalsIgnoreCase("XLSX")) {
				ExcelWBook = new XSSFWorkbook(fis);
			}
			// ExcelWSheet = ExcelWBook.getSheetAt(0);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			/*
			 * if (ExcelWBook.getNumberOfSheets() != 0) { for (int i = 0; i <
			 * ExcelWBook.getNumberOfSheets(); i++) { if
			 * (ExcelWBook.getSheetName(i).equals(SheetName)) { ExcelWSheet =
			 * ExcelWBook.getSheet(SheetName); } else { throw new
			 * IOException("Sorry Invalid SheetName"); } } } else { throw new
			 * IOException("Sorry Invalid SheetName"); }
			 */
			fis.close();
		} catch (Exception e) {

			log.error("setExcelFile", e);
		}
	}

	public static String getCellData(String ColNum) throws Exception {

		try {

			Row = ExcelWSheet.getRow(0);

			int col_Num = -1;

			for (int i = 0; i < Row.getLastCellNum(); i++) {
				// System.out.println(Row.getCell(i).getStringCellValue().trim());
				if (Row.getCell(i).getStringCellValue().trim().equals(ColNum))
					col_Num = i;
			}
			if (col_Num == -1)
				return "";

			Cell = ExcelWSheet.getRow(1).getCell(col_Num);
			String CellData = Cell.getStringCellValue();

			return CellData;
		} catch (Exception e) {

			log.error("Invalid Colnum name : getCellData", e);

			throw new IOException("Invalid Colnum name");
		}
	}

	public static void setCellData(String colName, String data) throws Exception {

		try {

			Row = ExcelWSheet.getRow(0);
			int colNum = -1;
			for (int i = 0; i < Row.getLastCellNum(); i++) {
				// System.out.println(row.getCell(i).getStringCellValue().trim());
				if (Row.getCell(i).getStringCellValue().trim().equals(colName))
					colNum = i;
			}
			if (colNum == -1)
				return;

			// ExcelWSheet.autoSizeColumn(colNum);
			// Row = ExcelWSheet.getRow(1);
			// if (Row == null)
			// Row = ExcelWSheet.createRow(rowNum-1);

			// Cell = Row.getCell(colNum);
			Cell = ExcelWSheet.getRow(1).getCell(colNum);

			/*
			 * if (Cell == null) { Cell = Row.createCell(colNum); } else { throw new
			 * IOException("Invalid Colnum Name"); }
			 */
			Cell.setCellValue(data);

			fileOut = new FileOutputStream(path);
			ExcelWBook.write(fileOut);
			fileOut.close();
		} catch (Exception e) {

			log.error("setCellData", e);
		}

	}

	public static String getCellData(String ColNum, int rows) throws Exception {

		try {

			Row = ExcelWSheet.getRow(0);
			int col_Num = -1;

			for (int i = 0; i < Row.getLastCellNum(); i++) {
				// System.out.println(Row.getCell(i).getStringCellValue().trim());
				if (Row.getCell(i).getStringCellValue().trim().equals(ColNum))
					col_Num = i;
			}
			if (col_Num == -1)
				return "";

			Cell = ExcelWSheet.getRow(rows).getCell(col_Num);
			String CellData = Cell.getStringCellValue();
			return CellData;
		} catch (Exception e) {

			log.error("Invalid Colnum name : getCellData", e);

			throw new IOException("Invalid Colnum name");
		}
	}

	public static void setCellData(String colName, String data, int rows) throws Exception {

		try {

			Row = ExcelWSheet.getRow(0);

			int colNum = -1;
			for (int i = 0; i < Row.getLastCellNum(); i++) {
				// System.out.println(row.getCell(i).getStringCellValue().trim());
				if (Row.getCell(i).getStringCellValue().trim().equals(colName))
					colNum = i;
			}
			if (colNum == -1)
				return;
			// ExcelWSheet.autoSizeColumn(colNum);
			// Row = ExcelWSheet.getRow(rows);
			// if (Row == null)
			// Row = ExcelWSheet.createRow(rowNum-1);
			// Cell = Row.getCell(colNum);

			Cell = ExcelWSheet.getRow(rows).getCell(colNum);
			/*
			 * if (Cell == null) { Cell = Row.createCell(colNum); } else { throw new
			 * IOException("Invalid Colnum Name"); }
			 */
			Cell.setCellValue(data);
			fileOut = new FileOutputStream(path);
			ExcelWBook.write(fileOut);
			fileOut.close();
		} catch (Exception e) {

			log.error("setCellData", e);
		}
	}

	public static String VerifyColName(String ColNam) throws Exception {

		try {

			Row = ExcelWSheet.getRow(0);
			int col_Num = -1;
			for (int i = 0; i < Row.getLastCellNum(); i++) {
				// System.out.println(Row.getCell(i).getStringCellValue().trim());
				if (Row.getCell(i).getStringCellValue().trim().equals(ColNam))
					col_Num = i;
			}
			if (col_Num == -1)
				return "";

			return ColNam;
		} catch (Exception e) {

			log.error("Invalid Colnum name : VerifyColName", e);

			throw new IOException("Invalid Colnum name");
		}
	}

	public static void setListOfData(String colName, ArrayList<String> setValues) throws Exception {

		try {

			Row = ExcelWSheet.getRow(0);

			int colNum = -1;
			for (int i = 0; i < Row.getLastCellNum(); i++) {
				// System.out.println(row.getCell(i).getStringCellValue().trim());
				if (Row.getCell(i).getStringCellValue().trim().equals(colName))
					colNum = i;
			}
			if (colNum == -1)
				return;

			int i = 0;

			// System.out.println(setValues);

			for (String w : setValues) {
				i++;
				Cell = ExcelWSheet.getRow(i).getCell(colNum);
				Cell.setCellValue(w);
				// System.out.println(colNum);
			}

			fileOut = new FileOutputStream(path);
			ExcelWBook.write(fileOut);
			fileOut.close();
		} catch (Exception e) {

			log.error("setListOfData", e);
			// throw new IOException("Invalid Colnum name or Something wrong happened");
		}
	}
}