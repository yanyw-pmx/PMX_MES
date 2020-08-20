package com.powermax.mes.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProduceProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProduceProcessExample() {
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

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(Long value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(Long value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(Long value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(Long value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(Long value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(Long value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<Long> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<Long> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(Long value1, Long value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(Long value1, Long value2) {
            addCriterion("process_id not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andDesIsNull() {
            addCriterion("des is null");
            return (Criteria) this;
        }

        public Criteria andDesIsNotNull() {
            addCriterion("des is not null");
            return (Criteria) this;
        }

        public Criteria andDesEqualTo(String value) {
            addCriterion("des =", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotEqualTo(String value) {
            addCriterion("des <>", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThan(String value) {
            addCriterion("des >", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThanOrEqualTo(String value) {
            addCriterion("des >=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThan(String value) {
            addCriterion("des <", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThanOrEqualTo(String value) {
            addCriterion("des <=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLike(String value) {
            addCriterion("des like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotLike(String value) {
            addCriterion("des not like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesIn(List<String> values) {
            addCriterion("des in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotIn(List<String> values) {
            addCriterion("des not in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesBetween(String value1, String value2) {
            addCriterion("des between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotBetween(String value1, String value2) {
            addCriterion("des not between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andCycleTimeIsNull() {
            addCriterion("cycle_time is null");
            return (Criteria) this;
        }

        public Criteria andCycleTimeIsNotNull() {
            addCriterion("cycle_time is not null");
            return (Criteria) this;
        }

        public Criteria andCycleTimeEqualTo(Integer value) {
            addCriterion("cycle_time =", value, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeNotEqualTo(Integer value) {
            addCriterion("cycle_time <>", value, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeGreaterThan(Integer value) {
            addCriterion("cycle_time >", value, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle_time >=", value, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeLessThan(Integer value) {
            addCriterion("cycle_time <", value, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeLessThanOrEqualTo(Integer value) {
            addCriterion("cycle_time <=", value, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeIn(List<Integer> values) {
            addCriterion("cycle_time in", values, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeNotIn(List<Integer> values) {
            addCriterion("cycle_time not in", values, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeBetween(Integer value1, Integer value2) {
            addCriterion("cycle_time between", value1, value2, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle_time not between", value1, value2, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleStitchIsNull() {
            addCriterion("cycle_stitch is null");
            return (Criteria) this;
        }

        public Criteria andCycleStitchIsNotNull() {
            addCriterion("cycle_stitch is not null");
            return (Criteria) this;
        }

        public Criteria andCycleStitchEqualTo(Integer value) {
            addCriterion("cycle_stitch =", value, "cycleStitch");
            return (Criteria) this;
        }

        public Criteria andCycleStitchNotEqualTo(Integer value) {
            addCriterion("cycle_stitch <>", value, "cycleStitch");
            return (Criteria) this;
        }

        public Criteria andCycleStitchGreaterThan(Integer value) {
            addCriterion("cycle_stitch >", value, "cycleStitch");
            return (Criteria) this;
        }

        public Criteria andCycleStitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle_stitch >=", value, "cycleStitch");
            return (Criteria) this;
        }

        public Criteria andCycleStitchLessThan(Integer value) {
            addCriterion("cycle_stitch <", value, "cycleStitch");
            return (Criteria) this;
        }

        public Criteria andCycleStitchLessThanOrEqualTo(Integer value) {
            addCriterion("cycle_stitch <=", value, "cycleStitch");
            return (Criteria) this;
        }

        public Criteria andCycleStitchIn(List<Integer> values) {
            addCriterion("cycle_stitch in", values, "cycleStitch");
            return (Criteria) this;
        }

        public Criteria andCycleStitchNotIn(List<Integer> values) {
            addCriterion("cycle_stitch not in", values, "cycleStitch");
            return (Criteria) this;
        }

        public Criteria andCycleStitchBetween(Integer value1, Integer value2) {
            addCriterion("cycle_stitch between", value1, value2, "cycleStitch");
            return (Criteria) this;
        }

        public Criteria andCycleStitchNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle_stitch not between", value1, value2, "cycleStitch");
            return (Criteria) this;
        }

        public Criteria andCycleTrimIsNull() {
            addCriterion("cycle_trim is null");
            return (Criteria) this;
        }

        public Criteria andCycleTrimIsNotNull() {
            addCriterion("cycle_trim is not null");
            return (Criteria) this;
        }

        public Criteria andCycleTrimEqualTo(Integer value) {
            addCriterion("cycle_trim =", value, "cycleTrim");
            return (Criteria) this;
        }

        public Criteria andCycleTrimNotEqualTo(Integer value) {
            addCriterion("cycle_trim <>", value, "cycleTrim");
            return (Criteria) this;
        }

        public Criteria andCycleTrimGreaterThan(Integer value) {
            addCriterion("cycle_trim >", value, "cycleTrim");
            return (Criteria) this;
        }

        public Criteria andCycleTrimGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle_trim >=", value, "cycleTrim");
            return (Criteria) this;
        }

        public Criteria andCycleTrimLessThan(Integer value) {
            addCriterion("cycle_trim <", value, "cycleTrim");
            return (Criteria) this;
        }

        public Criteria andCycleTrimLessThanOrEqualTo(Integer value) {
            addCriterion("cycle_trim <=", value, "cycleTrim");
            return (Criteria) this;
        }

        public Criteria andCycleTrimIn(List<Integer> values) {
            addCriterion("cycle_trim in", values, "cycleTrim");
            return (Criteria) this;
        }

        public Criteria andCycleTrimNotIn(List<Integer> values) {
            addCriterion("cycle_trim not in", values, "cycleTrim");
            return (Criteria) this;
        }

        public Criteria andCycleTrimBetween(Integer value1, Integer value2) {
            addCriterion("cycle_trim between", value1, value2, "cycleTrim");
            return (Criteria) this;
        }

        public Criteria andCycleTrimNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle_trim not between", value1, value2, "cycleTrim");
            return (Criteria) this;
        }

        public Criteria andWorkPriceIsNull() {
            addCriterion("work_price is null");
            return (Criteria) this;
        }

        public Criteria andWorkPriceIsNotNull() {
            addCriterion("work_price is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPriceEqualTo(BigDecimal value) {
            addCriterion("work_price =", value, "workPrice");
            return (Criteria) this;
        }

        public Criteria andWorkPriceNotEqualTo(BigDecimal value) {
            addCriterion("work_price <>", value, "workPrice");
            return (Criteria) this;
        }

        public Criteria andWorkPriceGreaterThan(BigDecimal value) {
            addCriterion("work_price >", value, "workPrice");
            return (Criteria) this;
        }

        public Criteria andWorkPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("work_price >=", value, "workPrice");
            return (Criteria) this;
        }

        public Criteria andWorkPriceLessThan(BigDecimal value) {
            addCriterion("work_price <", value, "workPrice");
            return (Criteria) this;
        }

        public Criteria andWorkPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("work_price <=", value, "workPrice");
            return (Criteria) this;
        }

        public Criteria andWorkPriceIn(List<BigDecimal> values) {
            addCriterion("work_price in", values, "workPrice");
            return (Criteria) this;
        }

        public Criteria andWorkPriceNotIn(List<BigDecimal> values) {
            addCriterion("work_price not in", values, "workPrice");
            return (Criteria) this;
        }

        public Criteria andWorkPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("work_price between", value1, value2, "workPrice");
            return (Criteria) this;
        }

        public Criteria andWorkPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("work_price not between", value1, value2, "workPrice");
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

        public Criteria andMachineIdEqualTo(Integer value) {
            addCriterion("machine_id =", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotEqualTo(Integer value) {
            addCriterion("machine_id <>", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThan(Integer value) {
            addCriterion("machine_id >", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_id >=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThan(Integer value) {
            addCriterion("machine_id <", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThanOrEqualTo(Integer value) {
            addCriterion("machine_id <=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdIn(List<Integer> values) {
            addCriterion("machine_id in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotIn(List<Integer> values) {
            addCriterion("machine_id not in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdBetween(Integer value1, Integer value2) {
            addCriterion("machine_id between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_id not between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andProcessTypeIsNull() {
            addCriterion("process_type is null");
            return (Criteria) this;
        }

        public Criteria andProcessTypeIsNotNull() {
            addCriterion("process_type is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTypeEqualTo(Integer value) {
            addCriterion("process_type =", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeNotEqualTo(Integer value) {
            addCriterion("process_type <>", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeGreaterThan(Integer value) {
            addCriterion("process_type >", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_type >=", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeLessThan(Integer value) {
            addCriterion("process_type <", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("process_type <=", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeIn(List<Integer> values) {
            addCriterion("process_type in", values, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeNotIn(List<Integer> values) {
            addCriterion("process_type not in", values, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeBetween(Integer value1, Integer value2) {
            addCriterion("process_type between", value1, value2, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("process_type not between", value1, value2, "processType");
            return (Criteria) this;
        }

        public Criteria andSewingLengthIsNull() {
            addCriterion("sewing_length is null");
            return (Criteria) this;
        }

        public Criteria andSewingLengthIsNotNull() {
            addCriterion("sewing_length is not null");
            return (Criteria) this;
        }

        public Criteria andSewingLengthEqualTo(Integer value) {
            addCriterion("sewing_length =", value, "sewingLength");
            return (Criteria) this;
        }

        public Criteria andSewingLengthNotEqualTo(Integer value) {
            addCriterion("sewing_length <>", value, "sewingLength");
            return (Criteria) this;
        }

        public Criteria andSewingLengthGreaterThan(Integer value) {
            addCriterion("sewing_length >", value, "sewingLength");
            return (Criteria) this;
        }

        public Criteria andSewingLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("sewing_length >=", value, "sewingLength");
            return (Criteria) this;
        }

        public Criteria andSewingLengthLessThan(Integer value) {
            addCriterion("sewing_length <", value, "sewingLength");
            return (Criteria) this;
        }

        public Criteria andSewingLengthLessThanOrEqualTo(Integer value) {
            addCriterion("sewing_length <=", value, "sewingLength");
            return (Criteria) this;
        }

        public Criteria andSewingLengthIn(List<Integer> values) {
            addCriterion("sewing_length in", values, "sewingLength");
            return (Criteria) this;
        }

        public Criteria andSewingLengthNotIn(List<Integer> values) {
            addCriterion("sewing_length not in", values, "sewingLength");
            return (Criteria) this;
        }

        public Criteria andSewingLengthBetween(Integer value1, Integer value2) {
            addCriterion("sewing_length between", value1, value2, "sewingLength");
            return (Criteria) this;
        }

        public Criteria andSewingLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("sewing_length not between", value1, value2, "sewingLength");
            return (Criteria) this;
        }

        public Criteria andSewingTimeIsNull() {
            addCriterion("sewing_time is null");
            return (Criteria) this;
        }

        public Criteria andSewingTimeIsNotNull() {
            addCriterion("sewing_time is not null");
            return (Criteria) this;
        }

        public Criteria andSewingTimeEqualTo(Integer value) {
            addCriterion("sewing_time =", value, "sewingTime");
            return (Criteria) this;
        }

        public Criteria andSewingTimeNotEqualTo(Integer value) {
            addCriterion("sewing_time <>", value, "sewingTime");
            return (Criteria) this;
        }

        public Criteria andSewingTimeGreaterThan(Integer value) {
            addCriterion("sewing_time >", value, "sewingTime");
            return (Criteria) this;
        }

        public Criteria andSewingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sewing_time >=", value, "sewingTime");
            return (Criteria) this;
        }

        public Criteria andSewingTimeLessThan(Integer value) {
            addCriterion("sewing_time <", value, "sewingTime");
            return (Criteria) this;
        }

        public Criteria andSewingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("sewing_time <=", value, "sewingTime");
            return (Criteria) this;
        }

        public Criteria andSewingTimeIn(List<Integer> values) {
            addCriterion("sewing_time in", values, "sewingTime");
            return (Criteria) this;
        }

        public Criteria andSewingTimeNotIn(List<Integer> values) {
            addCriterion("sewing_time not in", values, "sewingTime");
            return (Criteria) this;
        }

        public Criteria andSewingTimeBetween(Integer value1, Integer value2) {
            addCriterion("sewing_time between", value1, value2, "sewingTime");
            return (Criteria) this;
        }

        public Criteria andSewingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sewing_time not between", value1, value2, "sewingTime");
            return (Criteria) this;
        }

        public Criteria andPartsNameIsNull() {
            addCriterion("parts_name is null");
            return (Criteria) this;
        }

        public Criteria andPartsNameIsNotNull() {
            addCriterion("parts_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartsNameEqualTo(String value) {
            addCriterion("parts_name =", value, "partsName");
            return (Criteria) this;
        }

        public Criteria andPartsNameNotEqualTo(String value) {
            addCriterion("parts_name <>", value, "partsName");
            return (Criteria) this;
        }

        public Criteria andPartsNameGreaterThan(String value) {
            addCriterion("parts_name >", value, "partsName");
            return (Criteria) this;
        }

        public Criteria andPartsNameGreaterThanOrEqualTo(String value) {
            addCriterion("parts_name >=", value, "partsName");
            return (Criteria) this;
        }

        public Criteria andPartsNameLessThan(String value) {
            addCriterion("parts_name <", value, "partsName");
            return (Criteria) this;
        }

        public Criteria andPartsNameLessThanOrEqualTo(String value) {
            addCriterion("parts_name <=", value, "partsName");
            return (Criteria) this;
        }

        public Criteria andPartsNameLike(String value) {
            addCriterion("parts_name like", value, "partsName");
            return (Criteria) this;
        }

        public Criteria andPartsNameNotLike(String value) {
            addCriterion("parts_name not like", value, "partsName");
            return (Criteria) this;
        }

        public Criteria andPartsNameIn(List<String> values) {
            addCriterion("parts_name in", values, "partsName");
            return (Criteria) this;
        }

        public Criteria andPartsNameNotIn(List<String> values) {
            addCriterion("parts_name not in", values, "partsName");
            return (Criteria) this;
        }

        public Criteria andPartsNameBetween(String value1, String value2) {
            addCriterion("parts_name between", value1, value2, "partsName");
            return (Criteria) this;
        }

        public Criteria andPartsNameNotBetween(String value1, String value2) {
            addCriterion("parts_name not between", value1, value2, "partsName");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIsNull() {
            addCriterion("picture_url is null");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIsNotNull() {
            addCriterion("picture_url is not null");
            return (Criteria) this;
        }

        public Criteria andPictureUrlEqualTo(String value) {
            addCriterion("picture_url =", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotEqualTo(String value) {
            addCriterion("picture_url <>", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThan(String value) {
            addCriterion("picture_url >", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("picture_url >=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThan(String value) {
            addCriterion("picture_url <", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThanOrEqualTo(String value) {
            addCriterion("picture_url <=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLike(String value) {
            addCriterion("picture_url like", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotLike(String value) {
            addCriterion("picture_url not like", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIn(List<String> values) {
            addCriterion("picture_url in", values, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotIn(List<String> values) {
            addCriterion("picture_url not in", values, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlBetween(String value1, String value2) {
            addCriterion("picture_url between", value1, value2, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotBetween(String value1, String value2) {
            addCriterion("picture_url not between", value1, value2, "pictureUrl");
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