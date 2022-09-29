package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //DEFINE A CLASSE CONTROLADORA 
@RequestMapping("/hello-world") // MAPEAR SOLICITAÇÕES PARA MÉTODOS DA CLASSE CONTROLADORA,DEFINIR A URL.
public class HelloWorldController {

	@GetMapping // MAPEIA SOLICITAÇÕES HTTP GET PARA TRATAMENTOS ESPECIFICOS, INDICA O HELLOWORLD RESPONDERA AS REQUISIÇÕE HTTP GET  
	public String helloWorld() {
		return "Hello World";
	}
	
}
