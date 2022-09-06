package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import negocio.ClienteRepository;
import negocio.ColaboradorVendedor;
import negocio.ColaboradorVendedorRepository;
import negocio.ConcessionariaRepository;
import negocio.Transacao;
import negocio.TransacaoRepository;
import negocio.TransacaoStatus;
import negocio.VeiculoRepository;

public class CSVTransacaoRepository implements TransacaoRepository {
    String arquivo = "projeto/arquivos/transacoes.txt";

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

        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        return null;
    }

    @Override
    public double totalVendido() {
        try {
            FileReader fr = new FileReader(arquivo);
            try (BufferedReader bf = new BufferedReader(fr)) {
                String linha;
                String[] campos = new String[53];

                double resultado = 0;
                while ((linha = bf.readLine()) != null) {
                    campos = linha.split(";");
                    resultado += Double.parseDouble(campos[3]);
                }

                return resultado;
            }
        } catch (Exception e) {
        }

        return 0;
    }

}