package com.pugilist.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopOrdRecordExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ShopOrdRecordExample() {
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

		public Criteria andOrd_noIsNull() {
			addCriterion("ord_no is null");
			return (Criteria) this;
		}

		public Criteria andOrd_noIsNotNull() {
			addCriterion("ord_no is not null");
			return (Criteria) this;
		}

		public Criteria andOrd_noEqualTo(String value) {
			addCriterion("ord_no =", value, "ord_no");
			return (Criteria) this;
		}

		public Criteria andOrd_noNotEqualTo(String value) {
			addCriterion("ord_no <>", value, "ord_no");
			return (Criteria) this;
		}

		public Criteria andOrd_noGreaterThan(String value) {
			addCriterion("ord_no >", value, "ord_no");
			return (Criteria) this;
		}

		public Criteria andOrd_noGreaterThanOrEqualTo(String value) {
			addCriterion("ord_no >=", value, "ord_no");
			return (Criteria) this;
		}

		public Criteria andOrd_noLessThan(String value) {
			addCriterion("ord_no <", value, "ord_no");
			return (Criteria) this;
		}

		public Criteria andOrd_noLessThanOrEqualTo(String value) {
			addCriterion("ord_no <=", value, "ord_no");
			return (Criteria) this;
		}

		public Criteria andOrd_noLike(String value) {
			addCriterion("ord_no like", value, "ord_no");
			return (Criteria) this;
		}

		public Criteria andOrd_noNotLike(String value) {
			addCriterion("ord_no not like", value, "ord_no");
			return (Criteria) this;
		}

		public Criteria andOrd_noIn(List<String> values) {
			addCriterion("ord_no in", values, "ord_no");
			return (Criteria) this;
		}

		public Criteria andOrd_noNotIn(List<String> values) {
			addCriterion("ord_no not in", values, "ord_no");
			return (Criteria) this;
		}

		public Criteria andOrd_noBetween(String value1, String value2) {
			addCriterion("ord_no between", value1, value2, "ord_no");
			return (Criteria) this;
		}

		public Criteria andOrd_noNotBetween(String value1, String value2) {
			addCriterion("ord_no not between", value1, value2, "ord_no");
			return (Criteria) this;
		}

		public Criteria andAction_timeIsNull() {
			addCriterion("action_time is null");
			return (Criteria) this;
		}

		public Criteria andAction_timeIsNotNull() {
			addCriterion("action_time is not null");
			return (Criteria) this;
		}

		public Criteria andAction_timeEqualTo(Date value) {
			addCriterion("action_time =", value, "action_time");
			return (Criteria) this;
		}

		public Criteria andAction_timeNotEqualTo(Date value) {
			addCriterion("action_time <>", value, "action_time");
			return (Criteria) this;
		}

		public Criteria andAction_timeGreaterThan(Date value) {
			addCriterion("action_time >", value, "action_time");
			return (Criteria) this;
		}

		public Criteria andAction_timeGreaterThanOrEqualTo(Date value) {
			addCriterion("action_time >=", value, "action_time");
			return (Criteria) this;
		}

		public Criteria andAction_timeLessThan(Date value) {
			addCriterion("action_time <", value, "action_time");
			return (Criteria) this;
		}

		public Criteria andAction_timeLessThanOrEqualTo(Date value) {
			addCriterion("action_time <=", value, "action_time");
			return (Criteria) this;
		}

		public Criteria andAction_timeIn(List<Date> values) {
			addCriterion("action_time in", values, "action_time");
			return (Criteria) this;
		}

		public Criteria andAction_timeNotIn(List<Date> values) {
			addCriterion("action_time not in", values, "action_time");
			return (Criteria) this;
		}

		public Criteria andAction_timeBetween(Date value1, Date value2) {
			addCriterion("action_time between", value1, value2, "action_time");
			return (Criteria) this;
		}

		public Criteria andAction_timeNotBetween(Date value1, Date value2) {
			addCriterion("action_time not between", value1, value2, "action_time");
			return (Criteria) this;
		}

		public Criteria andAction_typeIsNull() {
			addCriterion("action_type is null");
			return (Criteria) this;
		}

		public Criteria andAction_typeIsNotNull() {
			addCriterion("action_type is not null");
			return (Criteria) this;
		}

		public Criteria andAction_typeEqualTo(Integer value) {
			addCriterion("action_type =", value, "action_type");
			return (Criteria) this;
		}

		public Criteria andAction_typeNotEqualTo(Integer value) {
			addCriterion("action_type <>", value, "action_type");
			return (Criteria) this;
		}

		public Criteria andAction_typeGreaterThan(Integer value) {
			addCriterion("action_type >", value, "action_type");
			return (Criteria) this;
		}

		public Criteria andAction_typeGreaterThanOrEqualTo(Integer value) {
			addCriterion("action_type >=", value, "action_type");
			return (Criteria) this;
		}

		public Criteria andAction_typeLessThan(Integer value) {
			addCriterion("action_type <", value, "action_type");
			return (Criteria) this;
		}

		public Criteria andAction_typeLessThanOrEqualTo(Integer value) {
			addCriterion("action_type <=", value, "action_type");
			return (Criteria) this;
		}

		public Criteria andAction_typeIn(List<Integer> values) {
			addCriterion("action_type in", values, "action_type");
			return (Criteria) this;
		}

		public Criteria andAction_typeNotIn(List<Integer> values) {
			addCriterion("action_type not in", values, "action_type");
			return (Criteria) this;
		}

		public Criteria andAction_typeBetween(Integer value1, Integer value2) {
			addCriterion("action_type between", value1, value2, "action_type");
			return (Criteria) this;
		}

		public Criteria andAction_typeNotBetween(Integer value1, Integer value2) {
			addCriterion("action_type not between", value1, value2, "action_type");
			return (Criteria) this;
		}

		public Criteria andAction_infoIsNull() {
			addCriterion("action_info is null");
			return (Criteria) this;
		}

		public Criteria andAction_infoIsNotNull() {
			addCriterion("action_info is not null");
			return (Criteria) this;
		}

		public Criteria andAction_infoEqualTo(String value) {
			addCriterion("action_info =", value, "action_info");
			return (Criteria) this;
		}

		public Criteria andAction_infoNotEqualTo(String value) {
			addCriterion("action_info <>", value, "action_info");
			return (Criteria) this;
		}

		public Criteria andAction_infoGreaterThan(String value) {
			addCriterion("action_info >", value, "action_info");
			return (Criteria) this;
		}

		public Criteria andAction_infoGreaterThanOrEqualTo(String value) {
			addCriterion("action_info >=", value, "action_info");
			return (Criteria) this;
		}

		public Criteria andAction_infoLessThan(String value) {
			addCriterion("action_info <", value, "action_info");
			return (Criteria) this;
		}

		public Criteria andAction_infoLessThanOrEqualTo(String value) {
			addCriterion("action_info <=", value, "action_info");
			return (Criteria) this;
		}

		public Criteria andAction_infoLike(String value) {
			addCriterion("action_info like", value, "action_info");
			return (Criteria) this;
		}

		public Criteria andAction_infoNotLike(String value) {
			addCriterion("action_info not like", value, "action_info");
			return (Criteria) this;
		}

		public Criteria andAction_infoIn(List<String> values) {
			addCriterion("action_info in", values, "action_info");
			return (Criteria) this;
		}

		public Criteria andAction_infoNotIn(List<String> values) {
			addCriterion("action_info not in", values, "action_info");
			return (Criteria) this;
		}

		public Criteria andAction_infoBetween(String value1, String value2) {
			addCriterion("action_info between", value1, value2, "action_info");
			return (Criteria) this;
		}

		public Criteria andAction_infoNotBetween(String value1, String value2) {
			addCriterion("action_info not between", value1, value2, "action_info");
			return (Criteria) this;
		}

		public Criteria andIsDelatedIsNull() {
			addCriterion("isDelated is null");
			return (Criteria) this;
		}

		public Criteria andIsDelatedIsNotNull() {
			addCriterion("isDelated is not null");
			return (Criteria) this;
		}

		public Criteria andIsDelatedEqualTo(String value) {
			addCriterion("isDelated =", value, "isDelated");
			return (Criteria) this;
		}

		public Criteria andIsDelatedNotEqualTo(String value) {
			addCriterion("isDelated <>", value, "isDelated");
			return (Criteria) this;
		}

		public Criteria andIsDelatedGreaterThan(String value) {
			addCriterion("isDelated >", value, "isDelated");
			return (Criteria) this;
		}

		public Criteria andIsDelatedGreaterThanOrEqualTo(String value) {
			addCriterion("isDelated >=", value, "isDelated");
			return (Criteria) this;
		}

		public Criteria andIsDelatedLessThan(String value) {
			addCriterion("isDelated <", value, "isDelated");
			return (Criteria) this;
		}

		public Criteria andIsDelatedLessThanOrEqualTo(String value) {
			addCriterion("isDelated <=", value, "isDelated");
			return (Criteria) this;
		}

		public Criteria andIsDelatedLike(String value) {
			addCriterion("isDelated like", value, "isDelated");
			return (Criteria) this;
		}

		public Criteria andIsDelatedNotLike(String value) {
			addCriterion("isDelated not like", value, "isDelated");
			return (Criteria) this;
		}

		public Criteria andIsDelatedIn(List<String> values) {
			addCriterion("isDelated in", values, "isDelated");
			return (Criteria) this;
		}

		public Criteria andIsDelatedNotIn(List<String> values) {
			addCriterion("isDelated not in", values, "isDelated");
			return (Criteria) this;
		}

		public Criteria andIsDelatedBetween(String value1, String value2) {
			addCriterion("isDelated between", value1, value2, "isDelated");
			return (Criteria) this;
		}

		public Criteria andIsDelatedNotBetween(String value1, String value2) {
			addCriterion("isDelated not between", value1, value2, "isDelated");
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

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopOrdRecordExample() {
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

        public Criteria andOrd_noIsNull() {
            addCriterion("ord_no is null");
            return (Criteria) this;
        }

        public Criteria andOrd_noIsNotNull() {
            addCriterion("ord_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrd_noEqualTo(String value) {
            addCriterion("ord_no =", value, "ord_no");
            return (Criteria) this;
        }

        public Criteria andOrd_noNotEqualTo(String value) {
            addCriterion("ord_no <>", value, "ord_no");
            return (Criteria) this;
        }

        public Criteria andOrd_noGreaterThan(String value) {
            addCriterion("ord_no >", value, "ord_no");
            return (Criteria) this;
        }

        public Criteria andOrd_noGreaterThanOrEqualTo(String value) {
            addCriterion("ord_no >=", value, "ord_no");
            return (Criteria) this;
        }

        public Criteria andOrd_noLessThan(String value) {
            addCriterion("ord_no <", value, "ord_no");
            return (Criteria) this;
        }

        public Criteria andOrd_noLessThanOrEqualTo(String value) {
            addCriterion("ord_no <=", value, "ord_no");
            return (Criteria) this;
        }

        public Criteria andOrd_noLike(String value) {
            addCriterion("ord_no like", value, "ord_no");
            return (Criteria) this;
        }

        public Criteria andOrd_noNotLike(String value) {
            addCriterion("ord_no not like", value, "ord_no");
            return (Criteria) this;
        }

        public Criteria andOrd_noIn(List<String> values) {
            addCriterion("ord_no in", values, "ord_no");
            return (Criteria) this;
        }

        public Criteria andOrd_noNotIn(List<String> values) {
            addCriterion("ord_no not in", values, "ord_no");
            return (Criteria) this;
        }

        public Criteria andOrd_noBetween(String value1, String value2) {
            addCriterion("ord_no between", value1, value2, "ord_no");
            return (Criteria) this;
        }

        public Criteria andOrd_noNotBetween(String value1, String value2) {
            addCriterion("ord_no not between", value1, value2, "ord_no");
            return (Criteria) this;
        }

        public Criteria andAction_timeIsNull() {
            addCriterion("action_time is null");
            return (Criteria) this;
        }

        public Criteria andAction_timeIsNotNull() {
            addCriterion("action_time is not null");
            return (Criteria) this;
        }

        public Criteria andAction_timeEqualTo(Date value) {
            addCriterion("action_time =", value, "action_time");
            return (Criteria) this;
        }

        public Criteria andAction_timeNotEqualTo(Date value) {
            addCriterion("action_time <>", value, "action_time");
            return (Criteria) this;
        }

        public Criteria andAction_timeGreaterThan(Date value) {
            addCriterion("action_time >", value, "action_time");
            return (Criteria) this;
        }

        public Criteria andAction_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("action_time >=", value, "action_time");
            return (Criteria) this;
        }

        public Criteria andAction_timeLessThan(Date value) {
            addCriterion("action_time <", value, "action_time");
            return (Criteria) this;
        }

        public Criteria andAction_timeLessThanOrEqualTo(Date value) {
            addCriterion("action_time <=", value, "action_time");
            return (Criteria) this;
        }

        public Criteria andAction_timeIn(List<Date> values) {
            addCriterion("action_time in", values, "action_time");
            return (Criteria) this;
        }

        public Criteria andAction_timeNotIn(List<Date> values) {
            addCriterion("action_time not in", values, "action_time");
            return (Criteria) this;
        }

        public Criteria andAction_timeBetween(Date value1, Date value2) {
            addCriterion("action_time between", value1, value2, "action_time");
            return (Criteria) this;
        }

        public Criteria andAction_timeNotBetween(Date value1, Date value2) {
            addCriterion("action_time not between", value1, value2, "action_time");
            return (Criteria) this;
        }

        public Criteria andAction_typeIsNull() {
            addCriterion("action_type is null");
            return (Criteria) this;
        }

        public Criteria andAction_typeIsNotNull() {
            addCriterion("action_type is not null");
            return (Criteria) this;
        }

        public Criteria andAction_typeEqualTo(Integer value) {
            addCriterion("action_type =", value, "action_type");
            return (Criteria) this;
        }

        public Criteria andAction_typeNotEqualTo(Integer value) {
            addCriterion("action_type <>", value, "action_type");
            return (Criteria) this;
        }

        public Criteria andAction_typeGreaterThan(Integer value) {
            addCriterion("action_type >", value, "action_type");
            return (Criteria) this;
        }

        public Criteria andAction_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("action_type >=", value, "action_type");
            return (Criteria) this;
        }

        public Criteria andAction_typeLessThan(Integer value) {
            addCriterion("action_type <", value, "action_type");
            return (Criteria) this;
        }

        public Criteria andAction_typeLessThanOrEqualTo(Integer value) {
            addCriterion("action_type <=", value, "action_type");
            return (Criteria) this;
        }

        public Criteria andAction_typeIn(List<Integer> values) {
            addCriterion("action_type in", values, "action_type");
            return (Criteria) this;
        }

        public Criteria andAction_typeNotIn(List<Integer> values) {
            addCriterion("action_type not in", values, "action_type");
            return (Criteria) this;
        }

        public Criteria andAction_typeBetween(Integer value1, Integer value2) {
            addCriterion("action_type between", value1, value2, "action_type");
            return (Criteria) this;
        }

        public Criteria andAction_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("action_type not between", value1, value2, "action_type");
            return (Criteria) this;
        }

        public Criteria andAction_infoIsNull() {
            addCriterion("action_info is null");
            return (Criteria) this;
        }

        public Criteria andAction_infoIsNotNull() {
            addCriterion("action_info is not null");
            return (Criteria) this;
        }

        public Criteria andAction_infoEqualTo(String value) {
            addCriterion("action_info =", value, "action_info");
            return (Criteria) this;
        }

        public Criteria andAction_infoNotEqualTo(String value) {
            addCriterion("action_info <>", value, "action_info");
            return (Criteria) this;
        }

        public Criteria andAction_infoGreaterThan(String value) {
            addCriterion("action_info >", value, "action_info");
            return (Criteria) this;
        }

        public Criteria andAction_infoGreaterThanOrEqualTo(String value) {
            addCriterion("action_info >=", value, "action_info");
            return (Criteria) this;
        }

        public Criteria andAction_infoLessThan(String value) {
            addCriterion("action_info <", value, "action_info");
            return (Criteria) this;
        }

        public Criteria andAction_infoLessThanOrEqualTo(String value) {
            addCriterion("action_info <=", value, "action_info");
            return (Criteria) this;
        }

        public Criteria andAction_infoLike(String value) {
            addCriterion("action_info like", value, "action_info");
            return (Criteria) this;
        }

        public Criteria andAction_infoNotLike(String value) {
            addCriterion("action_info not like", value, "action_info");
            return (Criteria) this;
        }

        public Criteria andAction_infoIn(List<String> values) {
            addCriterion("action_info in", values, "action_info");
            return (Criteria) this;
        }

        public Criteria andAction_infoNotIn(List<String> values) {
            addCriterion("action_info not in", values, "action_info");
            return (Criteria) this;
        }

        public Criteria andAction_infoBetween(String value1, String value2) {
            addCriterion("action_info between", value1, value2, "action_info");
            return (Criteria) this;
        }

        public Criteria andAction_infoNotBetween(String value1, String value2) {
            addCriterion("action_info not between", value1, value2, "action_info");
            return (Criteria) this;
        }

        public Criteria andIsDelatedIsNull() {
            addCriterion("isDelated is null");
            return (Criteria) this;
        }

        public Criteria andIsDelatedIsNotNull() {
            addCriterion("isDelated is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelatedEqualTo(String value) {
            addCriterion("isDelated =", value, "isDelated");
            return (Criteria) this;
        }

        public Criteria andIsDelatedNotEqualTo(String value) {
            addCriterion("isDelated <>", value, "isDelated");
            return (Criteria) this;
        }

        public Criteria andIsDelatedGreaterThan(String value) {
            addCriterion("isDelated >", value, "isDelated");
            return (Criteria) this;
        }

        public Criteria andIsDelatedGreaterThanOrEqualTo(String value) {
            addCriterion("isDelated >=", value, "isDelated");
            return (Criteria) this;
        }

        public Criteria andIsDelatedLessThan(String value) {
            addCriterion("isDelated <", value, "isDelated");
            return (Criteria) this;
        }

        public Criteria andIsDelatedLessThanOrEqualTo(String value) {
            addCriterion("isDelated <=", value, "isDelated");
            return (Criteria) this;
        }

        public Criteria andIsDelatedLike(String value) {
            addCriterion("isDelated like", value, "isDelated");
            return (Criteria) this;
        }

        public Criteria andIsDelatedNotLike(String value) {
            addCriterion("isDelated not like", value, "isDelated");
            return (Criteria) this;
        }

        public Criteria andIsDelatedIn(List<String> values) {
            addCriterion("isDelated in", values, "isDelated");
            return (Criteria) this;
        }

        public Criteria andIsDelatedNotIn(List<String> values) {
            addCriterion("isDelated not in", values, "isDelated");
            return (Criteria) this;
        }

        public Criteria andIsDelatedBetween(String value1, String value2) {
            addCriterion("isDelated between", value1, value2, "isDelated");
            return (Criteria) this;
        }

        public Criteria andIsDelatedNotBetween(String value1, String value2) {
            addCriterion("isDelated not between", value1, value2, "isDelated");
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