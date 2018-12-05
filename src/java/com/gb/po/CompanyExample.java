package com.gb.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("companyName =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("companyName <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("companyName like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("companyName not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("companyName in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("companyPhone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("companyPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("companyPhone =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("companyPhone <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("companyPhone >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("companyPhone >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("companyPhone <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("companyPhone <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("companyPhone like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("companyPhone not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("companyPhone in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("companyPhone not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("companyPhone between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("companyPhone not between", value1, value2, "companyPhone");
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

        public Criteria andWorkerSexIsNull() {
            addCriterion("workerSex is null");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIsNotNull() {
            addCriterion("workerSex is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerSexEqualTo(Integer value) {
            addCriterion("workerSex =", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotEqualTo(Integer value) {
            addCriterion("workerSex <>", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexGreaterThan(Integer value) {
            addCriterion("workerSex >", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("workerSex >=", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLessThan(Integer value) {
            addCriterion("workerSex <", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLessThanOrEqualTo(Integer value) {
            addCriterion("workerSex <=", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIn(List<Integer> values) {
            addCriterion("workerSex in", values, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotIn(List<Integer> values) {
            addCriterion("workerSex not in", values, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexBetween(Integer value1, Integer value2) {
            addCriterion("workerSex between", value1, value2, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotBetween(Integer value1, Integer value2) {
            addCriterion("workerSex not between", value1, value2, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneIsNull() {
            addCriterion("workerPhone is null");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneIsNotNull() {
            addCriterion("workerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneEqualTo(String value) {
            addCriterion("workerPhone =", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneNotEqualTo(String value) {
            addCriterion("workerPhone <>", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneGreaterThan(String value) {
            addCriterion("workerPhone >", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("workerPhone >=", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneLessThan(String value) {
            addCriterion("workerPhone <", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneLessThanOrEqualTo(String value) {
            addCriterion("workerPhone <=", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneLike(String value) {
            addCriterion("workerPhone like", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneNotLike(String value) {
            addCriterion("workerPhone not like", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneIn(List<String> values) {
            addCriterion("workerPhone in", values, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneNotIn(List<String> values) {
            addCriterion("workerPhone not in", values, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneBetween(String value1, String value2) {
            addCriterion("workerPhone between", value1, value2, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneNotBetween(String value1, String value2) {
            addCriterion("workerPhone not between", value1, value2, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardIsNull() {
            addCriterion("workerIdcard is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardIsNotNull() {
            addCriterion("workerIdcard is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardEqualTo(String value) {
            addCriterion("workerIdcard =", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardNotEqualTo(String value) {
            addCriterion("workerIdcard <>", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardGreaterThan(String value) {
            addCriterion("workerIdcard >", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("workerIdcard >=", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardLessThan(String value) {
            addCriterion("workerIdcard <", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardLessThanOrEqualTo(String value) {
            addCriterion("workerIdcard <=", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardLike(String value) {
            addCriterion("workerIdcard like", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardNotLike(String value) {
            addCriterion("workerIdcard not like", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardIn(List<String> values) {
            addCriterion("workerIdcard in", values, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardNotIn(List<String> values) {
            addCriterion("workerIdcard not in", values, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardBetween(String value1, String value2) {
            addCriterion("workerIdcard between", value1, value2, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardNotBetween(String value1, String value2) {
            addCriterion("workerIdcard not between", value1, value2, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailIsNull() {
            addCriterion("workerEmail is null");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailIsNotNull() {
            addCriterion("workerEmail is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailEqualTo(String value) {
            addCriterion("workerEmail =", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailNotEqualTo(String value) {
            addCriterion("workerEmail <>", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailGreaterThan(String value) {
            addCriterion("workerEmail >", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("workerEmail >=", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailLessThan(String value) {
            addCriterion("workerEmail <", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailLessThanOrEqualTo(String value) {
            addCriterion("workerEmail <=", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailLike(String value) {
            addCriterion("workerEmail like", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailNotLike(String value) {
            addCriterion("workerEmail not like", value, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailIn(List<String> values) {
            addCriterion("workerEmail in", values, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailNotIn(List<String> values) {
            addCriterion("workerEmail not in", values, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailBetween(String value1, String value2) {
            addCriterion("workerEmail between", value1, value2, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andWorkerEmailNotBetween(String value1, String value2) {
            addCriterion("workerEmail not between", value1, value2, "workerEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNull() {
            addCriterion("companyEmail is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNotNull() {
            addCriterion("companyEmail is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailEqualTo(String value) {
            addCriterion("companyEmail =", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotEqualTo(String value) {
            addCriterion("companyEmail <>", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThan(String value) {
            addCriterion("companyEmail >", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("companyEmail >=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThan(String value) {
            addCriterion("companyEmail <", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThanOrEqualTo(String value) {
            addCriterion("companyEmail <=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLike(String value) {
            addCriterion("companyEmail like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotLike(String value) {
            addCriterion("companyEmail not like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIn(List<String> values) {
            addCriterion("companyEmail in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotIn(List<String> values) {
            addCriterion("companyEmail not in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailBetween(String value1, String value2) {
            addCriterion("companyEmail between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotBetween(String value1, String value2) {
            addCriterion("companyEmail not between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNull() {
            addCriterion("legalName is null");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNotNull() {
            addCriterion("legalName is not null");
            return (Criteria) this;
        }

        public Criteria andLegalNameEqualTo(String value) {
            addCriterion("legalName =", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotEqualTo(String value) {
            addCriterion("legalName <>", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThan(String value) {
            addCriterion("legalName >", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThanOrEqualTo(String value) {
            addCriterion("legalName >=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThan(String value) {
            addCriterion("legalName <", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThanOrEqualTo(String value) {
            addCriterion("legalName <=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLike(String value) {
            addCriterion("legalName like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotLike(String value) {
            addCriterion("legalName not like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameIn(List<String> values) {
            addCriterion("legalName in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotIn(List<String> values) {
            addCriterion("legalName not in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameBetween(String value1, String value2) {
            addCriterion("legalName between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotBetween(String value1, String value2) {
            addCriterion("legalName not between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardIsNull() {
            addCriterion("legalIdcard is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardIsNotNull() {
            addCriterion("legalIdcard is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardEqualTo(String value) {
            addCriterion("legalIdcard =", value, "legalIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardNotEqualTo(String value) {
            addCriterion("legalIdcard <>", value, "legalIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardGreaterThan(String value) {
            addCriterion("legalIdcard >", value, "legalIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("legalIdcard >=", value, "legalIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardLessThan(String value) {
            addCriterion("legalIdcard <", value, "legalIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardLessThanOrEqualTo(String value) {
            addCriterion("legalIdcard <=", value, "legalIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardLike(String value) {
            addCriterion("legalIdcard like", value, "legalIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardNotLike(String value) {
            addCriterion("legalIdcard not like", value, "legalIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardIn(List<String> values) {
            addCriterion("legalIdcard in", values, "legalIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardNotIn(List<String> values) {
            addCriterion("legalIdcard not in", values, "legalIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardBetween(String value1, String value2) {
            addCriterion("legalIdcard between", value1, value2, "legalIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalIdcardNotBetween(String value1, String value2) {
            addCriterion("legalIdcard not between", value1, value2, "legalIdcard");
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