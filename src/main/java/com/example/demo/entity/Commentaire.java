package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name = "Commentaire")
public class Commentaire {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id_comm;
	
    private String comm;
    
    private Date date_comm;
//    @OneToOne
//    private Adherent adherent;

	public int getId_comm() {
		return id_comm;
	}

	public Date getDate() {
		return date_comm;
	}

	public void setDate(Date d) {
		this.date_comm = d;
	}

	public void setId_comm(int id_comm) {
		this.id_comm = id_comm;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}
    
    
    
    
	 
	
	
	
//	public Adherent getAdherent() {
//		return adherent;
//	}
//	public void setAdherent(Adherent adherent) {
//	this.adherent = adherent;
//	} 
	
}
 
