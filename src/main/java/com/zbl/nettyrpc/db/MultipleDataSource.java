package com.zbl.nettyrpc.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by jdd on 2018/3/15.
 */
public class MultipleDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        Object key = DataSourceContext.getCustomerType();
        if (key != null) {
            logger.debug("当前线程使用的数据源标识为 [ " + key.toString() + " ].");
        }
        return key;
    }
}
