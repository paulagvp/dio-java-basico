package EquilibrandoSaldo;
import java.util.Scanner;

public class EquilibrandoSaldo1 {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            double saldoAtual = scanner.nextDouble();
            double valorDeposito = scanner.nextDouble();
            double valorRetirada = scanner.nextDouble();

            final double novoSaldo = saldoAtual + valorDeposito - valorRetirada;

            System.out.println("Saldo atualizado na conta:  " + novoSaldo);
        }
    }
    
}
