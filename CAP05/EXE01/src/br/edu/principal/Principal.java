package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, novo_salario, percentual;
        int i, ano_atual;

        System.out.print("Digite o ano atual: ");
        ano_atual = sc.nextInt();

        salario = 1000;  
        percentual = 1.5 / 100;  
        novo_salario = salario + percentual * salario;  
        
        for (i = 2007; i <= ano_atual; i++) {
            percentual = 2 * percentual; 
            novo_salario = novo_salario + percentual * novo_salario; 
        }
        
        System.out.print("O salário atual do funcionário é: R$ " + novo_salario);
	}

}
