package negocio;

import java.io.IOException;

public interface ClienteRepository {

    /**
     * Recupera o cliente para o cpf fornecido.
     * 
     * @param cpf O CPF do cliente.
     * @return O cliente para o CPF fornecido ou {@code null}
     *         caso não exista cliente para o CPF.
     * @throws IOException Situaçâo excepcional de I/O.
     */
    public Cliente porCpf(String cpf) throws IOException;

    /**
     * Recupera os dados, em formato csv, do cliente para o cpf fornecido.
     * 
     * @param cpf O cpf do cliente.
     * @return Uma String contendo os dados do cliente, em formato csv,
     *         para o cpf fornecido ou {@code null} caso não exista
     *         cliente para o cpf fornecido.
     * 
     * @throws I/O.
     * 
     */
    public String dadosEmCsvPorCpf(String cpf) throws IOException;

    /**
     * Armazena o cliente fornecido.
     * 
     * @param cliente O cliente a ser armazenado.
     * @return O cliente armazenado, possivelmente com identificador
     *         único atribuído pelo mecanismo de persistência ou
     *         {@code null} caso ocorra falha na persistência.
     */
    public Cliente persiste(Cliente cliente);
}
