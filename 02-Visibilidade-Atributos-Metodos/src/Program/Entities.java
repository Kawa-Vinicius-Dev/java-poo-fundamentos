package Program;

public class Entities {

    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar() {
        if (this.carga <= 0) {
            System.out.println("Caneta sem carga");
        } else if (this.tampada == true) {
            System.out.println("Caneta tampada");
        } else {
            System.out.println("Estou rabiscando! ");

        }
    }

    protected void tampar() {
        this.tampada = true;
    }
    protected void destampar() {
        this.tampada = false;
    }
}


