package com.pugilist.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andOlduseridIsNull() {
            addCriterion("olduserid is null");
            return (Criteria) this;
        }

        public Criteria andOlduseridIsNotNull() {
            addCriterion("olduserid is not null");
            return (Criteria) this;
        }

        public Criteria andOlduseridEqualTo(String value) {
            addCriterion("olduserid =", value, "olduserid");
            return (Criteria) this;
        }

        public Criteria andOlduseridNotEqualTo(String value) {
            addCriterion("olduserid <>", value, "olduserid");
            return (Criteria) this;
        }

        public Criteria andOlduseridGreaterThan(String value) {
            addCriterion("olduserid >", value, "olduserid");
            return (Criteria) this;
        }

        public Criteria andOlduseridGreaterThanOrEqualTo(String value) {
            addCriterion("olduserid >=", value, "olduserid");
            return (Criteria) this;
        }

        public Criteria andOlduseridLessThan(String value) {
            addCriterion("olduserid <", value, "olduserid");
            return (Criteria) this;
        }

        public Criteria andOlduseridLessThanOrEqualTo(String value) {
            addCriterion("olduserid <=", value, "olduserid");
            return (Criteria) this;
        }

        public Criteria andOlduseridLike(String value) {
            addCriterion("olduserid like", value, "olduserid");
            return (Criteria) this;
        }

        public Criteria andOlduseridNotLike(String value) {
            addCriterion("olduserid not like", value, "olduserid");
            return (Criteria) this;
        }

        public Criteria andOlduseridIn(List<String> values) {
            addCriterion("olduserid in", values, "olduserid");
            return (Criteria) this;
        }

        public Criteria andOlduseridNotIn(List<String> values) {
            addCriterion("olduserid not in", values, "olduserid");
            return (Criteria) this;
        }

        public Criteria andOlduseridBetween(String value1, String value2) {
            addCriterion("olduserid between", value1, value2, "olduserid");
            return (Criteria) this;
        }

        public Criteria andOlduseridNotBetween(String value1, String value2) {
            addCriterion("olduserid not between", value1, value2, "olduserid");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
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

        public Criteria andHeadpicIsNull() {
            addCriterion("headpic is null");
            return (Criteria) this;
        }

        public Criteria andHeadpicIsNotNull() {
            addCriterion("headpic is not null");
            return (Criteria) this;
        }

        public Criteria andHeadpicEqualTo(String value) {
            addCriterion("headpic =", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotEqualTo(String value) {
            addCriterion("headpic <>", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicGreaterThan(String value) {
            addCriterion("headpic >", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicGreaterThanOrEqualTo(String value) {
            addCriterion("headpic >=", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicLessThan(String value) {
            addCriterion("headpic <", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicLessThanOrEqualTo(String value) {
            addCriterion("headpic <=", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicLike(String value) {
            addCriterion("headpic like", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotLike(String value) {
            addCriterion("headpic not like", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicIn(List<String> values) {
            addCriterion("headpic in", values, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotIn(List<String> values) {
            addCriterion("headpic not in", values, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicBetween(String value1, String value2) {
            addCriterion("headpic between", value1, value2, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotBetween(String value1, String value2) {
            addCriterion("headpic not between", value1, value2, "headpic");
            return (Criteria) this;
        }

        public Criteria andStemfromIsNull() {
            addCriterion("stemfrom is null");
            return (Criteria) this;
        }

        public Criteria andStemfromIsNotNull() {
            addCriterion("stemfrom is not null");
            return (Criteria) this;
        }

        public Criteria andStemfromEqualTo(String value) {
            addCriterion("stemfrom =", value, "stemfrom");
            return (Criteria) this;
        }

        public Criteria andStemfromNotEqualTo(String value) {
            addCriterion("stemfrom <>", value, "stemfrom");
            return (Criteria) this;
        }

        public Criteria andStemfromGreaterThan(String value) {
            addCriterion("stemfrom >", value, "stemfrom");
            return (Criteria) this;
        }

        public Criteria andStemfromGreaterThanOrEqualTo(String value) {
            addCriterion("stemfrom >=", value, "stemfrom");
            return (Criteria) this;
        }

        public Criteria andStemfromLessThan(String value) {
            addCriterion("stemfrom <", value, "stemfrom");
            return (Criteria) this;
        }

        public Criteria andStemfromLessThanOrEqualTo(String value) {
            addCriterion("stemfrom <=", value, "stemfrom");
            return (Criteria) this;
        }

        public Criteria andStemfromLike(String value) {
            addCriterion("stemfrom like", value, "stemfrom");
            return (Criteria) this;
        }

        public Criteria andStemfromNotLike(String value) {
            addCriterion("stemfrom not like", value, "stemfrom");
            return (Criteria) this;
        }

        public Criteria andStemfromIn(List<String> values) {
            addCriterion("stemfrom in", values, "stemfrom");
            return (Criteria) this;
        }

        public Criteria andStemfromNotIn(List<String> values) {
            addCriterion("stemfrom not in", values, "stemfrom");
            return (Criteria) this;
        }

        public Criteria andStemfromBetween(String value1, String value2) {
            addCriterion("stemfrom between", value1, value2, "stemfrom");
            return (Criteria) this;
        }

        public Criteria andStemfromNotBetween(String value1, String value2) {
            addCriterion("stemfrom not between", value1, value2, "stemfrom");
            return (Criteria) this;
        }

        public Criteria andTelmodelIsNull() {
            addCriterion("telmodel is null");
            return (Criteria) this;
        }

        public Criteria andTelmodelIsNotNull() {
            addCriterion("telmodel is not null");
            return (Criteria) this;
        }

        public Criteria andTelmodelEqualTo(String value) {
            addCriterion("telmodel =", value, "telmodel");
            return (Criteria) this;
        }

        public Criteria andTelmodelNotEqualTo(String value) {
            addCriterion("telmodel <>", value, "telmodel");
            return (Criteria) this;
        }

        public Criteria andTelmodelGreaterThan(String value) {
            addCriterion("telmodel >", value, "telmodel");
            return (Criteria) this;
        }

        public Criteria andTelmodelGreaterThanOrEqualTo(String value) {
            addCriterion("telmodel >=", value, "telmodel");
            return (Criteria) this;
        }

        public Criteria andTelmodelLessThan(String value) {
            addCriterion("telmodel <", value, "telmodel");
            return (Criteria) this;
        }

        public Criteria andTelmodelLessThanOrEqualTo(String value) {
            addCriterion("telmodel <=", value, "telmodel");
            return (Criteria) this;
        }

        public Criteria andTelmodelLike(String value) {
            addCriterion("telmodel like", value, "telmodel");
            return (Criteria) this;
        }

        public Criteria andTelmodelNotLike(String value) {
            addCriterion("telmodel not like", value, "telmodel");
            return (Criteria) this;
        }

        public Criteria andTelmodelIn(List<String> values) {
            addCriterion("telmodel in", values, "telmodel");
            return (Criteria) this;
        }

        public Criteria andTelmodelNotIn(List<String> values) {
            addCriterion("telmodel not in", values, "telmodel");
            return (Criteria) this;
        }

        public Criteria andTelmodelBetween(String value1, String value2) {
            addCriterion("telmodel between", value1, value2, "telmodel");
            return (Criteria) this;
        }

        public Criteria andTelmodelNotBetween(String value1, String value2) {
            addCriterion("telmodel not between", value1, value2, "telmodel");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRemorksIsNull() {
            addCriterion("remorks is null");
            return (Criteria) this;
        }

        public Criteria andRemorksIsNotNull() {
            addCriterion("remorks is not null");
            return (Criteria) this;
        }

        public Criteria andRemorksEqualTo(String value) {
            addCriterion("remorks =", value, "remorks");
            return (Criteria) this;
        }

        public Criteria andRemorksNotEqualTo(String value) {
            addCriterion("remorks <>", value, "remorks");
            return (Criteria) this;
        }

        public Criteria andRemorksGreaterThan(String value) {
            addCriterion("remorks >", value, "remorks");
            return (Criteria) this;
        }

        public Criteria andRemorksGreaterThanOrEqualTo(String value) {
            addCriterion("remorks >=", value, "remorks");
            return (Criteria) this;
        }

        public Criteria andRemorksLessThan(String value) {
            addCriterion("remorks <", value, "remorks");
            return (Criteria) this;
        }

        public Criteria andRemorksLessThanOrEqualTo(String value) {
            addCriterion("remorks <=", value, "remorks");
            return (Criteria) this;
        }

        public Criteria andRemorksLike(String value) {
            addCriterion("remorks like", value, "remorks");
            return (Criteria) this;
        }

        public Criteria andRemorksNotLike(String value) {
            addCriterion("remorks not like", value, "remorks");
            return (Criteria) this;
        }

        public Criteria andRemorksIn(List<String> values) {
            addCriterion("remorks in", values, "remorks");
            return (Criteria) this;
        }

        public Criteria andRemorksNotIn(List<String> values) {
            addCriterion("remorks not in", values, "remorks");
            return (Criteria) this;
        }

        public Criteria andRemorksBetween(String value1, String value2) {
            addCriterion("remorks between", value1, value2, "remorks");
            return (Criteria) this;
        }

        public Criteria andRemorksNotBetween(String value1, String value2) {
            addCriterion("remorks not between", value1, value2, "remorks");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("lastlogintime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("lastlogintime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(Date value) {
            addCriterion("lastlogintime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(Date value) {
            addCriterion("lastlogintime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(Date value) {
            addCriterion("lastlogintime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastlogintime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(Date value) {
            addCriterion("lastlogintime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("lastlogintime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<Date> values) {
            addCriterion("lastlogintime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<Date> values) {
            addCriterion("lastlogintime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(Date value1, Date value2) {
            addCriterion("lastlogintime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("lastlogintime not between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("cardType is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("cardType is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("cardType =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("cardType <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("cardType >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cardType >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("cardType <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("cardType <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("cardType like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("cardType not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("cardType in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("cardType not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("cardType between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("cardType not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("cardNo is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("cardNo is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("cardNo =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("cardNo <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("cardNo >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("cardNo >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("cardNo <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("cardNo <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("cardNo like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("cardNo not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("cardNo in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("cardNo not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("cardNo between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("cardNo not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameIsNull() {
            addCriterion("lastModifyName is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameIsNotNull() {
            addCriterion("lastModifyName is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameEqualTo(String value) {
            addCriterion("lastModifyName =", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameNotEqualTo(String value) {
            addCriterion("lastModifyName <>", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameGreaterThan(String value) {
            addCriterion("lastModifyName >", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("lastModifyName >=", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameLessThan(String value) {
            addCriterion("lastModifyName <", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameLessThanOrEqualTo(String value) {
            addCriterion("lastModifyName <=", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameLike(String value) {
            addCriterion("lastModifyName like", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameNotLike(String value) {
            addCriterion("lastModifyName not like", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameIn(List<String> values) {
            addCriterion("lastModifyName in", values, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameNotIn(List<String> values) {
            addCriterion("lastModifyName not in", values, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameBetween(String value1, String value2) {
            addCriterion("lastModifyName between", value1, value2, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameNotBetween(String value1, String value2) {
            addCriterion("lastModifyName not between", value1, value2, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("openId is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("openId is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("openId =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("openId <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("openId >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("openId >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("openId <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("openId <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("openId like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("openId not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("openId in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("openId not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("openId between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("openId not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNull() {
            addCriterion("unionId is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("unionId is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(String value) {
            addCriterion("unionId =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(String value) {
            addCriterion("unionId <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(String value) {
            addCriterion("unionId >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("unionId >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(String value) {
            addCriterion("unionId <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(String value) {
            addCriterion("unionId <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLike(String value) {
            addCriterion("unionId like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotLike(String value) {
            addCriterion("unionId not like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<String> values) {
            addCriterion("unionId in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<String> values) {
            addCriterion("unionId not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(String value1, String value2) {
            addCriterion("unionId between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(String value1, String value2) {
            addCriterion("unionId not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNull() {
            addCriterion("registertime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("registertime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(Date value) {
            addCriterion("registertime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(Date value) {
            addCriterion("registertime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(Date value) {
            addCriterion("registertime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registertime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(Date value) {
            addCriterion("registertime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(Date value) {
            addCriterion("registertime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<Date> values) {
            addCriterion("registertime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<Date> values) {
            addCriterion("registertime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(Date value1, Date value2) {
            addCriterion("registertime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(Date value1, Date value2) {
            addCriterion("registertime not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andUnionuseridIsNull() {
            addCriterion("unionuserid is null");
            return (Criteria) this;
        }

        public Criteria andUnionuseridIsNotNull() {
            addCriterion("unionuserid is not null");
            return (Criteria) this;
        }

        public Criteria andUnionuseridEqualTo(String value) {
            addCriterion("unionuserid =", value, "unionuserid");
            return (Criteria) this;
        }

        public Criteria andUnionuseridNotEqualTo(String value) {
            addCriterion("unionuserid <>", value, "unionuserid");
            return (Criteria) this;
        }

        public Criteria andUnionuseridGreaterThan(String value) {
            addCriterion("unionuserid >", value, "unionuserid");
            return (Criteria) this;
        }

        public Criteria andUnionuseridGreaterThanOrEqualTo(String value) {
            addCriterion("unionuserid >=", value, "unionuserid");
            return (Criteria) this;
        }

        public Criteria andUnionuseridLessThan(String value) {
            addCriterion("unionuserid <", value, "unionuserid");
            return (Criteria) this;
        }

        public Criteria andUnionuseridLessThanOrEqualTo(String value) {
            addCriterion("unionuserid <=", value, "unionuserid");
            return (Criteria) this;
        }

        public Criteria andUnionuseridLike(String value) {
            addCriterion("unionuserid like", value, "unionuserid");
            return (Criteria) this;
        }

        public Criteria andUnionuseridNotLike(String value) {
            addCriterion("unionuserid not like", value, "unionuserid");
            return (Criteria) this;
        }

        public Criteria andUnionuseridIn(List<String> values) {
            addCriterion("unionuserid in", values, "unionuserid");
            return (Criteria) this;
        }

        public Criteria andUnionuseridNotIn(List<String> values) {
            addCriterion("unionuserid not in", values, "unionuserid");
            return (Criteria) this;
        }

        public Criteria andUnionuseridBetween(String value1, String value2) {
            addCriterion("unionuserid between", value1, value2, "unionuserid");
            return (Criteria) this;
        }

        public Criteria andUnionuseridNotBetween(String value1, String value2) {
            addCriterion("unionuserid not between", value1, value2, "unionuserid");
            return (Criteria) this;
        }

        public Criteria andWxopenIdIsNull() {
            addCriterion("wxopenId is null");
            return (Criteria) this;
        }

        public Criteria andWxopenIdIsNotNull() {
            addCriterion("wxopenId is not null");
            return (Criteria) this;
        }

        public Criteria andWxopenIdEqualTo(String value) {
            addCriterion("wxopenId =", value, "wxopenId");
            return (Criteria) this;
        }

        public Criteria andWxopenIdNotEqualTo(String value) {
            addCriterion("wxopenId <>", value, "wxopenId");
            return (Criteria) this;
        }

        public Criteria andWxopenIdGreaterThan(String value) {
            addCriterion("wxopenId >", value, "wxopenId");
            return (Criteria) this;
        }

        public Criteria andWxopenIdGreaterThanOrEqualTo(String value) {
            addCriterion("wxopenId >=", value, "wxopenId");
            return (Criteria) this;
        }

        public Criteria andWxopenIdLessThan(String value) {
            addCriterion("wxopenId <", value, "wxopenId");
            return (Criteria) this;
        }

        public Criteria andWxopenIdLessThanOrEqualTo(String value) {
            addCriterion("wxopenId <=", value, "wxopenId");
            return (Criteria) this;
        }

        public Criteria andWxopenIdLike(String value) {
            addCriterion("wxopenId like", value, "wxopenId");
            return (Criteria) this;
        }

        public Criteria andWxopenIdNotLike(String value) {
            addCriterion("wxopenId not like", value, "wxopenId");
            return (Criteria) this;
        }

        public Criteria andWxopenIdIn(List<String> values) {
            addCriterion("wxopenId in", values, "wxopenId");
            return (Criteria) this;
        }

        public Criteria andWxopenIdNotIn(List<String> values) {
            addCriterion("wxopenId not in", values, "wxopenId");
            return (Criteria) this;
        }

        public Criteria andWxopenIdBetween(String value1, String value2) {
            addCriterion("wxopenId between", value1, value2, "wxopenId");
            return (Criteria) this;
        }

        public Criteria andWxopenIdNotBetween(String value1, String value2) {
            addCriterion("wxopenId not between", value1, value2, "wxopenId");
            return (Criteria) this;
        }

        public Criteria andEffectIsNull() {
            addCriterion("effect is null");
            return (Criteria) this;
        }

        public Criteria andEffectIsNotNull() {
            addCriterion("effect is not null");
            return (Criteria) this;
        }

        public Criteria andEffectEqualTo(String value) {
            addCriterion("effect =", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotEqualTo(String value) {
            addCriterion("effect <>", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThan(String value) {
            addCriterion("effect >", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThanOrEqualTo(String value) {
            addCriterion("effect >=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThan(String value) {
            addCriterion("effect <", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThanOrEqualTo(String value) {
            addCriterion("effect <=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLike(String value) {
            addCriterion("effect like", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotLike(String value) {
            addCriterion("effect not like", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectIn(List<String> values) {
            addCriterion("effect in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotIn(List<String> values) {
            addCriterion("effect not in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectBetween(String value1, String value2) {
            addCriterion("effect between", value1, value2, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotBetween(String value1, String value2) {
            addCriterion("effect not between", value1, value2, "effect");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andFansCountIsNull() {
            addCriterion("fansCount is null");
            return (Criteria) this;
        }

        public Criteria andFansCountIsNotNull() {
            addCriterion("fansCount is not null");
            return (Criteria) this;
        }

        public Criteria andFansCountEqualTo(Integer value) {
            addCriterion("fansCount =", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotEqualTo(Integer value) {
            addCriterion("fansCount <>", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountGreaterThan(Integer value) {
            addCriterion("fansCount >", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fansCount >=", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountLessThan(Integer value) {
            addCriterion("fansCount <", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountLessThanOrEqualTo(Integer value) {
            addCriterion("fansCount <=", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountIn(List<Integer> values) {
            addCriterion("fansCount in", values, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotIn(List<Integer> values) {
            addCriterion("fansCount not in", values, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountBetween(Integer value1, Integer value2) {
            addCriterion("fansCount between", value1, value2, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fansCount not between", value1, value2, "fansCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("commentCount is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("commentCount is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("commentCount =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("commentCount <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("commentCount >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentCount >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("commentCount <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("commentCount <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("commentCount in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("commentCount not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("commentCount between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("commentCount not between", value1, value2, "commentCount");
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