package com.pandaio.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pandaio.springboot.moddel.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
