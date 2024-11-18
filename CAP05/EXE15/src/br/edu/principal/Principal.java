package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, qtd_b = 0, qtd_n = 0, qtd_c = 0;
        double preco, custo_est, imp, preco_final, adicional = 0;
        double maior_p = 0, menor_p = 0, tot_imp = 0;
        String refri, categ;

        for (i = 1; i <= 12; i++) {
            System.out.print("Digite o preço unitário do " + i + "º produto: ");
            preco = sc.nextDouble();
            System.out.print("Digite a refrigeração (S ou N): ");
            refri = sc.next().toUpperCase();
            System.out.print("Digite a categoria (A, L ou V): ");
            categ = sc.next().toUpperCase();

            if (preco <= 20) {
                if (categ.equals("A")) {
                    custo_est = 2;
                } else if (categ.equals("L")) {
                    custo_est = 3;
                } else {
                    custo_est = 4;
                }
            } else if (preco > 20 && preco <= 50) {
                if (refri.equals("S")) {
                    custo_est = 6;
                } else {
                    custo_est = 0;
                }
            } else {
                if (refri.equals("S")) {
                    if (categ.equals("A")) {
                        custo_est = 5;
                    } else if (categ.equals("L")) {
                        custo_est = 2;
                    } else {
                        custo_est = 4;
                    }
                } else {
                    if (categ.equals("A") || categ.equals("V")) {
                        custo_est = 0;
                    } else {
                        custo_est = 1;
                    }
                }
            }

            if (!categ.equals("A") && !refri.equals("S")) {
                imp = preco * 2.0 / 100;
            } else {
                imp = preco * 4.0 / 100;
            }

            preco_final = preco + custo_est + imp;
            
            System.out.println("Custo de estocagem: R$ " + custo_est);
            System.out.println("Imposto: R$ " + imp);
            System.out.println("Preço final: R$ " + preco_final);

            if (preco_final <= 20) {
                qtd_b = qtd_b + 1;
                System.out.println("Classificação: Barato");
            } else if (preco_final > 20 && preco_final <= 100) {
            	qtd_n = qtd_n + 1;
                System.out.println("Classificação: Normal");
            } else {
            	qtd_c = qtd_c + 1;
                System.out.println("Classificação: Caro");
            }

            adicional = adicional + custo_est + imp;
            tot_imp = tot_imp + imp;

            if (i == 1) {
                maior_p = preco_final;
                menor_p = preco_final;
            } else {
                if (preco_final > maior_p) {
                    maior_p = preco_final;
                }
                if (preco_final < menor_p) {
                    menor_p = preco_final;
                }
            }
        }

        adicional = adicional / 12;
        
        System.out.println("Média dos valores adicionais (custos de estocagem + impostos): R$ " + adicional);
        System.out.println("Maior preço final: R$ " + maior_p);
        System.out.println("Menor preço final: R$ " + menor_p);
        System.out.println("Total de impostos: R$ " + tot_imp);
        System.out.println("Quantidade de produtos classificados como Barato: " + qtd_b);
        System.out.println("Quantidade de produtos classificados como Normal: " + qtd_n);
        System.out.println("Quantidade de produtos classificados como Caro: " + qtd_c);

	}

}
