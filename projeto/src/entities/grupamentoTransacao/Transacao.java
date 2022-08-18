package entities.grupamentoTransacao;

import entities.grupamentoColaboradorVendedor.ColaboradorVendedor;
import entities.grupamentoEmpresa.Empresa;
import entities.grupamentoPessoa.Pessoa;
import entities.grupamentoVeiculo.Veiculo;

public abstract class Transacao {
    private Pessoa pessoa;
    private Empresa empresa;
    private Veiculo veiculo;
    private ColaboradorVendedor colaboradorVendedor;
    private TransacaoStatus status;

    public Transacao(Veiculo veiculo, TransacaoStatus status) {
        this.veiculo = veiculo;
        this.status = status;

    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setVendedor(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Empresa getComprador() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public ColaboradorVendedor getColaboradorVendedor() {
        return colaboradorVendedor;
    }

    public void setColaboradorVendedor(ColaboradorVendedor colaboradorVendedor) {
        this.colaboradorVendedor = colaboradorVendedor;
    }

}
