package com.gb.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewExample() {
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

        public Criteria andNewsNoIsNull() {
            addCriterion("newsNo is null");
            return (Criteria) this;
        }

        public Criteria andNewsNoIsNotNull() {
            addCriterion("newsNo is not null");
            return (Criteria) this;
        }

        public Criteria andNewsNoEqualTo(Integer value) {
            addCriterion("newsNo =", value, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoNotEqualTo(Integer value) {
            addCriterion("newsNo <>", value, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoGreaterThan(Integer value) {
            addCriterion("newsNo >", value, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsNo >=", value, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoLessThan(Integer value) {
            addCriterion("newsNo <", value, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoLessThanOrEqualTo(Integer value) {
            addCriterion("newsNo <=", value, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoIn(List<Integer> values) {
            addCriterion("newsNo in", values, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoNotIn(List<Integer> values) {
            addCriterion("newsNo not in", values, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoBetween(Integer value1, Integer value2) {
            addCriterion("newsNo between", value1, value2, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoNotBetween(Integer value1, Integer value2) {
            addCriterion("newsNo not between", value1, value2, "newsNo");
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

        public Criteria andNewsTitleIsNull() {
            addCriterion("newsTitle is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("newsTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("newsTitle =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("newsTitle <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("newsTitle >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("newsTitle >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("newsTitle <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("newsTitle <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("newsTitle like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("newsTitle not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("newsTitle in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("newsTitle not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("newsTitle between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("newsTitle not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("createAt is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("createAt is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("createAt =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("createAt <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("createAt >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("createAt >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("createAt <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("createAt <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("createAt in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("createAt not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("createAt between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("createAt not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andEditAtIsNull() {
            addCriterion("editAt is null");
            return (Criteria) this;
        }

        public Criteria andEditAtIsNotNull() {
            addCriterion("editAt is not null");
            return (Criteria) this;
        }

        public Criteria andEditAtEqualTo(Date value) {
            addCriterion("editAt =", value, "editAt");
            return (Criteria) this;
        }

        public Criteria andEditAtNotEqualTo(Date value) {
            addCriterion("editAt <>", value, "editAt");
            return (Criteria) this;
        }

        public Criteria andEditAtGreaterThan(Date value) {
            addCriterion("editAt >", value, "editAt");
            return (Criteria) this;
        }

        public Criteria andEditAtGreaterThanOrEqualTo(Date value) {
            addCriterion("editAt >=", value, "editAt");
            return (Criteria) this;
        }

        public Criteria andEditAtLessThan(Date value) {
            addCriterion("editAt <", value, "editAt");
            return (Criteria) this;
        }

        public Criteria andEditAtLessThanOrEqualTo(Date value) {
            addCriterion("editAt <=", value, "editAt");
            return (Criteria) this;
        }

        public Criteria andEditAtIn(List<Date> values) {
            addCriterion("editAt in", values, "editAt");
            return (Criteria) this;
        }

        public Criteria andEditAtNotIn(List<Date> values) {
            addCriterion("editAt not in", values, "editAt");
            return (Criteria) this;
        }

        public Criteria andEditAtBetween(Date value1, Date value2) {
            addCriterion("editAt between", value1, value2, "editAt");
            return (Criteria) this;
        }

        public Criteria andEditAtNotBetween(Date value1, Date value2) {
            addCriterion("editAt not between", value1, value2, "editAt");
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