package br.com.cepservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CepServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CepServiceApplication.class, args);
	}

}
