package negocio;

public abstract class Pessoa {
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public EstadoCivil estadoCivil(String descricao) {
        return estadoCivil(descricao);
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contatoPessoal) {
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
