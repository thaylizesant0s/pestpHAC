package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int m, n, soma, i;

        System.out.print("Digite o valor de m: ");
        m = sc.nextInt();
        System.out.print("Digite o valor de n: ");
        n = sc.nextInt();

        while (m < n) {
            soma = 0; 

            for (i = m; i <= n; i++) {
                soma = soma + i;
            }

            System.out.println("Soma dos números entre " + m + " e " + n + ": " + soma);

            System.out.print("Digite o valor de m: ");
            m = sc.nextInt();
            System.out.print("Digite o valor de n: ");
            n = sc.nextInt();
        }
	}

}
