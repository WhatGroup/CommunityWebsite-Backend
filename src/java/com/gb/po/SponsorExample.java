package com.gb.po;

import java.util.ArrayList;
import java.util.List;

public class SponsorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SponsorExample() {
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

        public Criteria andSponsorNoIsNull() {
            addCriterion("sponsorNo is null");
            return (Criteria) this;
        }

        public Criteria andSponsorNoIsNotNull() {
            addCriterion("sponsorNo is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorNoEqualTo(Integer value) {
            addCriterion("sponsorNo =", value, "sponsorNo");
            return (Criteria) this;
        }

        public Criteria andSponsorNoNotEqualTo(Integer value) {
            addCriterion("sponsorNo <>", value, "sponsorNo");
            return (Criteria) this;
        }

        public Criteria andSponsorNoGreaterThan(Integer value) {
            addCriterion("sponsorNo >", value, "sponsorNo");
            return (Criteria) this;
        }

        public Criteria andSponsorNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sponsorNo >=", value, "sponsorNo");
            return (Criteria) this;
        }

        public Criteria andSponsorNoLessThan(Integer value) {
            addCriterion("sponsorNo <", value, "sponsorNo");
            return (Criteria) this;
        }

        public Criteria andSponsorNoLessThanOrEqualTo(Integer value) {
            addCriterion("sponsorNo <=", value, "sponsorNo");
            return (Criteria) this;
        }

        public Criteria andSponsorNoIn(List<Integer> values) {
            addCriterion("sponsorNo in", values, "sponsorNo");
            return (Criteria) this;
        }

        public Criteria andSponsorNoNotIn(List<Integer> values) {
            addCriterion("sponsorNo not in", values, "sponsorNo");
            return (Criteria) this;
        }

        public Criteria andSponsorNoBetween(Integer value1, Integer value2) {
            addCriterion("sponsorNo between", value1, value2, "sponsorNo");
            return (Criteria) this;
        }

        public Criteria andSponsorNoNotBetween(Integer value1, Integer value2) {
            addCriterion("sponsorNo not between", value1, value2, "sponsorNo");
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

        public Criteria andCompanyNoIsNull() {
            addCriterion("companyNo is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNoIsNotNull() {
            addCriterion("companyNo is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNoEqualTo(Integer value) {
            addCriterion("companyNo =", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotEqualTo(Integer value) {
            addCriterion("companyNo <>", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoGreaterThan(Integer value) {
            addCriterion("companyNo >", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyNo >=", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoLessThan(Integer value) {
            addCriterion("companyNo <", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoLessThanOrEqualTo(Integer value) {
            addCriterion("companyNo <=", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoIn(List<Integer> values) {
            addCriterion("companyNo in", values, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotIn(List<Integer> values) {
            addCriterion("companyNo not in", values, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoBetween(Integer value1, Integer value2) {
            addCriterion("companyNo between", value1, value2, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotBetween(Integer value1, Integer value2) {
            addCriterion("companyNo not between", value1, value2, "companyNo");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
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