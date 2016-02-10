package net.spring.domain;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Chapter1 implements InitializingBean {

	public String getName() {
		return "SpringBasics";
	}
	
	public String getDescription() {
		return "SpringBasics This is Chapter 1";
	}
	
	@PostConstruct
	  public void postConstruct() {
  System.out.println(" My instance exists  now "+this.getDescription());
	    }
	
	@PreDestroy
	  public void preDestroy() {
System.out.println(" This instance is about to be destroyed "+this.getDescription());
	    }

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" After  propertiesset method");
		
	}
}
