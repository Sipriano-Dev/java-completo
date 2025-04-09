import java.util.Scanner;

public class ContagemLetras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine();

        int quantidadeLetras = 0;

        for (int indice = 0; indice < frase.length(); indice++) {
            char letraDaVez = frase.charAt(indice);
            boolean isLetra = Character.isLetter(letraDaVez);
            if (isLetra) {
                quantidadeLetras++;
            }
        }

        System.out.print("A quantidade de letras é: " + quantidadeLetras);
    }
}
