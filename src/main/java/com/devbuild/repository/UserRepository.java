package com.devbuild.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devbuild.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
