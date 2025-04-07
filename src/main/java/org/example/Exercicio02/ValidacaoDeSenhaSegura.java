package org.example.Exercicio02;
import java.util.Scanner;

public class ValidacaoDeSenhaSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String senha;
        while (true) {

            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();


            String erro = validarSenha(senha);

            if (erro == null) {
                System.out.println("Senha cadastrada com sucesso para " + nome + "!");
                break;
            } else {
                System.out.println("Erro: " + erro + " Tente novamente.");
            }
        }

        scanner.close();
    }


    public static String validarSenha(String senha) {
        if (senha.length() < 8) {
            return "A senha deve ter no mínimo 8 caracteres.";
        }
        if (!senha.matches(".*[A-Z].*")) {
            return "A senha deve conter pelo menos uma letra maiúscula.";
        }
        if (!senha.matches(".*\\d.*")) {
            return "A senha deve conter pelo menos um número.";
        }
        if (!senha.matches(".*[@#$%^&*!].*")) {
            return "A senha deve conter pelo menos um caractere especial (@, #, $, etc.).";
        }
        return null;
    }
}