public class Video implements Controlador {
    private String titulo;
    private int avaliacao;
    private int view;
    private int curtidas;
    private boolean reproduzir;

    public Video(String titulo) {
        setTitulo(titulo);
        setAvaliacao(1);
        setView(0);
        setCurtidas(0);
        setReproduzir(false);
    }

    @Override
    public void play() {
    setReproduzir(true);
    }

    @Override
    public void pause() {
    setReproduzir(false);
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao ) / this.view;
        this.avaliacao = nova;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public boolean isReproduzir() {
        return reproduzir;
    }

    public void setReproduzir(boolean reproduzir) {
        this.reproduzir = reproduzir;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", view=" + view +
                ", curtidas=" + curtidas +
                ", reproduzir=" + reproduzir +
                '}';
    }
}
