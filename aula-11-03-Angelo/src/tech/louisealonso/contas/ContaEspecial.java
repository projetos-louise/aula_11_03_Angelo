package tech.louisealonso.contas;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(double limite) {
        super();
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void depositarComDesconto(double valor, double desconto) {
        double valorDescontado = valor - (valor * (desconto / 100));
        if (valorDescontado > 0) {
            this.saldo += valorDescontado;
            System.out.println("Depósito de " + valor + " realizado com desconto de " + desconto + "%: " + valorDescontado + " (Valor original: " + valor + ")");
        } else {
            System.out.println("Valor inválido para depósito após aplicar o desconto.");
        }
    }
}
