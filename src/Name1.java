import java.util.Scanner;

public class Name1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double[] vetor = new double[5];
        double qtdPares = 0;
        double menorValor = Double.MAX_VALUE;
        double media;


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o número na posição " + (i + 1));
            vetor[i] = s.nextDouble();
            if (vetor[i] % 2 == 0) {
                qtdPares++;
            }
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }


        double soma = 0;
        for (double valor : vetor) {
            soma += valor;
        }
        media = soma / vetor.length;


        int maioresQueMedia = 0;
        for (double valor : vetor) {
            if (valor > media) {
                maioresQueMedia++;
            }
        }


        System.out.println("O menor valor foi " + menorValor);
        System.out.println("Existem " + (int) qtdPares + " números pares.");
        System.out.println("Existem " + maioresQueMedia + " valores maiores que a média (" + media + ").");

        s.close();
    }
}