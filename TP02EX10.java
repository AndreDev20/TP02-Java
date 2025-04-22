import java.util.Scanner;

public class TP02EX10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a ordem da matriz quadrada M (MxM), máximo 10:");
        int M = sc.nextInt();

        if (M < 1 || M > 10) {
            throw new RuntimeException("O valor de M deve estar entre 1 e 10.");
        }

        double[][] matriz = new double[M][M];
        double[][] identidade = new double[M][M];

        System.out.println("Digite os elementos da matriz " + M + "x" + M + ":");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
                identidade[i][j] = (i == j) ? 1.0 : 0.0;
            }
        }

        for (int i = 0; i < M; i++) {
            double pivo = matriz[i][i];
            if (pivo == 0) {
                System.out.println("A matriz não é invertível (divisão por zero).");
                return;
            }

            for (int j = 0; j < M; j++) {
                matriz[i][j] /= pivo;
                identidade[i][j] /= pivo;
            }

            for (int k = 0; k < M; k++) {
                if (k != i) {
                    double fator = matriz[k][i];
                    for (int j = 0; j < M; j++) {
                        matriz[k][j] -= fator * matriz[i][j];
                        identidade[k][j] -= fator * identidade[i][j];
                    }
                }
            }
        }

        System.out.println("\nMatriz original (transformada em identidade):");
        imprimirMatriz(matriz);

        System.out.println("\nMatriz inversa:");
        imprimirMatriz(identidade);

        sc.close();
    }

    private static void imprimirMatriz(double[][] matriz) {
        for (double[] linha : matriz) {
            for (double valor : linha) {
                System.out.printf("%.2f\t", valor);
            }
            System.out.println();
        }
    }
}

