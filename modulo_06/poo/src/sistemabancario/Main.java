package sistemabancario;

public class Main {
    public static void main(String[] args) {

        Cliente fulano = new Cliente("123456789", "Fulano");
        Conta contaFulano = new Conta(fulano, 1000, 50);

        Cliente cicrano = new Cliente("987654321", "Cicrano");
        Conta contaCicrano = new Conta(cicrano, 1001, -50);

        Banco sistemaBancario = new Banco();

        contaFulano.imprimirSaldo();

        System.out.println("Depositando 100 reais");
        sistemaBancario.depositar(contaFulano, 100d);
        contaFulano.imprimirSaldo();

        System.out.println("Sacando 30 reais");
        sistemaBancario.sacar(contaFulano, 30d);
        contaFulano.imprimirSaldo();

        System.out.println("Sacando 200 reais");
        sistemaBancario.sacar(contaFulano, 200d);
        contaFulano.imprimirSaldo();

        System.out.println("---------------------------");
        contaFulano.imprimirSaldo();
        contaCicrano.imprimirSaldo();
        System.out.println("Transferindo 120 reais de fulano para cicrano");
        sistemaBancario.transferir(contaFulano, contaCicrano, 121d);
        contaFulano.imprimirSaldo();
        contaCicrano.imprimirSaldo();



    }
}
