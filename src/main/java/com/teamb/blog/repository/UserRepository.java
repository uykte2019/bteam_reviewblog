package com.teamb.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamb.blog.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	//@Query(value="select * from user where user.username = ?1 and user.password = ?2")
	List<User> findByUsername(String username);
}
