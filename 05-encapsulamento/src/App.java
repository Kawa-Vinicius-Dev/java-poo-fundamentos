public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.abrirMenu();
        c1.ligarMudo();
        c1.abrirMenu();
        c1.fecharMenu();
        c1.desligar();
        c1.abrirMenu();
        c1.fecharMenu();
    }
}
