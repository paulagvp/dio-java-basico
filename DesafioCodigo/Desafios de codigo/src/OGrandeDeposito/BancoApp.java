package OGrandeDeposito;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        var valor = scanner.nextDouble();

        double valor2 = valor;
        if (valor2 > 0) {
        System.out.println("Deposito realizado com sucesso!");
        
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Saldo atual: R$ " +  df.format(valor2));
        
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
        } else if (valor2 == 0) {
            //TODO: Imprimir a mensagem de valor inválido.
             System.out.println("Encerrando o programa...");
    
        } else {
             //TODO: Imprimir a mensagem de encerrar o programa.
             System.out.println("Valor invalido! Digite um valor maior que zero.");
              
        }
    }
}
