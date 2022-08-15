package entities;

public abstract class Transacao {
    private double montante;
    private ColaboradorVendedor vendedor;
    private Comprador comprador;
    private double comissaoVendedor;
    private Veiculo veiculo;
    private TransacaoStatus status;

    public Transacao(double montante, ColaboradorVendedor vendedor, Comprador comprador, double comissaoVendedor,
            Veiculo veiculo) {
        this.montante = montante;
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.comissaoVendedor = comissaoVendedor;
        this.veiculo = veiculo;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    public ColaboradorVendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(ColaboradorVendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public double getComissaoVendedor() {
        return comissaoVendedor;
    }

    public void setComissaoVendedor(double comissaoVendedor) {
        this.comissaoVendedor = comissaoVendedor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public TransacaoStatus getStatus() {
        return status;
    }

    public void setStatus(TransacaoStatus status) {
        this.status = status;
    }

}
