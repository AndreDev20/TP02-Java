import java.util.Scanner;

public class Tp02Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]n = new int[2][3];
        System.out.println("Digite 6 valores inteiros: ");
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Digite um valor para n[" + i + "]: n[" + j + "]: ");
                while(!sc.hasNextInt()){
                    System.out.println("Erro: Digite um valor valido!");
                    sc.next();
                    System.out.println("Digite um valor para n[" + i + "]: n[" + j + "]: ");
                }
                n[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatriz 2x3");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(n[i][j]  + "\t");
            }
            System.out.println();
        }
    }
}
