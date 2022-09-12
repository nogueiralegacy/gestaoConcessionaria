package application;

import java.io.IOException;

import javax.swing.JOptionPane;

import negocio.ColaboradorVendedor;
import negocio.ColaboradorVendedorRepository;
import negocio.TransacaoRepository;
import negocio.Veiculo;
import negocio.VeiculoRepository;
import persistencia.CSVColaboradorVendedorRepository;
import persistencia.CSVTransacaoRepository;
import persistencia.CSVVeiculoRepository;

public class GUI {

    public static void cadastrarVeiculo() {
        String[] campos = new String[10];

        JOptionPane.showMessageDialog(null, "CADASTRAR VEÍCULO", "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
        campos[0] = JOptionPane.showInputDialog("modelo: ");
        campos[1] = JOptionPane.showInputDialog("ano: ");
        campos[2] = JOptionPane.showInputDialog("marca: ");
        campos[3] = JOptionPane.showInputDialog("chassi: ");
        campos[4] = JOptionPane.showInputDialog("cor: ");
        campos[5] = JOptionPane.showInputDialog("kilometragem: ");
        campos[6] = JOptionPane.showInputDialog("renavam: ");
        campos[7] = JOptionPane.showInputDialog("placa: ");
        campos[8] = JOptionPane.showInputDialog("categoria: ");
        campos[9] = JOptionPane.showInputDialog("adicionais: ");

        Veiculo veiculo = new Veiculo(campos[0], Integer.parseInt(campos[1]), campos[2], campos[3], campos[4],
                Integer.parseInt(campos[5]), campos[6], campos[7], campos[8], campos[9]);
        VeiculoRepository repoVeiculo = new CSVVeiculoRepository();
        repoVeiculo.persiste(veiculo);

    }

    public static void showNomeDoVendedorPorId() throws IOException {

        JOptionPane.showMessageDialog(null, "BUSCAR O NOME DO VENDEDOR PELO ID", "BUSCA",
                JOptionPane.INFORMATION_MESSAGE);

        ColaboradorVendedorRepository repoColaboradorVendedor = new CSVColaboradorVendedorRepository();
        int idParaBuscar = Integer.parseInt(JOptionPane.showInputDialog("Id do Vendedor: "));
        ColaboradorVendedor colaboradorVendedor = repoColaboradorVendedor.porId(idParaBuscar);
        String nome = colaboradorVendedor.getNome();
        JOptionPane.showMessageDialog(null, nome, "Busca por Id", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showFaturamentoTotalVendas() {
        TransacaoRepository repoTransacao = new CSVTransacaoRepository();

        double faturamento = repoTransacao.totalVendido();
        JOptionPane.showMessageDialog(null, faturamento, "Total Faturado pelas Vendas",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
