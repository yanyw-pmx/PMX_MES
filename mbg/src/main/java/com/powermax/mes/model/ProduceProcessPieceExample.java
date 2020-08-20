package com.powermax.mes.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProduceProcessPieceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProduceProcessPieceExample() {
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

        public Criteria andWorkerIdIsNull() {
            addCriterion("worker_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIsNotNull() {
            addCriterion("worker_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdEqualTo(Long value) {
            addCriterion("worker_id =", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotEqualTo(Long value) {
            addCriterion("worker_id <>", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThan(Long value) {
            addCriterion("worker_id >", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("worker_id >=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThan(Long value) {
            addCriterion("worker_id <", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThanOrEqualTo(Long value) {
            addCriterion("worker_id <=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIn(List<Long> values) {
            addCriterion("worker_id in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotIn(List<Long> values) {
            addCriterion("worker_id not in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdBetween(Long value1, Long value2) {
            addCriterion("worker_id between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotBetween(Long value1, Long value2) {
            addCriterion("worker_id not between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdIsNull() {
            addCriterion("dispatch_id is null");
            return (Criteria) this;
        }

        public Criteria andDispatchIdIsNotNull() {
            addCriterion("dispatch_id is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchIdEqualTo(Long value) {
            addCriterion("dispatch_id =", value, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdNotEqualTo(Long value) {
            addCriterion("dispatch_id <>", value, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdGreaterThan(Long value) {
            addCriterion("dispatch_id >", value, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dispatch_id >=", value, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdLessThan(Long value) {
            addCriterion("dispatch_id <", value, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdLessThanOrEqualTo(Long value) {
            addCriterion("dispatch_id <=", value, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdIn(List<Long> values) {
            addCriterion("dispatch_id in", values, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdNotIn(List<Long> values) {
            addCriterion("dispatch_id not in", values, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdBetween(Long value1, Long value2) {
            addCriterion("dispatch_id between", value1, value2, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdNotBetween(Long value1, Long value2) {
            addCriterion("dispatch_id not between", value1, value2, "dispatchId");
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

        public Criteria andValueTimeIsNull() {
            addCriterion("value_time is null");
            return (Criteria) this;
        }

        public Criteria andValueTimeIsNotNull() {
            addCriterion("value_time is not null");
            return (Criteria) this;
        }

        public Criteria andValueTimeEqualTo(Integer value) {
            addCriterion("value_time =", value, "valueTime");
            return (Criteria) this;
        }

        public Criteria andValueTimeNotEqualTo(Integer value) {
            addCriterion("value_time <>", value, "valueTime");
            return (Criteria) this;
        }

        public Criteria andValueTimeGreaterThan(Integer value) {
            addCriterion("value_time >", value, "valueTime");
            return (Criteria) this;
        }

        public Criteria andValueTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("value_time >=", value, "valueTime");
            return (Criteria) this;
        }

        public Criteria andValueTimeLessThan(Integer value) {
            addCriterion("value_time <", value, "valueTime");
            return (Criteria) this;
        }

        public Criteria andValueTimeLessThanOrEqualTo(Integer value) {
            addCriterion("value_time <=", value, "valueTime");
            return (Criteria) this;
        }

        public Criteria andValueTimeIn(List<Integer> values) {
            addCriterion("value_time in", values, "valueTime");
            return (Criteria) this;
        }

        public Criteria andValueTimeNotIn(List<Integer> values) {
            addCriterion("value_time not in", values, "valueTime");
            return (Criteria) this;
        }

        public Criteria andValueTimeBetween(Integer value1, Integer value2) {
            addCriterion("value_time between", value1, value2, "valueTime");
            return (Criteria) this;
        }

        public Criteria andValueTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("value_time not between", value1, value2, "valueTime");
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

        public Criteria andDoneCntIsNull() {
            addCriterion("done_cnt is null");
            return (Criteria) this;
        }

        public Criteria andDoneCntIsNotNull() {
            addCriterion("done_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andDoneCntEqualTo(Integer value) {
            addCriterion("done_cnt =", value, "doneCnt");
            return (Criteria) this;
        }

        public Criteria andDoneCntNotEqualTo(Integer value) {
            addCriterion("done_cnt <>", value, "doneCnt");
            return (Criteria) this;
        }

        public Criteria andDoneCntGreaterThan(Integer value) {
            addCriterion("done_cnt >", value, "doneCnt");
            return (Criteria) this;
        }

        public Criteria andDoneCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("done_cnt >=", value, "doneCnt");
            return (Criteria) this;
        }

        public Criteria andDoneCntLessThan(Integer value) {
            addCriterion("done_cnt <", value, "doneCnt");
            return (Criteria) this;
        }

        public Criteria andDoneCntLessThanOrEqualTo(Integer value) {
            addCriterion("done_cnt <=", value, "doneCnt");
            return (Criteria) this;
        }

        public Criteria andDoneCntIn(List<Integer> values) {
            addCriterion("done_cnt in", values, "doneCnt");
            return (Criteria) this;
        }

        public Criteria andDoneCntNotIn(List<Integer> values) {
            addCriterion("done_cnt not in", values, "doneCnt");
            return (Criteria) this;
        }

        public Criteria andDoneCntBetween(Integer value1, Integer value2) {
            addCriterion("done_cnt between", value1, value2, "doneCnt");
            return (Criteria) this;
        }

        public Criteria andDoneCntNotBetween(Integer value1, Integer value2) {
            addCriterion("done_cnt not between", value1, value2, "doneCnt");
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