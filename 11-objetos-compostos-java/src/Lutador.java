public class Lutador {
    //atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public void apresentar(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Chegou a hora apresentamos o lutador - " + getNome());
        System.out.println("com " + getIdade());
        System.out.println("Diretamente de " + getNacionalidade());
        System.out.println("altura de - " + getAltura());
        System.out.println("pesando - " + getPeso());
        System.out.println("luta hoje na categoria - " + getCategoria());
        System.out.println("vitorias: " + getVitorias());
        System.out.println("derrotas: " + getDerrotas());
        System.out.println("empates: " + getEmpates());
    }
    public void status(){
        System.out.println(this.getNome() + " é peso " + this.getAltura() + " " + this.getCategoria());
        System.out.println("Ganhou " + getVitorias());
        System.out.println("Perdeu " + getDerrotas());
        System.out.println("Empatou " + getEmpates());
    }
    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nacionalidade = na;
        this.nome = no;
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.altura = al;
        this.setPeso(pe);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso <52.2){
            this.categoria = "inválido!";
        }else if (this.peso <70.3){
            this.categoria = "leve";
        }else if (this.peso <83.9){
            this.categoria = "médio";
        }else if (this.peso <120.2){
            this.categoria = "pesado";
        }else{
            this.categoria = "inválido!";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
}
