package com.example.HotelService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HotelService.Entity.Hotel;
import com.example.HotelService.Exception.ResourceNotFoundException;
import com.example.HotelService.Repository.HotelRepo;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepo hotelRepo;

	@Override
	public Hotel create(Hotel hotel) {
		Hotel hotel2 = hotelRepo.save(hotel);
		return hotel2;
	}

	@Override
	public List<Hotel> getAll() {
		List<Hotel> all = hotelRepo.findAll();
		return all;
	}

	@Override
	public Hotel get(int id) {
		return hotelRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Hotel is not found with the given id : " + id));

	}

}
