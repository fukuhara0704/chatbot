package com.example.chatbot.model;

import java.util.ArrayList;
import java.util.List;

public class SubPhasesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubPhasesExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andSubPhaseIdIsNull() {
            addCriterion("sub_phase_id is null");
            return (Criteria) this;
        }

        public Criteria andSubPhaseIdIsNotNull() {
            addCriterion("sub_phase_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubPhaseIdEqualTo(Integer value) {
            addCriterion("sub_phase_id =", value, "subPhaseId");
            return (Criteria) this;
        }

        public Criteria andSubPhaseIdNotEqualTo(Integer value) {
            addCriterion("sub_phase_id <>", value, "subPhaseId");
            return (Criteria) this;
        }

        public Criteria andSubPhaseIdGreaterThan(Integer value) {
            addCriterion("sub_phase_id >", value, "subPhaseId");
            return (Criteria) this;
        }

        public Criteria andSubPhaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_phase_id >=", value, "subPhaseId");
            return (Criteria) this;
        }

        public Criteria andSubPhaseIdLessThan(Integer value) {
            addCriterion("sub_phase_id <", value, "subPhaseId");
            return (Criteria) this;
        }

        public Criteria andSubPhaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("sub_phase_id <=", value, "subPhaseId");
            return (Criteria) this;
        }

        public Criteria andSubPhaseIdIn(List<Integer> values) {
            addCriterion("sub_phase_id in", values, "subPhaseId");
            return (Criteria) this;
        }

        public Criteria andSubPhaseIdNotIn(List<Integer> values) {
            addCriterion("sub_phase_id not in", values, "subPhaseId");
            return (Criteria) this;
        }

        public Criteria andSubPhaseIdBetween(Integer value1, Integer value2) {
            addCriterion("sub_phase_id between", value1, value2, "subPhaseId");
            return (Criteria) this;
        }

        public Criteria andSubPhaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_phase_id not between", value1, value2, "subPhaseId");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameIsNull() {
            addCriterion("sub_phase_name is null");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameIsNotNull() {
            addCriterion("sub_phase_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameEqualTo(String value) {
            addCriterion("sub_phase_name =", value, "subPhaseName");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameNotEqualTo(String value) {
            addCriterion("sub_phase_name <>", value, "subPhaseName");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameGreaterThan(String value) {
            addCriterion("sub_phase_name >", value, "subPhaseName");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_phase_name >=", value, "subPhaseName");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameLessThan(String value) {
            addCriterion("sub_phase_name <", value, "subPhaseName");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameLessThanOrEqualTo(String value) {
            addCriterion("sub_phase_name <=", value, "subPhaseName");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameLike(String value) {
            addCriterion("sub_phase_name like", value, "subPhaseName");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameNotLike(String value) {
            addCriterion("sub_phase_name not like", value, "subPhaseName");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameIn(List<String> values) {
            addCriterion("sub_phase_name in", values, "subPhaseName");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameNotIn(List<String> values) {
            addCriterion("sub_phase_name not in", values, "subPhaseName");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameBetween(String value1, String value2) {
            addCriterion("sub_phase_name between", value1, value2, "subPhaseName");
            return (Criteria) this;
        }

        public Criteria andSubPhaseNameNotBetween(String value1, String value2) {
            addCriterion("sub_phase_name not between", value1, value2, "subPhaseName");
            return (Criteria) this;
        }

        public Criteria andNextPropertyIdIsNull() {
            addCriterion("next_property_id is null");
            return (Criteria) this;
        }

        public Criteria andNextPropertyIdIsNotNull() {
            addCriterion("next_property_id is not null");
            return (Criteria) this;
        }

        public Criteria andNextPropertyIdEqualTo(Integer value) {
            addCriterion("next_property_id =", value, "nextPropertyId");
            return (Criteria) this;
        }

        public Criteria andNextPropertyIdNotEqualTo(Integer value) {
            addCriterion("next_property_id <>", value, "nextPropertyId");
            return (Criteria) this;
        }

        public Criteria andNextPropertyIdGreaterThan(Integer value) {
            addCriterion("next_property_id >", value, "nextPropertyId");
            return (Criteria) this;
        }

        public Criteria andNextPropertyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("next_property_id >=", value, "nextPropertyId");
            return (Criteria) this;
        }

        public Criteria andNextPropertyIdLessThan(Integer value) {
            addCriterion("next_property_id <", value, "nextPropertyId");
            return (Criteria) this;
        }

        public Criteria andNextPropertyIdLessThanOrEqualTo(Integer value) {
            addCriterion("next_property_id <=", value, "nextPropertyId");
            return (Criteria) this;
        }

        public Criteria andNextPropertyIdIn(List<Integer> values) {
            addCriterion("next_property_id in", values, "nextPropertyId");
            return (Criteria) this;
        }

        public Criteria andNextPropertyIdNotIn(List<Integer> values) {
            addCriterion("next_property_id not in", values, "nextPropertyId");
            return (Criteria) this;
        }

        public Criteria andNextPropertyIdBetween(Integer value1, Integer value2) {
            addCriterion("next_property_id between", value1, value2, "nextPropertyId");
            return (Criteria) this;
        }

        public Criteria andNextPropertyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("next_property_id not between", value1, value2, "nextPropertyId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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