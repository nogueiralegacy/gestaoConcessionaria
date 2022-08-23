package negocio;

public class TransacaoDeVenda extends Transacao {
    private ColaboradorVendedor colaboradorVendedor;

    public TransacaoDeVenda(Cliente cliente, Concessionaria concessionaria, Veiculo veiculo,
            double montante, long id, ColaboradorVendedor colaboradorVendedor) {
        super(cliente, concessionaria, veiculo, TransacaoStatus.VENDA, montante, id);
        this.colaboradorVendedor = colaboradorVendedor;
    }

    @Override
    public ColaboradorVendedor getColaboradorVendedor() {
        return colaboradorVendedor;
    }

    public void setColaboradorVendedor(ColaboradorVendedor colaboradorVendedor) {
        this.colaboradorVendedor = colaboradorVendedor;
    }
}
