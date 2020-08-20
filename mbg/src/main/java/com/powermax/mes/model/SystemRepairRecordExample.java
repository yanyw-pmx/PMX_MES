package com.powermax.mes.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemRepairRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemRepairRecordExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRfidRecorderIdIsNull() {
            addCriterion("rfid_recorder_id is null");
            return (Criteria) this;
        }

        public Criteria andRfidRecorderIdIsNotNull() {
            addCriterion("rfid_recorder_id is not null");
            return (Criteria) this;
        }

        public Criteria andRfidRecorderIdEqualTo(Long value) {
            addCriterion("rfid_recorder_id =", value, "rfidRecorderId");
            return (Criteria) this;
        }

        public Criteria andRfidRecorderIdNotEqualTo(Long value) {
            addCriterion("rfid_recorder_id <>", value, "rfidRecorderId");
            return (Criteria) this;
        }

        public Criteria andRfidRecorderIdGreaterThan(Long value) {
            addCriterion("rfid_recorder_id >", value, "rfidRecorderId");
            return (Criteria) this;
        }

        public Criteria andRfidRecorderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rfid_recorder_id >=", value, "rfidRecorderId");
            return (Criteria) this;
        }

        public Criteria andRfidRecorderIdLessThan(Long value) {
            addCriterion("rfid_recorder_id <", value, "rfidRecorderId");
            return (Criteria) this;
        }

        public Criteria andRfidRecorderIdLessThanOrEqualTo(Long value) {
            addCriterion("rfid_recorder_id <=", value, "rfidRecorderId");
            return (Criteria) this;
        }

        public Criteria andRfidRecorderIdIn(List<Long> values) {
            addCriterion("rfid_recorder_id in", values, "rfidRecorderId");
            return (Criteria) this;
        }

        public Criteria andRfidRecorderIdNotIn(List<Long> values) {
            addCriterion("rfid_recorder_id not in", values, "rfidRecorderId");
            return (Criteria) this;
        }

        public Criteria andRfidRecorderIdBetween(Long value1, Long value2) {
            addCriterion("rfid_recorder_id between", value1, value2, "rfidRecorderId");
            return (Criteria) this;
        }

        public Criteria andRfidRecorderIdNotBetween(Long value1, Long value2) {
            addCriterion("rfid_recorder_id not between", value1, value2, "rfidRecorderId");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNull() {
            addCriterion("over_time is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNotNull() {
            addCriterion("over_time is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeEqualTo(Date value) {
            addCriterion("over_time =", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotEqualTo(Date value) {
            addCriterion("over_time <>", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThan(Date value) {
            addCriterion("over_time >", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("over_time >=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThan(Date value) {
            addCriterion("over_time <", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThanOrEqualTo(Date value) {
            addCriterion("over_time <=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeIn(List<Date> values) {
            addCriterion("over_time in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotIn(List<Date> values) {
            addCriterion("over_time not in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeBetween(Date value1, Date value2) {
            addCriterion("over_time between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotBetween(Date value1, Date value2) {
            addCriterion("over_time not between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesIsNull() {
            addCriterion("machine_fault_codes is null");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesIsNotNull() {
            addCriterion("machine_fault_codes is not null");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesEqualTo(String value) {
            addCriterion("machine_fault_codes =", value, "machineFaultCodes");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesNotEqualTo(String value) {
            addCriterion("machine_fault_codes <>", value, "machineFaultCodes");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesGreaterThan(String value) {
            addCriterion("machine_fault_codes >", value, "machineFaultCodes");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesGreaterThanOrEqualTo(String value) {
            addCriterion("machine_fault_codes >=", value, "machineFaultCodes");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesLessThan(String value) {
            addCriterion("machine_fault_codes <", value, "machineFaultCodes");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesLessThanOrEqualTo(String value) {
            addCriterion("machine_fault_codes <=", value, "machineFaultCodes");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesLike(String value) {
            addCriterion("machine_fault_codes like", value, "machineFaultCodes");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesNotLike(String value) {
            addCriterion("machine_fault_codes not like", value, "machineFaultCodes");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesIn(List<String> values) {
            addCriterion("machine_fault_codes in", values, "machineFaultCodes");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesNotIn(List<String> values) {
            addCriterion("machine_fault_codes not in", values, "machineFaultCodes");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesBetween(String value1, String value2) {
            addCriterion("machine_fault_codes between", value1, value2, "machineFaultCodes");
            return (Criteria) this;
        }

        public Criteria andMachineFaultCodesNotBetween(String value1, String value2) {
            addCriterion("machine_fault_codes not between", value1, value2, "machineFaultCodes");
            return (Criteria) this;
        }
    }

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