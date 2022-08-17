package entities.grupamentoCliente;

import java.io.IOException;

public interface ClienteRepository {
    public Cliente getClienteCpf(String cpf) throws IOException;
}
