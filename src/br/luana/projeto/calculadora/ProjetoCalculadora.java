/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.luana.projeto.calculadora;

import java.util.Scanner;

/**
 *
 * @author luana.faiotto
 */
public class ProjetoCalculadora {

    public static void menu(int op){
	if (op == 0) { //Menu inicial
            System.out.println("=============================================================");
            System.out.println("              Seja Bem Vindo a Calculadora XPTO              ");
            System.out.println("=============================================================");
            System.out.println("              Tipos de Calculadora Disponíveis               ");
            System.out.println("               1 para calculadora de inteiros                ");
            System.out.println("                 2 para calculadora de reais                 ");
            System.out.println("=============================================================");
	} else { //Menu após selecionar o tipo de calculadora
            if (op == 1) {
		System.out.println("=============================================================");
		System.out.println("                     Calculadora XPTO                        ");
		System.out.println("=============================================================");
		System.out.println("               Tipos de Operações Disponíveis                ");
		System.out.println("                        1 para soma                          ");
		System.out.println("                     2 para subtração                        ");
		System.out.println("                   3 para multiplicação                      ");
		System.out.println("                      4 para divisão                         ");
		System.out.println("                  5 para MOD da divisão                      ");
		System.out.println("                    6 para potenciação                       ");
		System.out.println("=============================================================");
            } else {
                if (op == 2) {
                    System.out.println("=============================================================");
                    System.out.println("                     Calculadora XPTO                        ");
                    System.out.println("=============================================================");
                    System.out.println("               Tipos de Operações Disponíveis                ");
                    System.out.println("                        1 para soma                          ");
                    System.out.println("                     2 para subtração                        ");
                    System.out.println("                   3 para multiplicação                      ");
                    System.out.println("                      4 para divisão                         ");
                    System.out.println("=============================================================");
                }
            }	
	}
    }
    
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("ConvertToTryWithResources") //Para retirar o Warning de Scanner
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instância do Scanner para leitura
	Scanner ler = new Scanner(System.in);
		
	//Declaração de variáveis
	int num1 = 0;
	int num2 = 0;
	int resultInteiro = 0;
	double numero1 = 0;
	double numero2 = 0;
	double resultReal = 0;
	int op = 0;
	int aux; //Selecionar uma operação

	//Instância da classe calculadora
	Calculadora calculadora = new Calculadora();

	//Selecionar qual tipo de calculadora o usuário deseja utilizar (inteiro ou real)
	menu(op);
	System.out.println("Selecione a calculadora que deseja: ");
	op = ler.nextInt();
	
	if (op == 1) { //Caso seja selecionado a calculadora de inteiro
            System.out.println("Digite o primeiro número: ");
            num1 = ler.nextInt();
            System.out.println("Digite o segundo número: ");
            num2 = ler.nextInt();
	} else { //Caso seja selecionado a calculadora de real
            if (op == 2) {
                System.out.println("Digite o primeiro número: ");
                numero1 = ler.nextDouble();
                System.out.println("Digite o segundo número: ");
                numero2 = ler.nextDouble();
            }
	}

        if (op == 1 || op == 2) {
            menu(op);
            System.out.println("Selecione qual operação deseja realizar: ");
            aux = ler.nextInt();

            switch (aux) {
                case 1:
                    if (op == 1) {
                        resultInteiro = calculadora.soma(num1, num2);
                    } else {
                        resultReal = calculadora.somaReal(numero1, numero2);
                    }
                    break;
                case 2:
                    if (op == 1) {
                        resultInteiro = calculadora.subtracao(num1, num2);
                    } else {
                        resultReal = calculadora.subtracaoReal(numero1, numero2);
                    }
                    break;
                case 3:
                    if (op == 1) {
                        resultInteiro = calculadora.multiplicacao(num1, num2);
                    } else {
                        resultReal = calculadora.multiplicacaoReal(numero1, numero2);
                    }
                    break;
                case 4:
                    if (op == 1) {
                        resultInteiro = calculadora.div(num1, num2);
                    } else {
                        resultReal = calculadora.divisao(numero1, numero2);
                    }
                    break;
                case 5:
                    if (op == 1) {
                        resultInteiro = calculadora.mod(num1, num2);
                    } else {
                        System.out.println("Não é possível realizar esta operação com números reais");
                    }
                    break;
                case 6:
                    if (op == 1) {
                        resultInteiro = calculadora.potenciacao(num1, num2);
                    } else {
                        System.out.println("Não é possível realizar esta operação com números reais");
                    }
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }

            //Mostrando o resultado para o usuário
            if (aux >= 0 && aux < 7) {
                if (op == 1) { //Mostra o resultado caso seja uma calculado de inteiros
                    System.out.println("O resultado é: " + resultInteiro);
                } else { //Mostra o resultado caso seja uma calculadora de reais
                    System.out.println("O resultado é: " + resultReal);
                }
            }      
        } else {
            System.out.println("Opção Inválida");
        }
	
	//Finalizando o Scanner
        ler.close();
        
    }
    
}
