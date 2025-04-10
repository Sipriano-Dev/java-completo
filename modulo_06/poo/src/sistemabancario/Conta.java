package sistemabancario;

public class Conta {

    Cliente titular;
    int numero;
    double saldo;

    Conta(){};

    Conta(Cliente titular, int numero, double saldo) {
        if (titular == null) {
            //Lançar um erro no sistema
        }
        this.titular = titular;
        this.numero = numero;
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    void imprimirSaldo() {
        System.out.println("Saldo atual " + titular.nome + ": " + this.saldo);
    }

}
