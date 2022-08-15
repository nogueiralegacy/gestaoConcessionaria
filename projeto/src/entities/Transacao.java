package entities;

public abstract class Transacao {
    private double montante;
    private Papel vendedor;
    private Papel comprador;
    private double comissaoVendedor;
    private Veiculo veiculo;
    private TransacaoStatus status;

    public Transacao(double montante, double comissaoVendedor,
            Veiculo veiculo, TransacaoStatus status) {
        this.montante = montante;
        this.comissaoVendedor = comissaoVendedor;
        this.veiculo = veiculo;
        this.status = status;
        if (status == TransacaoStatus.VENDA) {
            vendedor = Concessionaria.getInstance();
        }
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    public Papel getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Papel getComprador() {
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
