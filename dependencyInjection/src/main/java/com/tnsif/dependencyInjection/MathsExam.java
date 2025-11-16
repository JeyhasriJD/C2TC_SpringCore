package com.tnsif.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MathsExam {
	
public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		
		//setter injection
		Student Mohan=con.getBean("Mohan",Student.class);
		Student Gowtham=con.getBean("Gowtham",Student.class);
		
		Mohan.showInfo();
		Gowtham.showInfo();
		
		//Constructor injection
		Student1 Gokul=con.getBean("Gokul",Student1.class);
		Student1 Irfan=con.getBean("Irfan",Student1.class);
		
		Gokul.showInfo();
		Irfan.showInfo();
		
	}

}
