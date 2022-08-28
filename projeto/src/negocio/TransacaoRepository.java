package negocio;

import java.io.IOException;
import java.util.List;

public interface TransacaoRepository {
    public List<Transacao> getAll();

    public List<Transacao> getPorVendedorId();

    public List<Transacao> getPorTransacaoId();

    public List<Transacao> getVendas();

    public List<Transacao> getCompras();



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

}