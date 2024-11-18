package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    double sal, valor_kw, gasto, acresc, total, tot_geral = 0;
	    int qtd, qtd_cons = 0, tipo;
	
	    System.out.print("Digite o valor do salário mínimo: ");
        sal = sc.nextDouble();
        
        valor_kw = sal / 8;

        while (true) {
            System.out.print("Digite a quantidade de quilowatts consumidos (ou 0 para encerrar): ");
            qtd = sc.nextInt();
            
            if (qtd == 0) break;
    
            gasto = qtd * valor_kw;

            System.out.print("Digite o tipo de consumidor (1 - Residencial, 2 - Comercial, 3 - Industrial): ");
            tipo = sc.nextInt();
    
            if (tipo == 1) {
                acresc = gasto * 5.0 / 100;
            } else if (tipo == 2) {
                acresc = gasto * 10.0 / 100;
            } else if (tipo == 3) {
                acresc = gasto * 15.0 / 100;
            } else {
                acresc = 0;
            }
    
            total = gasto + acresc;
            tot_geral = tot_geral + total;

            if (total >= 500 && total <= 1000) {
                qtd_cons = qtd_cons +1;
            }
    
            System.out.println("Gasto: R$ " + gasto);
            System.out.println("Acréscimo: R$ " + acresc);
            System.out.println("Total a pagar: R$ " + total);
        }
    
        System.out.println("Faturamento geral: R$ " + tot_geral);
        System.out.println("Quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00: " + qtd_cons);

	}

}
