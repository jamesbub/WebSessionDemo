package com.biswajeet.websessiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@ComponentScan("com.biswajeet.websessiondemo")
public class WebApplication extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebApplication.class);
    }
	
	public static void main(String[] args) throws Exception {
System.out.println(System.getProperty("java.class.path"));
		SpringApplication.run(WebApplication.class, args);
    }
	
}
