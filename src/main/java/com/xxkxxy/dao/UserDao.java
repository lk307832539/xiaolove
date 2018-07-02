package com.xxkxxy.dao;


import com.xxkxxy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<User, Integer> {

    User findByUserId(Integer userId);
}
