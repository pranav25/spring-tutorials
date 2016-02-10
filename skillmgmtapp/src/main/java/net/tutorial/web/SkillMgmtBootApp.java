package net.tutorial.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import ({SkillMgmtWebConfig.class})
public class SkillMgmtBootApp extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(SkillMgmtBootApp.class, args);
	}
	

}
