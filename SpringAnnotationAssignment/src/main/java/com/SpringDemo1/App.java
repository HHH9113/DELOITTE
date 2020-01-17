package com.SpringDemo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */

@Configuration
public class App {

	@Bean
	public Body getBody() {
		return new Body();

	}

	@Bean
	public Email getEmail() {

		return new Email();

	}

	@Bean
	public To getTo() {

		return new To();

	}

	@Bean
	public From getFrom() {

		return new From();

	}

	@Bean
	public Subject getSubject() {

		return new Subject();

	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
