import java.util.Scanner;

public class Exercicio1 {

        public static void main(String[] args) {

            int[][] matriz = new int[2][4];
            Scanner scanner = new Scanner(System.in);
           
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {

                    System.out.println("Digite o número na matriz posição: [" + (i + 1) + "][" + (j + 1) + "]");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Matriz: ");
            System.out.print("[");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j]);
                    if (i == 1 && j == 3) {
                        System.out.print("]");
                    }
                    else {
                        System.out.print(", ");
                    }
                }
                System.out.println();

            }


        }

}
