package application;

import negocio.Cliente;
import negocio.ClienteRepository;
import negocio.ColaboradorVendedor;
import negocio.ColaboradorVendedorRepository;
import negocio.Concessionaria;
import negocio.ConcessionariaRepository;
import negocio.Veiculo;
import negocio.VeiculoRepository;
import persistencia.CSVClienteRepository;
import persistencia.CSVColaboradorVendedorRepository;
import persistencia.CSVConcessionariaRepository;
import persistencia.CSVVeiculoRepository;

public class Teste {
    public static void main(String[] args) throws Exception {
        // @Teste SistemaDeArquivosVeiculoRepository;
        String placa = "PRW6D02";
        VeiculoRepository repoVei = new CSVVeiculoRepository();
        Veiculo veiculo = repoVei.porPlaca(placa);
        System.out.println(veiculo.isUsado());

        // @Teste SistemaDeArquivosColaboradorVendedorRepository;
        int id = 001;
        ColaboradorVendedorRepository repoCola = new CSVColaboradorVendedorRepository();
        ColaboradorVendedor colaboradorVendedor = repoCola.porId(id);
        System.out.println(colaboradorVendedor.getSalarioBase());

        // @Teste SistemaDeArquivosClienteRepository;
        String cpf = "020672779-12";
        ClienteRepository repoCliente = new CSVClienteRepository();
        Cliente cliente = repoCliente.porCpf(cpf);
        System.out.println(cliente.toString());

        // @Teste SistemaDeArquivosConcessionariaRepository;
        ConcessionariaRepository repoConcessionaria = new CSVConcessionariaRepository();
        Concessionaria concessionaria = repoConcessionaria.getIntance();
        System.out.println(concessionaria.toString());
        System.out.println("APROVADO");
    }
}
