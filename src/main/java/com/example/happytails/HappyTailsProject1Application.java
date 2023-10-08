package com.example.happytails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.happytails.repository.PetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class HappyTailsProject1Application {

	public static void main(String[] args) {
		
		SpringApplication.run(HappyTailsProject1Application.class, args);
	}
		@Autowired 
		private PetRepository petRepository;
		
		public void run(String...args) throws Exception{
			
		
		
		
		
	}
}
