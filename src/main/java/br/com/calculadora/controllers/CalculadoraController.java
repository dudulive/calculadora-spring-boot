package br.com.calculadora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.calculadora.services.CalculadoraService;

@RestController
public class CalculadoraController {

	private final CalculadoraService service;

	@Autowired
	public CalculadoraController(CalculadoraService service) {
		this.service = service;
	}

	@GetMapping("/soma")
	@ResponseBody
	public String soma(@RequestParam("primeiroValor") String primeiroValor,
			@RequestParam("segundoValor") String segundoValor) {
		return service.soma(Integer.valueOf(primeiroValor), Integer.valueOf(segundoValor));
	}

	@GetMapping("/subtracao")
	@ResponseBody
	public String subtracao(@RequestParam("primeiroValor") String primeiroValor,
			@RequestParam("segundoValor") String segundoValor) {
		return service.subtracao(Integer.valueOf(primeiroValor), Integer.valueOf(segundoValor));
	}

	@GetMapping("/mutiplicacao")
	@ResponseBody
	public String mutiplicacao(@RequestParam("primeiroValor") String primeiroValor,
			@RequestParam("segundoValor") String segundoValor) {
		return service.mutiplicacao(Integer.valueOf(primeiroValor), Integer.valueOf(segundoValor));
	}

	@GetMapping("/divisao")
	@ResponseBody
	public String divisao(@RequestParam("primeiroValor") String primeiroValor,
			@RequestParam("segundoValor") String segundoValor) {
		return service.divisao(Integer.valueOf(primeiroValor), Integer.valueOf(segundoValor));
	}

	@GetMapping("/potencia")
	@ResponseBody
	public String potencia(@RequestParam("primeiroValor") String primeiroValor,
			@RequestParam("segundoValor") String segundoValor) {
		return service.potencia(Double.valueOf(primeiroValor), Double.valueOf(segundoValor));
	}

	@GetMapping("/raizquadrada")
	@ResponseBody
	public String raizQuadra(@RequestParam("valor") String valor) {
		return service.raizQuadra(Double.valueOf(valor));
	}
}
