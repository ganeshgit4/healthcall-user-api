package com.healthcall.in.healthcall.userapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcall.in.healthcall.userapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
