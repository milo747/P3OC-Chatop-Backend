package com.openclassrooms.api.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "RENTALS")  
public class Rental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String price;
	
	private String surface;
	
	private String description;

	private String picture;

	private Timestamp created_at;
	
	private Timestamp updated_at;
	
	private Long owner_id;
		
}
