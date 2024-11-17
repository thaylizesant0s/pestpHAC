package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double pre, valor_adic, imposto, pre_custo, desconto, novo_pre;
        String tipo, refrig;

        System.out.print("Digite o preço do produto: R$ ");
        pre = sc.nextDouble();
        System.out.print("Digite o tipo do produto (A - Alimentação, L - Limpeza, V - Vestuário): ");
        tipo = sc.next();
        System.out.print("Digite a refrigeração do produto (S - Necessita, N - Não necessita): ");
        refrig = sc.next();

        if (refrig.equals("N")) {
            if (tipo.equals("A")) {
                if (pre < 15) {
                    valor_adic = 2.00;
                } else {
                    valor_adic = 5.00;
                }
            } else if (tipo.equals("L")) {
                if (pre < 10) {
                    valor_adic = 1.50;
                } else {
                    valor_adic = 2.50;
                }
            } else if (tipo.equals("V")) {
                if (pre < 30) {
                    valor_adic = 3.00;
                } else {
                    valor_adic = 2.50;
                }
            } else {
                valor_adic = 0;
            }
        } else { 
            if (tipo.equals("A")) {
                valor_adic = 8.00;
            } else if (tipo.equals("L")) {
                valor_adic = 0.00;
            } else if (tipo.equals("V")) {
                valor_adic = 0.00;
            } else {
                valor_adic = 0;
            }
        }
        
        System.out.println("Valor Adicional: R$ " + valor_adic);

        if (pre < 25) {
            imposto = pre * 5.0 / 100;
        } else {
            imposto = pre * 8.0 / 100;
        }
        
        System.out.println("Imposto: R$ " + imposto);

        pre_custo = pre + imposto;
        
        System.out.println("Preço de Custo: R$ " + pre_custo);

        if (!tipo.equals("A") && !refrig.equals("S")) {
            desconto = pre_custo * 3.0 / 100;
        } else {
            desconto = 0;
        }
        
        System.out.println("Desconto: R$ " + desconto);

        novo_pre = pre_custo + valor_adic - desconto;
        
        System.out.println("Novo Preço: R$ " + novo_pre);

        String classificacao;
        if (novo_pre <= 50) {
            classificacao = "Barato";
        } else if (novo_pre < 100) {
            classificacao = "Normal";
        } else {
            classificacao = "Caro";
        }

        System.out.println("Classificação: " + classificacao);
	}

}
