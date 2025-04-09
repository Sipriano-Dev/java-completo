import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class CalculadoraIdade {

    public static void main(String[] args) {

        //1 -> pegar o ano atual
        //2 -> pegar o ano de nascimento
        // 3 -> subtrair o ano atual - ano de nascimento

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = teclado.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = teclado.nextInt();

        int resultado = anoAtual - anoNascimento;

        System.out.println("A idade é " + resultado);

        teclado.close();
    }
}
