package net.spring.tutorial;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"net.spring.domain","net.spring.service"})
public class AppConfig {

	
}
