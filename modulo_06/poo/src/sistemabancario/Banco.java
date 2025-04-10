package sistemabancario;

public class Banco {

    public void depositar(Conta conta, double valor) {
        double saldoAtual = conta.saldo;
        double novoSaldo = saldoAtual + valor;
        conta.saldo = novoSaldo;
    }

    public void sacar(Conta conta, double valor) {
        double saldoAtual = conta.saldo;
        double novoSaldo = saldoAtual - valor;
        if (novoSaldo < 0) {
            System.out.println("Não foi possível sacar, saldo insuficiente");
        } else {
            conta.saldo = novoSaldo;
        }

    }

    public void transferir(Conta origem, Conta destino, double valor) {
        double saldoAtualOrigem = origem.saldo;
        double novoSaldoOrigem = saldoAtualOrigem - valor;
        if (novoSaldoOrigem < 0) {
            System.out.println("Não foi possível transferir, saldo insuficiente");
        } else {
            origem.saldo = novoSaldoOrigem;
            double novoSaldoDestino = destino.saldo + valor;
            destino.saldo = novoSaldoDestino;
        }
    }

}
