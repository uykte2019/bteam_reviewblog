package com.teamb.blog.service;

import com.teamb.blog.model.User;
import com.teamb.blog.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserServiceImpl implements  IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        //if(user!=null){
            return userRepository.save(user);
//        }
//        return null;
    }

    @Override
    public User updateUser(String username, User user) {
        if(user!=null){
        	List<User> listUser=userRepository.findByUsername(username);
            if(listUser.size() > 0){
            	User user1 = listUser.get(0);
            	//user1.setUsername(user.getUsername());
            	user1.setPassword(user.getPassword());
            	user1.setName(user.getName());
            	user1.setRole(user.getRole());

                return userRepository.save(user1);
            }
        }
        return null;
    }

    @Override
    public Boolean deleteUser(String username) {
        if(username != null){
        	List<User> listUser=userRepository.findByUsername(username);
            if(listUser.size() > 0){
            	User user = listUser.get(0);
            	userRepository.delete(user);
                return true;
            }
        }
        return false;
    }


	@Override
	public ResponseEntity<List<User>> getUser(@RequestParam("username") String username){
        return new ResponseEntity<List<User>>( userRepository.findByUsername(username), HttpStatus.OK);
	}
}
