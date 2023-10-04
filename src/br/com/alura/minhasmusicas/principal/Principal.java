package br.com.alura.minhasmusicas.principal;
import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Kyoto");
        minhaMusica.setDuracao(2);
        minhaMusica.setCantor("Phoebe");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Como lidar com sentimentos difíceis");
        meuPodcast.setDuracao(314);
        meuPodcast.setApresentador("Jout Jout");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);





    }
}