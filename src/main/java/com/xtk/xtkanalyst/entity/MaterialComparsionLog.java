package com.xtk.xtkanalyst.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * material_comparsion_log
 * @author 
 */
public class MaterialComparsionLog implements Serializable {
    private Integer id;

    /**
     * 案例uuid
     */
    private String sUuid;

    /**
     * 匹配到物料号
     */
    private String fdMatnum;

    /**
     * 案例生成时间
     */
    private Date sDatetime;

    /**
     * 案例生成人员
     */
    private String sOperator;

    /**
     * 案例源excel文件名
     */
    private String sXlsfilename;

    /**
     * 案例相关联信息
     */
    private String sRelatedinfor;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getsUuid() {
        return sUuid;
    }

    public void setsUuid(String sUuid) {
        this.sUuid = sUuid;
    }

    public String getFdMatnum() {
        return fdMatnum;
    }

    public void setFdMatnum(String fdMatnum) {
        this.fdMatnum = fdMatnum;
    }

    public Date getsDatetime() {
        return sDatetime;
    }

    public void setsDatetime(Date sDatetime) {
        this.sDatetime = sDatetime;
    }

    public String getsOperator() {
        return sOperator;
    }

    public void setsOperator(String sOperator) {
        this.sOperator = sOperator;
    }

    public String getsXlsfilename() {
        return sXlsfilename;
    }

    public void setsXlsfilename(String sXlsfilename) {
        this.sXlsfilename = sXlsfilename;
    }

    public String getsRelatedinfor() {
        return sRelatedinfor;
    }

    public void setsRelatedinfor(String sRelatedinfor) {
        this.sRelatedinfor = sRelatedinfor;
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
        MaterialComparsionLog other = (MaterialComparsionLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getsUuid() == null ? other.getsUuid() == null : this.getsUuid().equals(other.getsUuid()))
            && (this.getFdMatnum() == null ? other.getFdMatnum() == null : this.getFdMatnum().equals(other.getFdMatnum()))
            && (this.getsDatetime() == null ? other.getsDatetime() == null : this.getsDatetime().equals(other.getsDatetime()))
            && (this.getsOperator() == null ? other.getsOperator() == null : this.getsOperator().equals(other.getsOperator()))
            && (this.getsXlsfilename() == null ? other.getsXlsfilename() == null : this.getsXlsfilename().equals(other.getsXlsfilename()))
            && (this.getsRelatedinfor() == null ? other.getsRelatedinfor() == null : this.getsRelatedinfor().equals(other.getsRelatedinfor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getsUuid() == null) ? 0 : getsUuid().hashCode());
        result = prime * result + ((getFdMatnum() == null) ? 0 : getFdMatnum().hashCode());
        result = prime * result + ((getsDatetime() == null) ? 0 : getsDatetime().hashCode());
        result = prime * result + ((getsOperator() == null) ? 0 : getsOperator().hashCode());
        result = prime * result + ((getsXlsfilename() == null) ? 0 : getsXlsfilename().hashCode());
        result = prime * result + ((getsRelatedinfor() == null) ? 0 : getsRelatedinfor().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sUuid=").append(sUuid);
        sb.append(", fdMatnum=").append(fdMatnum);
        sb.append(", sDatetime=").append(sDatetime);
        sb.append(", sOperator=").append(sOperator);
        sb.append(", sXlsfilename=").append(sXlsfilename);
        sb.append(", sRelatedinfor=").append(sRelatedinfor);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}