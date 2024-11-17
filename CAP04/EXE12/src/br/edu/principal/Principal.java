package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("| Código |    Cargo     |    Percentual   |");
        System.out.println("|   1    | Escriturário |       50%       |");
        System.out.println("|   2    |  Secretário  |       35%       |");
        System.out.println("|   3    |    Caixa     |       20%       |");
        System.out.println("|   4    |   Gerente    |       10%       |");
        System.out.println("|   5    |   Diretor    | Não tem aumento |");
        
		Scanner sc = new Scanner(System.in);
		double salario, aumento, novo_salario;
        int cargo;

        System.out.print("Digite o cargo do funcionário (1, 2, 3, 4 ou 5): ");
        cargo = sc.nextInt();

        System.out.print("Digite o valor do salário: ");
        salario = sc.nextDouble();

        if (cargo == 1) {
            System.out.println("O cargo é Escriturário");
            aumento = salario * 50 / 100;
            System.out.println("O valor do aumento é: " + aumento);
            novo_salario = salario + aumento;
            System.out.println("O novo salário é: " + novo_salario);
        } else if (cargo == 2) {
            System.out.println("O cargo é Secretário");
            aumento = salario * 35 / 100;
            System.out.println("O valor do aumento é: " + aumento);
            novo_salario = salario + aumento;
            System.out.println("O novo salário é: " + novo_salario);
        } else if (cargo == 3) {
            System.out.println("O cargo é Caixa");
            aumento = salario * 20 / 100;
            System.out.println("O valor do aumento é: " + aumento);
            novo_salario = salario + aumento;
            System.out.println("O novo salário é: " + novo_salario);
        } else if (cargo == 4) {
            System.out.println("O cargo é Gerente");
            aumento = salario * 10 / 100;
            System.out.println("O valor do aumento é: " + aumento);
            novo_salario = salario + aumento;
            System.out.println("O novo salário é: " + novo_salario);
        } else if (cargo == 5) {
            System.out.println("O cargo é Diretor");
            aumento = salario * 0 / 100;
            System.out.println("O valor do aumento é: " + aumento);
            novo_salario = salario + aumento;
            System.out.println("O novo salário é: " + novo_salario);
        } else {
            System.out.println("Cargo Inexistente!");
        }
	}

}
