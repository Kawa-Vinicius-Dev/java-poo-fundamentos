package Program;

public class app {
    public static void main(String[] args) {
        Entities c1 = new Entities();

        c1.modelo = "BIC";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;

        c1.status();
    }
}
