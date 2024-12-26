package com.sistemas.karnaval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class KarnavalAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarnavalAdminServerApplication.class, args);
	}

}
