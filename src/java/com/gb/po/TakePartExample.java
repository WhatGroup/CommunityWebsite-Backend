package com.gb.po;

import java.util.ArrayList;
import java.util.List;

public class TakePartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TakePartExample() {
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

        public Criteria andTakepartNoIsNull() {
            addCriterion("takepartNo is null");
            return (Criteria) this;
        }

        public Criteria andTakepartNoIsNotNull() {
            addCriterion("takepartNo is not null");
            return (Criteria) this;
        }

        public Criteria andTakepartNoEqualTo(Integer value) {
            addCriterion("takepartNo =", value, "takepartNo");
            return (Criteria) this;
        }

        public Criteria andTakepartNoNotEqualTo(Integer value) {
            addCriterion("takepartNo <>", value, "takepartNo");
            return (Criteria) this;
        }

        public Criteria andTakepartNoGreaterThan(Integer value) {
            addCriterion("takepartNo >", value, "takepartNo");
            return (Criteria) this;
        }

        public Criteria andTakepartNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("takepartNo >=", value, "takepartNo");
            return (Criteria) this;
        }

        public Criteria andTakepartNoLessThan(Integer value) {
            addCriterion("takepartNo <", value, "takepartNo");
            return (Criteria) this;
        }

        public Criteria andTakepartNoLessThanOrEqualTo(Integer value) {
            addCriterion("takepartNo <=", value, "takepartNo");
            return (Criteria) this;
        }

        public Criteria andTakepartNoIn(List<Integer> values) {
            addCriterion("takepartNo in", values, "takepartNo");
            return (Criteria) this;
        }

        public Criteria andTakepartNoNotIn(List<Integer> values) {
            addCriterion("takepartNo not in", values, "takepartNo");
            return (Criteria) this;
        }

        public Criteria andTakepartNoBetween(Integer value1, Integer value2) {
            addCriterion("takepartNo between", value1, value2, "takepartNo");
            return (Criteria) this;
        }

        public Criteria andTakepartNoNotBetween(Integer value1, Integer value2) {
            addCriterion("takepartNo not between", value1, value2, "takepartNo");
            return (Criteria) this;
        }

        public Criteria andEventNoIsNull() {
            addCriterion("eventNo is null");
            return (Criteria) this;
        }

        public Criteria andEventNoIsNotNull() {
            addCriterion("eventNo is not null");
            return (Criteria) this;
        }

        public Criteria andEventNoEqualTo(Integer value) {
            addCriterion("eventNo =", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoNotEqualTo(Integer value) {
            addCriterion("eventNo <>", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoGreaterThan(Integer value) {
            addCriterion("eventNo >", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("eventNo >=", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoLessThan(Integer value) {
            addCriterion("eventNo <", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoLessThanOrEqualTo(Integer value) {
            addCriterion("eventNo <=", value, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoIn(List<Integer> values) {
            addCriterion("eventNo in", values, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoNotIn(List<Integer> values) {
            addCriterion("eventNo not in", values, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoBetween(Integer value1, Integer value2) {
            addCriterion("eventNo between", value1, value2, "eventNo");
            return (Criteria) this;
        }

        public Criteria andEventNoNotBetween(Integer value1, Integer value2) {
            addCriterion("eventNo not between", value1, value2, "eventNo");
            return (Criteria) this;
        }

        public Criteria andClientNoIsNull() {
            addCriterion("clientNo is null");
            return (Criteria) this;
        }

        public Criteria andClientNoIsNotNull() {
            addCriterion("clientNo is not null");
            return (Criteria) this;
        }

        public Criteria andClientNoEqualTo(Integer value) {
            addCriterion("clientNo =", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoNotEqualTo(Integer value) {
            addCriterion("clientNo <>", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoGreaterThan(Integer value) {
            addCriterion("clientNo >", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientNo >=", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoLessThan(Integer value) {
            addCriterion("clientNo <", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoLessThanOrEqualTo(Integer value) {
            addCriterion("clientNo <=", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoIn(List<Integer> values) {
            addCriterion("clientNo in", values, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoNotIn(List<Integer> values) {
            addCriterion("clientNo not in", values, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoBetween(Integer value1, Integer value2) {
            addCriterion("clientNo between", value1, value2, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoNotBetween(Integer value1, Integer value2) {
            addCriterion("clientNo not between", value1, value2, "clientNo");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
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