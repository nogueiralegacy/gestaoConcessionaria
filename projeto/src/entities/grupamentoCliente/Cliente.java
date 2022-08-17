package entities.grupamentoCliente;

import entities.grupamentoCliente.grupamentoPessoa.EstadoCivil;
import entities.grupamentoCliente.grupamentoPessoa.Pessoa;
import entities.grupamentoContato.Contato;
import entities.grupamentoEndereco.Endereco;

public class Cliente extends Pessoa {

    public Cliente(String nome, Contato contato, Endereco endereco, EstadoCivil estadoCivil, String cpf, String rg) {
        super(nome, contato, endereco, estadoCivil, cpf, rg);
    }
}
