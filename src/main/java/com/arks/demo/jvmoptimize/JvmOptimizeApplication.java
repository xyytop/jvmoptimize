package com.arks.demo.jvmoptimize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JvmOptimizeApplication extends SpringBootServletInitializer{ 

	public static void main(String[] args) {
		SpringApplication.run(JvmOptimizeApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JvmOptimizeApplication.class);
    }
}









