package org.example.Exercicio10;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class RegistroCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo = "compras.txt";

        try (FileWriter escritor = new FileWriter(nomeArquivo)) {
            // Cadastrando 3 compras
            for (int i = 1; i <= 3; i++) {
                System.out.println("Cadastro da compra " + i + ":");

                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                System.out.print("Preço unitário: ");
                double preco = scanner.nextDouble();
                scanner.nextLine(); // Limpa o buffer do scanner

                // Escrevendo no arquivo
                escritor.write(produto + "," + quantidade + "," + preco + "\n");
            }
            System.out.println("\nCompras registradas com sucesso no arquivo!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar as compras: " + e.getMessage());
        }

        // Lendo e exibindo os dados do arquivo
        System.out.println("\nCompras Registradas:");
        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                String produto = dados[0];
                int quantidade = Integer.parseInt(dados[1]);
                double preco = Double.parseDouble(dados[2]);
                double total = quantidade * preco;

                System.out.println("Produto: " + produto + " | Quantidade: " + quantidade +
                        " | Preço Unitário: R$ " + String.format("%.2f", preco) +
                        " | Total: R$ " + String.format("%.2f", total));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}