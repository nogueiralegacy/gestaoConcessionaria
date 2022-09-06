package negocio;

import java.io.IOException;

public interface TransacaoRepository {
    /**
     * Armazena a transacao fornecida.
     * 
     * @param transacao A transacao a ser armazenada.
     * @return Retorna a transacao armazenada possivelmente com um
     *         identificador único, fornecido pelo sistema de
     *         armazenamento ou {@code null} caso ocorrer falha na
     *         persistência.
     * @throws IOException Excepcionalidade de I/O.
     */
    public Transacao persiste(Transacao transacao) throws IOException;

    /**
     * Calcula o faturamento de todas as vendas.
     * 
     * @return Retorna a soma de todas as vendas ou 0 caso não tenha
     *         nenhuma venda;
     */
    public double totalVendido();

}