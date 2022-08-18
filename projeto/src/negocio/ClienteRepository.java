package negocio;

import java.io.IOException;

public interface ClienteRepository {

    /**
     * Recupera o cliente para o cpf fornecido.
     * 
     * @param cpf O CPF do cliente.
     * @return O cliente para o CPF fornecido ou {@code null}
     *         caso nâo exista cliente para o CPF.
     * @throws IOException Situaçâo excepcional de I/O.
     */
    public Cliente getClienteCpf(String cpf) throws IOException;

    /**
     * Armazena o cliente fornecido.
     * 
     * @param cliente O cliente a ser armazenado.
     * @return O cliente armazenado, possivelmente com identificado
     *         único atribuído pelo mecanismo de persistência ou
     *         {@code null} caso ocorra falha na persistência.
     */
    public Cliente persiste(Cliente cliente);
}
