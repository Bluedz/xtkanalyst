package com.xtk.xtkanalyst.service;

import java.lang.reflect.Field;

class DemoClass1{
    private String att1;
    private String att2;
    public void setAttr1(String str){ this.att1 = str;}
    public void setAttr2(String str){ this.att2 = str;}
}

class DemoClass2 extends DemoClass1{
    private String attr3;
    public void setAttr3(String str){ this.attr3 = str;}
}


public class TstgGetClassAttr1 {
    public static int getClassAttrLength(Object obj){
        Field[] field = obj.getClass().getDeclaredFields();
        Field[] field2 = obj.getClass().getSuperclass().getDeclaredFields();
        System.out.println(
                field.length + field2.length
        );
        return field.length + field2.length;
    }
    public static void main(String[] args) {
        DemoClass2 dc2 = new DemoClass2();
        dc2.setAttr1("str1");
        dc2.setAttr2("str2");
        dc2.setAttr3("str3");

        getClassAttrLength(dc2);

//        Field[] field = dc2.getClass().getDeclaredFields();
//        Field[] field2 = dc2.getClass().getSuperclass().getDeclaredFields();
//        System.out.println(
//        field.length + field2.length
//        );
    }
}
