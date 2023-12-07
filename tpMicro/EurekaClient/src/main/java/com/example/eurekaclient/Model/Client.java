package com.example.eurekaclient.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Client {

   
	
	public Client(Long id, String nom, Float age) {
		super();
		this.id = id;
		this.nom = nom;
		this.age = age;
	}
	@Id
    @GeneratedValue
    private Long id;
    private String nom;
    private Float age;

}
