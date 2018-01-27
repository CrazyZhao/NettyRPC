package com.zbl.nettyrpc.utils;

import java.math.BigDecimal;

/**
 * BigDecimal包装类
 */
public final class BigDecimalWrapper {

    private static final int ZERO = 0;
    private final BigDecimal bigDecimal;

    BigDecimalWrapper(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    /**
     * bigdecimal等于
     * @param decimal
     * @return
     */
    public boolean eq(BigDecimal decimal) {
        return bigDecimal.compareTo(decimal) == ZERO;
    }

    /**
     * double 等于
     * @param decimal
     * @return
     */
    public boolean eq(double decimal) {
        return eq(BigDecimal.valueOf(decimal));
    }

    /**
     * bigdecimal 大于
     * @param decimal
     * @return
     */
    public boolean gt(BigDecimal decimal) {
        return bigDecimal.compareTo(decimal) > ZERO;
    }

    /**
     * double 大于
     * @param decimal
     * @return
     */
    public boolean gt(double decimal) {
        return gt(BigDecimal.valueOf(decimal));
    }

    /**
     * bigdecimal 大于等于
     * @param decimal
     * @return
     */
    public boolean gte(BigDecimal decimal) {
        return bigDecimal.compareTo(decimal) >= ZERO;
    }

    /**
     * double大于等于
     * @param decimal
     * @return
     */
    public boolean gte(double decimal) {
        return gte(BigDecimal.valueOf(decimal));
    }

    /**
     * bigdecimal小于
     * @param decimal
     * @return
     */
    public boolean lt(BigDecimal decimal) {
        return bigDecimal.compareTo(decimal) < ZERO;
    }

    /**
     * double小于
     * @param decimal
     * @return
     */
    public boolean lt(double decimal) {
        return lt(BigDecimal.valueOf(decimal));
    }

    /**
     * bigdecimal小于等于
     * @param decimal
     * @return
     */
    public boolean lte(BigDecimal decimal) {
        return bigDecimal.compareTo(decimal) <= ZERO;
    }

    /**
     * double小于等于
     * @param decimal
     * @return
     */
    public boolean lte(double decimal) {
        return lte(BigDecimal.valueOf(decimal));
    }

    /**
     * bigdecimal不等于
     * @param decimal
     * @return
     */
    public boolean notEq(BigDecimal decimal) {
        return !eq(decimal);
    }

    /**
     * double不等于
     * @param decimal
     * @return
     */
    public boolean notEq(double decimal) {
        return !eq(decimal);
    }

    /**
     * bigdecimal不大于
     * @param decimal
     * @return
     */
    public boolean notGt(BigDecimal decimal) {
        return !gt(decimal);
    }

    /**
     * double不大于
     * @param decimal
     * @return
     */
    public boolean notGt(double decimal) {
        return !gt(decimal);
    }

    /**
     * bigdecimal不大于等于
     * @param decimal
     * @return
     */
    public boolean notGte(BigDecimal decimal) {
        return !gte(decimal);
    }

    /**
     * double不大于等于
     * @param decimal
     * @return
     */
    public boolean notGte(double decimal) {
        return !gte(decimal);
    }

    /**
     * bigdecimal不小于
     * @param decimal
     * @return
     */
    public boolean notLt(BigDecimal decimal) {
        return !lt(decimal);
    }

    /**
     * double不小于
     * @param decimal
     * @return
     */
    public boolean notLt(double decimal) {
        return !lt(decimal);
    }

    /**
     * bigdecimal 不小于等于
     * @param decimal
     * @return
     */
    public boolean notLte(BigDecimal decimal) {
        return !lte(decimal);
    }

    /**
     * double不小于等于
     * @param decimal
     * @return
     */
    public boolean notLte(double decimal) {
        return !lte(decimal);
    }

    /**
     * 是否为正数
     * @return
     */
    public boolean isPositive() {
        return gt(ZERO);
    }

    /**
     * 是否为负数
     * @return
     */
    public boolean isNegative() {
        return lt(ZERO);
    }

    /**
     * 是否小于等于0
     * @return
     */
    public boolean isNonPositive() {
        return lte(ZERO);
    }

    /**
     * 是否大于等于0
     * @return
     */
    public boolean isNonNegative() {
        return gte(ZERO);
    }

    /**
     * 是否等于0
     * @return
     */
    public boolean isZero() {
        return eq(ZERO);
    }

    /**
     * 是否不等于0
     * @return
     */
    public boolean isNotZero() {
        return notEq(ZERO);
    }

    /**
     * 是否为null或0
     * @return
     */
    public boolean isNullOrZero() {
        return bigDecimal == null || isZero();
    }

    /**
     * 是否不等于null或0
     * @return
     */
    public boolean notNullOrZero() {
        return bigDecimal != null && isNotZero();
    }



}