package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 

  
@Entity(name = "Reservation")
@Table(name = "Reservation")
public class  Reservation  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int id_abonn;
	 
   private String email;
	 
   private String nom ;
	 
   private String prenom;
   
   private String tel;
   
   private String ville;
   
   private String activite;
   
	
	
	
	
	
	public int getId_abonn() {
		return id_abonn;
	}
	public void setId_abonn(int id_abonn) {
		this.id_abonn = id_abonn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
 
   public String getActivite() {
		return activite;
	}
	public void setActivite(String activite) {
		this.activite = activite;
	}

 
}  
