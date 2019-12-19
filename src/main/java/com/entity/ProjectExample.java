package com.entity;

import java.util.ArrayList;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("pro_name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("pro_name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("pro_name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("pro_name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("pro_name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("pro_name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("pro_name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("pro_name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("pro_name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("pro_name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("pro_name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("pro_name not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andDeclarerTeacherNumIsNull() {
            addCriterion("declarer_teacher_num is null");
            return (Criteria) this;
        }

        public Criteria andDeclarerTeacherNumIsNotNull() {
            addCriterion("declarer_teacher_num is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarerTeacherNumEqualTo(Integer value) {
            addCriterion("declarer_teacher_num =", value, "declarerTeacherNum");
            return (Criteria) this;
        }

        public Criteria andDeclarerTeacherNumNotEqualTo(Integer value) {
            addCriterion("declarer_teacher_num <>", value, "declarerTeacherNum");
            return (Criteria) this;
        }

        public Criteria andDeclarerTeacherNumGreaterThan(Integer value) {
            addCriterion("declarer_teacher_num >", value, "declarerTeacherNum");
            return (Criteria) this;
        }

        public Criteria andDeclarerTeacherNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("declarer_teacher_num >=", value, "declarerTeacherNum");
            return (Criteria) this;
        }

        public Criteria andDeclarerTeacherNumLessThan(Integer value) {
            addCriterion("declarer_teacher_num <", value, "declarerTeacherNum");
            return (Criteria) this;
        }

        public Criteria andDeclarerTeacherNumLessThanOrEqualTo(Integer value) {
            addCriterion("declarer_teacher_num <=", value, "declarerTeacherNum");
            return (Criteria) this;
        }

        public Criteria andDeclarerTeacherNumIn(List<Integer> values) {
            addCriterion("declarer_teacher_num in", values, "declarerTeacherNum");
            return (Criteria) this;
        }

        public Criteria andDeclarerTeacherNumNotIn(List<Integer> values) {
            addCriterion("declarer_teacher_num not in", values, "declarerTeacherNum");
            return (Criteria) this;
        }

        public Criteria andDeclarerTeacherNumBetween(Integer value1, Integer value2) {
            addCriterion("declarer_teacher_num between", value1, value2, "declarerTeacherNum");
            return (Criteria) this;
        }

        public Criteria andDeclarerTeacherNumNotBetween(Integer value1, Integer value2) {
            addCriterion("declarer_teacher_num not between", value1, value2, "declarerTeacherNum");
            return (Criteria) this;
        }

        public Criteria andPassFlagIsNull() {
            addCriterion("pass_flag is null");
            return (Criteria) this;
        }

        public Criteria andPassFlagIsNotNull() {
            addCriterion("pass_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPassFlagEqualTo(String value) {
            addCriterion("pass_flag =", value, "passFlag");
            return (Criteria) this;
        }

        public Criteria andPassFlagNotEqualTo(String value) {
            addCriterion("pass_flag <>", value, "passFlag");
            return (Criteria) this;
        }

        public Criteria andPassFlagGreaterThan(String value) {
            addCriterion("pass_flag >", value, "passFlag");
            return (Criteria) this;
        }

        public Criteria andPassFlagGreaterThanOrEqualTo(String value) {
            addCriterion("pass_flag >=", value, "passFlag");
            return (Criteria) this;
        }

        public Criteria andPassFlagLessThan(String value) {
            addCriterion("pass_flag <", value, "passFlag");
            return (Criteria) this;
        }

        public Criteria andPassFlagLessThanOrEqualTo(String value) {
            addCriterion("pass_flag <=", value, "passFlag");
            return (Criteria) this;
        }

        public Criteria andPassFlagLike(String value) {
            addCriterion("pass_flag like", value, "passFlag");
            return (Criteria) this;
        }

        public Criteria andPassFlagNotLike(String value) {
            addCriterion("pass_flag not like", value, "passFlag");
            return (Criteria) this;
        }

        public Criteria andPassFlagIn(List<String> values) {
            addCriterion("pass_flag in", values, "passFlag");
            return (Criteria) this;
        }

        public Criteria andPassFlagNotIn(List<String> values) {
            addCriterion("pass_flag not in", values, "passFlag");
            return (Criteria) this;
        }

        public Criteria andPassFlagBetween(String value1, String value2) {
            addCriterion("pass_flag between", value1, value2, "passFlag");
            return (Criteria) this;
        }

        public Criteria andPassFlagNotBetween(String value1, String value2) {
            addCriterion("pass_flag not between", value1, value2, "passFlag");
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