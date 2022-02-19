package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

 
import com.example.demo.entity.Commentaire;
import com.example.demo.repository.ComentaireRepository;

@Transactional
@Service
public class CommentaireService {
	
	@Autowired
	private ComentaireRepository repo;
	
	
	public List<Commentaire> listAll() {
		 
		return  repo.findAll();
	}


	public void save(Commentaire commentaire) {
		 repo.save(commentaire);
		
	}


	public ResponseEntity<String> delete(int id) {
		 repo.deleteById(id);
		  return new ResponseEntity<>("All Adherents have been deleted!", HttpStatus.OK);
	}

}
