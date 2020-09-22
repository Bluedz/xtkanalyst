package com.xtk.xtkanalyst.service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class DemoClass01{
    private String att1;
    private String att2;
    public void setAttr1(String str){ this.att1 = str;}
    public void setAttr2(String str){ this.att2 = str;}
}

class DemoClass02 extends DemoClass1{
    private String attr3;
    public void setAttr3(String str){ this.attr3 = str;}
}


public class GetClassAttr {
    public static List<String> objToStrList(Object obj){
        Field[] field = obj.getClass().getDeclaredFields();
        Field[] fieldAll = obj.getClass().getSuperclass().getDeclaredFields();
        List<String> fdNameLst = new ArrayList<String>();
        for( Field fd : field){
            fdNameLst.add(fd.getName());
        }
        for( Field fdA : fieldAll){
            fdNameLst.add(fdA.getName());
        }
        return fdNameLst;
    }
    public static int getClassAttrLength(Object obj){
        Field[] field = obj.getClass().getDeclaredFields();
        Field[] fieldAll = obj.getClass().getSuperclass().getDeclaredFields();
        System.out.println(
                field.length + " this : all " + fieldAll.length + " : con " + fieldAll.length
        );
        return fieldAll.length;
    }
    public static void main(String[] args) {

        DemoClass02 dc2 = new DemoClass02();
        dc2.setAttr1("str1");
        dc2.setAttr2("str2");
        dc2.setAttr3("str3");
        getClassAttrLength(dc2);

        Field[] field = dc2.getClass().getDeclaredFields();
        Field[] field2 = dc2.getClass().getSuperclass().getDeclaredFields();
        System.out.println(
        field.length + " " + field2.length
        );
    }
}
