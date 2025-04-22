import java.util.Scanner;
public class TP02Ex3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n;


            while (true) {
                System.out.print("Digite a quantidade de valores (maior que 0 e menor que 20): ");
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                    if (n > 0 && n < 20) {
                        break;
                    } else {
                        System.out.println("Erro: o valor deve ser maior que 0 e menor que 20.");
                    }
                } else {
                    System.out.println("Erro: entrada inválida. Digite um número inteiro.");
                    scanner.next();

                }
            }

            double[] valores = new double[n];
            double soma = 0;
            int positivos = 0;
            int negativos = 0;


            for (int i = 0; i < n; i++) {
                System.out.print("Digite o " + (i + 1) + "º valor: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Erro: digite um número válido.");
                    scanner.next();
                    System.out.print("Digite o " + (i + 1) + "º valor: ");
                }
                valores[i] = scanner.nextDouble();
                soma += valores[i];

                if (valores[i] > 0) {
                    positivos++;
                } else if (valores[i] < 0) {
                    negativos++;
                }
            }


            double maior = valores[0];
            double menor = valores[0];

            for (int i = 1; i < n; i++) {
                if (valores[i] > maior) {
                    maior = valores[i];
                }
                if (valores[i] < menor) {
                    menor = valores[i];
                }
            }

            double media = soma / n;
            double porcentagemPositivos = (positivos * 100.0) / n;
            double porcentagemNegativos = (negativos * 100.0) / n;

            System.out.println("\nResultados:");
            System.out.println("a. Maior valor: " + maior);
            System.out.println("b. Menor valor: " + menor);
            System.out.println("c. Soma dos valores: " + soma);
            System.out.println("d. Média aritmética: " + media);
            System.out.printf("e. Porcentagem de valores positivos: %.2f%%\n", porcentagemPositivos);
            System.out.printf("f. Porcentagem de valores negativos: %.2f%%\n", porcentagemNegativos);
        }
    }

