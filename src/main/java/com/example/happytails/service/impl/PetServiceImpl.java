package com.example.happytails.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.happytails.model.Pets;
import com.example.happytails.repository.PetRepository;
import com.example.happytails.service.PetService;

@Service
public class PetServiceImpl implements PetService {

	private PetRepository petRepository;
	
	public PetServiceImpl(PetRepository petRepository) {
		super();
		this.petRepository = petRepository;
	}
	
	@Override
	public List<Pets> getAllPets(){
		return petRepository.findAll();
	}
	
	@Override
	public Pets savePet(Pets pet) {
		return petRepository.save(pet);
	}
	
	@Override
	public Pets getPetById(int id) {
		return petRepository.findById(id).get();
	}
	
	@Override
	public Pets updatePet(Pets pet) {
		return petRepository.save(pet);
	}
	
	@Override
	public void deletePetById(int id) {
		petRepository.deleteById(id);
		
	}
}
