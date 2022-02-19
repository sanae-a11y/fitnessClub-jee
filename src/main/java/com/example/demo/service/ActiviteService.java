package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Activite;
 
import com.example.demo.repository.ActiviteRepository;
 

@Transactional
@Service
public class ActiviteService {
	
	@Autowired
	private ActiviteRepository repo;

	
	public List<Activite> listAll() {
		 
		return  repo.findAll();
	}


	public Activite get(int id) {
		 return repo.getById(id);
	}
	

}
