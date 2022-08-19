package negocio;

import java.time.LocalDateTime;

public class TransacaoDeVenda extends Transacao {
    private ColaboradorVendedor colaboradorVendedor;

    public TransacaoDeVenda(Cliente cliente, Concessionaria concessionaria, Veiculo veiculo, TransacaoStatus status,
            LocalDateTime dataHora, double montante, long id, ColaboradorVendedor colaboradorVendedor) {
        super(cliente, concessionaria, veiculo, status, dataHora, montante, id);
        this.colaboradorVendedor = colaboradorVendedor;
    }

    public ColaboradorVendedor getColaboradorVendedor() {
        return colaboradorVendedor;
    }

    public void setColaboradorVendedor(ColaboradorVendedor colaboradorVendedor) {
        this.colaboradorVendedor = colaboradorVendedor;
    }
}
