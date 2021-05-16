package br.com.impacta.lab.controller;

import org.dom4j.IllegalAddException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.joran.conditional.ElseAction;

@RestController
@RequestMapping("/atividades")
public class CondicionalController {

	@GetMapping("/condicional")
	public ResponseEntity<String> simularValores(@RequestParam(name="idade") int idade) {
		/*
		 * Elabore um algoritmo para dizer a partir da idade se a 
		 * pessoa tem mais ou menos do que 18 anos.
		 *  
		 *  Retornar os seguintes textos:
		 *  
		 *  
		 *  Para maiores de dezoito anos -> Possui mais de 18 anos
		 *  
		 *  Para menores de dezoito anos -> Possui menos de 18 anos
		 *  
		 */

		 //http://localhost8080/atividades/hello?idade=18 - Para testar
		
		   
		return ResponseEntity.ok(idade >= 18 ? "Possui mais de 18 anos" : "Possui menos de 18 anos");
	}
	
}
