package JurosCompostos;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
    
        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();

        double valorFinal = calcularJuros(valorInicial, taxaJuros, periodo);
       
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
    
    public static double calcularJuros(double valorFinal, double taxaJuros, int periodo){
        return valorFinal * Math.pow(1 + taxaJuros, periodo);
    }

}


