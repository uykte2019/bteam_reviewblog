package com.teamb.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamb.blog.model.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
