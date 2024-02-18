package com.example.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.accounts.dto.AccountsContactInfoDto;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableFeignClients
@Configuration
@ComponentScan(value = "com.example.accounts")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info =@Info(
				title = "Accounts microservice REST API Documentation",
				description = "ING Bank Accounts microservice REST API Documentation",
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
				url = "https://www.linkedin.com/in/madhu--s"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
