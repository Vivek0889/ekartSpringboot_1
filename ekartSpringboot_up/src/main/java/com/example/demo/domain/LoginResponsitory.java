/**
 * 
 */
package com.example.demo.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entities.LoginEntity;

/**
 * @author vivek
 *
 */
public interface LoginResponsitory extends CrudRepository<LoginEntity, Integer> {

	@Query(value = "SELECT u FROM LoginEntity u WHERE login_id=1" )
	public Optional<LoginEntity> getAllUsers(); 
}
