package com.app.ponni_bommai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ponni_bommai.model.SignUpAndSignInModel;

@Repository
public interface SignUpAndSignInRepo extends JpaRepository<SignUpAndSignInModel, Integer> {

}
