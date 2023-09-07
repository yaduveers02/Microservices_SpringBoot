package com.example.RatingService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RatingService.Entity.Rating;
import com.example.RatingService.Service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService service;
	
//	we are not creating DTO/models to transfer data, here we are considering Rating entity as DTO and converting all 
//	data coming in JSON form to Object to do operation with database
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(rating));
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>> getRating(){
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable int userId){
		return ResponseEntity.ok(service.getRatingByUserId(userId));
	}
	
	@GetMapping("/hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable int hotelId){
		return ResponseEntity.ok(service.getRatingByUserId(hotelId));
	}
}
