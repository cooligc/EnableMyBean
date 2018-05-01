/**
 * 
 */
package com.skc.enableanno.annotation;

import org.springframework.context.annotation.Bean;

/**
 * @author sitakant
 *
 */
public class EnableMyBeanConfiguration {

	@Bean
	public MyBean message(){
		MyBean myBean = new MyBean();
		myBean.setName("sitakant.info");
		myBean.setGreeting("says hello");
		return myBean;
	}
	
}
