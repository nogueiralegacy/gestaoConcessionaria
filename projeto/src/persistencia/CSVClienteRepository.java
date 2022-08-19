package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import negocio.Cliente;
import negocio.ClienteRepository;
import negocio.Contato;
import negocio.Endereco;
import negocio.EstadoCivil;

public class CSVClienteRepository implements ClienteRepository {
    String arquivo = "C:\\Users\\danie\\Documents\\gestaoConcessionaria\\projeto\\arquivos\\clientes.txt";

    @Override
    public Cliente persiste(Cliente cliente) {
        try {
            FileWriter fw;
            fw = new FileWriter(arquivo, true);
            String linhaCliente = cliente.getNome() + ";";
            linhaCliente += cliente.getContato().getEmail() + ";";
            linhaCliente += cliente.getContato().getTelefone() + ";";
            linhaCliente += cliente.getEndereco().getCidade() + ";";
            linhaCliente += cliente.getEndereco().getEstado() + ";";
            linhaCliente += cliente.getEndereco().getCep() + ";";
            linhaCliente += cliente.getEndereco().getRua() + ";";
            linhaCliente += cliente.getEndereco().getNumero() + ";";
            linhaCliente += cliente.getEndereco().getBairro() + ";";
            linhaCliente += cliente.getEndereco().getComplemento() + ";";
            linhaCliente += cliente.getEstadoCivil() + ";";
            linhaCliente += cliente.getCpf() + ";";
            linhaCliente += cliente.getRg();

            fw.write(linhaCliente);
            fw.close();

            return cliente;
        } catch (Exception e) {
            System.out.println("EROO: " + e.getMessage());

            return null;
        }
    }

    @Override
    public Cliente porCpf(String cpfParaBuscar) throws IOException {
        FileReader r = null;
        BufferedReader bf = null;

        try {
            r = new FileReader(arquivo);
            bf = new BufferedReader(r);

            String linha;
            String[] campos = new String[13];

            while ((linha = bf.readLine()) != null) {

                campos = linha.split(";");
                if (campos[11].equals(cpfParaBuscar)) {
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

                    return new Cliente(nome, contato, endereco, estadoCivil, cpf, rg);
                }
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