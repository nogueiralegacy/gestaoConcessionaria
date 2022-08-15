
package entities;

import java.util.ArrayList;
import java.util.List;

public class ColaboradorVendedor extends Pessoa {
    private double salarioBase;
    private double faturamentoTotal;

    private List<Transacao> vendas = new ArrayList<>();

    public ColaboradorVendedor(String nome, Contato contatoPessoal, Endereco enderecoResidencial,
            EstadoCivil estadoCivil, String cpf,
            String rg, double salarioBase, List<Transacao> vendas) {
        super(nome, contatoPessoal, enderecoResidencial, estadoCivil, cpf, rg);
        this.salarioBase = salarioBase;
        this.faturamentoTotal = 0;
        this.vendas = vendas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getFaturamentoTotal() {
        return faturamentoTotal;
    }

    public void setFaturamentoTotal(double faturamentoTotal) {
        this.faturamentoTotal = faturamentoTotal;
    }

    public List<Transacao> getVendas() {
        return vendas;
    }

    public void adicionaVenda(Transacao venda) {
        vendas.add(venda);
    }

    public double faturamentoTotal() {
        double resultado = 0;
        for (Transacao venda : vendas) {
            resultado += venda.getMontante();
        }

        return resultado;
    }

    public double calculaSalario() {
        double salario = salarioBase;
        for (Transacao venda : vendas) {
            salario += faturamentoTotal * (venda.getComissaoVendedor() / 100);
        }

        return salario;
    }
}
