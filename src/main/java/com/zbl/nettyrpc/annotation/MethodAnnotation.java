package com.zbl.nettyrpc.annotation;

import java.lang.annotation.*;

/**
 * Created by jdd on 2017/10/11.
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodAnnotation {

    String desc() default "method1";
}
