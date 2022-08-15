package entities;

public abstract class Pessoa {
    private String nome;
    private Contato contatoPessoal;
    private Endereco enderecoResidencial;
    private EstadoCivil estadoCivil;
    private String cpf;
    private String rg;

    public Pessoa(String nome, Contato contatoPessoal, Endereco enderecoResidencial, EstadoCivil estadoCivil,
            String cpf,
            String rg) {
        this.nome = nome;
        this.contatoPessoal = contatoPessoal;
        this.enderecoResidencial = enderecoResidencial;
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
        return contatoPessoal;
    }

    public void setContatoPessoal(Contato contatoPessoal) {
        this.contatoPessoal = contatoPessoal;
    }

    public Endereco getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(Endereco enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
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

}
