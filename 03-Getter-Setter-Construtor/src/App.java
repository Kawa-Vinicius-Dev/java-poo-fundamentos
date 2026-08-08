public class App {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC",0.5f, "azul",true);
        Copo copo1 = new Copo("Verde",12,0.43f,"Caneca");

        c1.status();
        copo1.status();
    }
}
