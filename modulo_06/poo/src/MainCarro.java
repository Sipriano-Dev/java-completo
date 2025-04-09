public class MainCarro {
    public static void main(String[] args) {

        Carro punto = new Carro();
        punto.cavalos = 100;
        punto.cor = "Preto";
        punto.montadora = "Fiat";
        punto.transmissao = "Automática";

        Carro civic = new Carro();
        civic.cavalos = 150;
        civic.cor = "Prata";
        civic.montadora = "Honda";
        civic.transmissao = "Automática";

        System.out.println("Cavalos do punto: " + punto.cavalos);
        System.out.println("Transmissão do civic: " + civic.transmissao);
    }
}
