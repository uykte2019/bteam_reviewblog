package com.teamb.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.teamb.blog.model.Review;


public interface ReviewRepository extends JpaRepository<Review, Long> {
}
