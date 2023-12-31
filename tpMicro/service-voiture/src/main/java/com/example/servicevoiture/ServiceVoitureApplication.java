package com.example.servicevoiture;

import com.example.servicevoiture.Model.Client;
import com.example.servicevoiture.Model.Voiture;
import com.example.servicevoiture.Repository.ClientRepository;
import com.example.servicevoiture.Repository.VoitureRepository;
import com.example.servicevoiture.ClientService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceVoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceVoitureApplication.class, args);
	}
	@Bean
	CommandLineRunner initialiserBaseH2(VoitureRepository voitureRepository, ClientService clientService) {

		return args -> {
			Client c1 = clientService.clientById(2L);
			Client c2 = clientService.clientById(1L);
			System.out.println("**************************");
			System.out.println("Id est :" + c2.getId());
			System.out.println("Nom est :" + c2.getNom());
			System.out.println("**************************");
			System.out.println("**************************");
			System.out.println("Id est :" + c1.getId());
			System.out.println("Nom est :" + c1.getNom());
			System.out.println("Nom est :" + c1.getAge());
			System.out.println("**************************");
			voitureRepository.save(new Voiture(Long.parseLong("1"), "Mercedes", "123", "class A", 1L, c2));
			voitureRepository.save(new Voiture(Long.parseLong("2"), "Fiat", "3456", "500", 1L, c2));
			voitureRepository.save(new Voiture(Long.parseLong("3"), "Porshe", "555", "201", 2L, c1));
		};
	}


}
