package com.powermax.mes.model;

import java.util.ArrayList;
import java.util.List;

public class DeviceSeriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceSeriesExample() {
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

        public Criteria andManufacturerIdIsNull() {
            addCriterion("manufacturer_id is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIsNotNull() {
            addCriterion("manufacturer_id is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdEqualTo(Integer value) {
            addCriterion("manufacturer_id =", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotEqualTo(Integer value) {
            addCriterion("manufacturer_id <>", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdGreaterThan(Integer value) {
            addCriterion("manufacturer_id >", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manufacturer_id >=", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdLessThan(Integer value) {
            addCriterion("manufacturer_id <", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manufacturer_id <=", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIn(List<Integer> values) {
            addCriterion("manufacturer_id in", values, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotIn(List<Integer> values) {
            addCriterion("manufacturer_id not in", values, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdBetween(Integer value1, Integer value2) {
            addCriterion("manufacturer_id between", value1, value2, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manufacturer_id not between", value1, value2, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIdIsNull() {
            addCriterion("machine_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIdIsNotNull() {
            addCriterion("machine_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIdEqualTo(Integer value) {
            addCriterion("machine_type_id =", value, "machineTypeId");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIdNotEqualTo(Integer value) {
            addCriterion("machine_type_id <>", value, "machineTypeId");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIdGreaterThan(Integer value) {
            addCriterion("machine_type_id >", value, "machineTypeId");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_type_id >=", value, "machineTypeId");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIdLessThan(Integer value) {
            addCriterion("machine_type_id <", value, "machineTypeId");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("machine_type_id <=", value, "machineTypeId");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIdIn(List<Integer> values) {
            addCriterion("machine_type_id in", values, "machineTypeId");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIdNotIn(List<Integer> values) {
            addCriterion("machine_type_id not in", values, "machineTypeId");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("machine_type_id between", value1, value2, "machineTypeId");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_type_id not between", value1, value2, "machineTypeId");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIsNull() {
            addCriterion("series_name is null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIsNotNull() {
            addCriterion("series_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameEqualTo(String value) {
            addCriterion("series_name =", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotEqualTo(String value) {
            addCriterion("series_name <>", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThan(String value) {
            addCriterion("series_name >", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThanOrEqualTo(String value) {
            addCriterion("series_name >=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThan(String value) {
            addCriterion("series_name <", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThanOrEqualTo(String value) {
            addCriterion("series_name <=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLike(String value) {
            addCriterion("series_name like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotLike(String value) {
            addCriterion("series_name not like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIn(List<String> values) {
            addCriterion("series_name in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotIn(List<String> values) {
            addCriterion("series_name not in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameBetween(String value1, String value2) {
            addCriterion("series_name between", value1, value2, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotBetween(String value1, String value2) {
            addCriterion("series_name not between", value1, value2, "seriesName");
            return (Criteria) this;
        }

        public Criteria andEcufaultGroupIdIsNull() {
            addCriterion("ecuFault_group_id is null");
            return (Criteria) this;
        }

        public Criteria andEcufaultGroupIdIsNotNull() {
            addCriterion("ecuFault_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andEcufaultGroupIdEqualTo(Long value) {
            addCriterion("ecuFault_group_id =", value, "ecufaultGroupId");
            return (Criteria) this;
        }

        public Criteria andEcufaultGroupIdNotEqualTo(Long value) {
            addCriterion("ecuFault_group_id <>", value, "ecufaultGroupId");
            return (Criteria) this;
        }

        public Criteria andEcufaultGroupIdGreaterThan(Long value) {
            addCriterion("ecuFault_group_id >", value, "ecufaultGroupId");
            return (Criteria) this;
        }

        public Criteria andEcufaultGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ecuFault_group_id >=", value, "ecufaultGroupId");
            return (Criteria) this;
        }

        public Criteria andEcufaultGroupIdLessThan(Long value) {
            addCriterion("ecuFault_group_id <", value, "ecufaultGroupId");
            return (Criteria) this;
        }

        public Criteria andEcufaultGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("ecuFault_group_id <=", value, "ecufaultGroupId");
            return (Criteria) this;
        }

        public Criteria andEcufaultGroupIdIn(List<Long> values) {
            addCriterion("ecuFault_group_id in", values, "ecufaultGroupId");
            return (Criteria) this;
        }

        public Criteria andEcufaultGroupIdNotIn(List<Long> values) {
            addCriterion("ecuFault_group_id not in", values, "ecufaultGroupId");
            return (Criteria) this;
        }

        public Criteria andEcufaultGroupIdBetween(Long value1, Long value2) {
            addCriterion("ecuFault_group_id between", value1, value2, "ecufaultGroupId");
            return (Criteria) this;
        }

        public Criteria andEcufaultGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("ecuFault_group_id not between", value1, value2, "ecufaultGroupId");
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