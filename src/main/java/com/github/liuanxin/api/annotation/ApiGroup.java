package com.github.liuanxin.api.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiGroup {

    /** @return module name. for example: name-comment */
    String[] value();

    /** @return more forward when smaller */
    int index() default Integer.MAX_VALUE;
}
