import java.util.Scanner;

public class TP02Ex5 {
    public static void main(String[] args) {
        int [][]n = new int[3][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 6 valores inteiros: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                System.out.println("Digite um valor para n[" + i + "]: n[" + j + "] ");
                while(!sc.hasNextInt()){
                    System.out.println("Erro, digite um valor valido");
                    sc.next();
                    System.out.println("Digite um valor para n[" + i + "]: n[" + j + "] ");
                }
                n[i][j] = sc.nextInt();
            }

        }

        System.out.println("Matriz 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }
}
