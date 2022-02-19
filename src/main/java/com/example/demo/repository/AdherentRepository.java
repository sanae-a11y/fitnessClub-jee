package com.example.demo.repository;

 
 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Adherent;

@Repository
public interface AdherentRepository extends JpaRepository<Adherent,Integer>{

//	Optional<Adherent> findByNom(String nom);

}