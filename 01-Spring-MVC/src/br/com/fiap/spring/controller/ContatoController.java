package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("contato")
public class ContatoController {

	@GetMapping("enviar")
	public String enviar() {
		return "contato/enviar";
	}
	
	@PostMapping(value="enviar")
	public String processarForm(String nome, String telefone, String email) {
		System.out.println(nome + " " + telefone + " " + email);
		return "contato/enviar";
	}
}
