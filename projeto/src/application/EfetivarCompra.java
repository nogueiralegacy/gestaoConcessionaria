package application;

import java.io.IOException;

import negocio.Cliente;
import negocio.ClienteRepository;
import negocio.Concessionaria;
import negocio.ConcessionariaRepository;
import negocio.TransacaoDeCompra;
import negocio.Veiculo;
import negocio.VeiculoRepository;
import persistencia.CSVClienteRepository;
import persistencia.CSVConcessionariaRepository;
import persistencia.CSVVeiculoRepository;

public class EfetivarCompra {
    public static TransacaoDeCompra criaTransacaoDeCompra(String cpfDoCliente, String placa, double montante,
            long idDaTransacao) throws IOException {
        ClienteRepository repoCliente = new CSVClienteRepository();
        ConcessionariaRepository repoConcessionaria = new CSVConcessionariaRepository();
        VeiculoRepository repoVeiculo = new CSVVeiculoRepository();

        Cliente cliente = repoCliente.porCpf(cpfDoCliente);
        Concessionaria concessionaria = repoConcessionaria.getIntance();
        Veiculo veiculo = repoVeiculo.porPlaca(placa);

        return new TransacaoDeCompra(cliente, concessionaria, veiculo, montante, idDaTransacao);
    }
}
