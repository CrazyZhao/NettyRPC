package com.zbl.nettyrpc.utils;

import java.math.BigDecimal;

/**
 * Created by jdd on 2018/1/25.
 */
public class BigDecimalUtils {

    private BigDecimalUtils() {
    }

    /**
     * @param decimal
     * @return
     */
    public static BigDecimalWrapper is(BigDecimal decimal) {

        return new BigDecimalWrapper(decimal);
    }

    /**
     * @param dbl
     * @return
     */
    public static BigDecimalWrapper is(double dbl) {
        return is(BigDecimal.valueOf(dbl));
    }

    /**
     * 金额除法计算，返回2位小数
     *
     * @param b1
     * @param b2
     * @return
     */
    public static <T extends Number> BigDecimal safeDivide(T b1, T b2) {
        return safeDivide(b1, b2, BigDecimal.ZERO);
    }

    /**
     * BigDecimal的除法运算封装，如果除数或者被除数为0，返回默认值
     *
     * @param b1
     * @param b2
     * @param defaultValue
     * @param <T>
     * @return
     */
    public static <T extends Number> BigDecimal safeDivide(T b1, T b2, BigDecimal defaultValue) {
        if (null == b1 || null == b2) {
            return defaultValue;
        }
        try {
            return BigDecimal.valueOf(b1.doubleValue()).divide(BigDecimal.valueOf(b2.doubleValue()), 2, BigDecimal.ROUND_HALF_UP);
        } catch (Exception e) {
            return defaultValue;
        }
    }
}
