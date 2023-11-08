package com.openclassrooms.api.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openclassrooms.api.model.Rental;
import com.openclassrooms.api.service.RentalService;

import lombok.Data;

@Data
@RestController
@RequestMapping("/api")
public class RentalController {
	
	@Autowired
	private RentalService rentalServices;

	
	
	/**
	 * Read - Get all Rentals
	 * @return - An Iterable object of Rental full filled
	 */
	@GetMapping("/rentals")
	public Iterable<Rental>getRental()
	{
		//System.out.println("test");
		return rentalServices.getRentals();
	}

}
