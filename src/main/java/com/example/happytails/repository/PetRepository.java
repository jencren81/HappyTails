package com.example.happytails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.happytails.model.Pets;

public interface PetRepository extends JpaRepository<Pets, Integer>{

}
