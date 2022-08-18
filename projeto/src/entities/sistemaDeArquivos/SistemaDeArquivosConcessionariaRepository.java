package entities.sistemaDeArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entities.grupamentoConcessionaria.Concessionaria;
import entities.grupamentoConcessionaria.ConcessionariaRepository;
import entities.grupamentoContato.Contato;
import entities.grupamentoEndereco.Endereco;

public class SistemaDeArquivosConcessionariaRepository implements ConcessionariaRepository {

    @Override
    public Concessionaria getIntance() throws IOException {
        FileReader r = null;
        BufferedReader bf = null;
        String arquivo = "C:\\Users\\danie\\Documents\\gestaoConcessionaria\\projeto\\arquivos\\concessionaria.txt";

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
            String cidade = campos[3];
            String estado = campos[4];
            String cep = campos[5];
            String bairro = campos[8];
            int numero = Integer.parseInt(campos[7]);
            String rua = campos[6];
            String complemento = campos[9];

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
