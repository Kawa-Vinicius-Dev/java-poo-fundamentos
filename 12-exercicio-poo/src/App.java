public class App {
    public static void main(String[] args){
        //dados ficticios.

        Pessoa [] p = new Pessoa[5];
        p[0] = new Pessoa("Kawã Vinicius",22, "Masculino");
        p[1] = new Pessoa("Leon tolstoi",53, "Masculino" );
        Livro [] l = new Livro[5];
        l[0] = new Livro("A morte de Ivan ilitch",p[1] , 112);

        l[0].abrir();
        l[0].detalhes();

    }
}
