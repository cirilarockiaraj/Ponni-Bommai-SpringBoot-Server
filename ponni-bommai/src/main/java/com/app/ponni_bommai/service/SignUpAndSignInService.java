package com.app.ponni_bommai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ponni_bommai.model.SignUpAndSignInModel;
import com.app.ponni_bommai.repository.SignUpAndSignInRepo;

@Service
public class SignUpAndSignInService {

	@Autowired
	SignUpAndSignInRepo repo;

	public SignUpAndSignInModel signUp(SignUpAndSignInModel model) {
		return repo.save(model);
	}
	
	public SignUpAndSignInModel signIn(SignUpAndSignInModel model) {
		for(SignUpAndSignInModel sineInModel : repo.findAll()) {
			if(sineInModel.getUsername().equals(model.getUsername()) && sineInModel.getPassword().equals(model.getPassword())) {
				return sineInModel;
			}
		}
		return null;
	}
}
