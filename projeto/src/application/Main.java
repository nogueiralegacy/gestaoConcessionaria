package application;

import negocio.TransacaoDeVenda;
import negocio.TransacaoRepository;
import persistencia.CSVTransacaoRepository;

public class Main {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String cpf = "020672779-12";
        String placa = "PRW6D02";

        TransacaoDeVenda transacaoDeVenda = EfetivarVenda.criaTransacaoDeVenda(cpf, placa, 100000, 1,
                2);
        TransacaoRepository repoTransacao = new CSVTransacaoRepository();
        repoTransacao.persiste(transacaoDeVenda);

        System.out.println(repoTransacao.totalVendido());

        GUI.showFaturamentoTotalVendas();
        GUI.cadastrarVeiculo();
        GUI.showNomeDoVendedorPorId();
    }
}