package com.xtk.xtkanalyst.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * material_comparison_data
 * @author zyh
 */

@Repository
public class MaterialComparisonData implements Serializable {
    /**
     * 自增序号
     */
    private Integer id;

    /**
     * 物料名称
     */
    private String matName;

    /**
     * 规格/型号
     */
    private String specModel;

    /**
     * 制造商
     */
    private String manufacturer;

    /**
     * 制造商编号
     */
    private String manufacturerNo;

    /**
     * 设备制造商
     */
    private String equipmentManufacturer;

    /**
     * 设别制造商编号
     */
    private String equipmentManufacturerNo;

    private static final long serialVersionUID = 1L;

    public void setClassAttr( List<Object> lst){
        this.matName = String.valueOf(lst.get(0));
        this.specModel = String.valueOf(lst.get(1));
        this.manufacturer = String.valueOf (lst.get(2));
        this.manufacturerNo = String.valueOf(lst.get(3));
        this.equipmentManufacturer = String.valueOf(lst.get(4));
        this.equipmentManufacturerNo = String.valueOf(lst.get(5));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatName() {
        return matName;
    }

    public void setMatName(String matName) {
        this.matName = matName;
    }

    public String getSpecModel() {
        return specModel;
    }

    public void setSpecModel(String specModel) {
        this.specModel = specModel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturerNo() {
        return manufacturerNo;
    }

    public void setManufacturerNo(String manufacturerNo) {
        this.manufacturerNo = manufacturerNo;
    }

    public String getEquipmentManufacturer() {
        return equipmentManufacturer;
    }

    public void setEquipmentManufacturer(String equipmentManufacturer) {
        this.equipmentManufacturer = equipmentManufacturer;
    }

    public String getEquipmentManufacturerNo() {
        return equipmentManufacturerNo;
    }

    public void setEquipmentManufacturerNo(String equipmentManufacturerNo) {
        this.equipmentManufacturerNo = equipmentManufacturerNo;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MaterialComparisonData other = (MaterialComparisonData) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMatName() == null ? other.getMatName() == null : this.getMatName().equals(other.getMatName()))
            && (this.getSpecModel() == null ? other.getSpecModel() == null : this.getSpecModel().equals(other.getSpecModel()))
            && (this.getManufacturer() == null ? other.getManufacturer() == null : this.getManufacturer().equals(other.getManufacturer()))
            && (this.getManufacturerNo() == null ? other.getManufacturerNo() == null : this.getManufacturerNo().equals(other.getManufacturerNo()))
            && (this.getEquipmentManufacturer() == null ? other.getEquipmentManufacturer() == null : this.getEquipmentManufacturer().equals(other.getEquipmentManufacturer()))
            && (this.getEquipmentManufacturerNo() == null ? other.getEquipmentManufacturerNo() == null : this.getEquipmentManufacturerNo().equals(other.getEquipmentManufacturerNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMatName() == null) ? 0 : getMatName().hashCode());
        result = prime * result + ((getSpecModel() == null) ? 0 : getSpecModel().hashCode());
        result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        result = prime * result + ((getManufacturerNo() == null) ? 0 : getManufacturerNo().hashCode());
        result = prime * result + ((getEquipmentManufacturer() == null) ? 0 : getEquipmentManufacturer().hashCode());
        result = prime * result + ((getEquipmentManufacturerNo() == null) ? 0 : getEquipmentManufacturerNo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", matName=" + matName +
                ", specModel=" + specModel +
                ", manufacturer=" + manufacturer +
                ", manufacturerNo=" + manufacturerNo +
                ", equipmentManufacturer=" + equipmentManufacturer +
                ", equipmentManufacturerNo=" + equipmentManufacturerNo +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}