public class Livro implements ControladorLivro {
    private String titulo;
    private Pessoa leitor;
    private Pessoa autor;
    private int totalPaginas, pagAtual;
    private boolean aberto;

    public Livro(String ti, Pessoa au, int tPag) {

        setTitulo(ti);
        setAutor(au);
        setTotalPaginas(tPag);
        setPagAtual(1);
        setAberto(false);

    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void detalhes() {
        System.out.println("Titulo: " + getTitulo());
        autor.apresentar();
        System.out.println("Total: " + getTotalPaginas());
        System.out.println("PagAtual: " + getPagAtual());
        System.out.println("Aberto: " + isAberto());
    }

    @Override
    public void abrir() {
        if (isAberto()) {
            System.out.println("Livro já esta aberto!");
        } else {
            System.out.println("Livro aberto!");
            setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (!isAberto()) {
            System.out.println("Livro já esta fechado");
        } else {
            System.out.println("Livro fechado!");
            setAberto(false);
        }
    }

    @Override
    public void folhear() {
        int condicao = getTotalPaginas() - getPagAtual();
        if (isAberto() && condicao > 0) {
            for (int i = 1; i <= condicao; i++) {
                System.out.print(getPagAtual() + " ");
                setPagAtual(getPagAtual() + 1);
            }
        } else if (!isAberto()) {
            System.out.println("Livro fechado!\nNão tem como folhear");
        } else if (condicao == 0) {
            System.out.println("Não tem como folhear!\nLivro esta na ultima pagina!");
        }
    }

    @Override
    public void avancarPag() {
        if (isAberto() && getPagAtual() < getTotalPaginas()) {
            setPagAtual(getPagAtual() + 1);
            System.out.println("folheado: " + (getPagAtual() - 1) +
                    "para a página " + getPagAtual());
        }
    }

    @Override
    public void voltarPag() {
        if (isAberto() && getPagAtual() > 1) {
            setPagAtual(getPagAtual() - 1);
            System.out.println("folheado: " + (getPagAtual() + 1) +
                    "para a página " + getPagAtual());
        }
    }

    @Override
    public void abrirPag1() {
        if (isAberto()) {
            if (getPagAtual() == 1) {
                System.out.println("Já está na primeira página");
            } else {
                System.out.println("Folheando até a primeira pagina");
                setPagAtual(1);
            }
        } else {
            setAberto(true);
            setPagAtual(1);
            System.out.println("Livro aberto na primeira página");
        }
    }
}
