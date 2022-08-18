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
     * @return O colaborador vendedor armazenado, possivelmente com o
     *         identificador único fornecido pelo mecanismo de
     *         persistência ou {@code null} caso ocorra falha na
     *         persistência.
     */
    public ColaboradorVendedor persiste(ColaboradorVendedor colaboradorVendedor);
}
