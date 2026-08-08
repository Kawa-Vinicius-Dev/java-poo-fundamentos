public class app {
    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco();
        cb1.abrirConta(123,"Kawã Vinicius Viana");
        cb1.statusConta();
        cb1.depositar();
        cb1.statusConta();
        cb1.sacar();
        cb1.statusConta();
        cb1.fecharConta();
        cb1.statusConta();
        cb1.sacar();
        cb1.fecharConta();
        cb1.statusConta();
    }
}
