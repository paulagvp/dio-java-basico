

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            
            System.out.println("Digite o saldo atual:");

            double saldoAtual = scanner.nextDouble();

            System.out.println("Digite o valor do depósito:");

            double valorDeposito = scanner.nextDouble();

            System.out.println("Digite o valor a ser sacado:");
            double valorRetirada = scanner.nextDouble();

            final double novoSaldo = saldoAtual + valorDeposito - valorRetirada;

            System.out.println("Saldo atualizado na conta: " + novoSaldo);
        }
    }
}
