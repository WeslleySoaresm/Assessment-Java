package org.example.Exercicio09;

// Classe ContaBancaria com encapsulamento
class ContaBancaria {
    private String titular; // Nome do titular da conta
    private double saldo; // Saldo da conta (privado)

    // Construtor para inicializar a conta com titular e saldo inicial
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }

    // Método para sacar dinheiro (verifica se há saldo suficiente)
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser positivo.");
        } else {
            System.out.println("Erro: Saldo insuficiente para saque.");
        }
    }

    // Método para exibir o saldo atual
    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Atual: R$ " + String.format("%.2f", saldo));
    }
}

// Classe principal para testar a conta bancária
public class Banco {
    public static void main(String[] args) {
        // Criando uma conta bancária para um cliente
        ContaBancaria conta = new ContaBancaria("João Silva", 1000.00);

        // Exibindo saldo inicial
        conta.exibirSaldo();

        // Realizando operações bancárias
        System.out.println("\nRealizando operações...");
        conta.depositar(500.00); // Deposita R$ 500
        conta.sacar(200.00); // Saca R$ 200
        conta.sacar(2000.00); // Tentativa de saque sem saldo suficiente

        // Exibindo saldo final
        System.out.println("\nSaldo Final:");
        conta.exibirSaldo();
    }
}