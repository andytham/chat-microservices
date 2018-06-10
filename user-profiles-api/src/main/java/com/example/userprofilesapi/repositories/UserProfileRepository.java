package com.example.userprofilesapi.repositories;

import com.example.reactchatspring.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserProfileRepository extends CrudRepository<UserProfile, Long> {
    @Query("SELECT u FROM User u where u.nickname = :nickname")
    Optional<UserProfile> findByNickname(@Param("nickname")String nickname);

//    @Transactional
//    @Query("DELETE from User u where u.username = :username")
//    void deleteByUsername(@Param("username")String username);


//    @Transactional
//    Long deleteByNickname(String nickname);

}