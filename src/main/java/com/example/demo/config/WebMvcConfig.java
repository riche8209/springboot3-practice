package com.example.demo.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
//		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**")
		.addResourceLocations("classpath:/templates/", "classpath:/static/")
		.setCacheControl(CacheControl.maxAge(10,TimeUnit.MINUTES));
	}

	
	
}
