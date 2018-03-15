package com.zbl.nettyrpc.db;

/**
 * Created by jdd on 2018/3/15.
 */
public class DataSourceContext {

    public final static String DATA_SOURCE_READ = "dataSourceRead";

    public final static String DATA_SOURCE_WRITE = "dataSourceWrite";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setCustomerType(String customerType) {
        contextHolder.set(customerType);
    }

    public static String getCustomerType() {
        return contextHolder.get();
    }

    public static void clearCustomerType() {
        contextHolder.remove();
    }
    public static void setCustomerTypeByNo(String datasource,String shardNo) {
        String shard=datasource+shardNo;
        contextHolder.set(shard);
    }
}
