package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Adherent;
import com.example.demo.entity.Reservation;
import com.example.demo.repository.AdherentRepository;

@Transactional
@Service
public class AdherentService {
	@Autowired
	private AdherentRepository repo;

	
	public List<Adherent> listAll() {
		 
		return  repo.findAll();
	}


	public void save(Adherent adherent) {
		repo.save(adherent);
		
	}


	public Adherent get(int id) {
		Adherent adherent = repo.getById(id);
		return adherent;
	}


	public ResponseEntity<String> delete(int id) {
		 repo.deleteById(id);
		  return new ResponseEntity<>("All Adherents have been deleted!", HttpStatus.OK);
	
		 
		
	}


	 
}
