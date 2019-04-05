/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.luana.projeto.calculadora;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luana.faiotto
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    //Métodos para calculadora dos inteiros
    @Test
    public void soma_de_dois_numeros_inteiros(){

        //1. Configuração
	int num1 = 3;
	int num2 = 4;
	int resultado;
	Calculadora calculadora = new Calculadora();

	//2. Execução
	resultado = calculadora.soma(num1, num2);

	//3. Validação/Asserção
	assertEquals(num1 + num2, resultado);

    }

    @Test
    public void subtracao_de_dois_numeros_inteiros(){

	//1. Configuração
	int num1 = 6;
	int num2 = 2;
	int resultado;
	Calculadora calculadora = new Calculadora();

        //2. Execução
	resultado = calculadora.subtracao(num1, num2);

	//3. Validação/Asserção
	assertEquals(num1 - num2, resultado);

    }

    @Test
    public void multiplicacao_de_dois_numeros_inteiros(){

        //1. Configuração
	int num1 = 3;
	int num2 = 7;
	int resultado;
	Calculadora calculadora = new Calculadora();

	//2. Execução
	resultado = calculadora.multiplicacao(num1, num2);

	//3. Validação/Asserção
	assertEquals(num1 * num2, resultado);

    }

    @Test
    public void divisao_de_dois_numeros_inteiros(){

	//1. Configuração
	int num1 = 6;
	int num2 = 2;
	int resultado;
	Calculadora calculadora = new Calculadora();

	//2. Execução
	resultado = calculadora.div(num1, num2);

	//3. Validação/Asserção
	assertEquals(num1 / num2, resultado);

    }

    @Test
    public void fazer_mod_de_dois_numeros(){

	//1. Configuração
	int num1 = 7;
	int num2 = 5;
	int resultado;
        int resultadoEsperado = 2;
	Calculadora calculadora = new Calculadora();
		
	//2. Execução
	resultado = calculadora.mod(num1, num2);

	//3. Validação/Asserção
	assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void potenciacao_do_primeiro_pelo_segundo(){

	//1. Configuração
	int num1 = 3;
	int num2 = 2;
	int resultado;
	int valorEsperado;
	Calculadora calculadora = new Calculadora();

	//2. Execução
	resultado = calculadora.potenciacao(num1, num2);
	valorEsperado = (int) Math.pow(num1, num2);

	//3. Validação/Asserção
	assertEquals(valorEsperado, resultado);

    }   
    
    //Métodos para calculadora dos reais
    @Test
    public void somar_dois_numeros_reais(){

	//1. Configuração
	double num1 = 3.5;
	double num2 = 2.7;
	double resultado;
	Calculadora calculadora = new Calculadora();

	//2. Execução
	resultado = calculadora.somaReal(num1, num2);

	//3. Validação/Asserção
	assertEquals(num1 + num2, resultado, 0);
	
    }

    @Test
    public void subtrair_dois_numeros_reais(){

	//1. Configuração
	double num1 = 4.3;
	double num2 = 1.2;
	double resultado;
	Calculadora calculadora = new Calculadora();

	//2. Execução
	resultado = calculadora.subtracaoReal(num1, num2);

        //3. Validação/Asserção
	assertEquals(num1 - num2, resultado, 0);

    }

    @Test
    public void multiplicar_dois_numeros_reais(){

	//1. Configuração
	double num1 = 3.2;
	double num2 = 2.5;
	double resultado;
	Calculadora calculadora = new Calculadora();

	//2. Execução
	resultado = calculadora.multiplicacaoReal(num1, num2);

	//3. Validação/Asserção
	assertEquals(num1 * num2, resultado, 0);

    }

    @Test
    public void dividir_dois_numeros_reais(){

	//1. Configuração
	double num1 = 4.2;
	double num2 = 2.7;
	double resultado;
	Calculadora calculadora = new Calculadora();

	//2. Execução
	resultado = calculadora.divisao(num1, num2);

	//3. Validação/Asserção
	assertEquals(num1 / num2, resultado, 0);
    }
    
}
