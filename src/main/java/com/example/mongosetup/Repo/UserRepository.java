package com.example.mongosetup.Repo;

import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongosetup.Entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId>{

	ArrayList<User> findByAgeBetween(int mini, int maxi);
	User findByName(String name);
}
