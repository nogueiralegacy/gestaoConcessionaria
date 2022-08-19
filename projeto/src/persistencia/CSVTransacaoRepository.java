package persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import negocio.ClienteRepository;
import negocio.ConcessionariaRepository;
import negocio.Transacao;
import negocio.TransacaoRepository;

public class CSVTransacaoRepository implements TransacaoRepository {

    String arquivo = "C:\\Users\\danie\\Documents\\gestaoConcessionaria\\projeto\\arquivos\\transacoes.txt";

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
    public Transacao persiste(Transacao transacao) throws IOException {

        try {
            FileWriter fw;

            fw = new FileWriter(arquivo, true);

            fw.write(String.valueOf(transacao.getId()));
            fw.write(String.valueOf(transacao.getStatus()));
            fw.write(String.valueOf(transacao.getDataHora()));
            fw.write(String.valueOf(transacao.getMontante()));

            ClienteRepository repoCliente = new CSVClienteRepository();
            String dadosCsvCliente = repoCliente.dadosEmCsvPorCpf(transacao.getCliente().getCpf());
            fw.write(dadosCsvCliente);

            ConcessionariaRepository repoConcessionaria = new CSVConcessionariaRepository();
            String dadosConcessionaria = repoConcessionaria.dadosEmCsv();
            fw.write(dadosConcessionaria);

            fw.close();
            return null;

        } catch (Exception e) {

        }

        return null;
    }

}