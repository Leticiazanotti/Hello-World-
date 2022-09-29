package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Bsm-Gen")
public class BsmController {

	@GetMapping
	public String BsmGen() {
		return "BsmGen<br>Orientação ao futuro<br>Orientação aos detalhes<br>Trabalho em equipe<br>Comunicação<br>Responsabilidade pessoal";
	}
	
}
