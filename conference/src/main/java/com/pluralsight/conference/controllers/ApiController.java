package com.pluralsight.conference.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.conference.entities.UserDetails;
import com.pluralsight.conference.exceptions.EntityNotFoundException;
import com.pluralsight.conference.model.Address;
import com.pluralsight.conference.model.Info;
import com.pluralsight.conference.model.UserDetailsRequestModel;

@RestController
@RequestMapping("/root")
public class ApiController {

	private ModelMapper modelMapper;

	public ApiController(ModelMapper modelMapper) {
		super();
		this.modelMapper = modelMapper;
	}

	@GetMapping("/greetingapi")
	private String helloapi(HttpServletRequest req) {
		return "hello from api again";
	}

	@GetMapping(value = "/infoApi", produces = { "application/json", "application/xml" })
	private Info getInfo() {
		Address add = new Address();
		add.setCompleteAddress("ICX4 way .... :(");
		return new Info("1", "from infor", true, add);
	}

	@GetMapping(value = "/infoFromServlet")
	private void getInfoFromServlet(HttpServletResponse res) throws IOException {
		res.setHeader("jiten", "head");
		res.setStatus(200);
		res.getWriter().println("response from infoFromServlet");
	}

	@PostMapping(value = "/saveuser", produces = { "application/json", "application/xml" })
	private ResponseEntity<UserDetails> saveUser(@Valid @RequestBody UserDetailsRequestModel model) {

		var ud = modelMapper.map(model, UserDetails.class);

		return new ResponseEntity<UserDetails>(ud, HttpStatus.OK);
	}

	@GetMapping(value = "/user/{id}/{id2}", produces = { "application/json", "application/xml" })
	private ResponseEntity<UserDetails> getUser(@PathVariable("id") int id2, @PathVariable("id2") int id) {
		return new ResponseEntity<UserDetails>(getUserFromService(id), HttpStatus.OK);
	}

	private static UserDetails getUserFromService(int id) {
		if (id <= 0)
			throw new EntityNotFoundException();

		return new UserDetails();
	}

}