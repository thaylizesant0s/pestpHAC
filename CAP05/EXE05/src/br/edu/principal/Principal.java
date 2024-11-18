package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int fim, i, j, x, expoente, num_termos, denominador, den;
        long fat;  

        System.out.print("Digite o número de termos: ");
        num_termos = sc.nextInt();
        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();

        double s = 0;
        denominador = 1;

        for (i = 1; i <= num_termos; i++) {
            fim = denominador;  
            fat = 1; 

            for (j = 1; j <= fim; j++) {
                fat = fat * j; 
            }

            expoente = i + 1;

            if (expoente % 2 == 0) {
                s = s - (Math.pow(x, expoente)) / fat;  
            } else {
                s = s + (Math.pow(x, expoente)) / fat;  
            }

            if (denominador == 4) {
                den = -1;
            } else {
                den = 1;
            }

            if (den == 1) {
                denominador = denominador + 1;  
            } else {
                denominador = denominador - 1;  
            }
        }

        System.out.println("Valor da série: " + s);
	}

}
