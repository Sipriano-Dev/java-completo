package sistemabancario;

public class Main {
    public static void main(String[] args) {

        Cliente fulano = new Cliente();
        fulano.nome = "Fulano";
        fulano.cpf = "123456789";

        Conta contaFulano = new Conta();
        contaFulano.titular = fulano;
        contaFulano.numero = 1000;
        contaFulano.saldo = 50;

        //--------------------------------

        Cliente cicrano = new Cliente();
        cicrano.nome = "Cicrano";
        cicrano.cpf = "987654321";

        Conta contaCicrano = new Conta();
        contaCicrano.titular = cicrano;
        contaCicrano.numero = 1001;
        contaCicrano.saldo = 0;


        Banco sistemaBancario = new Banco();

        contaFulano.imprimirSaldo();

        System.out.println("Depositando 50 reais");
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
