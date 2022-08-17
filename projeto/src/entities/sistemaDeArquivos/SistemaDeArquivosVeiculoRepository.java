package entities.sistemaDeArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entities.grupamentoVeiculo.Veiculo;
import entities.grupamentoVeiculo.VeiculoRepository;

public class SistemaDeArquivosVeiculoRepository implements VeiculoRepository {

    @Override
    public Veiculo getVeiculoPlaca(String placaParaBuscar) throws IOException {
        FileReader r = null;
        BufferedReader bf = null;
        String arquivo = "C:\\Users\\danie\\Documents\\gestaoConcessionaria\\projeto\\arquivos\\veiculos.txt";

        try {
            r = new FileReader(arquivo);
            bf = new BufferedReader(r);

            String linha;
            String[] campos = new String[11];

            while ((linha = bf.readLine()) != null) {
                campos = linha.split(";");
                if (campos[8].equals(placaParaBuscar)) {
                    String modelo = campos[0];
                    int ano = Integer.parseInt(campos[1]);
                    String marca = campos[2];
                    double valorComercial = Double.parseDouble(campos[3]);
                    String chassi = campos[4];
                    String cor = campos[5];
                    int kilometragem = Integer.parseInt(campos[6]);
                    String renavam = campos[7];
                    String placa = campos[8];
                    String categoria = campos[9];
                    String adicionais = campos[10];

                    return new Veiculo(modelo, ano, marca, valorComercial, chassi, cor, kilometragem,
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
