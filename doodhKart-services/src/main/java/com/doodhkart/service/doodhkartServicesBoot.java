package com.doodhkart.service;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableAutoConfiguration(exclude= {
		SecurityAutoConfiguration.class,
		DataSourceAutoConfiguration.class,
		ErrorMvcAutoConfiguration.class
})
public class doodhkartServicesBoot extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return configureApplication(builder);
	}
	
	private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
		return builder.sources(doodhkartServicesBoot.class).bannerMode(Banner.Mode.OFF);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(doodhkartServicesBoot.class, args);
	}

}
