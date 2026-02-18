package domain.entity.model;



public class Conta {
    private static final double LIMITE_CHEQUE_ESPECIAL_PADRAO = 500.0;
    private final String numero;
    private double saldo;

    public Conta(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Número de conta é obrigatório.");
        }
        this.numero = numero;
        this.saldo = 0.0;

    }

    public void sacar(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque.");
        }

        if (saldo - valor < -LIMITE_CHEQUE_ESPECIAL_PADRAO) {
            throw new IllegalArgumentException("Limite da conta excedido.");
        }
        saldo -= valor;
    }

    public void depositar (double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de deposito invalido.");
        }
        saldo += valor;
    }


    public void transferenciaBancariaParaContaDeTerceiros(Conta destino, double valor) {

        if (destino == null) {
            throw new IllegalArgumentException("Conta destino inválida.");
        }

        if (this == destino) {
            throw new IllegalArgumentException("Não pode transferir para mesma conta.");
        }

        this.sacar(valor);
        destino.depositar(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
}
