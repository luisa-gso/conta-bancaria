import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Caixa c1 = new Caixa();
    System.out.println("Entre com o valor de saque: ");
    int saque = input.nextInt();
    c1.calculo(saque);
    System.out.println("impressão da quantidade de notas");
    c1.imprimir();
  }
}