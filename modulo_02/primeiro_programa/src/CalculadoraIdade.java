public class CalculadoraIdade {

    public static void main(String[] args) {

        //1 -> pegar o ano atual
        //2 -> pegar o ano de nascimento
        // 3 -> subtrair o ano atual - ano de nascimento

        int anoAtual = 2039;
        int anoNascimento = 1985;

        int resultado = anoAtual - anoNascimento;

        System.out.println("A idade é " + resultado);

    }
}
