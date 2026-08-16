public class App {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.emitirSom();
        c.reagir("Olá");
        c.reagir(12,40);
        c.reagir(false);
    }
}
