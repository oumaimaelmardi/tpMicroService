package com.example.eurekaclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.eurekaclient.Model.Client;
import com.example.eurekaclient.Repository.ClientRepository;



@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(EurekaClientApplication.class, args);


	}
	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository cr){
		return args ->{
			
			cr.save(new Client(Long.parseLong("1"),"Oumaima elmardi",Float.parseFloat("11")));
			cr.save(new Client(Long.parseLong("2"),"boutata imane",Float.parseFloat("12")));
			cr.save(new Client(Long.parseLong("3"),"malouli yahya",Float.parseFloat("13")));
		};
	}

}
