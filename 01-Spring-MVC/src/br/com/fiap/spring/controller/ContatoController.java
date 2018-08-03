package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("contato")
public class ContatoController {

	@GetMapping("enviar")
	public String enviar() {
		return "contato/enviar";
	}
	
	@PostMapping(value="enviar")
	public ModelAndView processarForm(String nome, String telefone, String email) {
		System.out.println(nome + " " + telefone + " " + email);
		// Enviar valores para a tela
		ModelAndView retorno = 
				new ModelAndView("contato/enviar"); // pasta + pagina
		// Adiconar os valores para a página
		retorno.addObject("msg","Contato enviado!");
		retorno.addObject("nome", nome);
		return retorno;
	}
}
