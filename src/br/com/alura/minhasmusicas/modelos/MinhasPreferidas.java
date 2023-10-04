package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é uma de suas favoritas!");
        } else {
            System.out.println(audio.getTitulo() + " não é uma de suas favoritas :(");
        }
    }
}
