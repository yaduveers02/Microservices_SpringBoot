package com.example.RatingService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RatingService.Entity.Rating;
import com.example.RatingService.Repo.RatingRepo;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepo repository;

	@Override
	public Rating save(Rating r) {
		return repository.save(r);
	}

	@Override
	public List<Rating> getAll() {
		return repository.findAll();
	}

	@Override
	public List<Rating> getRatingByHotelId(int hotelId) {
		return repository.findByHotelId(hotelId);
	}

	@Override
	public List<Rating> getRatingByUserId(int userId) {
		return repository.findByUserId(userId);
	}

}
