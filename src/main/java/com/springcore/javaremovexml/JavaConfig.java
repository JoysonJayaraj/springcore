package com.springcore.javaremovexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaremovexml") // not required if we use @Bean
public class JavaConfig {

	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"student","temp","con"})
	public Student getStudent() {
		// creating a new student bean
		Student student = new Student(getSamosa());
		return student;
	}

}
