package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Objetivos-aprend")
public class ObjetivosAprend {

	@GetMapping
	public String ObjAprend() {
		return "Primeiros passos com Spring boot<br>Endpoint<br>Classe controller";
	}
}
