package com.MC1.UserServices.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
// we will not mark this as @Entity annotation as we don't want to store this in this database. Rating is different microservice
public class Rating {
	
	private int ratingId;
	private int userId;
	private int hotelId;
	private int rating;
	private String remark;

}
