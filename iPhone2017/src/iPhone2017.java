public class iPhone2017 {
    private String modelo;
    private int capacidade;
    private int armazenamento;

    public iPhone2017(String modelo, int capacidade, int armazenamento) {
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.armazenamento = armazenamento;
    }

    // Getters e Setters para modelo, capacidade e armazenamento

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
}
