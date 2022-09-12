package application;

import java.io.IOException;

import negocio.Cliente;
import negocio.ClienteRepository;
import negocio.ColaboradorVendedor;
import negocio.ColaboradorVendedorRepository;
import negocio.Concessionaria;
import negocio.ConcessionariaRepository;
import negocio.TransacaoDeVenda;
import negocio.Veiculo;
import negocio.VeiculoRepository;
import persistencia.CSVClienteRepository;
import persistencia.CSVColaboradorVendedorRepository;
import persistencia.CSVConcessionariaRepository;
import persistencia.CSVVeiculoRepository;

public class EfetivarVenda {
    public static TransacaoDeVenda criaTransacaoDeVenda(String cpfDoCliente, String placa, double montante,
            long idDaTransacao,
            int idDoColaboradorVendedor) throws IOException {
        ClienteRepository repoCliente = new CSVClienteRepository();
        ConcessionariaRepository repoConcessionaria = new CSVConcessionariaRepository();
        VeiculoRepository repoVeiculo = new CSVVeiculoRepository();
        ColaboradorVendedorRepository repoColaboradorRepository = new CSVColaboradorVendedorRepository();

        Cliente cliente = repoCliente.porCpf(cpfDoCliente);
        Concessionaria concessionaria = repoConcessionaria.getIntance();
        Veiculo veiculo = repoVeiculo.porPlaca(placa);
        ColaboradorVendedor colaboradorVendedor = repoColaboradorRepository.porId(idDoColaboradorVendedor);

        return new TransacaoDeVenda(cliente, concessionaria, veiculo, montante, idDaTransacao, colaboradorVendedor);
    }
}
