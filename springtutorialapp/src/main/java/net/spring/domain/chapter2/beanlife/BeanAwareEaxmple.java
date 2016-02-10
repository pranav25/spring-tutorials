package net.spring.domain.chapter2.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component
public class BeanAwareEaxmple implements BeanNameAware,BeanFactoryAware,ApplicationContextAware {

	@Override
	public void setBeanName(String name) {
		System.out.println(" Setting the  bean as listener My Ben name  is ::"+name);
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(" Set Bean Fcatory called "+beanFactory);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(" Application Context -Application Name:: "+applicationContext.getDisplayName());
		
	}

}
