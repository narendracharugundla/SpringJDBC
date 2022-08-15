package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.yaml")
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		//System.setProperty("classpath", "custom.properties");
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public HelloService getHelloService(){
		return   (HelloService) new DefaultHelloService();
	}

	public void run(String... args) throws Exception {
		getHelloService().hello();
	}

}
