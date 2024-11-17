package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod_prod, cod_pais;
        double peso_quilos, peso_gramas, pre_total, imposto, valor_total, pre_grama;

        System.out.print("Digite o código do produto (1 a 10): ");
        cod_prod = sc.nextInt();
        System.out.print("Digite o peso do produto em quilos: ");
        peso_quilos = sc.nextDouble();
        System.out.print("Digite o código do país de origem (1, 2 ou 3): ");
        cod_pais = sc.nextInt();

        peso_gramas = peso_quilos * 1000;
        
        System.out.println("Peso do produto em gramas: " + peso_gramas);

        if (cod_prod >= 1 && cod_prod <= 4) {
            pre_grama = 10;
        } else if (cod_prod >= 5 && cod_prod <= 7) {
            pre_grama = 25;
        } else if (cod_prod >= 8 && cod_prod <= 10) {
            pre_grama = 35;
        } else {
            pre_grama = 0;
        }

        pre_total = peso_gramas * pre_grama;
        
        System.out.println("Preço total do produto (sem imposto): R$ " + pre_total);

        if (cod_pais == 1) {
            imposto = 0;
        } else if (cod_pais == 2) {
            imposto = pre_total * 15.0/100;
        } else if (cod_pais == 3) {
            imposto = pre_total * 25.0/100;
        } else {
            imposto = 0; 
        }

        System.out.println("Valor do imposto: R$ " + imposto);

        valor_total = pre_total + imposto;
        
        System.out.println("Valor total (preço + imposto): R$ " + valor_total);
	}

}
