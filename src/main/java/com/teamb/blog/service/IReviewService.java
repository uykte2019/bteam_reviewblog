package com.teamb.blog.service;

import java.util.List;

import com.teamb.blog.model.Review;

public interface IReviewService {
    // Add review
    public Review addReview(Review review);

    // update review
    public Review updateReview(long id, Review review);

    // delete review
    public boolean deleteReview(long id);

    // get all list reviews
    public List<Review> getAllReviews();

    // get one review
    public Review getOneReview(long id);
}
