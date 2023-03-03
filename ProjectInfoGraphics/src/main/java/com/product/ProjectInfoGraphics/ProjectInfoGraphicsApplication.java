package com.product.ProjectInfoGraphics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.product.ProjectInfoGraphics.controller")
public class ProjectInfoGraphicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectInfoGraphicsApplication.class, args);
	}

}