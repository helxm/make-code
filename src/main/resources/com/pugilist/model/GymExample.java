package com.pugilist.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GymExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GymExample() {
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

        public Criteria andGym_typeIsNull() {
            addCriterion("gym_type is null");
            return (Criteria) this;
        }

        public Criteria andGym_typeIsNotNull() {
            addCriterion("gym_type is not null");
            return (Criteria) this;
        }

        public Criteria andGym_typeEqualTo(String value) {
            addCriterion("gym_type =", value, "gym_type");
            return (Criteria) this;
        }

        public Criteria andGym_typeNotEqualTo(String value) {
            addCriterion("gym_type <>", value, "gym_type");
            return (Criteria) this;
        }

        public Criteria andGym_typeGreaterThan(String value) {
            addCriterion("gym_type >", value, "gym_type");
            return (Criteria) this;
        }

        public Criteria andGym_typeGreaterThanOrEqualTo(String value) {
            addCriterion("gym_type >=", value, "gym_type");
            return (Criteria) this;
        }

        public Criteria andGym_typeLessThan(String value) {
            addCriterion("gym_type <", value, "gym_type");
            return (Criteria) this;
        }

        public Criteria andGym_typeLessThanOrEqualTo(String value) {
            addCriterion("gym_type <=", value, "gym_type");
            return (Criteria) this;
        }

        public Criteria andGym_typeLike(String value) {
            addCriterion("gym_type like", value, "gym_type");
            return (Criteria) this;
        }

        public Criteria andGym_typeNotLike(String value) {
            addCriterion("gym_type not like", value, "gym_type");
            return (Criteria) this;
        }

        public Criteria andGym_typeIn(List<String> values) {
            addCriterion("gym_type in", values, "gym_type");
            return (Criteria) this;
        }

        public Criteria andGym_typeNotIn(List<String> values) {
            addCriterion("gym_type not in", values, "gym_type");
            return (Criteria) this;
        }

        public Criteria andGym_typeBetween(String value1, String value2) {
            addCriterion("gym_type between", value1, value2, "gym_type");
            return (Criteria) this;
        }

        public Criteria andGym_typeNotBetween(String value1, String value2) {
            addCriterion("gym_type not between", value1, value2, "gym_type");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeIsNull() {
            addCriterion("gym_open_time is null");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeIsNotNull() {
            addCriterion("gym_open_time is not null");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeEqualTo(String value) {
            addCriterion("gym_open_time =", value, "gym_open_time");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeNotEqualTo(String value) {
            addCriterion("gym_open_time <>", value, "gym_open_time");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeGreaterThan(String value) {
            addCriterion("gym_open_time >", value, "gym_open_time");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeGreaterThanOrEqualTo(String value) {
            addCriterion("gym_open_time >=", value, "gym_open_time");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeLessThan(String value) {
            addCriterion("gym_open_time <", value, "gym_open_time");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeLessThanOrEqualTo(String value) {
            addCriterion("gym_open_time <=", value, "gym_open_time");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeLike(String value) {
            addCriterion("gym_open_time like", value, "gym_open_time");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeNotLike(String value) {
            addCriterion("gym_open_time not like", value, "gym_open_time");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeIn(List<String> values) {
            addCriterion("gym_open_time in", values, "gym_open_time");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeNotIn(List<String> values) {
            addCriterion("gym_open_time not in", values, "gym_open_time");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeBetween(String value1, String value2) {
            addCriterion("gym_open_time between", value1, value2, "gym_open_time");
            return (Criteria) this;
        }

        public Criteria andGym_open_timeNotBetween(String value1, String value2) {
            addCriterion("gym_open_time not between", value1, value2, "gym_open_time");
            return (Criteria) this;
        }

        public Criteria andGym_locationIsNull() {
            addCriterion("gym_location is null");
            return (Criteria) this;
        }

        public Criteria andGym_locationIsNotNull() {
            addCriterion("gym_location is not null");
            return (Criteria) this;
        }

        public Criteria andGym_locationEqualTo(String value) {
            addCriterion("gym_location =", value, "gym_location");
            return (Criteria) this;
        }

        public Criteria andGym_locationNotEqualTo(String value) {
            addCriterion("gym_location <>", value, "gym_location");
            return (Criteria) this;
        }

        public Criteria andGym_locationGreaterThan(String value) {
            addCriterion("gym_location >", value, "gym_location");
            return (Criteria) this;
        }

        public Criteria andGym_locationGreaterThanOrEqualTo(String value) {
            addCriterion("gym_location >=", value, "gym_location");
            return (Criteria) this;
        }

        public Criteria andGym_locationLessThan(String value) {
            addCriterion("gym_location <", value, "gym_location");
            return (Criteria) this;
        }

        public Criteria andGym_locationLessThanOrEqualTo(String value) {
            addCriterion("gym_location <=", value, "gym_location");
            return (Criteria) this;
        }

        public Criteria andGym_locationLike(String value) {
            addCriterion("gym_location like", value, "gym_location");
            return (Criteria) this;
        }

        public Criteria andGym_locationNotLike(String value) {
            addCriterion("gym_location not like", value, "gym_location");
            return (Criteria) this;
        }

        public Criteria andGym_locationIn(List<String> values) {
            addCriterion("gym_location in", values, "gym_location");
            return (Criteria) this;
        }

        public Criteria andGym_locationNotIn(List<String> values) {
            addCriterion("gym_location not in", values, "gym_location");
            return (Criteria) this;
        }

        public Criteria andGym_locationBetween(String value1, String value2) {
            addCriterion("gym_location between", value1, value2, "gym_location");
            return (Criteria) this;
        }

        public Criteria andGym_locationNotBetween(String value1, String value2) {
            addCriterion("gym_location not between", value1, value2, "gym_location");
            return (Criteria) this;
        }

        public Criteria andGym_coach_numIsNull() {
            addCriterion("gym_coach_num is null");
            return (Criteria) this;
        }

        public Criteria andGym_coach_numIsNotNull() {
            addCriterion("gym_coach_num is not null");
            return (Criteria) this;
        }

        public Criteria andGym_coach_numEqualTo(Integer value) {
            addCriterion("gym_coach_num =", value, "gym_coach_num");
            return (Criteria) this;
        }

        public Criteria andGym_coach_numNotEqualTo(Integer value) {
            addCriterion("gym_coach_num <>", value, "gym_coach_num");
            return (Criteria) this;
        }

        public Criteria andGym_coach_numGreaterThan(Integer value) {
            addCriterion("gym_coach_num >", value, "gym_coach_num");
            return (Criteria) this;
        }

        public Criteria andGym_coach_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("gym_coach_num >=", value, "gym_coach_num");
            return (Criteria) this;
        }

        public Criteria andGym_coach_numLessThan(Integer value) {
            addCriterion("gym_coach_num <", value, "gym_coach_num");
            return (Criteria) this;
        }

        public Criteria andGym_coach_numLessThanOrEqualTo(Integer value) {
            addCriterion("gym_coach_num <=", value, "gym_coach_num");
            return (Criteria) this;
        }

        public Criteria andGym_coach_numIn(List<Integer> values) {
            addCriterion("gym_coach_num in", values, "gym_coach_num");
            return (Criteria) this;
        }

        public Criteria andGym_coach_numNotIn(List<Integer> values) {
            addCriterion("gym_coach_num not in", values, "gym_coach_num");
            return (Criteria) this;
        }

        public Criteria andGym_coach_numBetween(Integer value1, Integer value2) {
            addCriterion("gym_coach_num between", value1, value2, "gym_coach_num");
            return (Criteria) this;
        }

        public Criteria andGym_coach_numNotBetween(Integer value1, Integer value2) {
            addCriterion("gym_coach_num not between", value1, value2, "gym_coach_num");
            return (Criteria) this;
        }

        public Criteria andGym_boxerIsNull() {
            addCriterion("gym_boxer is null");
            return (Criteria) this;
        }

        public Criteria andGym_boxerIsNotNull() {
            addCriterion("gym_boxer is not null");
            return (Criteria) this;
        }

        public Criteria andGym_boxerEqualTo(String value) {
            addCriterion("gym_boxer =", value, "gym_boxer");
            return (Criteria) this;
        }

        public Criteria andGym_boxerNotEqualTo(String value) {
            addCriterion("gym_boxer <>", value, "gym_boxer");
            return (Criteria) this;
        }

        public Criteria andGym_boxerGreaterThan(String value) {
            addCriterion("gym_boxer >", value, "gym_boxer");
            return (Criteria) this;
        }

        public Criteria andGym_boxerGreaterThanOrEqualTo(String value) {
            addCriterion("gym_boxer >=", value, "gym_boxer");
            return (Criteria) this;
        }

        public Criteria andGym_boxerLessThan(String value) {
            addCriterion("gym_boxer <", value, "gym_boxer");
            return (Criteria) this;
        }

        public Criteria andGym_boxerLessThanOrEqualTo(String value) {
            addCriterion("gym_boxer <=", value, "gym_boxer");
            return (Criteria) this;
        }

        public Criteria andGym_boxerLike(String value) {
            addCriterion("gym_boxer like", value, "gym_boxer");
            return (Criteria) this;
        }

        public Criteria andGym_boxerNotLike(String value) {
            addCriterion("gym_boxer not like", value, "gym_boxer");
            return (Criteria) this;
        }

        public Criteria andGym_boxerIn(List<String> values) {
            addCriterion("gym_boxer in", values, "gym_boxer");
            return (Criteria) this;
        }

        public Criteria andGym_boxerNotIn(List<String> values) {
            addCriterion("gym_boxer not in", values, "gym_boxer");
            return (Criteria) this;
        }

        public Criteria andGym_boxerBetween(String value1, String value2) {
            addCriterion("gym_boxer between", value1, value2, "gym_boxer");
            return (Criteria) this;
        }

        public Criteria andGym_boxerNotBetween(String value1, String value2) {
            addCriterion("gym_boxer not between", value1, value2, "gym_boxer");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starIsNull() {
            addCriterion("gym_coach_star is null");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starIsNotNull() {
            addCriterion("gym_coach_star is not null");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starEqualTo(String value) {
            addCriterion("gym_coach_star =", value, "gym_coach_star");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starNotEqualTo(String value) {
            addCriterion("gym_coach_star <>", value, "gym_coach_star");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starGreaterThan(String value) {
            addCriterion("gym_coach_star >", value, "gym_coach_star");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starGreaterThanOrEqualTo(String value) {
            addCriterion("gym_coach_star >=", value, "gym_coach_star");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starLessThan(String value) {
            addCriterion("gym_coach_star <", value, "gym_coach_star");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starLessThanOrEqualTo(String value) {
            addCriterion("gym_coach_star <=", value, "gym_coach_star");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starLike(String value) {
            addCriterion("gym_coach_star like", value, "gym_coach_star");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starNotLike(String value) {
            addCriterion("gym_coach_star not like", value, "gym_coach_star");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starIn(List<String> values) {
            addCriterion("gym_coach_star in", values, "gym_coach_star");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starNotIn(List<String> values) {
            addCriterion("gym_coach_star not in", values, "gym_coach_star");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starBetween(String value1, String value2) {
            addCriterion("gym_coach_star between", value1, value2, "gym_coach_star");
            return (Criteria) this;
        }

        public Criteria andGym_coach_starNotBetween(String value1, String value2) {
            addCriterion("gym_coach_star not between", value1, value2, "gym_coach_star");
            return (Criteria) this;
        }

        public Criteria andGym_telIsNull() {
            addCriterion("gym_tel is null");
            return (Criteria) this;
        }

        public Criteria andGym_telIsNotNull() {
            addCriterion("gym_tel is not null");
            return (Criteria) this;
        }

        public Criteria andGym_telEqualTo(String value) {
            addCriterion("gym_tel =", value, "gym_tel");
            return (Criteria) this;
        }

        public Criteria andGym_telNotEqualTo(String value) {
            addCriterion("gym_tel <>", value, "gym_tel");
            return (Criteria) this;
        }

        public Criteria andGym_telGreaterThan(String value) {
            addCriterion("gym_tel >", value, "gym_tel");
            return (Criteria) this;
        }

        public Criteria andGym_telGreaterThanOrEqualTo(String value) {
            addCriterion("gym_tel >=", value, "gym_tel");
            return (Criteria) this;
        }

        public Criteria andGym_telLessThan(String value) {
            addCriterion("gym_tel <", value, "gym_tel");
            return (Criteria) this;
        }

        public Criteria andGym_telLessThanOrEqualTo(String value) {
            addCriterion("gym_tel <=", value, "gym_tel");
            return (Criteria) this;
        }

        public Criteria andGym_telLike(String value) {
            addCriterion("gym_tel like", value, "gym_tel");
            return (Criteria) this;
        }

        public Criteria andGym_telNotLike(String value) {
            addCriterion("gym_tel not like", value, "gym_tel");
            return (Criteria) this;
        }

        public Criteria andGym_telIn(List<String> values) {
            addCriterion("gym_tel in", values, "gym_tel");
            return (Criteria) this;
        }

        public Criteria andGym_telNotIn(List<String> values) {
            addCriterion("gym_tel not in", values, "gym_tel");
            return (Criteria) this;
        }

        public Criteria andGym_telBetween(String value1, String value2) {
            addCriterion("gym_tel between", value1, value2, "gym_tel");
            return (Criteria) this;
        }

        public Criteria andGym_telNotBetween(String value1, String value2) {
            addCriterion("gym_tel not between", value1, value2, "gym_tel");
            return (Criteria) this;
        }

        public Criteria andGym_place_numIsNull() {
            addCriterion("gym_place_num is null");
            return (Criteria) this;
        }

        public Criteria andGym_place_numIsNotNull() {
            addCriterion("gym_place_num is not null");
            return (Criteria) this;
        }

        public Criteria andGym_place_numEqualTo(Integer value) {
            addCriterion("gym_place_num =", value, "gym_place_num");
            return (Criteria) this;
        }

        public Criteria andGym_place_numNotEqualTo(Integer value) {
            addCriterion("gym_place_num <>", value, "gym_place_num");
            return (Criteria) this;
        }

        public Criteria andGym_place_numGreaterThan(Integer value) {
            addCriterion("gym_place_num >", value, "gym_place_num");
            return (Criteria) this;
        }

        public Criteria andGym_place_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("gym_place_num >=", value, "gym_place_num");
            return (Criteria) this;
        }

        public Criteria andGym_place_numLessThan(Integer value) {
            addCriterion("gym_place_num <", value, "gym_place_num");
            return (Criteria) this;
        }

        public Criteria andGym_place_numLessThanOrEqualTo(Integer value) {
            addCriterion("gym_place_num <=", value, "gym_place_num");
            return (Criteria) this;
        }

        public Criteria andGym_place_numIn(List<Integer> values) {
            addCriterion("gym_place_num in", values, "gym_place_num");
            return (Criteria) this;
        }

        public Criteria andGym_place_numNotIn(List<Integer> values) {
            addCriterion("gym_place_num not in", values, "gym_place_num");
            return (Criteria) this;
        }

        public Criteria andGym_place_numBetween(Integer value1, Integer value2) {
            addCriterion("gym_place_num between", value1, value2, "gym_place_num");
            return (Criteria) this;
        }

        public Criteria andGym_place_numNotBetween(Integer value1, Integer value2) {
            addCriterion("gym_place_num not between", value1, value2, "gym_place_num");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoIsNull() {
            addCriterion("gym_show_video is null");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoIsNotNull() {
            addCriterion("gym_show_video is not null");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoEqualTo(String value) {
            addCriterion("gym_show_video =", value, "gym_show_video");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoNotEqualTo(String value) {
            addCriterion("gym_show_video <>", value, "gym_show_video");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoGreaterThan(String value) {
            addCriterion("gym_show_video >", value, "gym_show_video");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoGreaterThanOrEqualTo(String value) {
            addCriterion("gym_show_video >=", value, "gym_show_video");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoLessThan(String value) {
            addCriterion("gym_show_video <", value, "gym_show_video");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoLessThanOrEqualTo(String value) {
            addCriterion("gym_show_video <=", value, "gym_show_video");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoLike(String value) {
            addCriterion("gym_show_video like", value, "gym_show_video");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoNotLike(String value) {
            addCriterion("gym_show_video not like", value, "gym_show_video");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoIn(List<String> values) {
            addCriterion("gym_show_video in", values, "gym_show_video");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoNotIn(List<String> values) {
            addCriterion("gym_show_video not in", values, "gym_show_video");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoBetween(String value1, String value2) {
            addCriterion("gym_show_video between", value1, value2, "gym_show_video");
            return (Criteria) this;
        }

        public Criteria andGym_show_videoNotBetween(String value1, String value2) {
            addCriterion("gym_show_video not between", value1, value2, "gym_show_video");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgIsNull() {
            addCriterion("gym_show_img is null");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgIsNotNull() {
            addCriterion("gym_show_img is not null");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgEqualTo(String value) {
            addCriterion("gym_show_img =", value, "gym_show_img");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgNotEqualTo(String value) {
            addCriterion("gym_show_img <>", value, "gym_show_img");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgGreaterThan(String value) {
            addCriterion("gym_show_img >", value, "gym_show_img");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgGreaterThanOrEqualTo(String value) {
            addCriterion("gym_show_img >=", value, "gym_show_img");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgLessThan(String value) {
            addCriterion("gym_show_img <", value, "gym_show_img");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgLessThanOrEqualTo(String value) {
            addCriterion("gym_show_img <=", value, "gym_show_img");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgLike(String value) {
            addCriterion("gym_show_img like", value, "gym_show_img");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgNotLike(String value) {
            addCriterion("gym_show_img not like", value, "gym_show_img");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgIn(List<String> values) {
            addCriterion("gym_show_img in", values, "gym_show_img");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgNotIn(List<String> values) {
            addCriterion("gym_show_img not in", values, "gym_show_img");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgBetween(String value1, String value2) {
            addCriterion("gym_show_img between", value1, value2, "gym_show_img");
            return (Criteria) this;
        }

        public Criteria andGym_show_imgNotBetween(String value1, String value2) {
            addCriterion("gym_show_img not between", value1, value2, "gym_show_img");
            return (Criteria) this;
        }

        public Criteria andGym_nameIsNull() {
            addCriterion("gym_name is null");
            return (Criteria) this;
        }

        public Criteria andGym_nameIsNotNull() {
            addCriterion("gym_name is not null");
            return (Criteria) this;
        }

        public Criteria andGym_nameEqualTo(String value) {
            addCriterion("gym_name =", value, "gym_name");
            return (Criteria) this;
        }

        public Criteria andGym_nameNotEqualTo(String value) {
            addCriterion("gym_name <>", value, "gym_name");
            return (Criteria) this;
        }

        public Criteria andGym_nameGreaterThan(String value) {
            addCriterion("gym_name >", value, "gym_name");
            return (Criteria) this;
        }

        public Criteria andGym_nameGreaterThanOrEqualTo(String value) {
            addCriterion("gym_name >=", value, "gym_name");
            return (Criteria) this;
        }

        public Criteria andGym_nameLessThan(String value) {
            addCriterion("gym_name <", value, "gym_name");
            return (Criteria) this;
        }

        public Criteria andGym_nameLessThanOrEqualTo(String value) {
            addCriterion("gym_name <=", value, "gym_name");
            return (Criteria) this;
        }

        public Criteria andGym_nameLike(String value) {
            addCriterion("gym_name like", value, "gym_name");
            return (Criteria) this;
        }

        public Criteria andGym_nameNotLike(String value) {
            addCriterion("gym_name not like", value, "gym_name");
            return (Criteria) this;
        }

        public Criteria andGym_nameIn(List<String> values) {
            addCriterion("gym_name in", values, "gym_name");
            return (Criteria) this;
        }

        public Criteria andGym_nameNotIn(List<String> values) {
            addCriterion("gym_name not in", values, "gym_name");
            return (Criteria) this;
        }

        public Criteria andGym_nameBetween(String value1, String value2) {
            addCriterion("gym_name between", value1, value2, "gym_name");
            return (Criteria) this;
        }

        public Criteria andGym_nameNotBetween(String value1, String value2) {
            addCriterion("gym_name not between", value1, value2, "gym_name");
            return (Criteria) this;
        }

        public Criteria andGym_corporationidIsNull() {
            addCriterion("gym_corporationid is null");
            return (Criteria) this;
        }

        public Criteria andGym_corporationidIsNotNull() {
            addCriterion("gym_corporationid is not null");
            return (Criteria) this;
        }

        public Criteria andGym_corporationidEqualTo(Integer value) {
            addCriterion("gym_corporationid =", value, "gym_corporationid");
            return (Criteria) this;
        }

        public Criteria andGym_corporationidNotEqualTo(Integer value) {
            addCriterion("gym_corporationid <>", value, "gym_corporationid");
            return (Criteria) this;
        }

        public Criteria andGym_corporationidGreaterThan(Integer value) {
            addCriterion("gym_corporationid >", value, "gym_corporationid");
            return (Criteria) this;
        }

        public Criteria andGym_corporationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gym_corporationid >=", value, "gym_corporationid");
            return (Criteria) this;
        }

        public Criteria andGym_corporationidLessThan(Integer value) {
            addCriterion("gym_corporationid <", value, "gym_corporationid");
            return (Criteria) this;
        }

        public Criteria andGym_corporationidLessThanOrEqualTo(Integer value) {
            addCriterion("gym_corporationid <=", value, "gym_corporationid");
            return (Criteria) this;
        }

        public Criteria andGym_corporationidIn(List<Integer> values) {
            addCriterion("gym_corporationid in", values, "gym_corporationid");
            return (Criteria) this;
        }

        public Criteria andGym_corporationidNotIn(List<Integer> values) {
            addCriterion("gym_corporationid not in", values, "gym_corporationid");
            return (Criteria) this;
        }

        public Criteria andGym_corporationidBetween(Integer value1, Integer value2) {
            addCriterion("gym_corporationid between", value1, value2, "gym_corporationid");
            return (Criteria) this;
        }

        public Criteria andGym_corporationidNotBetween(Integer value1, Integer value2) {
            addCriterion("gym_corporationid not between", value1, value2, "gym_corporationid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("isShow is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("isShow is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("isShow =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("isShow <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("isShow >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("isShow >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("isShow <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("isShow <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("isShow in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("isShow not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("isShow between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("isShow not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNull() {
            addCriterion("viewCount is null");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNotNull() {
            addCriterion("viewCount is not null");
            return (Criteria) this;
        }

        public Criteria andViewCountEqualTo(Integer value) {
            addCriterion("viewCount =", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotEqualTo(Integer value) {
            addCriterion("viewCount <>", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThan(Integer value) {
            addCriterion("viewCount >", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewCount >=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThan(Integer value) {
            addCriterion("viewCount <", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThanOrEqualTo(Integer value) {
            addCriterion("viewCount <=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIn(List<Integer> values) {
            addCriterion("viewCount in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotIn(List<Integer> values) {
            addCriterion("viewCount not in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountBetween(Integer value1, Integer value2) {
            addCriterion("viewCount between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("viewCount not between", value1, value2, "viewCount");
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

        public Criteria andVoteCountIsNull() {
            addCriterion("voteCount is null");
            return (Criteria) this;
        }

        public Criteria andVoteCountIsNotNull() {
            addCriterion("voteCount is not null");
            return (Criteria) this;
        }

        public Criteria andVoteCountEqualTo(Integer value) {
            addCriterion("voteCount =", value, "voteCount");
            return (Criteria) this;
        }

        public Criteria andVoteCountNotEqualTo(Integer value) {
            addCriterion("voteCount <>", value, "voteCount");
            return (Criteria) this;
        }

        public Criteria andVoteCountGreaterThan(Integer value) {
            addCriterion("voteCount >", value, "voteCount");
            return (Criteria) this;
        }

        public Criteria andVoteCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("voteCount >=", value, "voteCount");
            return (Criteria) this;
        }

        public Criteria andVoteCountLessThan(Integer value) {
            addCriterion("voteCount <", value, "voteCount");
            return (Criteria) this;
        }

        public Criteria andVoteCountLessThanOrEqualTo(Integer value) {
            addCriterion("voteCount <=", value, "voteCount");
            return (Criteria) this;
        }

        public Criteria andVoteCountIn(List<Integer> values) {
            addCriterion("voteCount in", values, "voteCount");
            return (Criteria) this;
        }

        public Criteria andVoteCountNotIn(List<Integer> values) {
            addCriterion("voteCount not in", values, "voteCount");
            return (Criteria) this;
        }

        public Criteria andVoteCountBetween(Integer value1, Integer value2) {
            addCriterion("voteCount between", value1, value2, "voteCount");
            return (Criteria) this;
        }

        public Criteria andVoteCountNotBetween(Integer value1, Integer value2) {
            addCriterion("voteCount not between", value1, value2, "voteCount");
            return (Criteria) this;
        }

        public Criteria andOperate_adminidIsNull() {
            addCriterion("operate_adminid is null");
            return (Criteria) this;
        }

        public Criteria andOperate_adminidIsNotNull() {
            addCriterion("operate_adminid is not null");
            return (Criteria) this;
        }

        public Criteria andOperate_adminidEqualTo(Integer value) {
            addCriterion("operate_adminid =", value, "operate_adminid");
            return (Criteria) this;
        }

        public Criteria andOperate_adminidNotEqualTo(Integer value) {
            addCriterion("operate_adminid <>", value, "operate_adminid");
            return (Criteria) this;
        }

        public Criteria andOperate_adminidGreaterThan(Integer value) {
            addCriterion("operate_adminid >", value, "operate_adminid");
            return (Criteria) this;
        }

        public Criteria andOperate_adminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("operate_adminid >=", value, "operate_adminid");
            return (Criteria) this;
        }

        public Criteria andOperate_adminidLessThan(Integer value) {
            addCriterion("operate_adminid <", value, "operate_adminid");
            return (Criteria) this;
        }

        public Criteria andOperate_adminidLessThanOrEqualTo(Integer value) {
            addCriterion("operate_adminid <=", value, "operate_adminid");
            return (Criteria) this;
        }

        public Criteria andOperate_adminidIn(List<Integer> values) {
            addCriterion("operate_adminid in", values, "operate_adminid");
            return (Criteria) this;
        }

        public Criteria andOperate_adminidNotIn(List<Integer> values) {
            addCriterion("operate_adminid not in", values, "operate_adminid");
            return (Criteria) this;
        }

        public Criteria andOperate_adminidBetween(Integer value1, Integer value2) {
            addCriterion("operate_adminid between", value1, value2, "operate_adminid");
            return (Criteria) this;
        }

        public Criteria andOperate_adminidNotBetween(Integer value1, Integer value2) {
            addCriterion("operate_adminid not between", value1, value2, "operate_adminid");
            return (Criteria) this;
        }

        public Criteria andGym_fromIsNull() {
            addCriterion("gym_from is null");
            return (Criteria) this;
        }

        public Criteria andGym_fromIsNotNull() {
            addCriterion("gym_from is not null");
            return (Criteria) this;
        }

        public Criteria andGym_fromEqualTo(Integer value) {
            addCriterion("gym_from =", value, "gym_from");
            return (Criteria) this;
        }

        public Criteria andGym_fromNotEqualTo(Integer value) {
            addCriterion("gym_from <>", value, "gym_from");
            return (Criteria) this;
        }

        public Criteria andGym_fromGreaterThan(Integer value) {
            addCriterion("gym_from >", value, "gym_from");
            return (Criteria) this;
        }

        public Criteria andGym_fromGreaterThanOrEqualTo(Integer value) {
            addCriterion("gym_from >=", value, "gym_from");
            return (Criteria) this;
        }

        public Criteria andGym_fromLessThan(Integer value) {
            addCriterion("gym_from <", value, "gym_from");
            return (Criteria) this;
        }

        public Criteria andGym_fromLessThanOrEqualTo(Integer value) {
            addCriterion("gym_from <=", value, "gym_from");
            return (Criteria) this;
        }

        public Criteria andGym_fromIn(List<Integer> values) {
            addCriterion("gym_from in", values, "gym_from");
            return (Criteria) this;
        }

        public Criteria andGym_fromNotIn(List<Integer> values) {
            addCriterion("gym_from not in", values, "gym_from");
            return (Criteria) this;
        }

        public Criteria andGym_fromBetween(Integer value1, Integer value2) {
            addCriterion("gym_from between", value1, value2, "gym_from");
            return (Criteria) this;
        }

        public Criteria andGym_fromNotBetween(Integer value1, Integer value2) {
            addCriterion("gym_from not between", value1, value2, "gym_from");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixIsNull() {
            addCriterion("urlPrefix is null");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixIsNotNull() {
            addCriterion("urlPrefix is not null");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixEqualTo(String value) {
            addCriterion("urlPrefix =", value, "urlPrefix");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixNotEqualTo(String value) {
            addCriterion("urlPrefix <>", value, "urlPrefix");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixGreaterThan(String value) {
            addCriterion("urlPrefix >", value, "urlPrefix");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("urlPrefix >=", value, "urlPrefix");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixLessThan(String value) {
            addCriterion("urlPrefix <", value, "urlPrefix");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixLessThanOrEqualTo(String value) {
            addCriterion("urlPrefix <=", value, "urlPrefix");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixLike(String value) {
            addCriterion("urlPrefix like", value, "urlPrefix");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixNotLike(String value) {
            addCriterion("urlPrefix not like", value, "urlPrefix");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixIn(List<String> values) {
            addCriterion("urlPrefix in", values, "urlPrefix");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixNotIn(List<String> values) {
            addCriterion("urlPrefix not in", values, "urlPrefix");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixBetween(String value1, String value2) {
            addCriterion("urlPrefix between", value1, value2, "urlPrefix");
            return (Criteria) this;
        }

        public Criteria andUrlPrefixNotBetween(String value1, String value2) {
            addCriterion("urlPrefix not between", value1, value2, "urlPrefix");
            return (Criteria) this;
        }

        public Criteria andCity_idIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCity_idIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCity_idEqualTo(Integer value) {
            addCriterion("city_id =", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idGreaterThan(Integer value) {
            addCriterion("city_id >", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idLessThan(Integer value) {
            addCriterion("city_id <", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idIn(List<Integer> values) {
            addCriterion("city_id in", values, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "city_id");
            return (Criteria) this;
        }

        public Criteria andIs_hotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIs_hotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIs_hotEqualTo(Integer value) {
            addCriterion("is_hot =", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotNotEqualTo(Integer value) {
            addCriterion("is_hot <>", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotGreaterThan(Integer value) {
            addCriterion("is_hot >", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_hot >=", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotLessThan(Integer value) {
            addCriterion("is_hot <", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotLessThanOrEqualTo(Integer value) {
            addCriterion("is_hot <=", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotIn(List<Integer> values) {
            addCriterion("is_hot in", values, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotNotIn(List<Integer> values) {
            addCriterion("is_hot not in", values, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot between", value1, value2, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotNotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot not between", value1, value2, "is_hot");
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