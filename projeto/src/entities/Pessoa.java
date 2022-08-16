package entities;

public class Pessoa {
    private String nome;
    private Contato contato;
    private Endereco endereco;
    private EstadoCivil estadoCivil;
    private String cpf;
    private String rg;

    public Pessoa(String nome, Contato contato, Endereco endereco, EstadoCivil estadoCivil,
            String cpf,
            String rg) {
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
        this.estadoCivil = estadoCivil;
        this.cpf = cpf;
        this.rg = rg;
    }

    private String descricao;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public EstadoCivil estadoCivil(String descricao) {
        return estadoCivil(descricao);
    }

    public Contato getContatoPessoal() {
        return contato;
    }

    public void setContatoPessoal(Contato contatoPessoal) {
        this.contato = contatoPessoal;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        String dadosPessoa = null;

        dadosPessoa += getNome() + "," + getEstadoCivil().toString().toLowerCase();
        dadosPessoa += ", portador da célula de identidade R.G. n° " + getRg();
        dadosPessoa += "e CPF n° " + getCpf();
        dadosPessoa += ", residente e domiciliar à rua: " + getEndereco().getRua();
        dadosPessoa += ", n°: " + getEndereco().getNumero();
        dadosPessoa += ", bairro: " + getEndereco().getBairro();
        dadosPessoa += ", cep: " + getEndereco().getCep();
        dadosPessoa += ", cidade: " + getEndereco().getCidade();
        dadosPessoa += ", estado: " + getEndereco().getEstado() + ".\n";
        dadosPessoa += "Telefone: " + getContatoPessoal().getTelefone();
        dadosPessoa += "Email: " + getContatoPessoal().getEmail();

        return dadosPessoa;
    }

}
