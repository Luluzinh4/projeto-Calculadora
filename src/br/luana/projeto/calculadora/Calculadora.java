/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.luana.projeto.calculadora;

/**
 *
 * @author luana.faiotto
 */
class Calculadora {
    //Métodos da calculadora de inteiros
    public int soma(int num1, int num2){
	return num1 + num2;
    }

    public int subtracao(int num1, int num2){
	return num1 - num2;
    }

    public int multiplicacao(int num1, int num2){
	return num1 * num2;
    }

    public int div(int num1, int num2){
	return num1 / num2;
    }

    public int mod(int num1, int num2){
	return num1 % num2;
    }

    public int potenciacao(int num1, int num2){
    	int resultado = (int) Math.pow(num1, num2);
	return resultado;
    }

    //Métodos da calculadora de reais
    public double somaReal(double num1, double num2){
	return num1 + num2;
    }

    public double subtracaoReal(double num1, double num2){
	return num1 - num2;
    }

    public double multiplicacaoReal(double num1, double num2){
	return num1 * num2;
    }

    public double divisao(double num1, double num2){
	return num1 / num2;
    }
    
}
