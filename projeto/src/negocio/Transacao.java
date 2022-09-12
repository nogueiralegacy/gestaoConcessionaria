package negocio;

import java.time.LocalDateTime;

public abstract class Transacao {
    private Cliente cliente;
    private Concessionaria concessionaria;
    private Veiculo veiculo;
    private TransacaoStatus status;
    private LocalDateTime dataHora;
    private double montante;
    private long id;

    public Transacao() {
    }

    public Transacao(Cliente cliente, Concessionaria concessionaria, Veiculo veiculo,
            TransacaoStatus status, double montante, long id) {
        this.cliente = cliente;
        this.concessionaria = concessionaria;
        this.veiculo = veiculo;
        this.status = status;
        this.dataHora = LocalDateTime.now();
        this.montante = montante;
        this.id = id;
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

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ColaboradorVendedor getColaboradorVendedor() {
        return null;
    }
}
