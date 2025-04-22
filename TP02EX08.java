import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TP02EX08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> matriz = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            List<Integer> linha = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite o número a ser adicionado: ");
                Integer valor = sc.nextInt();
                linha.add(valor);
            }
            matriz.add(linha);
        }

        System.out.printf("Digite a constante a ser utilizada: ");
        Integer constante = sc.nextInt();

        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                matriz.get(i).set(j, matriz.get(i).get(j) * constante);
            }
        }

        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                System.out.printf("%3d", matriz.get(i).get(j));
            }
            System.out.println();
        }
    sc.close();
    }
}