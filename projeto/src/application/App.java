package application;

import entities.ColaboradorVendedor;
import entities.ColaboradorVendedorRepository;
import entities.SistemaDeArquivosColaboradorVendedorRepository;
import entities.SistemaDeArquivosVeiculoRepository;
import entities.Veiculo;
import entities.VeiculoRepository;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        String placa = "PRW6D02";
        VeiculoRepository repoVei = new SistemaDeArquivosVeiculoRepository();
        Veiculo veiculo = repoVei.getVeiculoPlaca(placa);
        System.out.println(veiculo.isUsado());

        int id = 001;
        ColaboradorVendedorRepository repoCola = new SistemaDeArquivosColaboradorVendedorRepository();
        ColaboradorVendedor colaboradorVendedor = repoCola.getColaboradorVendedorId(id);
        System.out.println(colaboradorVendedor.getSalarioBase());
        System.out.println("Hello, World!");
    }
}
