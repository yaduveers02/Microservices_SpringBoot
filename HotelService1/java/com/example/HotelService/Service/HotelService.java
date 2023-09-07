package com.example.HotelService.Service;

import java.util.List;

import com.example.HotelService.Entity.Hotel;

public interface HotelService {

	Hotel create(Hotel hotel);

	List<Hotel> getAll();

	Hotel get(int id);
}
