package com.yossboss.learnTheBooty;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class LearnTheBootyApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearnTheBootyApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
            System.out.println("Let's inspect your pathetic code.");
            String[] beanNames = ctx.getBeanDefinitionNames();

            Arrays.stream(beanNames).sorted().forEach(e->{
                System.out.println(e);
            });
        };
	}
}
