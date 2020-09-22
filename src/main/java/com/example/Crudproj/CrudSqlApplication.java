package com.example.Crudproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
@EnableSwagger2
@EnableJpaRepositories(basePackages="service,repository,controller")
@EntityScan(basePackages="service,repository,controller")
@SpringBootApplication
public class CrudSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSqlApplication.class, args);
	}

}
