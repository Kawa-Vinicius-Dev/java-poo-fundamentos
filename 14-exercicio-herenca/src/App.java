public class App {
    public static void main(String[] args) throws Exception {
        //Pessoa p1 = new Pessoa();
        /*Visitante v1 = new Visitante();
        v1.setNome("Kawã");
        v1.setSexo("M");
        v1.setIdade(22);
        System.out.println(v1.toString());*/

        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        a1.setCurso("Ciência da computação");
        a1.setMatricula(1111);
        a1.setIdade(17);
        a1.setSexo("F");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Julio");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

    }
}
