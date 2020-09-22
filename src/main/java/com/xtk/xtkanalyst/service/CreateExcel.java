package com.xtk.xtkanalyst.service;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateExcel {
    public void createFile(int a, int b){
        // 1. 创建workbook         // 2. 创建工作表
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("我是第一个工作表");

        for (int i=0; i < a; i++) {
            // 3. 创建行
            HSSFRow row = sheet.createRow(i);
            // 4. 创建单元格         // 5. 为单元格设置内容
            for (int j=0; j <b; j++) {
                HSSFCell cell = row.createCell(j);
                cell.setCellValue("这是单元格");
            }
        }
        // 6. 所有内容设置完毕，导出xls文件
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("E:/Codes/files/exp/file.xls");
            workbook.write(fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createFromStrList(List<List<String>> strLstLst){
        String filePath = "E:\\Codes\\idea\\XTKanalyst\\target\\classes\\static\\xlsResult\\" + "strListfile.xls";
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("sheet1");
        int i = 0;
        for (List<String> strLst : strLstLst){
            HSSFRow row = sheet.createRow(i);
            int j = 0;
            for (String str: strLst){
                HSSFCell cell = row.createCell(j);
                cell.setCellValue(str);

                CellStyle style =  workbook.createCellStyle();
                style.setFillForegroundColor(IndexedColors.RED.getIndex());
//                style.setFillPattern(CellStyle.SOLID_FOREGROUND);
                cell.setCellStyle(style);
                j++;
            }
            i++;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(
                    filePath
//                    "/static/xlsResult/strListfile.xls"
            );
            workbook.write(fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createFromObject(List<Object> objLst){
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("sheet1");

        int i = 0;
//        Object oblt = objLst.get(0);
        for (Object objl: objLst){
            HSSFRow row = sheet.createRow(i);

            for (int j=0 ; j < GetClassAttr.getClassAttrLength(objl); j++){
                HSSFCell cell = row.createCell(j);

                cell.setCellValue("这是单元格");
            }
            i++;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("E:/Codes/files/exp/objListfile.xls");
            workbook.write(fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void createDemoFile() {
        // 1. 创建workbook
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 2. 创建工作表
        HSSFSheet sheet = workbook.createSheet("我是第一个工作表");
        // 3. 创建行
        HSSFRow row = sheet.createRow(0);
        // 4. 创建单元格
        HSSFCell cell = row.createCell(0);
        // 5. 为单元格设置内容
        cell.setCellValue("这是A1单元格");
        // 6. 所有内容设置完毕，导出xls文件
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("E:/Codes/files/exp/demo.xls");
            workbook.write(fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CreateExcel ce = new CreateExcel();
//        ce.createDemoFile();
        ce.createFile(3, 4);


    }
}
