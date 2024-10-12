package com.npt.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npt.app.model.Rider;
import com.npt.app.repos.IRiderRepository;

@ComponentScan
@RestController
@RequestMapping("/RiderServices")
public class RiderController {
	
	@Autowired
	private IRiderRepository repo;

	@GetMapping("/getRiders")
	public ResponseEntity<List<Rider>> getBooks()  {

		return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
		
	}
}
