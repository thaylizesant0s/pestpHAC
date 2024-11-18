package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double preco, imp, transp, seguro, pre_final, total_imp = 0;
        int origem;
        String meio_t, carga;

        while (true) {
            System.out.print("Digite o preço unitário: ");
            preco = sc.nextDouble();
            
            if (preco <= 0) {
                break;
            }

            System.out.print("Digite o país de origem (1 - Estados Unidos, 2 - México, 3 - Outros): ");
            origem = sc.nextInt();
            System.out.print("Digite o meio de transporte (T - Terrestre, F - Fluvial, A - Aéreo): ");
            meio_t = sc.next().toUpperCase();
            System.out.print("Digite se é carga perigosa (S - Sim, N - Não): ");
            carga = sc.next().toUpperCase();

            if (preco <= 100) {
                imp = preco * 5.0 / 100;
            } else {
                imp = preco * 10.0 / 100;
            }

            if (carga.equals("S")) {
                if (origem == 1) {
                    transp = 50;
                } else if (origem == 2) {
                    transp = 21;
                } else {
                    transp = 24;
                }
            } else {
                if (origem == 1) {
                    transp = 12;
                } else if (origem == 2) {
                    transp = 21;
                } else {
                    transp = 60;
                }
            }

            if (origem == 2 || meio_t.equals("A")) {
                seguro = preco / 2;
            } else {
                seguro = 0;
            }

            pre_final = preco + imp + transp + seguro;
            total_imp += imp;

            System.out.println("Imposto: R$ " + imp);
            System.out.println("Transporte: R$ " + transp);
            System.out.println("Seguro: R$ " + seguro);
            System.out.println("Preço final: R$ " + pre_final);
        }

        System.out.println("Total de impostos: R$ " + total_imp);

	}

}
