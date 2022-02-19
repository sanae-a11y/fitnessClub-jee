package com.example.demo.entity;


 

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

 
 
@Entity(name="Activite")
@Table(name = "Activite")
public class Activite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id_activite;
	private String nom ;
	private String description;
	private float prix;
	private String src ;
	
	
	 
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public int getNbrmax() {
		return Nbrmax;
	}
	public void setNbrmax(int nbrmax) {
		Nbrmax = nbrmax;
	}
//	@ManyToMany
//	private List<Horaire> horaire;
	private int Nbrmax ;
//	
	
	
	
	
	
	public int getId_activite() {
		return id_activite;
	}
	public void setId_activite(int id_activite) {
		this.id_activite = id_activite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
//	public List<Horaire> getHoraire() {
//		return horaire;
//	}
//	public void setHoraire(List<Horaire> horaire) {
//		this.horaire = horaire;
//	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
