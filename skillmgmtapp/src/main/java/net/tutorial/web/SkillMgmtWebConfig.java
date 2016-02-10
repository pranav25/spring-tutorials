package net.tutorial.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@ComponentScan(basePackages={"net.tutorial"})
@EnableWebMvc
@Configuration
public class SkillMgmtWebConfig extends WebMvcConfigurerAdapter {

	
}
