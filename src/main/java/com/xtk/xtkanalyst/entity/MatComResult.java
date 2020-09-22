package com.xtk.xtkanalyst.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyh
 */
public class MatComResult extends MaterialComparisonData{
    private String matNum;

    public void setMatNum(String str) {
        this.matNum = str;
    }

    public String getMatNum() {
       return this.matNum;
    }

    public List<String> getAllAtrr(){
        List<String> lst =new ArrayList<String>();;

        lst.add(this.getMatName());
        lst.add(this.getSpecModel());
        lst.add(this.getManufacturer());
        lst.add(this.getManufacturerNo());
        lst.add(this.getEquipmentManufacturer());
        lst.add(this.getEquipmentManufacturerNo());
        lst.add(this.getMatNum());
        return lst;

    }
}
