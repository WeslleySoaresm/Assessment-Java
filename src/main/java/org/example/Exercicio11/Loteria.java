package org.example.Exercicio11;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Loteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gerando os 6 números aleatórios da loteria (sem repetições)
        Set<Integer> numerosSorteados = new HashSet<>();
        while (numerosSorteados.size() < 6) {
            numerosSorteados.add(random.nextInt(60) + 1);
        }

        // Pedindo os 6 números ao usuário
        Set<Integer> numerosUsuario = new HashSet<>();
        System.out.println("Digite 6 números entre 1 e 60:");

        while (numerosUsuario.size() < 6) {
            System.out.print("Número " + (numerosUsuario.size() + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 60) {
                System.out.println("Número inválido! Digite um número entre 1 e 60.");
            } else if (!numerosUsuario.add(numero)) {
                System.out.println("Número repetido! Digite um número diferente.");
            }
        }

        // Calculando quantos números o usuário acertou
        Set<Integer> acertos = new HashSet<>(numerosUsuario);
        acertos.retainAll(numerosSorteados); // Mantém apenas os números que coincidem

        // Exibindo os resultados
        System.out.println("\nNúmeros sorteados: " + numerosSorteados);
        System.out.println("Seus números: " + numerosUsuario);
        System.out.println("Você acertou " + acertos.size() + " número(s): " + acertos);

        scanner.close();
    }
}