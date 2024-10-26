package com.app.ponni_bommai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.ponni_bommai.model.SignUpAndSignInModel;
import com.app.ponni_bommai.service.SignUpAndSignInService;
import jakarta.validation.Valid;

@RestController
public class SignUpAndSignInController {

	@Autowired
	SignUpAndSignInService service;

	@PostMapping("/signup")
	public ResponseEntity<String> signUp(@Valid @RequestBody SignUpAndSignInModel model, BindingResult result) {

		if (result.hasErrors()) {
			return ResponseEntity.badRequest().body("Validation errors: " + result.getAllErrors());
		}

		if (service.signUp(model) != null) {
			return ResponseEntity.ok("Signup successfully..");
		}
		return ResponseEntity.badRequest().body("Sign-Up Faild !!!!");
	}
	
	@PostMapping("/signin")
	public ResponseEntity<String> signIn(@Valid @RequestBody SignUpAndSignInModel model, BindingResult result) {

		if (result.hasErrors()) {
			return ResponseEntity.badRequest().body("Validation errors: " + result.getAllErrors());
		}

		if (service.signIn(model) != null) {
			return ResponseEntity.ok("Sign-in successfully..");
		}
		return ResponseEntity.badRequest().body("Sign-in Faild !!!!");
	}
}
