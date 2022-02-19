package com.example.demo.entity;
 
 


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
import javax.persistence.OneToMany;
import javax.persistence.Table;

 

 
 
@Entity
@Table(name = "Adherent")

public class Adherent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_adherant;
	 
	private String nom ;
 
	private String prenom;
	 
	private String password;
	 
	private String sexe;
	
//	@OneToMany(fetch = FetchType.LAZY)
//	private List<Activite> activites ;
	 
	 
	public int getId_adherant() {
		return id_adherant;
	}
	public void setId_adherant(int id_adherant) {
		this.id_adherant = id_adherant;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
//	public List<Activite> getActivites() {
//		return activites;
//	}
//	public void setActivites(List<Activite> activites) {
//		this.activites = activites;
//	}
//	 

}
