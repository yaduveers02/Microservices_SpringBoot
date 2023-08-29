package com.MC1.UserServices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MC1.UserServices.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
