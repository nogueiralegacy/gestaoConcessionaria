package persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import negocio.ClienteRepository;
import negocio.ColaboradorVendedor;
import negocio.ColaboradorVendedorRepository;
import negocio.ConcessionariaRepository;
import negocio.Transacao;
import negocio.TransacaoRepository;
import negocio.TransacaoStatus;
import negocio.VeiculoRepository;

public class CSVTransacaoRepository implements TransacaoRepository {

    String arquivo = "projetos/arquivos/transacoes.txt";

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

    // escreve uma transacao em um arquivo
    @Override
    public Transacao persiste(Transacao transacao) throws IOException {

        try {
            FileWriter fw;

            fw = new FileWriter(arquivo, true);
            fw.write("\n");
            fw.write(String.valueOf(transacao.getId()) + ";");
            fw.write(String.valueOf(transacao.getStatus()) + ";");
            fw.write(String.valueOf(transacao.getDataHora()) + ";");
            fw.write(String.valueOf(transacao.getMontante()) + ";");

            ClienteRepository repoCliente = new CSVClienteRepository();
            String dadosCsvCliente = repoCliente.dadosEmCsvPorCpf(transacao.getCliente().getCpf());
            fw.write(dadosCsvCliente + ";");

            ConcessionariaRepository repoConcessionaria = new CSVConcessionariaRepository();
            String dadosConcessionaria = repoConcessionaria.dadosEmCsv();
            fw.write(dadosConcessionaria + ";");

            VeiculoRepository repoVeiculo = new CSVVeiculoRepository();
            String dadosVeiculo = repoVeiculo.dadosEmCsvPorPlaca(transacao.getVeiculo().getPlaca());
            fw.write(dadosVeiculo);


            if (transacao.getStatus() == TransacaoStatus.VENDA) {
                fw.write(";");

                ColaboradorVendedorRepository repoColaboradorVendedor = new CSVColaboradorVendedorRepository();
                ColaboradorVendedor colaboradorVendedor = transacao.getColaboradorVendedor();
                String dadosColaboradorVendedor = repoColaboradorVendedor
                        .dadosEmCsvPorId(colaboradorVendedor.getId());
                fw.write(dadosColaboradorVendedor);
            }

            fw.close();
            return transacao;

        } catch (Exception e) {

        }

        return null;
    }

}