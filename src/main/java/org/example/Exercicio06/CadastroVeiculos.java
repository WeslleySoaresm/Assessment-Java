package org.example.Exercicio06;

// Definição da classe Veiculo
class Veiculo {
    // Atributos do veículo
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    // Construtor da classe
    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    // Método para exibir os detalhes do veículo
    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("---------------------------");
    }

    // Método para registrar uma viagem e atualizar a quilometragem
    public void registrarViagem(double km) {
        if (km > 0) {
            quilometragem += km;
            System.out.println("Viagem registrada! Quilometragem atualizada para " + quilometragem + " km.");
        } else {
            System.out.println("Erro: A distância da viagem deve ser positiva.");
        }
    }
}

// Classe principal para testar o sistema
public class CadastroVeiculos {
    public static void main(String[] args) {

        Veiculo carro1 = new Veiculo("ABC-1234", "Toyota Corolla", 2020, 25000.0);
        Veiculo carro2 = new Veiculo("XYZ-5678", "Honda Civic", 2018, 45000.0);


        System.out.println("Detalhes dos Veículos:");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();


        System.out.println("Registrando viagens...");
        carro1.registrarViagem(150.5);
        carro2.registrarViagem(300.2);


        System.out.println("\nDetalhes Atualizados:");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}