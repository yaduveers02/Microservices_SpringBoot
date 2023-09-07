package com.example.RatingService.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RatingService.Entity.Rating;

public interface RatingRepo extends JpaRepository<Rating, Integer>{

//	custom finder method:- findBy+(column name in camel case)
	List<Rating> findByUserId(int userId);
	List<Rating> findByHotelId(int hotelId);
}
