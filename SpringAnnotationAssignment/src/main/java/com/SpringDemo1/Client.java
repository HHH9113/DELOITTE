package com.SpringDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(App.class);
		Email email= context.getBean(Email.class);
		From from = context.getBean(From.class);
		from.setFromEmail("hhhmail.kh@gmail.com");
		To to = context.getBean(To.class);
		to.setToName("Bhawna");
		to.setToEmail("bhawnarajput@gmail.com");
		
		Subject subject=context.getBean(Subject.class);
		subject.setCaption("hii hello");
		
	Body body= context.getBean(Body.class);
	body.setMessage("hello");
	
	
	email.setTo(to);
	email.setFrom(from);
	
	email.setBody(body);
	email.setSubject(subject);
	
	System.out.println(email);
	}
	
	
}
