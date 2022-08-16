package entities;

public class Veiculo {
    private String modelo;
    private int ano;
    private String marca;
    private double valorComercial;
    private String chassi; // código VIN;
    private String cor;
    private boolean usado;
    private int kilometragem;
    private String renavam;
    private String placa;
    private String categoria;
    private String adicionais;

    public Veiculo(String modelo, int ano, String marca, double valorComercial, String chassi, String cor,
            int kilometragem, String renavam,
            String placa,
            String categoria, String adicionais) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.valorComercial = valorComercial;
        this.chassi = chassi;
        this.cor = cor;
        this.kilometragem = kilometragem;
        if (kilometragem > 0) {
            this.usado = true;
        } else {
            this.usado = false;
        }
        this.renavam = renavam;
        this.placa = placa;
        this.categoria = categoria;
        this.adicionais = adicionais;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(String adicionais) {
        this.adicionais = adicionais;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}