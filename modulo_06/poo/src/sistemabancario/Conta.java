package sistemabancario;

public class Conta {

    private Cliente titular;
    private int numero;
    private double saldo;


    public Conta(Cliente titular, int numero, double saldo) {
        if (titular == null) {
            //Lançar um erro no sistema
        }
        this.titular = titular;
        this.numero = numero;
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não alterado, Valor negativo");
        }
    }

    public void imprimirSaldo() {
        System.out.println("Saldo atual " + titular.getNome() + ": " + this.saldo);
    }

}
