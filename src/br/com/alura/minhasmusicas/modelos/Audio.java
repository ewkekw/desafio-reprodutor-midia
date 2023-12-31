package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducao;
    private int totalCurtida;
    private float classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtida() {
        return totalCurtida;
    }

    public float getClassificacao() {
        return classificacao;
    }


    public void reproduz() {
    totalReproducao++;
    }

    public void curte(){
        totalCurtida++;
    }

}

