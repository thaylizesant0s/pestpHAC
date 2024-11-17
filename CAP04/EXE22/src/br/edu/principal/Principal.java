package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal_base, tempo, imposto, grat, sal_liq;
        
        System.out.print("Digite o salário base: R$ ");
        sal_base = sc.nextDouble();
        System.out.print("Digite o tempo de serviço em anos: ");
        tempo = sc.nextDouble();
        
        if (sal_base < 200) {
            imposto = 0;
        } else if (sal_base <= 450) {
            imposto = 3.0/100 * sal_base;
        } else if (sal_base < 700) {
            imposto = 8.0/100 * sal_base;
        } else {
            imposto = 12.0/100 * sal_base;
        }
        
        System.out.println("Imposto: R$ " + imposto);
        
        if (sal_base > 500) {
            if (tempo <= 3) {
                grat = 20;
            } else {
                grat = 30;
            }
        } else {
            if (tempo <= 3) {
                grat = 23;
            } else if (tempo <= 6) {
                grat = 35;
            } else {
                grat = 33;
            }
        }
        
        sal_liq = sal_base - imposto + grat;
        
        System.out.println("Gratificação: R$ " + grat);
        System.out.println("Salário Líquido: R$ " + sal_liq);
        
        if (sal_liq <= 350) {
            System.out.println("Classificação: A");
        } else if (sal_liq <= 600) {
            System.out.println("Classificação: B");
        } else {
            System.out.println("Classificação: C");
        }
	}

}
