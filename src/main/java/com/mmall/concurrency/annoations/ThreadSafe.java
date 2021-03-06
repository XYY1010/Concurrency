package com.mmall.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author XYY
 * @date 2019-04-22 22:05
 * 课程里用来标记【线程安全】的类或者写法
 */
@Target(ElementType.TYPE)       // 作用目标
@Retention(RetentionPolicy.SOURCE)                    // 注解存在的范围
public @interface ThreadSafe {
    String value() default "";
}
