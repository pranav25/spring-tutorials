package net.spring.launch;

import net.spring.domain.chapter2.beanlife.BeanAwareEaxmple;
import net.spring.domain.chapter2.beanlife.Chapter2Config;
import net.spring.service.TutorialService;
import net.spring.tutorial.AppConfig;




import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialLauncher {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class,Chapter2Config.class);
		TutorialService ts1 = ctx.getBean(TutorialService.class);
		System.out.println(" ts1 chapter hashcode::"+ts1.getChapter().hashCode());
		TutorialService ts2 = ctx.getBean(TutorialService.class);
		System.out.println(" ts2 chapter hashcode::"+ts2.getChapter().hashCode());
		System.out.println(" TS1::"+ts1.hashCode());
		System.out.println(" TS2::"+ts2.hashCode());
//		System.out.println(ts.getChapterDetails());
//		ctx.registerShutdownHook();
		//BeanAwareEaxmple ba=ctx.getBean(BeanAwareEaxmple.class);
		//System.out.println(" Example::"+ba.toString());
		
	}

}
