package com.ac1dtest.coinwidget.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.ac1dtest.coinwidget.model")
public class SpringConfig {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
