package com.example.chatbot.model;

import java.util.ArrayList;
import java.util.List;

public class ExplorationPropertyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExplorationPropertyExample() {
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

        public Criteria andPropertyIdIsNull() {
            addCriterion("property_id is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIdIsNotNull() {
            addCriterion("property_id is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyIdEqualTo(Integer value) {
            addCriterion("property_id =", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdNotEqualTo(Integer value) {
            addCriterion("property_id <>", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdGreaterThan(Integer value) {
            addCriterion("property_id >", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("property_id >=", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdLessThan(Integer value) {
            addCriterion("property_id <", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdLessThanOrEqualTo(Integer value) {
            addCriterion("property_id <=", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdIn(List<Integer> values) {
            addCriterion("property_id in", values, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdNotIn(List<Integer> values) {
            addCriterion("property_id not in", values, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdBetween(Integer value1, Integer value2) {
            addCriterion("property_id between", value1, value2, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("property_id not between", value1, value2, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionIsNull() {
            addCriterion("property_question is null");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionIsNotNull() {
            addCriterion("property_question is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionEqualTo(String value) {
            addCriterion("property_question =", value, "propertyQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionNotEqualTo(String value) {
            addCriterion("property_question <>", value, "propertyQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionGreaterThan(String value) {
            addCriterion("property_question >", value, "propertyQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("property_question >=", value, "propertyQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionLessThan(String value) {
            addCriterion("property_question <", value, "propertyQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionLessThanOrEqualTo(String value) {
            addCriterion("property_question <=", value, "propertyQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionLike(String value) {
            addCriterion("property_question like", value, "propertyQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionNotLike(String value) {
            addCriterion("property_question not like", value, "propertyQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionIn(List<String> values) {
            addCriterion("property_question in", values, "propertyQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionNotIn(List<String> values) {
            addCriterion("property_question not in", values, "propertyQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionBetween(String value1, String value2) {
            addCriterion("property_question between", value1, value2, "propertyQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertyQuestionNotBetween(String value1, String value2) {
            addCriterion("property_question not between", value1, value2, "propertyQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerIsNull() {
            addCriterion("property_answer is null");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerIsNotNull() {
            addCriterion("property_answer is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerEqualTo(String value) {
            addCriterion("property_answer =", value, "propertyAnswer");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerNotEqualTo(String value) {
            addCriterion("property_answer <>", value, "propertyAnswer");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerGreaterThan(String value) {
            addCriterion("property_answer >", value, "propertyAnswer");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("property_answer >=", value, "propertyAnswer");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerLessThan(String value) {
            addCriterion("property_answer <", value, "propertyAnswer");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerLessThanOrEqualTo(String value) {
            addCriterion("property_answer <=", value, "propertyAnswer");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerLike(String value) {
            addCriterion("property_answer like", value, "propertyAnswer");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerNotLike(String value) {
            addCriterion("property_answer not like", value, "propertyAnswer");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerIn(List<String> values) {
            addCriterion("property_answer in", values, "propertyAnswer");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerNotIn(List<String> values) {
            addCriterion("property_answer not in", values, "propertyAnswer");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerBetween(String value1, String value2) {
            addCriterion("property_answer between", value1, value2, "propertyAnswer");
            return (Criteria) this;
        }

        public Criteria andPropertyAnswerNotBetween(String value1, String value2) {
            addCriterion("property_answer not between", value1, value2, "propertyAnswer");
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

        public Criteria andPropertySubQuestionIsNull() {
            addCriterion("property_sub_question is null");
            return (Criteria) this;
        }

        public Criteria andPropertySubQuestionIsNotNull() {
            addCriterion("property_sub_question is not null");
            return (Criteria) this;
        }

        public Criteria andPropertySubQuestionEqualTo(String value) {
            addCriterion("property_sub_question =", value, "propertySubQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertySubQuestionNotEqualTo(String value) {
            addCriterion("property_sub_question <>", value, "propertySubQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertySubQuestionGreaterThan(String value) {
            addCriterion("property_sub_question >", value, "propertySubQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertySubQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("property_sub_question >=", value, "propertySubQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertySubQuestionLessThan(String value) {
            addCriterion("property_sub_question <", value, "propertySubQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertySubQuestionLessThanOrEqualTo(String value) {
            addCriterion("property_sub_question <=", value, "propertySubQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertySubQuestionLike(String value) {
            addCriterion("property_sub_question like", value, "propertySubQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertySubQuestionNotLike(String value) {
            addCriterion("property_sub_question not like", value, "propertySubQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertySubQuestionIn(List<String> values) {
            addCriterion("property_sub_question in", values, "propertySubQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertySubQuestionNotIn(List<String> values) {
            addCriterion("property_sub_question not in", values, "propertySubQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertySubQuestionBetween(String value1, String value2) {
            addCriterion("property_sub_question between", value1, value2, "propertySubQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertySubQuestionNotBetween(String value1, String value2) {
            addCriterion("property_sub_question not between", value1, value2, "propertySubQuestion");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesIsNull() {
            addCriterion("property_sub_answer_yes is null");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesIsNotNull() {
            addCriterion("property_sub_answer_yes is not null");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesEqualTo(String value) {
            addCriterion("property_sub_answer_yes =", value, "propertySubAnswerYes");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesNotEqualTo(String value) {
            addCriterion("property_sub_answer_yes <>", value, "propertySubAnswerYes");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesGreaterThan(String value) {
            addCriterion("property_sub_answer_yes >", value, "propertySubAnswerYes");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesGreaterThanOrEqualTo(String value) {
            addCriterion("property_sub_answer_yes >=", value, "propertySubAnswerYes");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesLessThan(String value) {
            addCriterion("property_sub_answer_yes <", value, "propertySubAnswerYes");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesLessThanOrEqualTo(String value) {
            addCriterion("property_sub_answer_yes <=", value, "propertySubAnswerYes");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesLike(String value) {
            addCriterion("property_sub_answer_yes like", value, "propertySubAnswerYes");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesNotLike(String value) {
            addCriterion("property_sub_answer_yes not like", value, "propertySubAnswerYes");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesIn(List<String> values) {
            addCriterion("property_sub_answer_yes in", values, "propertySubAnswerYes");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesNotIn(List<String> values) {
            addCriterion("property_sub_answer_yes not in", values, "propertySubAnswerYes");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesBetween(String value1, String value2) {
            addCriterion("property_sub_answer_yes between", value1, value2, "propertySubAnswerYes");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerYesNotBetween(String value1, String value2) {
            addCriterion("property_sub_answer_yes not between", value1, value2, "propertySubAnswerYes");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoIsNull() {
            addCriterion("property_sub_answer_no is null");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoIsNotNull() {
            addCriterion("property_sub_answer_no is not null");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoEqualTo(String value) {
            addCriterion("property_sub_answer_no =", value, "propertySubAnswerNo");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoNotEqualTo(String value) {
            addCriterion("property_sub_answer_no <>", value, "propertySubAnswerNo");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoGreaterThan(String value) {
            addCriterion("property_sub_answer_no >", value, "propertySubAnswerNo");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoGreaterThanOrEqualTo(String value) {
            addCriterion("property_sub_answer_no >=", value, "propertySubAnswerNo");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoLessThan(String value) {
            addCriterion("property_sub_answer_no <", value, "propertySubAnswerNo");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoLessThanOrEqualTo(String value) {
            addCriterion("property_sub_answer_no <=", value, "propertySubAnswerNo");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoLike(String value) {
            addCriterion("property_sub_answer_no like", value, "propertySubAnswerNo");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoNotLike(String value) {
            addCriterion("property_sub_answer_no not like", value, "propertySubAnswerNo");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoIn(List<String> values) {
            addCriterion("property_sub_answer_no in", values, "propertySubAnswerNo");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoNotIn(List<String> values) {
            addCriterion("property_sub_answer_no not in", values, "propertySubAnswerNo");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoBetween(String value1, String value2) {
            addCriterion("property_sub_answer_no between", value1, value2, "propertySubAnswerNo");
            return (Criteria) this;
        }

        public Criteria andPropertySubAnswerNoNotBetween(String value1, String value2) {
            addCriterion("property_sub_answer_no not between", value1, value2, "propertySubAnswerNo");
            return (Criteria) this;
        }

        public Criteria andNextContextIsNull() {
            addCriterion("next_context is null");
            return (Criteria) this;
        }

        public Criteria andNextContextIsNotNull() {
            addCriterion("next_context is not null");
            return (Criteria) this;
        }

        public Criteria andNextContextEqualTo(String value) {
            addCriterion("next_context =", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextNotEqualTo(String value) {
            addCriterion("next_context <>", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextGreaterThan(String value) {
            addCriterion("next_context >", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextGreaterThanOrEqualTo(String value) {
            addCriterion("next_context >=", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextLessThan(String value) {
            addCriterion("next_context <", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextLessThanOrEqualTo(String value) {
            addCriterion("next_context <=", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextLike(String value) {
            addCriterion("next_context like", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextNotLike(String value) {
            addCriterion("next_context not like", value, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextIn(List<String> values) {
            addCriterion("next_context in", values, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextNotIn(List<String> values) {
            addCriterion("next_context not in", values, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextBetween(String value1, String value2) {
            addCriterion("next_context between", value1, value2, "nextContext");
            return (Criteria) this;
        }

        public Criteria andNextContextNotBetween(String value1, String value2) {
            addCriterion("next_context not between", value1, value2, "nextContext");
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