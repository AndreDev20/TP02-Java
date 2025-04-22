import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TP02EX09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> matriz = new ArrayList<>();

        System.out.println("Digite M de forma a ser utilizado como [M]xN: ");
        int M = sc.nextInt();

        if(M < 1 || M > 10) {
            throw new RuntimeException("O valor deve estar entre 1 e 10.");
        }

        System.out.println("Digite N de forma a ser utilizado como Mx[N]: ");
        int N = sc.nextInt();

        if(N < 1 || N > 10) {
            throw new RuntimeException("O valor deve estar entre 1 e 10.");
        }

        System.out.println("Digite os elementos da matriz " + M + "x" + N + ":");
        for (int i = 0; i < M; i++) {
            List<Integer> linha = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                Integer valor = sc.nextInt();
                linha.add(valor);
            }
            matriz.add(linha);
        }

        List<List<Integer>> matrizTransposta = new ArrayList<>();

        for (int j = 0; j < N; j++) {
            matrizTransposta.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrizTransposta.get(j).add(matriz.get(i).get(j));
            }
        }

        System.out.println("\nMatriz transposta:");
        for (List<Integer> linha : matrizTransposta) {
            for (Integer elemento : linha) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}