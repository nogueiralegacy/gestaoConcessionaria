package negocio;

public abstract class Empresa {
    private String nome;
    private String cnpj;
    private Contato contato;
    private Endereco endereco;

    public Empresa(String nome, String cnpj, Contato contato, Endereco endereco) {
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String toString() {
        String dadosEmpresa = null;

        dadosEmpresa += getNome() + ",";
        dadosEmpresa += ", portador do cpnj n° " + getCnpj();
        dadosEmpresa += ", endereço da sede da empresa na rua: " + getEndereco().getRua();
        dadosEmpresa += ", n°: " + getEndereco().getNumero();
        dadosEmpresa += ", bairro: " + getEndereco().getBairro();
        dadosEmpresa += ", cep: " + getEndereco().getCep();
        dadosEmpresa += ", cidade: " + getEndereco().getCidade();
        dadosEmpresa += ", estado: " + getEndereco().getEstado() + ".\n";
        dadosEmpresa += "Telefone: " + getContato().getTelefone();
        dadosEmpresa += "Email: " + getContato().getEmail();

        return dadosEmpresa;
    }
}
