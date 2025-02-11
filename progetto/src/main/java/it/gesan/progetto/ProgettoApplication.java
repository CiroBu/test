package it.gesan.progetto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProgettoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgettoApplication.class, args);
	}

}
