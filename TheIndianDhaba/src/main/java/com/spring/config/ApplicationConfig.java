package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

//Use appropriate annotation 
@Configuration
@ComponentScan("com")
@PropertySource("restaurantDetails.properties")
public class ApplicationConfig {

}
