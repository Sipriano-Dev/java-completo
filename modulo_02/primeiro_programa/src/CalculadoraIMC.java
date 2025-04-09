import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        // peso div (altura * altura)
        System.out.print("Digite o seu peso: ");
        float peso = leitorTeclado.nextFloat();

        System.out.print("Digite sua altura em cm: ");
        float altura = leitorTeclado.nextFloat();

        float resultado = peso / ((altura / 100) * (altura / 100));

        System.out.println("O imc para o peso " + peso + " e altura " + " é " + resultado);

        leitorTeclado.close();
    }
}
