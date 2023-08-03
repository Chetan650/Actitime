package com.actitime.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String readDataFromExcel(String sheetName, int rowNum, int cellVal)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellVal);
		String value = cell.getStringCellValue();
		return value;
	}
}