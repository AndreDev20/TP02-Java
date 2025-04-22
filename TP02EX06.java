import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TP02EX06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<String>> matriz = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            List<String> linha = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o número a ser adicionado: ");
                String nome = sc.nextLine();
                linha.add(nome);
            }
            matriz.add(linha);
        }
        System.out.println(matriz);
        sc.close();
    }
}