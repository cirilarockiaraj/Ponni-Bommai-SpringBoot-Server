package com.app.ponni_bommai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.ponni_bommai.model.SignUpAndSignInModel;
import com.app.ponni_bommai.service.SignUpAndSignInService;

@RestController
public class SignUpAndSignInController {

	@Autowired
	SignUpAndSignInService service;

	@PostMapping("/signup")
	public SignUpAndSignInModel signUp(@RequestBody SignUpAndSignInModel model) {
		return service.signIn(model);
	}
}
