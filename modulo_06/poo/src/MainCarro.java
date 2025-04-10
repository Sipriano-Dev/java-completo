public class MainCarro {
    public static void main(String[] args) {

        Carro punto = new Carro();
        punto.cavalos = 100;
        punto.cor = "Preto";
        punto.montadora = "Fiat";
        punto.transmissao = "Automática";
        punto.capacidadeTanque = 50;
        punto.combustivel = 0;
        punto.kmPorLitro = 10;

        Carro civic = new Carro();
        civic.cavalos = 150;
        civic.cor = "Prata";
        civic.montadora = "Honda";
        civic.transmissao = "Automática";
        civic.capacidadeTanque = 48;
        civic.combustivel = 10;
        civic.kmPorLitro = 8;

        System.out.println("Combustível do punto: " + punto.combustivel);
        System.out.println("Combustível do civic: " + civic.combustivel);
        System.out.println();

        System.out.println("Após abastecimento: ");

        punto.abastecer(70);
        System.out.println("Combustível do punto: " + punto.combustivel);

        civic.abastecer(30);
        System.out.println("Combustível do civic: " + civic.combustivel);

        System.out.println();

        System.out.print("Punto autonomia: " + punto.autonomiaCombustivel() + "Km");
        System.out.println();
        System.out.print("Civic autonomia: " + civic.autonomiaCombustivel() + "Km");

    }
}
