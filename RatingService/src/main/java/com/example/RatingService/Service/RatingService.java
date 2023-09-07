package com.example.RatingService.Service;

import java.util.List;

import com.example.RatingService.Entity.Rating;

public interface RatingService {

//	save rating
	public Rating save(Rating r);
	
//	get all rating
	public List<Rating> getAll();
	
//	get by ratingBYHotelId
	
	public List<Rating> getRatingByHotelId(int hotelId);
	
	public List<Rating> getRatingByUserId(int userId);
}
