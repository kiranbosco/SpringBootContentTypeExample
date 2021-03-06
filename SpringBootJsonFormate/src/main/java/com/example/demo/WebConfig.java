package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{
	
	public void configureContentNegotion(ContentNegotiationConfigurer configure) {
		
		configure.favorPathExtension(true)
		.favorParameter(false)
		.ignoreAcceptHeader(true)
		.defaultContentType(MediaType.APPLICATION_JSON)
		.mediaType("xml",MediaType.APPLICATION_XML)
		.mediaType("json", MediaType.APPLICATION_JSON);

	}
	


}
