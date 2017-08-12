package cc.msonion.carambola.collector.pojo;

import cc.msonion.carambola.parent.interfaces.pojo.base.MsOnionBaseExampleAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectorItemCategoryExample implements MsOnionBaseExampleAdapter {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CollectorItemCategoryExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        private static final long serialVersionUID = 1L;

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

        public Criteria andIdxIsNull() {
            addCriterion("idx is null");
            return (Criteria) this;
        }

        public Criteria andIdxIsNotNull() {
            addCriterion("idx is not null");
            return (Criteria) this;
        }

        public Criteria andIdxEqualTo(Long value) {
            addCriterion("idx =", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotEqualTo(Long value) {
            addCriterion("idx <>", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThan(Long value) {
            addCriterion("idx >", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("idx >=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThan(Long value) {
            addCriterion("idx <", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThanOrEqualTo(Long value) {
            addCriterion("idx <=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxIn(List<Long> values) {
            addCriterion("idx in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotIn(List<Long> values) {
            addCriterion("idx not in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxBetween(Long value1, Long value2) {
            addCriterion("idx between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotBetween(Long value1, Long value2) {
            addCriterion("idx not between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxCodeIsNull() {
            addCriterion("idx_code is null");
            return (Criteria) this;
        }

        public Criteria andIdxCodeIsNotNull() {
            addCriterion("idx_code is not null");
            return (Criteria) this;
        }

        public Criteria andIdxCodeEqualTo(Long value) {
            addCriterion("idx_code =", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeNotEqualTo(Long value) {
            addCriterion("idx_code <>", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeGreaterThan(Long value) {
            addCriterion("idx_code >", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("idx_code >=", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeLessThan(Long value) {
            addCriterion("idx_code <", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeLessThanOrEqualTo(Long value) {
            addCriterion("idx_code <=", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeIn(List<Long> values) {
            addCriterion("idx_code in", values, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeNotIn(List<Long> values) {
            addCriterion("idx_code not in", values, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeBetween(Long value1, Long value2) {
            addCriterion("idx_code between", value1, value2, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeNotBetween(Long value1, Long value2) {
            addCriterion("idx_code not between", value1, value2, "idxCode");
            return (Criteria) this;
        }

        public Criteria andPidxIsNull() {
            addCriterion("pidx is null");
            return (Criteria) this;
        }

        public Criteria andPidxIsNotNull() {
            addCriterion("pidx is not null");
            return (Criteria) this;
        }

        public Criteria andPidxEqualTo(Long value) {
            addCriterion("pidx =", value, "pidx");
            return (Criteria) this;
        }

        public Criteria andPidxNotEqualTo(Long value) {
            addCriterion("pidx <>", value, "pidx");
            return (Criteria) this;
        }

        public Criteria andPidxGreaterThan(Long value) {
            addCriterion("pidx >", value, "pidx");
            return (Criteria) this;
        }

        public Criteria andPidxGreaterThanOrEqualTo(Long value) {
            addCriterion("pidx >=", value, "pidx");
            return (Criteria) this;
        }

        public Criteria andPidxLessThan(Long value) {
            addCriterion("pidx <", value, "pidx");
            return (Criteria) this;
        }

        public Criteria andPidxLessThanOrEqualTo(Long value) {
            addCriterion("pidx <=", value, "pidx");
            return (Criteria) this;
        }

        public Criteria andPidxIn(List<Long> values) {
            addCriterion("pidx in", values, "pidx");
            return (Criteria) this;
        }

        public Criteria andPidxNotIn(List<Long> values) {
            addCriterion("pidx not in", values, "pidx");
            return (Criteria) this;
        }

        public Criteria andPidxBetween(Long value1, Long value2) {
            addCriterion("pidx between", value1, value2, "pidx");
            return (Criteria) this;
        }

        public Criteria andPidxNotBetween(Long value1, Long value2) {
            addCriterion("pidx not between", value1, value2, "pidx");
            return (Criteria) this;
        }

        public Criteria andPidxCodeIsNull() {
            addCriterion("pidx_code is null");
            return (Criteria) this;
        }

        public Criteria andPidxCodeIsNotNull() {
            addCriterion("pidx_code is not null");
            return (Criteria) this;
        }

        public Criteria andPidxCodeEqualTo(Long value) {
            addCriterion("pidx_code =", value, "pidxCode");
            return (Criteria) this;
        }

        public Criteria andPidxCodeNotEqualTo(Long value) {
            addCriterion("pidx_code <>", value, "pidxCode");
            return (Criteria) this;
        }

        public Criteria andPidxCodeGreaterThan(Long value) {
            addCriterion("pidx_code >", value, "pidxCode");
            return (Criteria) this;
        }

        public Criteria andPidxCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("pidx_code >=", value, "pidxCode");
            return (Criteria) this;
        }

        public Criteria andPidxCodeLessThan(Long value) {
            addCriterion("pidx_code <", value, "pidxCode");
            return (Criteria) this;
        }

        public Criteria andPidxCodeLessThanOrEqualTo(Long value) {
            addCriterion("pidx_code <=", value, "pidxCode");
            return (Criteria) this;
        }

        public Criteria andPidxCodeIn(List<Long> values) {
            addCriterion("pidx_code in", values, "pidxCode");
            return (Criteria) this;
        }

        public Criteria andPidxCodeNotIn(List<Long> values) {
            addCriterion("pidx_code not in", values, "pidxCode");
            return (Criteria) this;
        }

        public Criteria andPidxCodeBetween(Long value1, Long value2) {
            addCriterion("pidx_code between", value1, value2, "pidxCode");
            return (Criteria) this;
        }

        public Criteria andPidxCodeNotBetween(Long value1, Long value2) {
            addCriterion("pidx_code not between", value1, value2, "pidxCode");
            return (Criteria) this;
        }

        public Criteria andTopIdxIsNull() {
            addCriterion("top_idx is null");
            return (Criteria) this;
        }

        public Criteria andTopIdxIsNotNull() {
            addCriterion("top_idx is not null");
            return (Criteria) this;
        }

        public Criteria andTopIdxEqualTo(Long value) {
            addCriterion("top_idx =", value, "topIdx");
            return (Criteria) this;
        }

        public Criteria andTopIdxNotEqualTo(Long value) {
            addCriterion("top_idx <>", value, "topIdx");
            return (Criteria) this;
        }

        public Criteria andTopIdxGreaterThan(Long value) {
            addCriterion("top_idx >", value, "topIdx");
            return (Criteria) this;
        }

        public Criteria andTopIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("top_idx >=", value, "topIdx");
            return (Criteria) this;
        }

        public Criteria andTopIdxLessThan(Long value) {
            addCriterion("top_idx <", value, "topIdx");
            return (Criteria) this;
        }

        public Criteria andTopIdxLessThanOrEqualTo(Long value) {
            addCriterion("top_idx <=", value, "topIdx");
            return (Criteria) this;
        }

        public Criteria andTopIdxIn(List<Long> values) {
            addCriterion("top_idx in", values, "topIdx");
            return (Criteria) this;
        }

        public Criteria andTopIdxNotIn(List<Long> values) {
            addCriterion("top_idx not in", values, "topIdx");
            return (Criteria) this;
        }

        public Criteria andTopIdxBetween(Long value1, Long value2) {
            addCriterion("top_idx between", value1, value2, "topIdx");
            return (Criteria) this;
        }

        public Criteria andTopIdxNotBetween(Long value1, Long value2) {
            addCriterion("top_idx not between", value1, value2, "topIdx");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andImageSmallIsNull() {
            addCriterion("image_small is null");
            return (Criteria) this;
        }

        public Criteria andImageSmallIsNotNull() {
            addCriterion("image_small is not null");
            return (Criteria) this;
        }

        public Criteria andImageSmallEqualTo(String value) {
            addCriterion("image_small =", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallNotEqualTo(String value) {
            addCriterion("image_small <>", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallGreaterThan(String value) {
            addCriterion("image_small >", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallGreaterThanOrEqualTo(String value) {
            addCriterion("image_small >=", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallLessThan(String value) {
            addCriterion("image_small <", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallLessThanOrEqualTo(String value) {
            addCriterion("image_small <=", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallLike(String value) {
            addCriterion("image_small like", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallNotLike(String value) {
            addCriterion("image_small not like", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallIn(List<String> values) {
            addCriterion("image_small in", values, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallNotIn(List<String> values) {
            addCriterion("image_small not in", values, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallBetween(String value1, String value2) {
            addCriterion("image_small between", value1, value2, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallNotBetween(String value1, String value2) {
            addCriterion("image_small not between", value1, value2, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageMiddleIsNull() {
            addCriterion("image_middle is null");
            return (Criteria) this;
        }

        public Criteria andImageMiddleIsNotNull() {
            addCriterion("image_middle is not null");
            return (Criteria) this;
        }

        public Criteria andImageMiddleEqualTo(String value) {
            addCriterion("image_middle =", value, "imageMiddle");
            return (Criteria) this;
        }

        public Criteria andImageMiddleNotEqualTo(String value) {
            addCriterion("image_middle <>", value, "imageMiddle");
            return (Criteria) this;
        }

        public Criteria andImageMiddleGreaterThan(String value) {
            addCriterion("image_middle >", value, "imageMiddle");
            return (Criteria) this;
        }

        public Criteria andImageMiddleGreaterThanOrEqualTo(String value) {
            addCriterion("image_middle >=", value, "imageMiddle");
            return (Criteria) this;
        }

        public Criteria andImageMiddleLessThan(String value) {
            addCriterion("image_middle <", value, "imageMiddle");
            return (Criteria) this;
        }

        public Criteria andImageMiddleLessThanOrEqualTo(String value) {
            addCriterion("image_middle <=", value, "imageMiddle");
            return (Criteria) this;
        }

        public Criteria andImageMiddleLike(String value) {
            addCriterion("image_middle like", value, "imageMiddle");
            return (Criteria) this;
        }

        public Criteria andImageMiddleNotLike(String value) {
            addCriterion("image_middle not like", value, "imageMiddle");
            return (Criteria) this;
        }

        public Criteria andImageMiddleIn(List<String> values) {
            addCriterion("image_middle in", values, "imageMiddle");
            return (Criteria) this;
        }

        public Criteria andImageMiddleNotIn(List<String> values) {
            addCriterion("image_middle not in", values, "imageMiddle");
            return (Criteria) this;
        }

        public Criteria andImageMiddleBetween(String value1, String value2) {
            addCriterion("image_middle between", value1, value2, "imageMiddle");
            return (Criteria) this;
        }

        public Criteria andImageMiddleNotBetween(String value1, String value2) {
            addCriterion("image_middle not between", value1, value2, "imageMiddle");
            return (Criteria) this;
        }

        public Criteria andImageBigIsNull() {
            addCriterion("image_big is null");
            return (Criteria) this;
        }

        public Criteria andImageBigIsNotNull() {
            addCriterion("image_big is not null");
            return (Criteria) this;
        }

        public Criteria andImageBigEqualTo(String value) {
            addCriterion("image_big =", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigNotEqualTo(String value) {
            addCriterion("image_big <>", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigGreaterThan(String value) {
            addCriterion("image_big >", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigGreaterThanOrEqualTo(String value) {
            addCriterion("image_big >=", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigLessThan(String value) {
            addCriterion("image_big <", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigLessThanOrEqualTo(String value) {
            addCriterion("image_big <=", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigLike(String value) {
            addCriterion("image_big like", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigNotLike(String value) {
            addCriterion("image_big not like", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigIn(List<String> values) {
            addCriterion("image_big in", values, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigNotIn(List<String> values) {
            addCriterion("image_big not in", values, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigBetween(String value1, String value2) {
            addCriterion("image_big between", value1, value2, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigNotBetween(String value1, String value2) {
            addCriterion("image_big not between", value1, value2, "imageBig");
            return (Criteria) this;
        }

        public Criteria andAttributeGroupIdxIsNull() {
            addCriterion("attribute_group_idx is null");
            return (Criteria) this;
        }

        public Criteria andAttributeGroupIdxIsNotNull() {
            addCriterion("attribute_group_idx is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeGroupIdxEqualTo(Long value) {
            addCriterion("attribute_group_idx =", value, "attributeGroupIdx");
            return (Criteria) this;
        }

        public Criteria andAttributeGroupIdxNotEqualTo(Long value) {
            addCriterion("attribute_group_idx <>", value, "attributeGroupIdx");
            return (Criteria) this;
        }

        public Criteria andAttributeGroupIdxGreaterThan(Long value) {
            addCriterion("attribute_group_idx >", value, "attributeGroupIdx");
            return (Criteria) this;
        }

        public Criteria andAttributeGroupIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("attribute_group_idx >=", value, "attributeGroupIdx");
            return (Criteria) this;
        }

        public Criteria andAttributeGroupIdxLessThan(Long value) {
            addCriterion("attribute_group_idx <", value, "attributeGroupIdx");
            return (Criteria) this;
        }

        public Criteria andAttributeGroupIdxLessThanOrEqualTo(Long value) {
            addCriterion("attribute_group_idx <=", value, "attributeGroupIdx");
            return (Criteria) this;
        }

        public Criteria andAttributeGroupIdxIn(List<Long> values) {
            addCriterion("attribute_group_idx in", values, "attributeGroupIdx");
            return (Criteria) this;
        }

        public Criteria andAttributeGroupIdxNotIn(List<Long> values) {
            addCriterion("attribute_group_idx not in", values, "attributeGroupIdx");
            return (Criteria) this;
        }

        public Criteria andAttributeGroupIdxBetween(Long value1, Long value2) {
            addCriterion("attribute_group_idx between", value1, value2, "attributeGroupIdx");
            return (Criteria) this;
        }

        public Criteria andAttributeGroupIdxNotBetween(Long value1, Long value2) {
            addCriterion("attribute_group_idx not between", value1, value2, "attributeGroupIdx");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitIsNull() {
            addCriterion("purchase_limit is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitIsNotNull() {
            addCriterion("purchase_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitEqualTo(Short value) {
            addCriterion("purchase_limit =", value, "purchaseLimit");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitNotEqualTo(Short value) {
            addCriterion("purchase_limit <>", value, "purchaseLimit");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitGreaterThan(Short value) {
            addCriterion("purchase_limit >", value, "purchaseLimit");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitGreaterThanOrEqualTo(Short value) {
            addCriterion("purchase_limit >=", value, "purchaseLimit");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitLessThan(Short value) {
            addCriterion("purchase_limit <", value, "purchaseLimit");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitLessThanOrEqualTo(Short value) {
            addCriterion("purchase_limit <=", value, "purchaseLimit");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitIn(List<Short> values) {
            addCriterion("purchase_limit in", values, "purchaseLimit");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitNotIn(List<Short> values) {
            addCriterion("purchase_limit not in", values, "purchaseLimit");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitBetween(Short value1, Short value2) {
            addCriterion("purchase_limit between", value1, value2, "purchaseLimit");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitNotBetween(Short value1, Short value2) {
            addCriterion("purchase_limit not between", value1, value2, "purchaseLimit");
            return (Criteria) this;
        }

        public Criteria andLevelNumIsNull() {
            addCriterion("level_num is null");
            return (Criteria) this;
        }

        public Criteria andLevelNumIsNotNull() {
            addCriterion("level_num is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNumEqualTo(Short value) {
            addCriterion("level_num =", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumNotEqualTo(Short value) {
            addCriterion("level_num <>", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumGreaterThan(Short value) {
            addCriterion("level_num >", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumGreaterThanOrEqualTo(Short value) {
            addCriterion("level_num >=", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumLessThan(Short value) {
            addCriterion("level_num <", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumLessThanOrEqualTo(Short value) {
            addCriterion("level_num <=", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumIn(List<Short> values) {
            addCriterion("level_num in", values, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumNotIn(List<Short> values) {
            addCriterion("level_num not in", values, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumBetween(Short value1, Short value2) {
            addCriterion("level_num between", value1, value2, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumNotBetween(Short value1, Short value2) {
            addCriterion("level_num not between", value1, value2, "levelNum");
            return (Criteria) this;
        }

        public Criteria andCategorySequenceIsNull() {
            addCriterion("category_sequence is null");
            return (Criteria) this;
        }

        public Criteria andCategorySequenceIsNotNull() {
            addCriterion("category_sequence is not null");
            return (Criteria) this;
        }

        public Criteria andCategorySequenceEqualTo(Integer value) {
            addCriterion("category_sequence =", value, "categorySequence");
            return (Criteria) this;
        }

        public Criteria andCategorySequenceNotEqualTo(Integer value) {
            addCriterion("category_sequence <>", value, "categorySequence");
            return (Criteria) this;
        }

        public Criteria andCategorySequenceGreaterThan(Integer value) {
            addCriterion("category_sequence >", value, "categorySequence");
            return (Criteria) this;
        }

        public Criteria andCategorySequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_sequence >=", value, "categorySequence");
            return (Criteria) this;
        }

        public Criteria andCategorySequenceLessThan(Integer value) {
            addCriterion("category_sequence <", value, "categorySequence");
            return (Criteria) this;
        }

        public Criteria andCategorySequenceLessThanOrEqualTo(Integer value) {
            addCriterion("category_sequence <=", value, "categorySequence");
            return (Criteria) this;
        }

        public Criteria andCategorySequenceIn(List<Integer> values) {
            addCriterion("category_sequence in", values, "categorySequence");
            return (Criteria) this;
        }

        public Criteria andCategorySequenceNotIn(List<Integer> values) {
            addCriterion("category_sequence not in", values, "categorySequence");
            return (Criteria) this;
        }

        public Criteria andCategorySequenceBetween(Integer value1, Integer value2) {
            addCriterion("category_sequence between", value1, value2, "categorySequence");
            return (Criteria) this;
        }

        public Criteria andCategorySequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("category_sequence not between", value1, value2, "categorySequence");
            return (Criteria) this;
        }

        public Criteria andPublishChannelIsNull() {
            addCriterion("publish_channel is null");
            return (Criteria) this;
        }

        public Criteria andPublishChannelIsNotNull() {
            addCriterion("publish_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPublishChannelEqualTo(Short value) {
            addCriterion("publish_channel =", value, "publishChannel");
            return (Criteria) this;
        }

        public Criteria andPublishChannelNotEqualTo(Short value) {
            addCriterion("publish_channel <>", value, "publishChannel");
            return (Criteria) this;
        }

        public Criteria andPublishChannelGreaterThan(Short value) {
            addCriterion("publish_channel >", value, "publishChannel");
            return (Criteria) this;
        }

        public Criteria andPublishChannelGreaterThanOrEqualTo(Short value) {
            addCriterion("publish_channel >=", value, "publishChannel");
            return (Criteria) this;
        }

        public Criteria andPublishChannelLessThan(Short value) {
            addCriterion("publish_channel <", value, "publishChannel");
            return (Criteria) this;
        }

        public Criteria andPublishChannelLessThanOrEqualTo(Short value) {
            addCriterion("publish_channel <=", value, "publishChannel");
            return (Criteria) this;
        }

        public Criteria andPublishChannelIn(List<Short> values) {
            addCriterion("publish_channel in", values, "publishChannel");
            return (Criteria) this;
        }

        public Criteria andPublishChannelNotIn(List<Short> values) {
            addCriterion("publish_channel not in", values, "publishChannel");
            return (Criteria) this;
        }

        public Criteria andPublishChannelBetween(Short value1, Short value2) {
            addCriterion("publish_channel between", value1, value2, "publishChannel");
            return (Criteria) this;
        }

        public Criteria andPublishChannelNotBetween(Short value1, Short value2) {
            addCriterion("publish_channel not between", value1, value2, "publishChannel");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxIsNull() {
            addCriterion("create_by_member_idx is null");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxIsNotNull() {
            addCriterion("create_by_member_idx is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxEqualTo(Long value) {
            addCriterion("create_by_member_idx =", value, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxNotEqualTo(Long value) {
            addCriterion("create_by_member_idx <>", value, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxGreaterThan(Long value) {
            addCriterion("create_by_member_idx >", value, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by_member_idx >=", value, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxLessThan(Long value) {
            addCriterion("create_by_member_idx <", value, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxLessThanOrEqualTo(Long value) {
            addCriterion("create_by_member_idx <=", value, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxIn(List<Long> values) {
            addCriterion("create_by_member_idx in", values, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxNotIn(List<Long> values) {
            addCriterion("create_by_member_idx not in", values, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxBetween(Long value1, Long value2) {
            addCriterion("create_by_member_idx between", value1, value2, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxNotBetween(Long value1, Long value2) {
            addCriterion("create_by_member_idx not between", value1, value2, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxIsNull() {
            addCriterion("update_by_member_idx is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxIsNotNull() {
            addCriterion("update_by_member_idx is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxEqualTo(Long value) {
            addCriterion("update_by_member_idx =", value, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxNotEqualTo(Long value) {
            addCriterion("update_by_member_idx <>", value, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxGreaterThan(Long value) {
            addCriterion("update_by_member_idx >", value, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("update_by_member_idx >=", value, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxLessThan(Long value) {
            addCriterion("update_by_member_idx <", value, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxLessThanOrEqualTo(Long value) {
            addCriterion("update_by_member_idx <=", value, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxIn(List<Long> values) {
            addCriterion("update_by_member_idx in", values, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxNotIn(List<Long> values) {
            addCriterion("update_by_member_idx not in", values, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxBetween(Long value1, Long value2) {
            addCriterion("update_by_member_idx between", value1, value2, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxNotBetween(Long value1, Long value2) {
            addCriterion("update_by_member_idx not between", value1, value2, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andExtIsNull() {
            addCriterion("ext is null");
            return (Criteria) this;
        }

        public Criteria andExtIsNotNull() {
            addCriterion("ext is not null");
            return (Criteria) this;
        }

        public Criteria andExtEqualTo(String value) {
            addCriterion("ext =", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotEqualTo(String value) {
            addCriterion("ext <>", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThan(String value) {
            addCriterion("ext >", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThanOrEqualTo(String value) {
            addCriterion("ext >=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThan(String value) {
            addCriterion("ext <", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThanOrEqualTo(String value) {
            addCriterion("ext <=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLike(String value) {
            addCriterion("ext like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotLike(String value) {
            addCriterion("ext not like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtIn(List<String> values) {
            addCriterion("ext in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotIn(List<String> values) {
            addCriterion("ext not in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtBetween(String value1, String value2) {
            addCriterion("ext between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotBetween(String value1, String value2) {
            addCriterion("ext not between", value1, value2, "ext");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {
        private static final long serialVersionUID = 1L;

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        private static final long serialVersionUID = 1L;

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