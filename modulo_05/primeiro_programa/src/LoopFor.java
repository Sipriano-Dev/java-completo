import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int valor = scan.nextInt();

        for (int cont=1; cont<=valor; cont++) {
            System.out.println(cont);
        }

        scan.close();
    }
}
