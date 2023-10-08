package com.example.happytails.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.happytails.model.Pets;
import com.example.happytails.model.Users;
import com.example.happytails.service.PetService;


import jakarta.servlet.http.HttpServletResponse;

import com.example.happytails.service.*;



@Controller
public class PetController {
	
	private PetService petService;
	private UserService userService;
	
	public PetController(PetService petService, UserService userService) {
		super();
		this.petService = petService;
		this.userService = userService;
	}

	
	
	@GetMapping("/login")
    public String loginForm() {
        return "login"; // Return the "login" template for GET requests
    }
	
	@PostMapping("/login")
    //public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
	public String loginUser(@ModelAttribute Users user, HttpServletResponse response) throws IOException {
	if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword())!=null) {
		response.sendRedirect("pets");
	}else {
		response.sendRedirect("errorpage");;
	}
	return null;
	}
	
	
	@GetMapping("/pets")
	public String listPets(Model model) {
		model.addAttribute("pets", petService.getAllPets());
		return "pets";
	
	}

	@GetMapping("/pets/new")
	public String registPetForm(Model model) {
		Pets pet = new Pets();
		model.addAttribute("pet", pet);
		return "Register";
	}
	
	@PostMapping("/pets")
	public String savePet(@ModelAttribute("pet") Pets pet) {
		petService.savePet(pet);
		return "redirect:/pets";
	}
	
	@GetMapping("/pets/edit/{id}")
	public String editPetForm(@PathVariable int id, Model model) {
		model.addAttribute("pet", petService.getPetById(id));
		return "edit_pet";
	}
	
	@PostMapping("/pets/{id}")
	public String updatePet(@PathVariable int id, @ModelAttribute("pet") Pets pet, Model model) {
		Pets existingPet = petService.getPetById(id);
		existingPet.setId(id);
		existingPet.setName(pet.getName());
		existingPet.setBreed(pet.getBreed());
		existingPet.setShots(pet.getShots());
		existingPet.setOwner(pet.getOwner());
		existingPet.setAddress(pet.getAddress());
		existingPet.setPhone(pet.getPhone());
		existingPet.setEmail(pet.getEmail());
		
		petService.updatePet(existingPet);
		return "redirect:/pets";
		
	}
	
	@GetMapping("/pets/{id}")
	public String deletePet(@PathVariable int id) {
		petService.deletePetById(id);
		return "redirect:/pets";
		}
}
