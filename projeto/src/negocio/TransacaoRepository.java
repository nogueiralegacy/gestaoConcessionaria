package negocio;

import java.util.List;

public interface TransacaoRepository {
    public List<Transacao> getAll();

    public List<Transacao> getPorVendedorId();

    public List<Transacao> getPorTransacaoId();

    public List<Transacao> getVendas();

    public List<Transacao> getCompras();

    public void saveTransacao();

}