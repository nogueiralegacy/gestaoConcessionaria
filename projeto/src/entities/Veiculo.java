package entities;

public class Veiculo {
    private String chassi; // código VIN;
    private String cor;
    private boolean usado;
    private int kilometragem;
    private long renavam;
    private String placa;
    private String categoria;

    public Veiculo(String chassi, String cor, long renavam, String placa, String categoria) {
        this.chassi = chassi;
        this.cor = cor;
        this.usado = false;
        this.kilometragem = 0;
        this.renavam = renavam;
        this.placa = placa;
        this.categoria = categoria;
    }

    public Veiculo(String chassi, String cor, int kilometragem, long renavam, String placa) {
        this.chassi = chassi;
        this.cor = cor;
        this.usado = true;
        this.kilometragem = kilometragem;
        this.renavam = renavam;
        this.placa = placa;
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

    public long getRenavam() {
        return renavam;
    }

    public void setRenavam(long renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}