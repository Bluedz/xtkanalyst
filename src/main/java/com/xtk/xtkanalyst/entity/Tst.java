package com.xtk.xtkanalyst.entity;

import java.io.Serializable;

/**
 * tst
 * @author 
 */
public class Tst implements Serializable {
    private String re1;

    private String re2;

    private static final long serialVersionUID = 1L;

    public String getRe1() {
        return re1;
    }

    public void setRe1(String re1) {
        this.re1 = re1;
    }

    public String getRe2() {
        return re2;
    }

    public void setRe2(String re2) {
        this.re2 = re2;
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
        Tst other = (Tst) that;
        return (this.getRe1() == null ? other.getRe1() == null : this.getRe1().equals(other.getRe1()))
            && (this.getRe2() == null ? other.getRe2() == null : this.getRe2().equals(other.getRe2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRe1() == null) ? 0 : getRe1().hashCode());
        result = prime * result + ((getRe2() == null) ? 0 : getRe2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", re1=").append(re1);
        sb.append(", re2=").append(re2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}