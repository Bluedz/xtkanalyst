package com.xtk.xtkanalyst.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaterialComparsionLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MaterialComparsionLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSUuidIsNull() {
            addCriterion("s_uuid is null");
            return (Criteria) this;
        }

        public Criteria andSUuidIsNotNull() {
            addCriterion("s_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andSUuidEqualTo(String value) {
            addCriterion("s_uuid =", value, "sUuid");
            return (Criteria) this;
        }

        public Criteria andSUuidNotEqualTo(String value) {
            addCriterion("s_uuid <>", value, "sUuid");
            return (Criteria) this;
        }

        public Criteria andSUuidGreaterThan(String value) {
            addCriterion("s_uuid >", value, "sUuid");
            return (Criteria) this;
        }

        public Criteria andSUuidGreaterThanOrEqualTo(String value) {
            addCriterion("s_uuid >=", value, "sUuid");
            return (Criteria) this;
        }

        public Criteria andSUuidLessThan(String value) {
            addCriterion("s_uuid <", value, "sUuid");
            return (Criteria) this;
        }

        public Criteria andSUuidLessThanOrEqualTo(String value) {
            addCriterion("s_uuid <=", value, "sUuid");
            return (Criteria) this;
        }

        public Criteria andSUuidLike(String value) {
            addCriterion("s_uuid like", value, "sUuid");
            return (Criteria) this;
        }

        public Criteria andSUuidNotLike(String value) {
            addCriterion("s_uuid not like", value, "sUuid");
            return (Criteria) this;
        }

        public Criteria andSUuidIn(List<String> values) {
            addCriterion("s_uuid in", values, "sUuid");
            return (Criteria) this;
        }

        public Criteria andSUuidNotIn(List<String> values) {
            addCriterion("s_uuid not in", values, "sUuid");
            return (Criteria) this;
        }

        public Criteria andSUuidBetween(String value1, String value2) {
            addCriterion("s_uuid between", value1, value2, "sUuid");
            return (Criteria) this;
        }

        public Criteria andSUuidNotBetween(String value1, String value2) {
            addCriterion("s_uuid not between", value1, value2, "sUuid");
            return (Criteria) this;
        }

        public Criteria andFdMatnumIsNull() {
            addCriterion("fd_MatNum is null");
            return (Criteria) this;
        }

        public Criteria andFdMatnumIsNotNull() {
            addCriterion("fd_MatNum is not null");
            return (Criteria) this;
        }

        public Criteria andFdMatnumEqualTo(String value) {
            addCriterion("fd_MatNum =", value, "fdMatnum");
            return (Criteria) this;
        }

        public Criteria andFdMatnumNotEqualTo(String value) {
            addCriterion("fd_MatNum <>", value, "fdMatnum");
            return (Criteria) this;
        }

        public Criteria andFdMatnumGreaterThan(String value) {
            addCriterion("fd_MatNum >", value, "fdMatnum");
            return (Criteria) this;
        }

        public Criteria andFdMatnumGreaterThanOrEqualTo(String value) {
            addCriterion("fd_MatNum >=", value, "fdMatnum");
            return (Criteria) this;
        }

        public Criteria andFdMatnumLessThan(String value) {
            addCriterion("fd_MatNum <", value, "fdMatnum");
            return (Criteria) this;
        }

        public Criteria andFdMatnumLessThanOrEqualTo(String value) {
            addCriterion("fd_MatNum <=", value, "fdMatnum");
            return (Criteria) this;
        }

        public Criteria andFdMatnumLike(String value) {
            addCriterion("fd_MatNum like", value, "fdMatnum");
            return (Criteria) this;
        }

        public Criteria andFdMatnumNotLike(String value) {
            addCriterion("fd_MatNum not like", value, "fdMatnum");
            return (Criteria) this;
        }

        public Criteria andFdMatnumIn(List<String> values) {
            addCriterion("fd_MatNum in", values, "fdMatnum");
            return (Criteria) this;
        }

        public Criteria andFdMatnumNotIn(List<String> values) {
            addCriterion("fd_MatNum not in", values, "fdMatnum");
            return (Criteria) this;
        }

        public Criteria andFdMatnumBetween(String value1, String value2) {
            addCriterion("fd_MatNum between", value1, value2, "fdMatnum");
            return (Criteria) this;
        }

        public Criteria andFdMatnumNotBetween(String value1, String value2) {
            addCriterion("fd_MatNum not between", value1, value2, "fdMatnum");
            return (Criteria) this;
        }

        public Criteria andSDatetimeIsNull() {
            addCriterion("s_datetime is null");
            return (Criteria) this;
        }

        public Criteria andSDatetimeIsNotNull() {
            addCriterion("s_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andSDatetimeEqualTo(Date value) {
            addCriterion("s_datetime =", value, "sDatetime");
            return (Criteria) this;
        }

        public Criteria andSDatetimeNotEqualTo(Date value) {
            addCriterion("s_datetime <>", value, "sDatetime");
            return (Criteria) this;
        }

        public Criteria andSDatetimeGreaterThan(Date value) {
            addCriterion("s_datetime >", value, "sDatetime");
            return (Criteria) this;
        }

        public Criteria andSDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("s_datetime >=", value, "sDatetime");
            return (Criteria) this;
        }

        public Criteria andSDatetimeLessThan(Date value) {
            addCriterion("s_datetime <", value, "sDatetime");
            return (Criteria) this;
        }

        public Criteria andSDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("s_datetime <=", value, "sDatetime");
            return (Criteria) this;
        }

        public Criteria andSDatetimeIn(List<Date> values) {
            addCriterion("s_datetime in", values, "sDatetime");
            return (Criteria) this;
        }

        public Criteria andSDatetimeNotIn(List<Date> values) {
            addCriterion("s_datetime not in", values, "sDatetime");
            return (Criteria) this;
        }

        public Criteria andSDatetimeBetween(Date value1, Date value2) {
            addCriterion("s_datetime between", value1, value2, "sDatetime");
            return (Criteria) this;
        }

        public Criteria andSDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("s_datetime not between", value1, value2, "sDatetime");
            return (Criteria) this;
        }

        public Criteria andSOperatorIsNull() {
            addCriterion("s_Operator is null");
            return (Criteria) this;
        }

        public Criteria andSOperatorIsNotNull() {
            addCriterion("s_Operator is not null");
            return (Criteria) this;
        }

        public Criteria andSOperatorEqualTo(String value) {
            addCriterion("s_Operator =", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorNotEqualTo(String value) {
            addCriterion("s_Operator <>", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorGreaterThan(String value) {
            addCriterion("s_Operator >", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("s_Operator >=", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorLessThan(String value) {
            addCriterion("s_Operator <", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorLessThanOrEqualTo(String value) {
            addCriterion("s_Operator <=", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorLike(String value) {
            addCriterion("s_Operator like", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorNotLike(String value) {
            addCriterion("s_Operator not like", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorIn(List<String> values) {
            addCriterion("s_Operator in", values, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorNotIn(List<String> values) {
            addCriterion("s_Operator not in", values, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorBetween(String value1, String value2) {
            addCriterion("s_Operator between", value1, value2, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorNotBetween(String value1, String value2) {
            addCriterion("s_Operator not between", value1, value2, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameIsNull() {
            addCriterion("s_xlsFileName is null");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameIsNotNull() {
            addCriterion("s_xlsFileName is not null");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameEqualTo(String value) {
            addCriterion("s_xlsFileName =", value, "sXlsfilename");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameNotEqualTo(String value) {
            addCriterion("s_xlsFileName <>", value, "sXlsfilename");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameGreaterThan(String value) {
            addCriterion("s_xlsFileName >", value, "sXlsfilename");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("s_xlsFileName >=", value, "sXlsfilename");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameLessThan(String value) {
            addCriterion("s_xlsFileName <", value, "sXlsfilename");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameLessThanOrEqualTo(String value) {
            addCriterion("s_xlsFileName <=", value, "sXlsfilename");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameLike(String value) {
            addCriterion("s_xlsFileName like", value, "sXlsfilename");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameNotLike(String value) {
            addCriterion("s_xlsFileName not like", value, "sXlsfilename");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameIn(List<String> values) {
            addCriterion("s_xlsFileName in", values, "sXlsfilename");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameNotIn(List<String> values) {
            addCriterion("s_xlsFileName not in", values, "sXlsfilename");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameBetween(String value1, String value2) {
            addCriterion("s_xlsFileName between", value1, value2, "sXlsfilename");
            return (Criteria) this;
        }

        public Criteria andSXlsfilenameNotBetween(String value1, String value2) {
            addCriterion("s_xlsFileName not between", value1, value2, "sXlsfilename");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforIsNull() {
            addCriterion("s_RelatedInfor is null");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforIsNotNull() {
            addCriterion("s_RelatedInfor is not null");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforEqualTo(String value) {
            addCriterion("s_RelatedInfor =", value, "sRelatedinfor");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforNotEqualTo(String value) {
            addCriterion("s_RelatedInfor <>", value, "sRelatedinfor");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforGreaterThan(String value) {
            addCriterion("s_RelatedInfor >", value, "sRelatedinfor");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforGreaterThanOrEqualTo(String value) {
            addCriterion("s_RelatedInfor >=", value, "sRelatedinfor");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforLessThan(String value) {
            addCriterion("s_RelatedInfor <", value, "sRelatedinfor");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforLessThanOrEqualTo(String value) {
            addCriterion("s_RelatedInfor <=", value, "sRelatedinfor");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforLike(String value) {
            addCriterion("s_RelatedInfor like", value, "sRelatedinfor");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforNotLike(String value) {
            addCriterion("s_RelatedInfor not like", value, "sRelatedinfor");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforIn(List<String> values) {
            addCriterion("s_RelatedInfor in", values, "sRelatedinfor");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforNotIn(List<String> values) {
            addCriterion("s_RelatedInfor not in", values, "sRelatedinfor");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforBetween(String value1, String value2) {
            addCriterion("s_RelatedInfor between", value1, value2, "sRelatedinfor");
            return (Criteria) this;
        }

        public Criteria andSRelatedinforNotBetween(String value1, String value2) {
            addCriterion("s_RelatedInfor not between", value1, value2, "sRelatedinfor");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}