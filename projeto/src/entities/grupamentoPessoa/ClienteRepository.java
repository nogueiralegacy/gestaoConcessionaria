package entities.grupamentoPessoa;

import java.io.IOException;

import entities.grupamentoCliente.Cliente;

public interface ClienteRepository {
    public Cliente getClienteCpf(String cpf) throws IOException;
}
