package com.openclassrooms.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.api.model.Rental;
import com.openclassrooms.api.repository.RentalRepository;

import lombok.Data;

@Data
@Service
public class RentalService {

	@Autowired
	private RentalRepository rentalRepositories;
	
	public Iterable<Rental> getRentals() {
		return rentalRepositories.findAll();
	}
	
}
