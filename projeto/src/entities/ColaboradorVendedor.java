
package entities;

public class ColaboradorVendedor extends Pessoa {
    private double salarioBase;
    private int id;

    public ColaboradorVendedor(String nome, Contato contatoPessoal, Endereco enderecoResidencial,
            EstadoCivil estadoCivil, String cpf,
            String rg, double salarioBase, int id) {
        super(nome, contatoPessoal, enderecoResidencial, estadoCivil, cpf, rg);
        this.salarioBase = salarioBase;
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
}
