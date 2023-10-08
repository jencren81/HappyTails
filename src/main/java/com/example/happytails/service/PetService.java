package com.example.happytails.service;

import java.util.List;

import com.example.happytails.model.Pets;

public interface PetService {
	List<Pets> getAllPets();
	
	Pets savePet(Pets pet);
	
	Pets getPetById(int id);
	
	Pets updatePet(Pets pet);
	
	void deletePetById(int id);

}
