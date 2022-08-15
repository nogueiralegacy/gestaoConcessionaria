package entities;

public abstract class Empresa {
    private String nome;
    private Contato contato;
    private Endereco endereco;
    private String cnpj;

    public Empresa(String nome, Contato contato, Endereco endereco, String cnpj) {
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
}
