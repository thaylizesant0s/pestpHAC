package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont, ta = 0, te = 0, tr = 0;
        double n1, n2, media, media_classe, total_classe = 0;

        for (cont = 1; cont <= 6; cont++) {
            System.out.println("Digite as duas notas do aluno " + cont + ":");
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();

            media = (n1 + n2) / 2;

            System.out.println("Média: " + media);

            if (media <= 3) {
                tr = tr + 1;
                System.out.println("Reprovado");
            } else if (media > 3 && media < 7) {
                te = te + 1; 
                System.out.println("Exame");
            } else if (media >= 7) {
                ta = ta + 1; 
                System.out.println("Aprovado");
            }

            total_classe = total_classe + media;
        }

        System.out.println("Total de alunos aprovados: " + ta);
        System.out.println("Total de alunos de exame: " + te);
        System.out.println("Total de alunos reprovados: " + tr);

        media_classe = total_classe / 6;
        System.out.println("Média da classe: " + media_classe);
	}

}
