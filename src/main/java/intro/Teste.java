// 1 - Pacote
package intro;

public class Teste {
     // 3.1 - Atributo - Caracteristicas

    // 3.2 - Métodos e funções
   public static void main(String[] args) {

       calcularAreaModoExtenso();
       calcularAreaModoCurto();
   }

       public static void calcularAreaModoCurto(){
       System.out.println("Cálculo de areas Modo curto");

       // Calculo de area - Reduzido
       int largura = 4;
       int comprimento = 3;

       System.out.println(" Para a largura de " + largura + "m e o comprimento de "
               + comprimento + "m A área é de " + largura * comprimento + "m²");

   }

public static void  calcularAreaModoExtenso(){
    System.out.println("Cálculo de areas Modo Extenso");
       // Calculo de área - Exemplo: o tamanho do tapete ou do piso
       int largura;
       int comprimento;
       int resultado;

       largura = 5; // largura recebe 4
       comprimento = 6;

       resultado = largura * comprimento;
       System.out.println(" Para a largura de " + largura + "m e o comprimento de "
               + comprimento + "m A área é de " + resultado + "m²");

   }
}
