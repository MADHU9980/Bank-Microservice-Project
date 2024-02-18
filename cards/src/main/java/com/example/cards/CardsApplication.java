package com.example.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.cards.dto.CardsContactInfoDto;
import com.example.cards.service.ICardsService;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableDiscoveryClient
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@ComponentScan(value = "com.example.cards")
//@PropertySource("classpath:application.properties")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "ING BankBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Madhu S",
						email = "madhuss923@gmail.com",
						url = "https://www.linkedin.com/in/madhu--s"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.linkedin.com/in/madhu--s"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "ING Bank Cards microservice REST API Documentation",
				url = "https://www.linkedin.com/in/madhu--s"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}