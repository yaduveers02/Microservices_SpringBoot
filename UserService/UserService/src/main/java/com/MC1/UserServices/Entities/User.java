package com.MC1.UserServices.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "micro_user")
public class User {

	@Id
	@Column
	private int userID;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String about;
}
