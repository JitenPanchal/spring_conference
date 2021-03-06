package com.pluralsight.conference;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConferenceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ConferenceApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ConferenceApplication.class);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}