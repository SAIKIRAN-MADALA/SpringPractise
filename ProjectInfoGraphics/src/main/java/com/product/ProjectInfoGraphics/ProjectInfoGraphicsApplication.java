package com.product.ProjectInfoGraphics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.product.ProjectInfoGraphics.controller")
@ComponentScan(basePackages = "com.product.ProjectInfoGraphics.model")
@ComponentScan(basePackages = "com.product.ProjectInfoGraphics.entity")
@ComponentScan(basePackages = "com.product.ProjectInfoGraphics.service")
@ComponentScan(basePackages = "com.product.ProjectInfoGraphics.repository")
public class ProjectInfoGraphicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectInfoGraphicsApplication.class, args);
	}

}