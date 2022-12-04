package com.question.UserTrackService.repository;

import com.question.UserTrackService.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    User findByUserId(String userId);
}
