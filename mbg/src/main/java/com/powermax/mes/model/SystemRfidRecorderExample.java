package com.powermax.mes.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemRfidRecorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemRfidRecorderExample() {
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

        public Criteria andMachineIdIsNull() {
            addCriterion("machine_id is null");
            return (Criteria) this;
        }

        public Criteria andMachineIdIsNotNull() {
            addCriterion("machine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMachineIdEqualTo(Long value) {
            addCriterion("machine_id =", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotEqualTo(Long value) {
            addCriterion("machine_id <>", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThan(Long value) {
            addCriterion("machine_id >", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThanOrEqualTo(Long value) {
            addCriterion("machine_id >=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThan(Long value) {
            addCriterion("machine_id <", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThanOrEqualTo(Long value) {
            addCriterion("machine_id <=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdIn(List<Long> values) {
            addCriterion("machine_id in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotIn(List<Long> values) {
            addCriterion("machine_id not in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdBetween(Long value1, Long value2) {
            addCriterion("machine_id between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotBetween(Long value1, Long value2) {
            addCriterion("machine_id not between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andRfidCardIdIsNull() {
            addCriterion("rfid_card_id is null");
            return (Criteria) this;
        }

        public Criteria andRfidCardIdIsNotNull() {
            addCriterion("rfid_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andRfidCardIdEqualTo(Long value) {
            addCriterion("rfid_card_id =", value, "rfidCardId");
            return (Criteria) this;
        }

        public Criteria andRfidCardIdNotEqualTo(Long value) {
            addCriterion("rfid_card_id <>", value, "rfidCardId");
            return (Criteria) this;
        }

        public Criteria andRfidCardIdGreaterThan(Long value) {
            addCriterion("rfid_card_id >", value, "rfidCardId");
            return (Criteria) this;
        }

        public Criteria andRfidCardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rfid_card_id >=", value, "rfidCardId");
            return (Criteria) this;
        }

        public Criteria andRfidCardIdLessThan(Long value) {
            addCriterion("rfid_card_id <", value, "rfidCardId");
            return (Criteria) this;
        }

        public Criteria andRfidCardIdLessThanOrEqualTo(Long value) {
            addCriterion("rfid_card_id <=", value, "rfidCardId");
            return (Criteria) this;
        }

        public Criteria andRfidCardIdIn(List<Long> values) {
            addCriterion("rfid_card_id in", values, "rfidCardId");
            return (Criteria) this;
        }

        public Criteria andRfidCardIdNotIn(List<Long> values) {
            addCriterion("rfid_card_id not in", values, "rfidCardId");
            return (Criteria) this;
        }

        public Criteria andRfidCardIdBetween(Long value1, Long value2) {
            addCriterion("rfid_card_id between", value1, value2, "rfidCardId");
            return (Criteria) this;
        }

        public Criteria andRfidCardIdNotBetween(Long value1, Long value2) {
            addCriterion("rfid_card_id not between", value1, value2, "rfidCardId");
            return (Criteria) this;
        }

        public Criteria andLoginStateIsNull() {
            addCriterion("login_state is null");
            return (Criteria) this;
        }

        public Criteria andLoginStateIsNotNull() {
            addCriterion("login_state is not null");
            return (Criteria) this;
        }

        public Criteria andLoginStateEqualTo(Integer value) {
            addCriterion("login_state =", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateNotEqualTo(Integer value) {
            addCriterion("login_state <>", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateGreaterThan(Integer value) {
            addCriterion("login_state >", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_state >=", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateLessThan(Integer value) {
            addCriterion("login_state <", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateLessThanOrEqualTo(Integer value) {
            addCriterion("login_state <=", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateIn(List<Integer> values) {
            addCriterion("login_state in", values, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateNotIn(List<Integer> values) {
            addCriterion("login_state not in", values, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateBetween(Integer value1, Integer value2) {
            addCriterion("login_state between", value1, value2, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateNotBetween(Integer value1, Integer value2) {
            addCriterion("login_state not between", value1, value2, "loginState");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
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