package com.springcore.javaremovexml;

import org.springframework.stereotype.Component;

//@Component
public class Student {

	private Samosa samosa;

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void study() {
		this.samosa.display();
		System.out.println("Im Studying");
	}

	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}

}
