package net.spring.launch;

import net.spring.domain.chapter2.beanlife.Chapter2;
import net.spring.domain.chapter2.beanlife.Chapter2Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Chapter2ScopeLauncher {
	public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Chapter2Config.class);
	
	Chapter2 chapter2=ctx.getBean(Chapter2.class);
	chapter2.setName("Lesson2");
	System.out.println(" Chapter2  ::"+chapter2+": Name:"+chapter2.getName());
	
	Chapter2 chapter02=ctx.getBean(Chapter2.class);
	
	System.out.println(" Chapter2  ::"+chapter02+": Name:"+chapter02.getName());
	}
}
