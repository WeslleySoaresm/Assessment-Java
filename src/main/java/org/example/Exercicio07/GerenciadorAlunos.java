package org.example.Exercicio07;

import java.util.Scanner;

// Definição da classe Aluno
class Aluno {
    // Atributos do aluno
    private String nome;
    private String matricula;
    private double nota1, nota2, nota3;

    // Construtor para inicializar os atributos
    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Método para calcular a média das três notas
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para verificar se o aluno está aprovado ou reprovado
    public void verificarAprovacao() {
        double media = calcularMedia();
        System.out.println("\nAluno: " + nome + " (Matrícula: " + matricula + ")");
        System.out.println("Média Final: " + String.format("%.2f", media));

        if (media >= 7) {
            System.out.println("Status: APROVADO ");
        } else {
            System.out.println("Status: REPROVADO ");
        }
    }
}

// Classe principal para executar o programa
public class GerenciadorAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Criando o objeto Aluno com os dados fornecidos
        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);

        // Exibindo a situação final do aluno
        aluno.verificarAprovacao();

        scanner.close();
    }
}