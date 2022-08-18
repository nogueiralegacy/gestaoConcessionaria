package negocio;

import java.time.LocalDateTime;

public abstract class Transacao {
    private Cliente cliente;
    private Concessionaria concessionaria;
    private Veiculo veiculo;
    private ColaboradorVendedor colaboradorVendedor;
    private TransacaoStatus status;
    private LocalDateTime dataHora;

    public Transacao(Cliente cliente, Concessionaria concessionaria, Veiculo veiculo,
            ColaboradorVendedor colaboradorVendedor, TransacaoStatus status, LocalDateTime dataHora) {
        this.cliente = cliente;
        this.concessionaria = concessionaria;
        this.veiculo = veiculo;
        this.colaboradorVendedor = colaboradorVendedor;
        this.status = status;
        this.dataHora = dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public ColaboradorVendedor getColaboradorVendedor() {
        return colaboradorVendedor;
    }

    public void setColaboradorVendedor(ColaboradorVendedor colaboradorVendedor) {
        this.colaboradorVendedor = colaboradorVendedor;
    }

    public TransacaoStatus getStatus() {
        return status;
    }

    public void setStatus(TransacaoStatus status) {
        this.status = status;
    }

    public Concessionaria getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(Concessionaria concessionaria) {
        this.concessionaria = concessionaria;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
