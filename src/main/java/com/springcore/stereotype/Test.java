package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
//		creating our own reference for the Bean
		
//		Student student1 = context.getBean("stud",Student.class);
//		System.out.println(student);
		
		
		
//		very important to note that created bean references in camelcasing
		Student student = context.getBean("student",Student.class);
//		System.out.println(student);
//		System.out.println(student.getAddresses());
//		System.out.println(student.getAddresses().getClass().getName());
		
//		System.out.println(student.hashCode());
		
		Student student2 = context.getBean("student",Student.class);
//		System.out.println(student2.hashCode()); // by default Singleton
		
		
		Teacher teacher1 = context.getBean("teacher", Teacher.class);
		Teacher teacher2 = context.getBean("teacher", Teacher.class);
		
		System.out.println(teacher1.hashCode());
		System.out.println(teacher2.hashCode());
		
		
		

	}

}
