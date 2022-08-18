package application;

import negocio.Cliente;
import negocio.ClienteRepository;
import negocio.ColaboradorVendedor;
import negocio.ColaboradorVendedorRepository;
import negocio.Concessionaria;
import negocio.ConcessionariaRepository;
import negocio.Veiculo;
import negocio.VeiculoRepository;
import persistencia.SistemaDeArquivosClienteRepository;
import persistencia.SistemaDeArquivosColaboradorVendedorRepository;
import persistencia.SistemaDeArquivosConcessionariaRepository;
import persistencia.SistemaDeArquivosVeiculoRepository;

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
