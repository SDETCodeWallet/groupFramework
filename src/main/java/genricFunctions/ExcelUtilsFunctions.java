package genricFunctions;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.hssf.usermodel.HSSFRow;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsFunctions {

	private static String cellvalue;

	private static String[] values;

	private static String value0;

	private static String value1;

	private static Sheet sh;

	private static XSSFWorkbook xssfbook;

	private static HSSFWorkbook hssfbook;

	private static Cell clstatus;

	private static FileInputStream File;

	private static FileOutputStream fileop;

	private static File loc;

	private static HSSFRow hssfrow;

	private static XSSFRow xssfrow;

	public static String readExcel(String path, int sheet, int row, int column) throws IOException {

		loc = new File(path);

		values = path.split("\\.");

		value0 = values[0];

		value1 = values[1];

		if (value1.equalsIgnoreCase("xlsx")) {

			try {

				File = new FileInputStream(loc);

				xssfbook = new XSSFWorkbook(File);

				sh = xssfbook.getSheetAt(sheet);

				cellvalue = sh.getRow(row).getCell(column).getStringCellValue();

			} catch (Exception IO) {

				System.out.println("Exception message" + IO);

			}

		} else if (value1.equalsIgnoreCase("xlx")) {

			try {

				File = new FileInputStream(loc);

				hssfbook = new HSSFWorkbook(File);

				sh = hssfbook.getSheetAt(sheet);

				cellvalue = sh.getRow(row).getCell(column).getStringCellValue();

			} catch (Exception IO) {

				System.out.println("Exception message" + IO);

			}

		}

		return cellvalue;

	}

	public static void writeCodeToexcel(String path, int sheet, int row, int Cellnum, String writecellvalue)
			throws FileNotFoundException {

		loc = new File(path);

		values = path.split("\\.");

		value0 = values[0];

		value1 = values[1];

		if (value1.equalsIgnoreCase("xlsx")) {

			try {

				File = new FileInputStream(loc);

				xssfbook = new XSSFWorkbook(File);

				fileop = new FileOutputStream(loc);

				xssfbook.getSheetAt(sheet).getRow(row).getCell(Cellnum).setCellValue(writecellvalue);

				xssfbook.write(fileop);

				fileop.close();

			} catch (Exception IO) {

				System.out.println("File is not correct:" + IO);

			}

		} else if (value1.equalsIgnoreCase("xlx")) {

			try {

				File = new FileInputStream(path);

				hssfbook = new HSSFWorkbook(File);

				fileop = new FileOutputStream(loc);

				hssfbook.getSheetAt(sheet).getRow(row).getCell(Cellnum).setCellValue(writecellvalue);

				hssfbook.write(fileop);

				hssfbook.close();

			} catch (Exception IO) {

				System.out.println("File is not correct:" + IO);

			}

		}
	}

	/* for any type of excel it will works */

	public static void writeCodeToexcel1() throws EncryptedDocumentException, InvalidFormatException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Deepak\\Desktop\\Excels\\Selenium1.xlsx");

		Workbook wbook = new WorkbookFactory().create(fis);

		// String
		// val=wbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		// System.out.println(val);

		wbook.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("my name is shubham");

		wbook.write(new FileOutputStream("C:\\Users\\Deepak\\Desktop\\Excels\\Selenium1.xlsx"));

		wbook.close();

	}

}
