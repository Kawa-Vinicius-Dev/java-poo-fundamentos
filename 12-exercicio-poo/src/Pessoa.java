public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String no, int id, String se) {
        setNome(no);
        setIdade(id);
        setSexo(se);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void fazerAniversario(){
        setIdade(getIdade() + 1);
    }
    public void apresentar(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
    }
}
