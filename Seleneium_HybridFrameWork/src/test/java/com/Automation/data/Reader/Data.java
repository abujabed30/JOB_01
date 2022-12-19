package com.Automation.data.Reader;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class Data {

    @DataProvider(name = "Sheet3")

    public Object[][] excelDemo() throws IOException {

        FileInputStream excel = new FileInputStream("C:\\Users\\banon\\IdeaProjects\\Seleneium_HybridFrameWork\\src\\test\\TestData\\Seleneum Exel.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(excel);
        XSSFSheet sheet = book.getSheet("Sheet3");
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println(rowCount);


        int coloumCount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println(coloumCount);

        Object[][] data = new Object[rowCount][coloumCount];

        for (int i = 0; i < rowCount; i++) {     // there could be lot of row.
            XSSFRow row = sheet.getRow(i);         //pointing to first row.

            for (int j = 0; j < coloumCount; j++) {    // there could be lot of colum.
                data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }

//                   for (Object data1 : data) {
//            System.out.println(data1);
//       }
//       Object[][]  data= new Object[rowCount][coloumCount];
//        for (int i = 0; i < rowCount; i++) {     // there could be lot of row.
//            XSSFRow row = sheet.getRow(i);         //pointing to first row.
//
//            for (int j = 0; j < coloumCount; j++) {    // there could be lot of colum.
//
//                data[i] [j] = sheet.getRow(i).getCell(j).getStringCellValue();
//            }


        return data;
    }







}
