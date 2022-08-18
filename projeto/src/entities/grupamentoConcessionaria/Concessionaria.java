package entities.grupamentoConcessionaria;

import entities.grupamentoContato.Contato;
import entities.grupamentoEmpresa.Empresa;
import entities.grupamentoEndereco.Endereco;

public class Concessionaria extends Empresa {

    public Concessionaria(String nome, String cnpj, Contato contato, Endereco endereco) {
        super(nome, cnpj, contato, endereco);
    }

}
