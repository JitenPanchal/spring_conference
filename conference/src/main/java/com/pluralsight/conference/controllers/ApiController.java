package com.pluralsight.conference.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.conference.model.Address;
import com.pluralsight.conference.model.Info;

@RestController
@RequestMapping("/root")
public class ApiController {

	@GetMapping("/greetingapi")
	private String helloapi(HttpServletRequest req) {
		return "hello from api again";
	}

	@GetMapping(value = "/infoApi", produces =  { "application/json", "application/xml" })
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
}