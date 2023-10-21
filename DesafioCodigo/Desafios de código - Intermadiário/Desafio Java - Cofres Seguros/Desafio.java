import java.util.Scanner;

import javax.sound.midi.Soundbank;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class Desafio {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();

    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
        int senha = scanner.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senha);
            System.out.println("Tipo: Cofre Digital");
            System.out.println("Método de abertura: Senha");
            senha = scanner.nextInt();

            if(cofreDigital.validarSenha(senha)){
            System.out.println("Cofre aberto! ");
            } else {

                System.out.println("Senha incorreta!");
            }
                

    }
    else if (tipoCofre.equalsIgnoreCase("fisico")){
        CofreFisico cofreFisico = new CofreFisico();
        System.out.println("Método de abertura: Chave");
    } else {
        System.out.println("Tipo de cofre inválido.");
    }
  }

}