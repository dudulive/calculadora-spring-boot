package br.com.calculadora.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public String soma(int primeiroValor, int segundoValor) {
        return Integer.toString(primeiroValor + segundoValor);
    }
    
    public String subtracao(int primeiroValor, int segundoValor) {
        return Integer.toString(primeiroValor - segundoValor);
    }
    
    public String divisao(int primeiroValor, int segundoValor) {
        return Double.toString(primeiroValor / segundoValor);
    }
    
    public String mutiplicacao(int primeiroValor, int segundoValor) {
        return Double.toString(primeiroValor * segundoValor);
    }
    
    public String potencia(Double primeiroValor, Double segundoValor) {
        return Double.toString(Math.pow(primeiroValor, segundoValor));
    }
    
    public String raizQuadra(Double valor) {
        return Double.toString(Math.sqrt(valor));
    }
}
