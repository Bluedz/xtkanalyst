package com.xtk.xtkanalyst.service;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yuhen
 */

@Repository
public class MaterialComparisonDataService {
    private final static String excel2003 = ".xls";
    private final static String getExcel2007 = ".xlsx";

    /**
     * @param  // in
     * @param //filename
     * 处理上传的 excel文件
     */
    public List<List<Object>> getBankListByExcel(InputStream in, String fileName) throws Exception{
        List<List<Object>> list = null;
        // 创建excel工作簿
        Workbook work = this.getWorkbook(in, fileName);
        if(null == work) {
           throw new Exception("创建Excel工作簿为空");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;

        list = new ArrayList<List<Object>>();
        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if(sheet==null){continue;}

            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {
                row = sheet.getRow(j);
                if(row==null||row.getFirstCellNum()==j){continue;}

                List<Object> li = new ArrayList<Object>();
                for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {
                    cell = row.getCell(y);
                    li.add(cell);
                }
                list.add(li);
            }
        }
        work.close();
        return list;
    }

    public Workbook getWorkbook(InputStream inStr, String fileName) throws Exception{
            Workbook wb = null;
            String fileType = fileName.substring(fileName.lastIndexOf("."));
            if(excel2003.equals(fileType)){
                wb = new HSSFWorkbook(inStr);
            }else if(getExcel2007.equals(fileType)){
                wb = new XSSFWorkbook(inStr);
            }else{
                throw new Exception("文件后缀不正确，解析的文件格式可能有误！");
            }
            return wb;
    }

    }
