import java.util.Scanner;

public class E1Q2 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        int sumFirstColumn = 0;
        int productFirstRow = 1;
        int sumAllIndexes = 0;
        int sumDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o número na matriz posição: [" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz: ");
        System.out.print("[");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
                if (i == 2 && j == 2) {
                    System.out.print("]");
                } else {
                    System.out.print(", ");
                }
            }
            System.out.println();

        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            sumFirstColumn += matriz[i][0];
        }
        for (int i = 0; i < matriz.length; i++) {
            productFirstRow *= matriz[0][i];
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumAllIndexes += matriz[i][j];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            sumDiagonal += matriz[i][i];
        }

        System.out.println("First column indexes sum: " + sumFirstColumn);
        System.out.println("First row indexes product: " + productFirstRow);
        System.out.println("Sum all indexes:" + sumAllIndexes);
        System.out.println("Sum of diagonal indexes: " + sumDiagonal);

    }
}
