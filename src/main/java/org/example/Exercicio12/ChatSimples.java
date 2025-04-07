package org.example.Exercicio12;

import java.util.Scanner;

public class ChatSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando os nomes dos usuários
        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        String[] mensagens = new String[10]; // Array para armazenar as mensagens
        int contadorMensagens = 0; // Contador de mensagens enviadas

        // Alternando entre os usuários para envio de mensagens
        while (contadorMensagens < 10) {
            String remetente = (contadorMensagens % 2 == 0) ? usuario1 : usuario2; // Alterna o usuário
            System.out.print(remetente + ", digite sua mensagem: ");
            String mensagem = scanner.nextLine();

            mensagens[contadorMensagens] = remetente + ": " + mensagem; // Armazena a mensagem no array
            contadorMensagens++;
        }

        // Exibindo o histórico de mensagen
        System.out.println("\n===== Histórico de Mensagens =====");
        for (String msg : mensagens) {
            System.out.println(msg);
        }

        // Mensagem de despedid
        System.out.println("\nObrigado por utilizarem o sistema!");

        scanner.close();
    }
}