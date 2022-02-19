package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "Centre")
public class Centre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private int id_center;
	
     private String nom ;
     
}
