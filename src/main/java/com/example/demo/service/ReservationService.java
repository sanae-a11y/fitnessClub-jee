package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Reservation; 
import com.example.demo.repository.ReservationRepository;

@Transactional
@Service
public class ReservationService {
	@Autowired
	private ReservationRepository repo;

	
	public List<Reservation> listAll() {
		 
		return  repo.findAll();
	}


	public void save(Reservation  reservation) {
		repo.save(reservation);
		
	}


	public Reservation get(int id) {
		Reservation reservation = repo.getById(id);
		return reservation;
	}


	public ResponseEntity<String> delete(int id) {
		 repo.deleteById(id);
		  return new ResponseEntity<>("All Adherents have been deleted!", HttpStatus.OK);
	
		 
		
	}

}
