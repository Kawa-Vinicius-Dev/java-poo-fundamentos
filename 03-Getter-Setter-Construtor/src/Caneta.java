import javax.swing.plaf.PanelUI;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampar;

    public Caneta(String m, float p, String c, boolean t) {
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.setTampar(t);
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return this.cor;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    public boolean getTampar() {
        return this.tampar;
    }
    public void setTampar(boolean t) {
        this.tampar = t;
    }
    public void tampada(){
        this.tampar = true;
    }
    public void destampar(){
        this.tampar = false;
    }
    public void status(){
        System.out.println("Sobre a caneta!");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor() );
        System.out.println("Tampada: " + this.getTampar());
    }
}
