package persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import negocio.Transacao;
import negocio.TransacaoRepository;

public class SistemaDeArquivosTransacaoRepository implements TransacaoRepository {

    @Override
    public List<Transacao> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Transacao> getCompras() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Transacao> getPorTransacaoId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Transacao> getPorVendedorId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Transacao> getVendas() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void saveTransacao(Transacao transacao) throws IOException {

        try {
            FileWriter fw;
            String arquivo = "C:\\Users\\danie\\Documents\\gestaoConcessionaria\\projeto\\arquivos\\transacoes.txt";

            fw = new FileWriter(arquivo, true);
            fw.write(String.valueOf(transacao.getStatus());

            fw.close();
        } catch (Exception e) {

        }
    }

}