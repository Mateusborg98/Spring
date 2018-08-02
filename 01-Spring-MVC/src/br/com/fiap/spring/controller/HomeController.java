package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// Mapeia a URL: http://localhost:8080/01-Spring-MVC/home
	@GetMapping("/home")
	public String abrirHome() {
		return "home/index"; // pasta + o nome do aquivo JSP
	}
	
	
}
