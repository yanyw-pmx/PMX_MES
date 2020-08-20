package com.powermax.mes.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceMachineStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceMachineStateExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRunStateIsNull() {
            addCriterion("run_state is null");
            return (Criteria) this;
        }

        public Criteria andRunStateIsNotNull() {
            addCriterion("run_state is not null");
            return (Criteria) this;
        }

        public Criteria andRunStateEqualTo(Integer value) {
            addCriterion("run_state =", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateNotEqualTo(Integer value) {
            addCriterion("run_state <>", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateGreaterThan(Integer value) {
            addCriterion("run_state >", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("run_state >=", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateLessThan(Integer value) {
            addCriterion("run_state <", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateLessThanOrEqualTo(Integer value) {
            addCriterion("run_state <=", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateIn(List<Integer> values) {
            addCriterion("run_state in", values, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateNotIn(List<Integer> values) {
            addCriterion("run_state not in", values, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateBetween(Integer value1, Integer value2) {
            addCriterion("run_state between", value1, value2, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateNotBetween(Integer value1, Integer value2) {
            addCriterion("run_state not between", value1, value2, "runState");
            return (Criteria) this;
        }

        public Criteria andLockFlagIsNull() {
            addCriterion("lock_flag is null");
            return (Criteria) this;
        }

        public Criteria andLockFlagIsNotNull() {
            addCriterion("lock_flag is not null");
            return (Criteria) this;
        }

        public Criteria andLockFlagEqualTo(Boolean value) {
            addCriterion("lock_flag =", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagNotEqualTo(Boolean value) {
            addCriterion("lock_flag <>", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagGreaterThan(Boolean value) {
            addCriterion("lock_flag >", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lock_flag >=", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagLessThan(Boolean value) {
            addCriterion("lock_flag <", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("lock_flag <=", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagIn(List<Boolean> values) {
            addCriterion("lock_flag in", values, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagNotIn(List<Boolean> values) {
            addCriterion("lock_flag not in", values, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("lock_flag between", value1, value2, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lock_flag not between", value1, value2, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagIsNull() {
            addCriterion("auto_flag is null");
            return (Criteria) this;
        }

        public Criteria andAutoFlagIsNotNull() {
            addCriterion("auto_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAutoFlagEqualTo(Boolean value) {
            addCriterion("auto_flag =", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotEqualTo(Boolean value) {
            addCriterion("auto_flag <>", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagGreaterThan(Boolean value) {
            addCriterion("auto_flag >", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("auto_flag >=", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagLessThan(Boolean value) {
            addCriterion("auto_flag <", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("auto_flag <=", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagIn(List<Boolean> values) {
            addCriterion("auto_flag in", values, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotIn(List<Boolean> values) {
            addCriterion("auto_flag not in", values, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_flag between", value1, value2, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_flag not between", value1, value2, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andTotalStitchIsNull() {
            addCriterion("total_stitch is null");
            return (Criteria) this;
        }

        public Criteria andTotalStitchIsNotNull() {
            addCriterion("total_stitch is not null");
            return (Criteria) this;
        }

        public Criteria andTotalStitchEqualTo(Long value) {
            addCriterion("total_stitch =", value, "totalStitch");
            return (Criteria) this;
        }

        public Criteria andTotalStitchNotEqualTo(Long value) {
            addCriterion("total_stitch <>", value, "totalStitch");
            return (Criteria) this;
        }

        public Criteria andTotalStitchGreaterThan(Long value) {
            addCriterion("total_stitch >", value, "totalStitch");
            return (Criteria) this;
        }

        public Criteria andTotalStitchGreaterThanOrEqualTo(Long value) {
            addCriterion("total_stitch >=", value, "totalStitch");
            return (Criteria) this;
        }

        public Criteria andTotalStitchLessThan(Long value) {
            addCriterion("total_stitch <", value, "totalStitch");
            return (Criteria) this;
        }

        public Criteria andTotalStitchLessThanOrEqualTo(Long value) {
            addCriterion("total_stitch <=", value, "totalStitch");
            return (Criteria) this;
        }

        public Criteria andTotalStitchIn(List<Long> values) {
            addCriterion("total_stitch in", values, "totalStitch");
            return (Criteria) this;
        }

        public Criteria andTotalStitchNotIn(List<Long> values) {
            addCriterion("total_stitch not in", values, "totalStitch");
            return (Criteria) this;
        }

        public Criteria andTotalStitchBetween(Long value1, Long value2) {
            addCriterion("total_stitch between", value1, value2, "totalStitch");
            return (Criteria) this;
        }

        public Criteria andTotalStitchNotBetween(Long value1, Long value2) {
            addCriterion("total_stitch not between", value1, value2, "totalStitch");
            return (Criteria) this;
        }

        public Criteria andTotalTrimIsNull() {
            addCriterion("total_trim is null");
            return (Criteria) this;
        }

        public Criteria andTotalTrimIsNotNull() {
            addCriterion("total_trim is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTrimEqualTo(Long value) {
            addCriterion("total_trim =", value, "totalTrim");
            return (Criteria) this;
        }

        public Criteria andTotalTrimNotEqualTo(Long value) {
            addCriterion("total_trim <>", value, "totalTrim");
            return (Criteria) this;
        }

        public Criteria andTotalTrimGreaterThan(Long value) {
            addCriterion("total_trim >", value, "totalTrim");
            return (Criteria) this;
        }

        public Criteria andTotalTrimGreaterThanOrEqualTo(Long value) {
            addCriterion("total_trim >=", value, "totalTrim");
            return (Criteria) this;
        }

        public Criteria andTotalTrimLessThan(Long value) {
            addCriterion("total_trim <", value, "totalTrim");
            return (Criteria) this;
        }

        public Criteria andTotalTrimLessThanOrEqualTo(Long value) {
            addCriterion("total_trim <=", value, "totalTrim");
            return (Criteria) this;
        }

        public Criteria andTotalTrimIn(List<Long> values) {
            addCriterion("total_trim in", values, "totalTrim");
            return (Criteria) this;
        }

        public Criteria andTotalTrimNotIn(List<Long> values) {
            addCriterion("total_trim not in", values, "totalTrim");
            return (Criteria) this;
        }

        public Criteria andTotalTrimBetween(Long value1, Long value2) {
            addCriterion("total_trim between", value1, value2, "totalTrim");
            return (Criteria) this;
        }

        public Criteria andTotalTrimNotBetween(Long value1, Long value2) {
            addCriterion("total_trim not between", value1, value2, "totalTrim");
            return (Criteria) this;
        }

        public Criteria andCurStitchIsNull() {
            addCriterion("cur_stitch is null");
            return (Criteria) this;
        }

        public Criteria andCurStitchIsNotNull() {
            addCriterion("cur_stitch is not null");
            return (Criteria) this;
        }

        public Criteria andCurStitchEqualTo(Long value) {
            addCriterion("cur_stitch =", value, "curStitch");
            return (Criteria) this;
        }

        public Criteria andCurStitchNotEqualTo(Long value) {
            addCriterion("cur_stitch <>", value, "curStitch");
            return (Criteria) this;
        }

        public Criteria andCurStitchGreaterThan(Long value) {
            addCriterion("cur_stitch >", value, "curStitch");
            return (Criteria) this;
        }

        public Criteria andCurStitchGreaterThanOrEqualTo(Long value) {
            addCriterion("cur_stitch >=", value, "curStitch");
            return (Criteria) this;
        }

        public Criteria andCurStitchLessThan(Long value) {
            addCriterion("cur_stitch <", value, "curStitch");
            return (Criteria) this;
        }

        public Criteria andCurStitchLessThanOrEqualTo(Long value) {
            addCriterion("cur_stitch <=", value, "curStitch");
            return (Criteria) this;
        }

        public Criteria andCurStitchIn(List<Long> values) {
            addCriterion("cur_stitch in", values, "curStitch");
            return (Criteria) this;
        }

        public Criteria andCurStitchNotIn(List<Long> values) {
            addCriterion("cur_stitch not in", values, "curStitch");
            return (Criteria) this;
        }

        public Criteria andCurStitchBetween(Long value1, Long value2) {
            addCriterion("cur_stitch between", value1, value2, "curStitch");
            return (Criteria) this;
        }

        public Criteria andCurStitchNotBetween(Long value1, Long value2) {
            addCriterion("cur_stitch not between", value1, value2, "curStitch");
            return (Criteria) this;
        }

        public Criteria andCurTrimIsNull() {
            addCriterion("cur_trim is null");
            return (Criteria) this;
        }

        public Criteria andCurTrimIsNotNull() {
            addCriterion("cur_trim is not null");
            return (Criteria) this;
        }

        public Criteria andCurTrimEqualTo(Long value) {
            addCriterion("cur_trim =", value, "curTrim");
            return (Criteria) this;
        }

        public Criteria andCurTrimNotEqualTo(Long value) {
            addCriterion("cur_trim <>", value, "curTrim");
            return (Criteria) this;
        }

        public Criteria andCurTrimGreaterThan(Long value) {
            addCriterion("cur_trim >", value, "curTrim");
            return (Criteria) this;
        }

        public Criteria andCurTrimGreaterThanOrEqualTo(Long value) {
            addCriterion("cur_trim >=", value, "curTrim");
            return (Criteria) this;
        }

        public Criteria andCurTrimLessThan(Long value) {
            addCriterion("cur_trim <", value, "curTrim");
            return (Criteria) this;
        }

        public Criteria andCurTrimLessThanOrEqualTo(Long value) {
            addCriterion("cur_trim <=", value, "curTrim");
            return (Criteria) this;
        }

        public Criteria andCurTrimIn(List<Long> values) {
            addCriterion("cur_trim in", values, "curTrim");
            return (Criteria) this;
        }

        public Criteria andCurTrimNotIn(List<Long> values) {
            addCriterion("cur_trim not in", values, "curTrim");
            return (Criteria) this;
        }

        public Criteria andCurTrimBetween(Long value1, Long value2) {
            addCriterion("cur_trim between", value1, value2, "curTrim");
            return (Criteria) this;
        }

        public Criteria andCurTrimNotBetween(Long value1, Long value2) {
            addCriterion("cur_trim not between", value1, value2, "curTrim");
            return (Criteria) this;
        }

        public Criteria andTotalRunRimeIsNull() {
            addCriterion("total_run_rime is null");
            return (Criteria) this;
        }

        public Criteria andTotalRunRimeIsNotNull() {
            addCriterion("total_run_rime is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRunRimeEqualTo(Long value) {
            addCriterion("total_run_rime =", value, "totalRunRime");
            return (Criteria) this;
        }

        public Criteria andTotalRunRimeNotEqualTo(Long value) {
            addCriterion("total_run_rime <>", value, "totalRunRime");
            return (Criteria) this;
        }

        public Criteria andTotalRunRimeGreaterThan(Long value) {
            addCriterion("total_run_rime >", value, "totalRunRime");
            return (Criteria) this;
        }

        public Criteria andTotalRunRimeGreaterThanOrEqualTo(Long value) {
            addCriterion("total_run_rime >=", value, "totalRunRime");
            return (Criteria) this;
        }

        public Criteria andTotalRunRimeLessThan(Long value) {
            addCriterion("total_run_rime <", value, "totalRunRime");
            return (Criteria) this;
        }

        public Criteria andTotalRunRimeLessThanOrEqualTo(Long value) {
            addCriterion("total_run_rime <=", value, "totalRunRime");
            return (Criteria) this;
        }

        public Criteria andTotalRunRimeIn(List<Long> values) {
            addCriterion("total_run_rime in", values, "totalRunRime");
            return (Criteria) this;
        }

        public Criteria andTotalRunRimeNotIn(List<Long> values) {
            addCriterion("total_run_rime not in", values, "totalRunRime");
            return (Criteria) this;
        }

        public Criteria andTotalRunRimeBetween(Long value1, Long value2) {
            addCriterion("total_run_rime between", value1, value2, "totalRunRime");
            return (Criteria) this;
        }

        public Criteria andTotalRunRimeNotBetween(Long value1, Long value2) {
            addCriterion("total_run_rime not between", value1, value2, "totalRunRime");
            return (Criteria) this;
        }

        public Criteria andTotalIdleTimeIsNull() {
            addCriterion("total_idle_time is null");
            return (Criteria) this;
        }

        public Criteria andTotalIdleTimeIsNotNull() {
            addCriterion("total_idle_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIdleTimeEqualTo(Long value) {
            addCriterion("total_idle_time =", value, "totalIdleTime");
            return (Criteria) this;
        }

        public Criteria andTotalIdleTimeNotEqualTo(Long value) {
            addCriterion("total_idle_time <>", value, "totalIdleTime");
            return (Criteria) this;
        }

        public Criteria andTotalIdleTimeGreaterThan(Long value) {
            addCriterion("total_idle_time >", value, "totalIdleTime");
            return (Criteria) this;
        }

        public Criteria andTotalIdleTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("total_idle_time >=", value, "totalIdleTime");
            return (Criteria) this;
        }

        public Criteria andTotalIdleTimeLessThan(Long value) {
            addCriterion("total_idle_time <", value, "totalIdleTime");
            return (Criteria) this;
        }

        public Criteria andTotalIdleTimeLessThanOrEqualTo(Long value) {
            addCriterion("total_idle_time <=", value, "totalIdleTime");
            return (Criteria) this;
        }

        public Criteria andTotalIdleTimeIn(List<Long> values) {
            addCriterion("total_idle_time in", values, "totalIdleTime");
            return (Criteria) this;
        }

        public Criteria andTotalIdleTimeNotIn(List<Long> values) {
            addCriterion("total_idle_time not in", values, "totalIdleTime");
            return (Criteria) this;
        }

        public Criteria andTotalIdleTimeBetween(Long value1, Long value2) {
            addCriterion("total_idle_time between", value1, value2, "totalIdleTime");
            return (Criteria) this;
        }

        public Criteria andTotalIdleTimeNotBetween(Long value1, Long value2) {
            addCriterion("total_idle_time not between", value1, value2, "totalIdleTime");
            return (Criteria) this;
        }

        public Criteria andCurRunTimeIsNull() {
            addCriterion("cur_run_time is null");
            return (Criteria) this;
        }

        public Criteria andCurRunTimeIsNotNull() {
            addCriterion("cur_run_time is not null");
            return (Criteria) this;
        }

        public Criteria andCurRunTimeEqualTo(Long value) {
            addCriterion("cur_run_time =", value, "curRunTime");
            return (Criteria) this;
        }

        public Criteria andCurRunTimeNotEqualTo(Long value) {
            addCriterion("cur_run_time <>", value, "curRunTime");
            return (Criteria) this;
        }

        public Criteria andCurRunTimeGreaterThan(Long value) {
            addCriterion("cur_run_time >", value, "curRunTime");
            return (Criteria) this;
        }

        public Criteria andCurRunTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("cur_run_time >=", value, "curRunTime");
            return (Criteria) this;
        }

        public Criteria andCurRunTimeLessThan(Long value) {
            addCriterion("cur_run_time <", value, "curRunTime");
            return (Criteria) this;
        }

        public Criteria andCurRunTimeLessThanOrEqualTo(Long value) {
            addCriterion("cur_run_time <=", value, "curRunTime");
            return (Criteria) this;
        }

        public Criteria andCurRunTimeIn(List<Long> values) {
            addCriterion("cur_run_time in", values, "curRunTime");
            return (Criteria) this;
        }

        public Criteria andCurRunTimeNotIn(List<Long> values) {
            addCriterion("cur_run_time not in", values, "curRunTime");
            return (Criteria) this;
        }

        public Criteria andCurRunTimeBetween(Long value1, Long value2) {
            addCriterion("cur_run_time between", value1, value2, "curRunTime");
            return (Criteria) this;
        }

        public Criteria andCurRunTimeNotBetween(Long value1, Long value2) {
            addCriterion("cur_run_time not between", value1, value2, "curRunTime");
            return (Criteria) this;
        }

        public Criteria andCurIdleTimeIsNull() {
            addCriterion("cur_idle_time is null");
            return (Criteria) this;
        }

        public Criteria andCurIdleTimeIsNotNull() {
            addCriterion("cur_idle_time is not null");
            return (Criteria) this;
        }

        public Criteria andCurIdleTimeEqualTo(Long value) {
            addCriterion("cur_idle_time =", value, "curIdleTime");
            return (Criteria) this;
        }

        public Criteria andCurIdleTimeNotEqualTo(Long value) {
            addCriterion("cur_idle_time <>", value, "curIdleTime");
            return (Criteria) this;
        }

        public Criteria andCurIdleTimeGreaterThan(Long value) {
            addCriterion("cur_idle_time >", value, "curIdleTime");
            return (Criteria) this;
        }

        public Criteria andCurIdleTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("cur_idle_time >=", value, "curIdleTime");
            return (Criteria) this;
        }

        public Criteria andCurIdleTimeLessThan(Long value) {
            addCriterion("cur_idle_time <", value, "curIdleTime");
            return (Criteria) this;
        }

        public Criteria andCurIdleTimeLessThanOrEqualTo(Long value) {
            addCriterion("cur_idle_time <=", value, "curIdleTime");
            return (Criteria) this;
        }

        public Criteria andCurIdleTimeIn(List<Long> values) {
            addCriterion("cur_idle_time in", values, "curIdleTime");
            return (Criteria) this;
        }

        public Criteria andCurIdleTimeNotIn(List<Long> values) {
            addCriterion("cur_idle_time not in", values, "curIdleTime");
            return (Criteria) this;
        }

        public Criteria andCurIdleTimeBetween(Long value1, Long value2) {
            addCriterion("cur_idle_time between", value1, value2, "curIdleTime");
            return (Criteria) this;
        }

        public Criteria andCurIdleTimeNotBetween(Long value1, Long value2) {
            addCriterion("cur_idle_time not between", value1, value2, "curIdleTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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