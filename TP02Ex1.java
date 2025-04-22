import java.util.Scanner;

public class TP02Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n1 = sc.nextInt();
        System.out.print("Enter an integer: ");
        int n2 = sc.nextInt();
        while (n2 <= n1) {
            System.out.println("n2 deve ser maior que n1");
            System.out.println("Digite um valor para n2: ");
            n2 = sc.nextInt();

        }
    }
}
