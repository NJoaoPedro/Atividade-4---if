import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        int maior;

        if (num1 > num2) {
            maior = num1;
        } else {
            maior = num2;
        }

        System.out.println("O maior numero e: " + maior);
    }
}
