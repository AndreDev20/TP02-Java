import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TP02EX11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Double>> matriz = new ArrayList<>();

        System.out.println("Digite a ordem da matriz quadrada M (MxM, máximo 10):");
        int M = sc.nextInt();

        if (M < 1 || M > 10) {
            System.out.println("Ordem inválida. M deve estar entre 1 e 10.");
            return;
        }

        for (int i = 0; i < M; i++) {
            List<Double> linha = new ArrayList<>();
            for (int j = 0; j < M; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                linha.add(sc.nextDouble());
            }
            matriz.add(linha);
        }

        double determinante = calcularDeterminante(matriz);
        System.out.println("\nDeterminante da matriz: " + determinante);
        sc.close();
    }

    public static double calcularDeterminante(List<List<Double>> matriz) {
        int ordem = matriz.size();

        if (ordem == 1) {
            return matriz.get(0).get(0);
        }

        if (ordem == 2) {
            return matriz.get(0).get(0) * matriz.get(1).get(1) - matriz.get(0).get(1) * matriz.get(1).get(0);
        }

        double det = 0.0;
        for (int j = 0; j < ordem; j++) {
            List<List<Double>> menor = new ArrayList<>();
            for (int i = 1; i < ordem; i++) {
                List<Double> novaLinha = new ArrayList<>();
                for (int k = 0; k < ordem; k++) {
                    if (k != j) {
                        novaLinha.add(matriz.get(i).get(k));
                    }
                }
                menor.add(novaLinha);
            }
            det += Math.pow(-1, j) * matriz.get(0).get(j) * calcularDeterminante(menor);
        }
        return det;
    }
}
