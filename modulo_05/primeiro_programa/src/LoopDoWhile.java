import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        do {
            System.out.print("Digite um número entre 1 e 10: ");
            num =  scan.nextInt();
        } while (num < 1 || num > 10);

        System.out.println("O número digitdo foi " + num);

        scan.close();
    }
}
