public class Aluno {
    private String nome;
    private int n_usp;
    private float notas;
    private float media_final;

    //getters and setters
    public float getNotas() {
        return notas;
    }

    public float getMedia_final() {
        return media_final;
    }

    public void setMedia_final(float media_final) {
        this.media_final = media_final;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getN_usp() {
        return n_usp;
    }

    public void setN_usp(int n_usp) {
        this.n_usp = n_usp;
    }

    public void setNotas(float notas) {
        this.notas = notas;
    }

}