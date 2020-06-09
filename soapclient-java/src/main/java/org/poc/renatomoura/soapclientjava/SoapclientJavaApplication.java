package org.poc.renatomoura.soapclientjava;

import org.poc.renatomoura.wsdl.GetCountryResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SoapclientJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapclientJavaApplication.class, args);
	}
}
