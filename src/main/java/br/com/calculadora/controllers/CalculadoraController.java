package br.com.calculadora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/soma/{primeiroValor}/{segundoValor}")
    @ResponseBody
    public String soma(@PathVariable  int primeiroValor, @PathVariable  int segundoValor) {
        return service.soma(primeiroValor, segundoValor);
    }
    
    @GetMapping("/subtracao/{primeiroValor}/{segundoValor}")
    @ResponseBody
    public String subtracao(@PathVariable  int primeiroValor, @PathVariable  int segundoValor) {
        return service.subtracao(primeiroValor, segundoValor);
    }
    
    @GetMapping("/mutiplicacao/{primeiroValor}/{segundoValor}")
    @ResponseBody
    public String mutiplicacao(@PathVariable  int primeiroValor, @PathVariable  int segundoValor) {
        return service.mutiplicacao(primeiroValor, segundoValor);
    }
    
    @GetMapping("/divisao/{primeiroValor}/{segundoValor}")
    @ResponseBody
    public String divisao(@PathVariable  int primeiroValor, @PathVariable  int segundoValor) {
        return service.divisao(primeiroValor, segundoValor);
    }
    
    @GetMapping("/potencia/{primeiroValor}/{segundoValor}")
    @ResponseBody
    public String potencia(@PathVariable  Double primeiroValor, @PathVariable Double segundoValor) {
        return service.potencia(primeiroValor, segundoValor);
    }
    
    @GetMapping("/raizquadrada/{valor}")
    @ResponseBody
    public String raizQuadra(@PathVariable  Double valor) {
        return service.raizQuadra(valor);
    }
}
