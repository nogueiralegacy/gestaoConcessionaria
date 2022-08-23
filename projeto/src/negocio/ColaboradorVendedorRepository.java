package negocio;

import java.io.IOException;

public interface ColaboradorVendedorRepository {
    /**
     * Recupera o colaborador vendedor pelo seu identificador único.
     * 
     * @param idParaBuscar O identificador único do colaborador vendedor.
     * @return O colaborador vendedor para o id fornecido ou {@code null}
     *         caso não exista colaborador para o id fornecido.
     * @throws IOException Excepicionalidade de I/O.
     */
    public ColaboradorVendedor porId(int idParaBuscar) throws IOException;

    /**
     * Armazena o colaborador vendedor fornecido.
     * 
     * @param colaboradorVendedor O colaborador vendedor a ser armazenado.
     * @return O colaborador vendedor armazenado ou {@code null} caso
     *         ocorra falha na persistência.
     */
    public ColaboradorVendedor persiste(ColaboradorVendedor colaboradorVendedor);

    /**
     * Recupera os dados do colaborador vendedor em formato csv.
     * 
     * @param id O identificador único do colaborador vendedor.
     * @return Os dados em formato csv do colaborador vendedor para o
     *         o identificadoe único fornecido ou {@code null} caso
     *         não exista colaborador vendedor para o identificador
     *         único fornecido.
     * @throws IOException Excepcionalidade de I/O.
     */
    public String dadosEmCsvPorId(int id) throws IOException;
}
