package com.biit.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biit.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	Optional<User> findByMailId(String mailId);
}