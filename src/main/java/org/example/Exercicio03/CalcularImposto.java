package org.example.Exercicio03;
import java.util.Scanner;

public class CalcularImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();


        System.out.print("Digite seu salário mensal: R$ ");
        double salarioMensal = scanner.nextDouble();


        double salarioAnual = salarioMensal * 12;


        double imposto = calcularImposto(salarioAnual);


        double salarioLiquido = salarioAnual - imposto;


        System.out.println("\nResumo Fiscal de " + nome + ":");
        System.out.println("Salário Anual: R$ " + String.format("%.2f", salarioAnual));
        System.out.println("Imposto a pagar: R$ " + String.format("%.2f", imposto));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));

        scanner.close();
    }


    public static double calcularImposto(double salarioAnual) {
        if (salarioAnual <= 22847.76) {
            return 0;
        } else if (salarioAnual <= 33919.80) {
            return salarioAnual * 0.075; // 7,5%
        } else if (salarioAnual <= 45012.60) {
            return salarioAnual * 0.15; // 15%
        } else {
            return salarioAnual * 0.275; // 27,5%
        }
    }
}