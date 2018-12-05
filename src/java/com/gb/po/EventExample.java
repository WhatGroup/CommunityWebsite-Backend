package com.gb.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andEventTitleIsNull() {
            addCriterion("eventTitle is null");
            return (Criteria) this;
        }

        public Criteria andEventTitleIsNotNull() {
            addCriterion("eventTitle is not null");
            return (Criteria) this;
        }

        public Criteria andEventTitleEqualTo(String value) {
            addCriterion("eventTitle =", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotEqualTo(String value) {
            addCriterion("eventTitle <>", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleGreaterThan(String value) {
            addCriterion("eventTitle >", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleGreaterThanOrEqualTo(String value) {
            addCriterion("eventTitle >=", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLessThan(String value) {
            addCriterion("eventTitle <", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLessThanOrEqualTo(String value) {
            addCriterion("eventTitle <=", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLike(String value) {
            addCriterion("eventTitle like", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotLike(String value) {
            addCriterion("eventTitle not like", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleIn(List<String> values) {
            addCriterion("eventTitle in", values, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotIn(List<String> values) {
            addCriterion("eventTitle not in", values, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleBetween(String value1, String value2) {
            addCriterion("eventTitle between", value1, value2, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotBetween(String value1, String value2) {
            addCriterion("eventTitle not between", value1, value2, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andApplyEndIsNull() {
            addCriterion("applyEnd is null");
            return (Criteria) this;
        }

        public Criteria andApplyEndIsNotNull() {
            addCriterion("applyEnd is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEndEqualTo(Date value) {
            addCriterionForJDBCDate("applyEnd =", value, "applyEnd");
            return (Criteria) this;
        }

        public Criteria andApplyEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("applyEnd <>", value, "applyEnd");
            return (Criteria) this;
        }

        public Criteria andApplyEndGreaterThan(Date value) {
            addCriterionForJDBCDate("applyEnd >", value, "applyEnd");
            return (Criteria) this;
        }

        public Criteria andApplyEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applyEnd >=", value, "applyEnd");
            return (Criteria) this;
        }

        public Criteria andApplyEndLessThan(Date value) {
            addCriterionForJDBCDate("applyEnd <", value, "applyEnd");
            return (Criteria) this;
        }

        public Criteria andApplyEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applyEnd <=", value, "applyEnd");
            return (Criteria) this;
        }

        public Criteria andApplyEndIn(List<Date> values) {
            addCriterionForJDBCDate("applyEnd in", values, "applyEnd");
            return (Criteria) this;
        }

        public Criteria andApplyEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("applyEnd not in", values, "applyEnd");
            return (Criteria) this;
        }

        public Criteria andApplyEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applyEnd between", value1, value2, "applyEnd");
            return (Criteria) this;
        }

        public Criteria andApplyEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applyEnd not between", value1, value2, "applyEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndIsNull() {
            addCriterion("trainEnd is null");
            return (Criteria) this;
        }

        public Criteria andTrainEndIsNotNull() {
            addCriterion("trainEnd is not null");
            return (Criteria) this;
        }

        public Criteria andTrainEndEqualTo(Date value) {
            addCriterionForJDBCDate("trainEnd =", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("trainEnd <>", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndGreaterThan(Date value) {
            addCriterionForJDBCDate("trainEnd >", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trainEnd >=", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndLessThan(Date value) {
            addCriterionForJDBCDate("trainEnd <", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trainEnd <=", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndIn(List<Date> values) {
            addCriterionForJDBCDate("trainEnd in", values, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("trainEnd not in", values, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trainEnd between", value1, value2, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trainEnd not between", value1, value2, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndIsNull() {
            addCriterion("eventEnd is null");
            return (Criteria) this;
        }

        public Criteria andEventEndIsNotNull() {
            addCriterion("eventEnd is not null");
            return (Criteria) this;
        }

        public Criteria andEventEndEqualTo(Date value) {
            addCriterionForJDBCDate("eventEnd =", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("eventEnd <>", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndGreaterThan(Date value) {
            addCriterionForJDBCDate("eventEnd >", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("eventEnd >=", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndLessThan(Date value) {
            addCriterionForJDBCDate("eventEnd <", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("eventEnd <=", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndIn(List<Date> values) {
            addCriterionForJDBCDate("eventEnd in", values, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("eventEnd not in", values, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("eventEnd between", value1, value2, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("eventEnd not between", value1, value2, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andIfTrainIsNull() {
            addCriterion("ifTrain is null");
            return (Criteria) this;
        }

        public Criteria andIfTrainIsNotNull() {
            addCriterion("ifTrain is not null");
            return (Criteria) this;
        }

        public Criteria andIfTrainEqualTo(Integer value) {
            addCriterion("ifTrain =", value, "ifTrain");
            return (Criteria) this;
        }

        public Criteria andIfTrainNotEqualTo(Integer value) {
            addCriterion("ifTrain <>", value, "ifTrain");
            return (Criteria) this;
        }

        public Criteria andIfTrainGreaterThan(Integer value) {
            addCriterion("ifTrain >", value, "ifTrain");
            return (Criteria) this;
        }

        public Criteria andIfTrainGreaterThanOrEqualTo(Integer value) {
            addCriterion("ifTrain >=", value, "ifTrain");
            return (Criteria) this;
        }

        public Criteria andIfTrainLessThan(Integer value) {
            addCriterion("ifTrain <", value, "ifTrain");
            return (Criteria) this;
        }

        public Criteria andIfTrainLessThanOrEqualTo(Integer value) {
            addCriterion("ifTrain <=", value, "ifTrain");
            return (Criteria) this;
        }

        public Criteria andIfTrainIn(List<Integer> values) {
            addCriterion("ifTrain in", values, "ifTrain");
            return (Criteria) this;
        }

        public Criteria andIfTrainNotIn(List<Integer> values) {
            addCriterion("ifTrain not in", values, "ifTrain");
            return (Criteria) this;
        }

        public Criteria andIfTrainBetween(Integer value1, Integer value2) {
            addCriterion("ifTrain between", value1, value2, "ifTrain");
            return (Criteria) this;
        }

        public Criteria andIfTrainNotBetween(Integer value1, Integer value2) {
            addCriterion("ifTrain not between", value1, value2, "ifTrain");
            return (Criteria) this;
        }

        public Criteria andTypeNoIsNull() {
            addCriterion("typeNo is null");
            return (Criteria) this;
        }

        public Criteria andTypeNoIsNotNull() {
            addCriterion("typeNo is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNoEqualTo(Integer value) {
            addCriterion("typeNo =", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoNotEqualTo(Integer value) {
            addCriterion("typeNo <>", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoGreaterThan(Integer value) {
            addCriterion("typeNo >", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeNo >=", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoLessThan(Integer value) {
            addCriterion("typeNo <", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoLessThanOrEqualTo(Integer value) {
            addCriterion("typeNo <=", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoIn(List<Integer> values) {
            addCriterion("typeNo in", values, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoNotIn(List<Integer> values) {
            addCriterion("typeNo not in", values, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoBetween(Integer value1, Integer value2) {
            addCriterion("typeNo between", value1, value2, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoNotBetween(Integer value1, Integer value2) {
            addCriterion("typeNo not between", value1, value2, "typeNo");
            return (Criteria) this;
        }

        public Criteria andRecruitNumIsNull() {
            addCriterion("recruitNum is null");
            return (Criteria) this;
        }

        public Criteria andRecruitNumIsNotNull() {
            addCriterion("recruitNum is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitNumEqualTo(Integer value) {
            addCriterion("recruitNum =", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumNotEqualTo(Integer value) {
            addCriterion("recruitNum <>", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumGreaterThan(Integer value) {
            addCriterion("recruitNum >", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruitNum >=", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumLessThan(Integer value) {
            addCriterion("recruitNum <", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumLessThanOrEqualTo(Integer value) {
            addCriterion("recruitNum <=", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumIn(List<Integer> values) {
            addCriterion("recruitNum in", values, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumNotIn(List<Integer> values) {
            addCriterion("recruitNum not in", values, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumBetween(Integer value1, Integer value2) {
            addCriterion("recruitNum between", value1, value2, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("recruitNum not between", value1, value2, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNull() {
            addCriterion("applyNum is null");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNotNull() {
            addCriterion("applyNum is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNumEqualTo(Integer value) {
            addCriterion("applyNum =", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotEqualTo(Integer value) {
            addCriterion("applyNum <>", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThan(Integer value) {
            addCriterion("applyNum >", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("applyNum >=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThan(Integer value) {
            addCriterion("applyNum <", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThanOrEqualTo(Integer value) {
            addCriterion("applyNum <=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumIn(List<Integer> values) {
            addCriterion("applyNum in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotIn(List<Integer> values) {
            addCriterion("applyNum not in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumBetween(Integer value1, Integer value2) {
            addCriterion("applyNum between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("applyNum not between", value1, value2, "applyNum");
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