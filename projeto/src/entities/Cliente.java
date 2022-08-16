package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cliente {
    public static Pessoa getInstance() throws IOException {

        FileReader r = null;
        BufferedReader bf = null;
        String arquivo = "C:\\Users\\danie\\Documents\\gestaoConcessionaria\\projeto\\cliente.txt";

        try {
            r = new FileReader(arquivo);
            bf = new BufferedReader(r);

            String linha;
            String[] campos = new String[13];

            while ((linha = bf.readLine()) != null) {
                campos = linha.split(";");

                String nome = campos[0];
                String email = campos[1];
                String telefone = campos[2];
                String cidade = campos[3];
                String estado = campos[4];
                String cep = campos[5];
                String rua = campos[6];
                int numero = Integer.parseInt(campos[7]);
                String bairro = campos[8];
                String complemento = campos[9];
                EstadoCivil estadoCivil = EstadoCivil.valueOf(campos[10].toUpperCase());
                String cpf = campos[11];
                String rg = campos[12];

                Contato contato = new Contato(telefone, email);
                Endereco endereco = new Endereco(cidade, estado, cep, rua, numero, bairro, complemento);

                return new Pessoa(nome, contato, endereco, estadoCivil, cpf, rg);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            r.close();
            bf.close();
        }
        return null;
    }
}