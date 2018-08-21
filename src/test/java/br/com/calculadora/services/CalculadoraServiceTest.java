package br.com.calculadora.services;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraServiceTest {

	private CalculadoraService service;

    @Before
    public void configuracao() {
        service = new CalculadoraService();
    }

    @Test
    public void soma_dois_numeros_e_converte_o_resultado_para_string() {
        String resultado = service.soma(1, 1);
        assertEquals(resultado, "2");
    }
    
    @Test
    public void subtracao_dois_numeros_e_converte_o_resultado_para_string() {
        String resultado = service.subtracao(1, 1);
        assertEquals(resultado, "0");
    }
    
    @Test
    public void divisao_dois_numeros_e_converte_o_resultado_para_string() {
        String resultado = service.divisao(1, 1);
        assertEquals(resultado, "1.0");
    }
    
    @Test
    public void mutiplicacao_dois_numeros_e_converte_o_resultado_para_string() {
        String resultado = service.mutiplicacao(1, 1);
        assertEquals(resultado, "1.0");
    }
    
    @Test
    public void potencia_dois_numeros_e_converte_o_resultado_para_string() {
        String resultado = service.potencia(1.0, 1.0);
        assertEquals(resultado, "1.0");
    }
    
    @Test
    public void raiz_quadrada_dois_numeros_e_converte_o_resultado_para_string() {
        String resultado = service.raizQuadra(4.0);
        assertEquals(resultado, "2.0");
    }


}
