import java.util.Scanner;

public class CalcularNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a nota do primeiro trimestre: ");
        float trimestre1 = teclado.nextFloat();

        System.out.print("Digite a nota do primeiro trimestre: ");
        float trimestre2 = teclado.nextFloat();

        System.out.print("Digite a nota do primeiro trimestre: ");
        float trimestre3 = teclado.nextFloat();

        float media = (trimestre1 + trimestre2 + trimestre3) / 3;
        System.out.println("A média é: " + media);

        if (media >= 6) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }


        teclado.close();
    }
}
