package application;

import negocio.Cliente;
import negocio.ClienteRepository;
import negocio.ColaboradorVendedor;
import negocio.ColaboradorVendedorRepository;
import negocio.Concessionaria;
import negocio.ConcessionariaRepository;
import negocio.TransacaoDeVenda;
import negocio.TransacaoRepository;
import negocio.Veiculo;
import negocio.VeiculoRepository;
import persistencia.CSVClienteRepository;
import persistencia.CSVColaboradorVendedorRepository;
import persistencia.CSVConcessionariaRepository;
import persistencia.CSVTransacaoRepository;
import persistencia.CSVVeiculoRepository;

public class Teste {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // @Teste SistemaDeArquivosVeiculoRepository;
        String placa = "PRW6D02";
        VeiculoRepository repoVeiculo = new CSVVeiculoRepository();
        Veiculo veiculo = repoVeiculo.porPlaca(placa);
        System.out.println(veiculo.isUsado());

        // @Teste SistemaDeArquivosColaboradorVendedorRepository;
        int idDoColaboradroVendedor = 1;
        ColaboradorVendedorRepository repoColaboradorVendedor = new CSVColaboradorVendedorRepository();
        ColaboradorVendedor colaboradorVendedor = repoColaboradorVendedor.porId(idDoColaboradroVendedor);
        System.out.println(colaboradorVendedor.getId());

        // @Teste SistemaDeArquivosClienteRepository;
        String cpf = "020672779-12";
        ClienteRepository repoCliente = new CSVClienteRepository();
        Cliente cliente = repoCliente.porCpf(cpf);
        System.out.println(cliente.toString());

        // @Teste SistemaDeArquivosConcessionariaRepository;
        ConcessionariaRepository repoConcessionaria = new CSVConcessionariaRepository();
        Concessionaria concessionaria = repoConcessionaria.getIntance();
        System.out.println(concessionaria.toString());

        TransacaoDeVenda transacaoDeVenda = EfetivarVenda.criaTransacaoDeVenda(cpf, placa, 100000, 1,
                7);
        TransacaoRepository repoTransacao = new CSVTransacaoRepository();
        repoTransacao.persiste(transacaoDeVenda);

        System.out.println(repoTransacao.totalVendido());

        GUI.showFaturamentoTotalVendas();
        GUI.cadastrarVeiculo();
        GUI.showNomeDoVendedorPorId();
        System.out.println("APROVADO");
    }
}
