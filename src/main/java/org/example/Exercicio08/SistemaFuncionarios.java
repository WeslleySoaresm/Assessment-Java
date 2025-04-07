package org.example.Exercicio08;

// Classe base Funcionario
class Funcionario {
    protected String nome;
    protected double salarioBase;

    // Construtor da classe Funcionario
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método para calcular o salário final (pode ser sobrescrito nas subclasses)
    public double calcularSalario() {
        return salarioBase;
    }

    // Método para exibir informações do funcionário
    public void exibirSalario() {
        System.out.println(nome + " - Salário Final: R$ " + String.format("%.2f", calcularSalario()));
    }
}

// Subclasse Gerente (herda de Funcionario)
class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // Gerente recebe um bônus de 20%
    @Override
    public double calcularSalario() {
        return salarioBase * 1.2;
    }
}

// Subclasse Estagiario (herda de Funcionario)
class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // Estagiário tem um desconto de 10%
    @Override
    public double calcularSalario() {
        return salarioBase * 0.9;
    }
}

// Classe principal para testar o sistema
public class SistemaFuncionarios {
    public static void main(String[] args) {
        // Criando um gerente e um estagiário
        Funcionario gerente = new Gerente("Carlos Silva", 5000.00);
        Funcionario estagiario = new Estagiario("Ana Souza", 2000.00);

        // Exibindo os salários finais
        System.out.println("Salários dos Funcionários:");
        gerente.exibirSalario();
        estagiario.exibirSalario();
    }
}