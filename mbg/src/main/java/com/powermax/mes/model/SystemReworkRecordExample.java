package com.powermax.mes.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemReworkRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemReworkRecordExample() {
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

        public Criteria andTimerIsNull() {
            addCriterion("timer is null");
            return (Criteria) this;
        }

        public Criteria andTimerIsNotNull() {
            addCriterion("timer is not null");
            return (Criteria) this;
        }

        public Criteria andTimerEqualTo(Long value) {
            addCriterion("timer =", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerNotEqualTo(Long value) {
            addCriterion("timer <>", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerGreaterThan(Long value) {
            addCriterion("timer >", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerGreaterThanOrEqualTo(Long value) {
            addCriterion("timer >=", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerLessThan(Long value) {
            addCriterion("timer <", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerLessThanOrEqualTo(Long value) {
            addCriterion("timer <=", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerIn(List<Long> values) {
            addCriterion("timer in", values, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerNotIn(List<Long> values) {
            addCriterion("timer not in", values, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerBetween(Long value1, Long value2) {
            addCriterion("timer between", value1, value2, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerNotBetween(Long value1, Long value2) {
            addCriterion("timer not between", value1, value2, "timer");
            return (Criteria) this;
        }

        public Criteria andPieceIsNull() {
            addCriterion("piece is null");
            return (Criteria) this;
        }

        public Criteria andPieceIsNotNull() {
            addCriterion("piece is not null");
            return (Criteria) this;
        }

        public Criteria andPieceEqualTo(Long value) {
            addCriterion("piece =", value, "piece");
            return (Criteria) this;
        }

        public Criteria andPieceNotEqualTo(Long value) {
            addCriterion("piece <>", value, "piece");
            return (Criteria) this;
        }

        public Criteria andPieceGreaterThan(Long value) {
            addCriterion("piece >", value, "piece");
            return (Criteria) this;
        }

        public Criteria andPieceGreaterThanOrEqualTo(Long value) {
            addCriterion("piece >=", value, "piece");
            return (Criteria) this;
        }

        public Criteria andPieceLessThan(Long value) {
            addCriterion("piece <", value, "piece");
            return (Criteria) this;
        }

        public Criteria andPieceLessThanOrEqualTo(Long value) {
            addCriterion("piece <=", value, "piece");
            return (Criteria) this;
        }

        public Criteria andPieceIn(List<Long> values) {
            addCriterion("piece in", values, "piece");
            return (Criteria) this;
        }

        public Criteria andPieceNotIn(List<Long> values) {
            addCriterion("piece not in", values, "piece");
            return (Criteria) this;
        }

        public Criteria andPieceBetween(Long value1, Long value2) {
            addCriterion("piece between", value1, value2, "piece");
            return (Criteria) this;
        }

        public Criteria andPieceNotBetween(Long value1, Long value2) {
            addCriterion("piece not between", value1, value2, "piece");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andReworkCodesIsNull() {
            addCriterion("rework_codes is null");
            return (Criteria) this;
        }

        public Criteria andReworkCodesIsNotNull() {
            addCriterion("rework_codes is not null");
            return (Criteria) this;
        }

        public Criteria andReworkCodesEqualTo(String value) {
            addCriterion("rework_codes =", value, "reworkCodes");
            return (Criteria) this;
        }

        public Criteria andReworkCodesNotEqualTo(String value) {
            addCriterion("rework_codes <>", value, "reworkCodes");
            return (Criteria) this;
        }

        public Criteria andReworkCodesGreaterThan(String value) {
            addCriterion("rework_codes >", value, "reworkCodes");
            return (Criteria) this;
        }

        public Criteria andReworkCodesGreaterThanOrEqualTo(String value) {
            addCriterion("rework_codes >=", value, "reworkCodes");
            return (Criteria) this;
        }

        public Criteria andReworkCodesLessThan(String value) {
            addCriterion("rework_codes <", value, "reworkCodes");
            return (Criteria) this;
        }

        public Criteria andReworkCodesLessThanOrEqualTo(String value) {
            addCriterion("rework_codes <=", value, "reworkCodes");
            return (Criteria) this;
        }

        public Criteria andReworkCodesLike(String value) {
            addCriterion("rework_codes like", value, "reworkCodes");
            return (Criteria) this;
        }

        public Criteria andReworkCodesNotLike(String value) {
            addCriterion("rework_codes not like", value, "reworkCodes");
            return (Criteria) this;
        }

        public Criteria andReworkCodesIn(List<String> values) {
            addCriterion("rework_codes in", values, "reworkCodes");
            return (Criteria) this;
        }

        public Criteria andReworkCodesNotIn(List<String> values) {
            addCriterion("rework_codes not in", values, "reworkCodes");
            return (Criteria) this;
        }

        public Criteria andReworkCodesBetween(String value1, String value2) {
            addCriterion("rework_codes between", value1, value2, "reworkCodes");
            return (Criteria) this;
        }

        public Criteria andReworkCodesNotBetween(String value1, String value2) {
            addCriterion("rework_codes not between", value1, value2, "reworkCodes");
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