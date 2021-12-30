package com.estudoapiexterna.consumoapi;

import com.estudoapiexterna.consumoapi.repository.CustomRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomRepositoryImpl.class)
@EnableFeignClients
public class ConsumoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoapiApplication.class, args);
	}

}
