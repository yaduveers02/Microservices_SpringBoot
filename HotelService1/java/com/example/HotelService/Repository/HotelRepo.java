package com.example.HotelService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HotelService.Entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Integer> {

}
