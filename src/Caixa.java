public class Caixa {
   private int cont100 = 0;
   private int cont50 = 0;
   private int cont20 = 0;
   private int cont10 = 0;

   public void calculo(int saque) {
      if (saque >= 100) {
         cont100++;
         saque -= 100;
      }
      if (saque >= 50) {
         cont50++;
         saque -= 50;
      }
      if (saque >= 20) {
         cont20++;
         saque -= 20;
      }
      if (saque >= 10) {
         cont10++;
         saque -= 10;
      }
   }

   public void imprimir() {
      System.out.println(cont100 + " notas de 100");
      System.out.println(cont50 + " notas de 50");
      System.out.println(cont20 + " notas de 20");
      System.out.println(cont10 + " notas de 10");
   }

}
