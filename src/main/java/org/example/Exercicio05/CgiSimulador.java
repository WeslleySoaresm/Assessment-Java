package org.example.Exercicio05;

public class CgiSimulador {
    public static void main(String[] args) {
        // Imprimir o cabeçalho HTTP obrigatório
        System.out.println("Content-Type: text/html");
        System.out.println(); // Linha em branco para separar headers do corpo da resposta

        // Imprimir o corpo da resposta em formato HTML
        System.out.println("<html>");
        System.out.println("<head><title>Saudação CGI</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Olá, Terráqueos!</h1>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}