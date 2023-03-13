package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// indica para o spring que essa é uma classe controladora
@RestController

//indica um endpoint para nossa aplicação
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String Hello() {
		return "Hello World!";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "BSMs:<br/>Persistência <br/>Mentalidade de Crescimento <br/>"
				+ "Orientação ao Futuro <br/>Responsabilidade Pessoal <br/>Trabalho em Equipe <br/>"
				+ "Comunicação <br/> Comunicação Não Violenta <br/>Atenção para Detalhes <br/>Proatividade";
	}

	@GetMapping("/objetivo")
	public String objetivos() {
		return "Esta semana quero me organizar em relação a gestão de tempo, e melhorar minha proatividade.";
	}
}