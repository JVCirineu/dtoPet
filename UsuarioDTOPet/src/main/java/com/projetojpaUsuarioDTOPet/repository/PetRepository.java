package com.projetojpaUsuarioDTOPet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpaUsuarioDTOPet.entities.Pet;

public interface PetRepository extends JpaRepository <Pet, Long>{

}
