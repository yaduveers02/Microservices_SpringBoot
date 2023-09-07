package com.example.RatingService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Ratings")
public class Rating {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ratingId;
	private int userId;
	private int hotelId;
	private int rating;
	private String remark;

}
