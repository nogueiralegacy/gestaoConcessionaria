package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import negocio.Veiculo;
import negocio.VeiculoRepository;

public class CSVVeiculoRepository implements VeiculoRepository {
    String arquivo = "projeto/arquivos/veiculos.txt";

    @Override
    public Veiculo persiste(Veiculo veiculo) {
        try {
            FileWriter fw = new FileWriter(arquivo, true);

            String linhaVeiculo = "\n";
            linhaVeiculo += veiculo.getModelo() + ";";
            linhaVeiculo += veiculo.getAno() + ";";
            linhaVeiculo += veiculo.getMarca() + ";";
            linhaVeiculo += veiculo.getChassi() + ";";
            linhaVeiculo += veiculo.getCor() + ";";
            linhaVeiculo += veiculo.getKilometragem() + ";";
            linhaVeiculo += veiculo.getRenavam() + ";";
            linhaVeiculo += veiculo.getPlaca() + ";";
            linhaVeiculo += veiculo.getCategoria() + ";";
            linhaVeiculo += veiculo.getAdicionais();

            fw.write(linhaVeiculo);
            fw.close();

            return veiculo;
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());

            return null;
        }
    }

    @Override
    public String dadosEmCsvPorPlaca(String placa) throws IOException {
        try {
            FileReader fr = new FileReader(arquivo);
            try (BufferedReader bf = new BufferedReader(fr)) {
                String linha;
                String[] campos = new String[10];
                while ((linha = bf.readLine()) != null) {
                    campos = linha.split(";");

                    if (campos[7].equals(placa)) {
                        return linha;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Veiculo porPlaca(String placaParaBuscar) throws IOException {
        FileReader r = null;
        BufferedReader bf = null;

        try {
            r = new FileReader(arquivo);
            bf = new BufferedReader(r);

            String linha;
            String[] campos = new String[10];

            while ((linha = bf.readLine()) != null) {
                campos = linha.split(";");
                if (campos[7].equals(placaParaBuscar)) {
                    String modelo = campos[0];
                    int ano = Integer.parseInt(campos[1]);
                    String marca = campos[2];
                    String chassi = campos[3];
                    String cor = campos[4];
                    int kilometragem = Integer.parseInt(campos[5]);
                    String renavam = campos[6];
                    String placa = campos[7];
                    String categoria = campos[8];
                    String adicionais = campos[9];

                    return new Veiculo(modelo, ano, marca, chassi, cor, kilometragem,
                            renavam, placa, categoria, adicionais);
                }

            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            r.close();
            bf.close();
        }

        return null;
    }
}
