package com.teamb.blog.controller;

import com.teamb.blog.model.Review;
import com.teamb.blog.service.IReviewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://127.0.0.1:3000")
@RestController
@RequestMapping("/reviewblog/api/v1/review")
public class ReviewController {
    @Autowired
    private IReviewService  iReviewService;

    // Test
    @GetMapping("")
    public Review getOneReview(@RequestParam("id") long id){
        return iReviewService.getOneReview(id);
    }

    // API add review
    @PostMapping("")
    public Review addReview(@RequestBody Review review){
        return iReviewService.addReview(review);
    }

    // API update review
    @PutMapping("")
    public Review updateReview(@RequestParam("id") long id, @RequestBody Review review){
        return iReviewService.updateReview(id, review);
    }

    // API delete review
    @DeleteMapping("")
    public boolean deleteReview(@RequestParam("id") long id){
        return iReviewService.deleteReview(id);
    }

    // API get list review
    @GetMapping("/list")
    public List<Review> getAllReviews(){
        return iReviewService.getAllReviews();
    }
}
