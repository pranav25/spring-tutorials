package net.spring.launch;

import net.spring.domain.chapter2.beanlife.Chapter2;
import net.spring.domain.chapter2.beanlife.Chapter2Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Chapter2Launcher {
	public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Chapter2Config.class);
	
	Chapter2 chapter2=ctx.getBean(Chapter2.class);
	chapter2.setName("Lesson2");
	System.out.println(" Chapter2  ::"+chapter2.getName());
	}
}
