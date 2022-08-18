package application;

import entities.grupamentoCliente.Cliente;
import entities.grupamentoColaboradorVendedor.ColaboradorVendedor;
import entities.grupamentoColaboradorVendedor.ColaboradorVendedorRepository;
import entities.grupamentoConcessionaria.Concessionaria;
import entities.grupamentoConcessionaria.ConcessionariaRepository;
import entities.grupamentoPessoa.ClienteRepository;
import entities.grupamentoVeiculo.Veiculo;
import entities.grupamentoVeiculo.VeiculoRepository;
import entities.sistemaDeArquivos.SistemaDeArquivosClienteRepository;
import entities.sistemaDeArquivos.SistemaDeArquivosColaboradorVendedorRepository;
import entities.sistemaDeArquivos.SistemaDeArquivosConcessionariaRepository;
import entities.sistemaDeArquivos.SistemaDeArquivosVeiculoRepository;

public class App {
    public static void main(String[] args) throws Exception {
        // @Teste SistemaDeArquivosVeiculoRepository;
        String placa = "PRW6D02";
        VeiculoRepository repoVei = new SistemaDeArquivosVeiculoRepository();
        Veiculo veiculo = repoVei.getVeiculoPlaca(placa);
        System.out.println(veiculo.isUsado());

        // @Teste SistemaDeArquivosColaboradorVendedorRepository;
        int id = 001;
        ColaboradorVendedorRepository repoCola = new SistemaDeArquivosColaboradorVendedorRepository();
        ColaboradorVendedor colaboradorVendedor = repoCola.getColaboradorVendedorId(id);
        System.out.println(colaboradorVendedor.getSalarioBase());

        // @Teste SistemaDeArquivosClienteRepository;
        String cpf = "020672779-12";
        ClienteRepository repoCliente = new SistemaDeArquivosClienteRepository();
        Cliente cliente = repoCliente.getClienteCpf(cpf);
        String estadoCivil = String.valueOf(cliente.getEstadoCivil()).toLowerCase();
        System.out.println(estadoCivil);

        // @Teste SistemaDeArquivosConcessionariaRepository;
        ConcessionariaRepository repoConcessionaria = new SistemaDeArquivosConcessionariaRepository();
        Concessionaria concessionaria = repoConcessionaria.getIntance();
        System.out.println(concessionaria.getNome());
        System.out.println("APROVADO");
    }
}
