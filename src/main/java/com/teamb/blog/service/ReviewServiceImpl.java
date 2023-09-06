package com.teamb.blog.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.teamb.blog.model.Review;
import com.teamb.blog.repository.ReviewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class ReviewServiceImpl implements  IReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review addReview(Review review) {
        if(review!=null){
            return reviewRepository.save(review);
        }
        return null;
    }

 
	@Override
    public Review updateReview(long id, Review review) {
        if(review!=null){

			Review review1=reviewRepository.findById(id).get();
            if(review1!=null){
            	review1.setTitle(review.getTitle());
            	review1.setContent(review.getContent());
            	review1.setAuthor(review.getAuthor());
//            	review1.setCreatedtime(review.getCreatedtime());
            	review1.setUpdatedtime(review.getUpdatedtime());

                return reviewRepository.save(review1);
            }
        }
        return null;
    }

	@Override
    public boolean deleteReview(long id) {
        if(id>=1){
        	Review review=reviewRepository.findById(id).get();
            if(review!=null){
            	reviewRepository.delete(review);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

	@Override
    public Review getOneReview(long id) {
        return reviewRepository.findById(id).get();
    }
}
