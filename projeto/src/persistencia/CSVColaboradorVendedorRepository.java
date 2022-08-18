package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import negocio.ColaboradorVendedor;
import negocio.ColaboradorVendedorRepository;
import negocio.Contato;
import negocio.Endereco;
import negocio.EstadoCivil;

public class CSVColaboradorVendedorRepository implements ColaboradorVendedorRepository {
    String arquivo = "C:\\Users\\danie\\Documents\\gestaoConcessionaria\\projeto\\arquivos\\colaboradoresVendedores.txt";

    @Override
    public ColaboradorVendedor persiste(ColaboradorVendedor colaboradorVendedor) {
        try {
            FileWriter fw;
            fw = new FileWriter(arquivo, true);

            String linhaColaboradorVendedor = colaboradorVendedor.getNome();
            linhaColaboradorVendedor += colaboradorVendedor.getContato().getEmail() + ";";
            linhaColaboradorVendedor += colaboradorVendedor.getContato().getTelefone() + ";";
            linhaColaboradorVendedor += colaboradorVendedor.getEndereco().getCidade() + ";";
            linhaColaboradorVendedor += colaboradorVendedor.getEndereco().getEstado() + ";";
            linhaColaboradorVendedor += colaboradorVendedor.getEndereco().getCep() + ";";
            linhaColaboradorVendedor += colaboradorVendedor.getEndereco().getRua() + ";";
            linhaColaboradorVendedor += colaboradorVendedor.getEndereco().getNumero() + ";";
            linhaColaboradorVendedor += colaboradorVendedor.getEndereco().getBairro() + ";";
            linhaColaboradorVendedor += colaboradorVendedor.getEndereco().getComplemento() + ";";
            linhaColaboradorVendedor += colaboradorVendedor.getEstadoCivil() + ";";
            linhaColaboradorVendedor += colaboradorVendedor.getCpf() + ";";
            linhaColaboradorVendedor += colaboradorVendedor.getRg() + ";";
            linhaColaboradorVendedor += colaboradorVendedor.getSalarioBase() + ";";
            linhaColaboradorVendedor += colaboradorVendedor.getId() + ";";

            fw.write(linhaColaboradorVendedor);
            fw.close();

            return colaboradorVendedor;
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());

            return null;
        }
    }

    @Override
    public ColaboradorVendedor porId(int idParaBuscar) throws IOException {

        FileReader r = null;
        BufferedReader bf = null;
        String arquivo = "C:\\Users\\danie\\Documents\\gestaoConcessionaria\\projeto\\arquivos\\colaboradoresVendedores.txt";

        try {
            r = new FileReader(arquivo);
            bf = new BufferedReader(r);

            String linha;
            String[] campos = new String[13];

            while ((linha = bf.readLine()) != null) {
                campos = linha.split(";");
                if (Integer.parseInt(campos[14]) == idParaBuscar) {
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
                    double salarioBase = Double.parseDouble(campos[13]);
                    int id = Integer.parseInt(campos[14]);

                    Contato contato = new Contato(telefone, email);
                    Endereco endereco = new Endereco(cidade, estado, cep, rua, numero, bairro, complemento);

                    return new ColaboradorVendedor(nome, contato, endereco, estadoCivil, cpf, rg, salarioBase, id);
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
