package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/atividades")
public class HelloController {
	@GetMapping ("/atividade1")
	public String atividade1 () {
		return "As habilidades e mentalidades usadas foram: Persistência e atenção aos detalhes";
	}
	
	@GetMapping ("/atividade2")
	public String atividade2 () {
		return "Para essa semana desejo reter o maximo de conhecimento possivel.";
	}
	
	
	}

