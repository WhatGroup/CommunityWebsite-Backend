package com.gb.po;

import java.util.ArrayList;
import java.util.List;

public class MatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchExample() {
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

        public Criteria andMatchNoIsNull() {
            addCriterion("matchNo is null");
            return (Criteria) this;
        }

        public Criteria andMatchNoIsNotNull() {
            addCriterion("matchNo is not null");
            return (Criteria) this;
        }

        public Criteria andMatchNoEqualTo(Integer value) {
            addCriterion("matchNo =", value, "matchNo");
            return (Criteria) this;
        }

        public Criteria andMatchNoNotEqualTo(Integer value) {
            addCriterion("matchNo <>", value, "matchNo");
            return (Criteria) this;
        }

        public Criteria andMatchNoGreaterThan(Integer value) {
            addCriterion("matchNo >", value, "matchNo");
            return (Criteria) this;
        }

        public Criteria andMatchNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("matchNo >=", value, "matchNo");
            return (Criteria) this;
        }

        public Criteria andMatchNoLessThan(Integer value) {
            addCriterion("matchNo <", value, "matchNo");
            return (Criteria) this;
        }

        public Criteria andMatchNoLessThanOrEqualTo(Integer value) {
            addCriterion("matchNo <=", value, "matchNo");
            return (Criteria) this;
        }

        public Criteria andMatchNoIn(List<Integer> values) {
            addCriterion("matchNo in", values, "matchNo");
            return (Criteria) this;
        }

        public Criteria andMatchNoNotIn(List<Integer> values) {
            addCriterion("matchNo not in", values, "matchNo");
            return (Criteria) this;
        }

        public Criteria andMatchNoBetween(Integer value1, Integer value2) {
            addCriterion("matchNo between", value1, value2, "matchNo");
            return (Criteria) this;
        }

        public Criteria andMatchNoNotBetween(Integer value1, Integer value2) {
            addCriterion("matchNo not between", value1, value2, "matchNo");
            return (Criteria) this;
        }

        public Criteria andWorkerNoIsNull() {
            addCriterion("workerNo is null");
            return (Criteria) this;
        }

        public Criteria andWorkerNoIsNotNull() {
            addCriterion("workerNo is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerNoEqualTo(String value) {
            addCriterion("workerNo =", value, "workerNo");
            return (Criteria) this;
        }

        public Criteria andWorkerNoNotEqualTo(String value) {
            addCriterion("workerNo <>", value, "workerNo");
            return (Criteria) this;
        }

        public Criteria andWorkerNoGreaterThan(String value) {
            addCriterion("workerNo >", value, "workerNo");
            return (Criteria) this;
        }

        public Criteria andWorkerNoGreaterThanOrEqualTo(String value) {
            addCriterion("workerNo >=", value, "workerNo");
            return (Criteria) this;
        }

        public Criteria andWorkerNoLessThan(String value) {
            addCriterion("workerNo <", value, "workerNo");
            return (Criteria) this;
        }

        public Criteria andWorkerNoLessThanOrEqualTo(String value) {
            addCriterion("workerNo <=", value, "workerNo");
            return (Criteria) this;
        }

        public Criteria andWorkerNoLike(String value) {
            addCriterion("workerNo like", value, "workerNo");
            return (Criteria) this;
        }

        public Criteria andWorkerNoNotLike(String value) {
            addCriterion("workerNo not like", value, "workerNo");
            return (Criteria) this;
        }

        public Criteria andWorkerNoIn(List<String> values) {
            addCriterion("workerNo in", values, "workerNo");
            return (Criteria) this;
        }

        public Criteria andWorkerNoNotIn(List<String> values) {
            addCriterion("workerNo not in", values, "workerNo");
            return (Criteria) this;
        }

        public Criteria andWorkerNoBetween(String value1, String value2) {
            addCriterion("workerNo between", value1, value2, "workerNo");
            return (Criteria) this;
        }

        public Criteria andWorkerNoNotBetween(String value1, String value2) {
            addCriterion("workerNo not between", value1, value2, "workerNo");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNull() {
            addCriterion("workerName is null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNotNull() {
            addCriterion("workerName is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameEqualTo(String value) {
            addCriterion("workerName =", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotEqualTo(String value) {
            addCriterion("workerName <>", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThan(String value) {
            addCriterion("workerName >", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThanOrEqualTo(String value) {
            addCriterion("workerName >=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThan(String value) {
            addCriterion("workerName <", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThanOrEqualTo(String value) {
            addCriterion("workerName <=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLike(String value) {
            addCriterion("workerName like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotLike(String value) {
            addCriterion("workerName not like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIn(List<String> values) {
            addCriterion("workerName in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotIn(List<String> values) {
            addCriterion("workerName not in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameBetween(String value1, String value2) {
            addCriterion("workerName between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotBetween(String value1, String value2) {
            addCriterion("workerName not between", value1, value2, "workerName");
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