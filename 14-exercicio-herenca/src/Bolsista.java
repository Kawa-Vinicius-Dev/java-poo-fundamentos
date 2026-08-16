public final class      Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {

    }
    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " é bolsista!\nPagando mensalidade!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
