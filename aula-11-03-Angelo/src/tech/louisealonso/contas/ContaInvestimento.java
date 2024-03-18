package tech.louisealonso.contas;

class ContaInvestimento extends Conta {
    private double taxa;

    public ContaInvestimento(double taxa) {
        super();
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }
}