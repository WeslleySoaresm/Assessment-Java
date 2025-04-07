package org.example.Exercicio04;
import java.util.Scanner;

public class SimuladorEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();


        System.out.print("Digite o valor do empréstimo: R$ ");
        double valorEmprestimo = scanner.nextDouble();

        int parcelas;
        while (true) {

            System.out.print("Digite a quantidade de parcelas (entre 6 e 48): ");
            parcelas = scanner.nextInt();


            if (parcelas >= 6 && parcelas <= 48) {
                break; // Sai do loop se o número de parcelas for válido
            } else {
                System.out.println("Erro: O número de parcelas deve estar entre 6 e 48. Tente novamente.");
            }
        }

        // Definição da taxa de juros
        double taxaJuros = 0.03; // 3% ao mês

        // Cálculo da prestação usando a fórmula de financiamento (Tabela Price)
        double valorParcela = calcularParcela(valorEmprestimo, taxaJuros, parcelas);

        // Cálculo do valor total pago ao final do empréstimo
        double totalPago = valorParcela * parcelas;

        // Exibir os resultados
        System.out.println("\nSimulação de Empréstimo para " + nome + ":");
        System.out.println("Valor do Empréstimo: R$ " + String.format("%.2f", valorEmprestimo));
        System.out.println("Número de Parcelas: " + parcelas);
        System.out.println("Valor da Parcela: R$ " + String.format("%.2f", valorParcela));
        System.out.println("Total Pago ao final do empréstimo: R$ " + String.format("%.2f", totalPago));

        scanner.close();
    }

    // Método para calcular o valor da parcela usando a fórmula do Sistema Price
    public static double calcularParcela(double valor, double juros, int meses) {
        return valor * (juros * Math.pow(1 + juros, meses)) / (Math.pow(1 + juros, meses) - 1);
    }
}