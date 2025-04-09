public class CalculadoraIMC {
    public static void main(String[] args) {
        // peso div (altura * altura)
        float peso = 90.0f;
        float altura = 1.70f;

        float resultado = peso / (altura * altura);

        System.out.println("O imc para o peso " + peso + " e altura " + " é " + resultado);
    }
}
