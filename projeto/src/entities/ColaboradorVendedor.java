
package entities;

public class ColaboradorVendedor extends Pessoa {
    private double salarioBase;
    private int id;
    private double faturamentoTotal;

    public ColaboradorVendedor(String nome, Contato contatoPessoal, Endereco enderecoResidencial,
            EstadoCivil estadoCivil, String cpf,
            String rg, double salarioBase, int id) {
        super(nome, contatoPessoal, enderecoResidencial, estadoCivil, cpf, rg);
        this.salarioBase = salarioBase;
        this.faturamentoTotal = 0;
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
