package com.student.examination;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication/*(scanBasePackages= {"com.student.examples","com.student.example.exam"})*/
/*@EnableJpaRepositories(basePackages = "com.student.examination", 
repositoryBaseClass = ExaminationRepositoryImpl.class)*/
public class ExaminationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(ExaminationApplication.class, args);
		for (String string1 : context.getBeanDefinitionNames()) {
			System.out.println("String 1:"+string1);
		}
		//System.out.println(context.getEffectiveMajorVersion());
	}

}

