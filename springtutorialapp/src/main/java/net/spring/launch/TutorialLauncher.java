package net.spring.launch;

import net.spring.service.TutorialService;
import net.spring.tutorial.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialLauncher {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		TutorialService ts = ctx.getBean(TutorialService.class);
		System.out.println(ts.getChapterDetails());
	}

}
