package negocio;

public class Cliente extends Pessoa {
    public Cliente(String nome, Contato contato, Endereco endereco, EstadoCivil estadoCivil, String cpf, String rg) {
        super(nome, contato, endereco, estadoCivil, cpf, rg);
    }
}
