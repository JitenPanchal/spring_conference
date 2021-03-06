package com.pluralsight.conference.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pluralsight.conference.model.Registration;

@Controller
public class RegistrationController {

	@GetMapping("registration")
	public String getRegistration(Model m) {
		return "registration";
	}

	@PostMapping("registration")
	public String postRegistration(@ModelAttribute("registration") Registration model) {
		System.out.println(model.getUsername());
		System.out.println(model.getEmail());
		return "redirect:registration";
	}
}
