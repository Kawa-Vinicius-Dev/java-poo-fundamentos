public class Copo {
    private int tamanho;
    private String cor;
    private float raio;
    private String modelo;

    public Copo(String cor, int tamanho, float raio, String modelo) {
        this.setTamanho(tamanho);
        this.setCor(cor);
        this.setRaio(raio);
        this.setModelo(modelo);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void status(){
        System.out.println("Estado copo!");
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tamanho: " + this.getTamanho());
        System.out.println("Raio: " + this.getRaio());
        System.out.println("Modelo: " + this.getModelo());

    }
}
