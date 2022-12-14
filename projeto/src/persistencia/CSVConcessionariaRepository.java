package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import negocio.Concessionaria;
import negocio.ConcessionariaRepository;
import negocio.Contato;
import negocio.Endereco;

public class CSVConcessionariaRepository implements ConcessionariaRepository {

    String arquivo = "projeto/arquivos/concessionaria.txt";

    @Override
    public String dadosEmCsv() throws IOException {
        try {
            FileReader fr = new FileReader(arquivo);
            try (BufferedReader bf = new BufferedReader(fr)) {
                String linha = bf.readLine();

                return linha;
            }
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Concessionaria getIntance() throws IOException {
        FileReader r = null;
        BufferedReader bf = null;

        try {
            r = new FileReader(arquivo);
            bf = new BufferedReader(r);

            String linha;
            String[] campos = new String[11];
            linha = bf.readLine();
            campos = linha.split(";");

            String nome = campos[0];
            String cnpj = campos[1];
            String email = campos[2];
            String telefone = campos[3];
            String cidade = campos[4];
            String estado = campos[5];
            String cep = campos[6];
            String bairro = campos[7];
            int numero = Integer.parseInt(campos[8]);
            String rua = campos[9];
            String complemento = campos[10];

            Contato contato = new Contato(telefone, email);
            Endereco endereco = new Endereco(cidade, estado, cep, rua, numero, bairro, complemento);

            return new Concessionaria(nome, cnpj, contato, endereco);
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());

        } finally {
            r.close();
            bf.close();
        }

        return null;
    }
}
