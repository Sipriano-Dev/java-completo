import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int contador = scan.nextInt();
        int valor = 0;
        while (valor <= contador) {
            if (valor % 2 == 0) {
                System.out.println("Número " + valor);
            }
            valor++;
        }

        scan.close();
    }
}
