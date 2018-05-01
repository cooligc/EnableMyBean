/**
 * 
 */
package com.skc.enableanno.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

/**
 * @author sitakant
 *
 */
@Retention(RUNTIME)
@Target(TYPE)
@Import(EnableMyBeanConfiguration.class)
public @interface EnableMyBean {
	
}
