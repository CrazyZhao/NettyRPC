package com.zbl.nettyrpc.db;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;

import java.lang.reflect.Method;

/**
 * Created by jdd on 2018/3/15.
 */
public class DsExchange implements MethodBeforeAdvice, AfterReturningAdvice {

    private final static String USER_ID = "userId";
    private final static String ORDER_NO = "schemeId";
    private final static String TICKET_NO = "ticketNo";
    private final static String PAY_SERIAL_NO = "paySerialNo";

    public void afterReturning(Object o, Method method, Object[] args, Object target) throws Throwable {
        DataSourceContext.clearCustomerType();
    }

    public void before(Method method, Object[] args, Object target) throws Throwable {
        //这里DataSource是自定义的注解，不是java里的DataSource接口
        if (method.isAnnotationPresent(DataSource.class)) {
            DataSource datasource = method.getAnnotation(DataSource.class);
            String shard = "";
            Object userId = getValueByParmName(USER_ID, method, args);
            Object schemeId = getValueByParmName(ORDER_NO, method, args);
            Object ticketNo = getValueByParmName(TICKET_NO, method, args);
            Object paySerialNo = getValueByParmName(PAY_SERIAL_NO, method, args);
            if (userId != null) {
                shard = getShardByUserId((Long) userId);
            } else if (schemeId != null) {
                shard = getShardByOrderNo(schemeId.toString());
            } else if (ticketNo != null) {
                shard = getShardByTicketNo(ticketNo.toString());
            } else if (paySerialNo != null) {
                shard = getShardByPayNo(paySerialNo.toString());
            }
            String datasourceName = datasource.name() + shard;
            DataSourceContext.setCustomerType(datasourceName);
        }
    }

    private Object getValueByParmName(String name, Method method, Object[] args) {
        ParameterNameDiscoverer parameterNameDiscoverer = new LocalVariableTableParameterNameDiscoverer();
        try {
            String[] parameterNames = parameterNameDiscoverer.getParameterNames(method);
            for (int i = 0; i < parameterNames.length; i++) {
                if (parameterNames[i].equals(name)) {
                    return args[i];
                }
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    private String getShardByUserId(Long userId) {
        try {
            Long y = userId % 1000;
            if (y < 100) {
                return "0";
            }
            return String.valueOf(y).substring(0, 1);
        } catch (Exception e) {
        }
        return "";
    }

    /**
     * schemeId的倒数第三位
     * @param schemeId
     * @return
     */
    private String getShardByOrderNo(String schemeId) {
        try {
            long l = Long.parseLong(schemeId);
            return String.valueOf((l/100)%10);
        } catch (Exception e) {
        }
        return "";
    }

    private String getShardByTicketNo(String ticketNo) {
        try {
            return ticketNo.substring(26, 27);
        } catch (Exception e) {
        }
        return "";
    }

    private String getShardByPayNo(String paySerialNo) {
        try {
            return paySerialNo.substring(21, 22);
        } catch (Exception e) {
        }
        return "";
    }
}
