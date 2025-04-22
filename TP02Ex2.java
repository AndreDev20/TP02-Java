import java.util.Scanner;

public class TP02Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        int maior = 0;
        int soma =0;
        double media = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor para n[" + i + "]:");
            n[i] = sc.nextInt();

            if(n[i] > maior){
                maior = n[i];
            }
            soma += n[i];
            media = soma/10;

        }

        System.out.println("O maior valor foi: " + maior);
        System.out.println("A soma dos valores foi: " + soma);
        System.out.println("A media dos valores foi: " + media);


    }
}
