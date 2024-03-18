package tech.louisealonso.contas;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        conta1.numero = 1;
        conta1.saldo = 10000;
        conta2.numero = 91;
        conta2.saldo = 10;

        System.out.println("Numero da conta 1: " + conta1.numero);
        System.out.println("Saldo da conta 1: " + conta1.saldo);

        conta1.depositar(1000);
        conta2.sacar(500);
        System.out.println("Saldo da conta: " + conta1.getSaldo());

        ContaEspecial contaEspecial = new ContaEspecial(1000);
        contaEspecial.depositarComDesconto(1500, 10); // 10% de desconto
        contaEspecial.sacar(2000);
        System.out.println("Saldo da conta especial: " + contaEspecial.getSaldo());
        System.out.println("Limite da conta especial: " + contaEspecial.getLimite());

        ContaInvestimento contaInvestimento = new ContaInvestimento(0.05);
        contaInvestimento.depositar(2000);
        contaInvestimento.sacar(1000);
        System.out.println("Saldo da conta de investimento: " + contaInvestimento.getSaldo());
        System.out.println("Taxa da conta de investimento: " + contaInvestimento.getTaxa());
    }
}
