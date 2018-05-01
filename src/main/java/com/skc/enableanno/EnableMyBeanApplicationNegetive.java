package com.skc.enableanno;

import org.springframework.beans.BeansException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.skc.enableanno.annotation.MyBean;

@SpringBootApplication
public class EnableMyBeanApplicationNegetive implements ApplicationRunner,ApplicationContextAware{

	private ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		SpringApplication.run(EnableMyBeanApplicationNegetive.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		MyBean bean = applicationContext.getBean(MyBean.class);
		
		System.out.println(bean);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	
}
