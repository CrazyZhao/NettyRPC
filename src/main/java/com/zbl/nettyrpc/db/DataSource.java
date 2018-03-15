package com.zbl.nettyrpc.db;

import java.lang.annotation.*;

/**
 * Created by jdd on 2018/3/15.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default DataSource.DATA_SOURCE_WRITE;
    String DATA_SOURCE_READ = "dataSourceRead";
    String DATA_SOURCE_WRITE = "dataSourceWrite";
}
