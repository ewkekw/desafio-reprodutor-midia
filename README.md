# Projeto Músicas e Podcasts Preferidos - Alura ⌨️

## Descrição
Neste projeto, aplicamos conceitos essenciais de orientação a objetos para criar uma aplicação eficiente de cadastro de músicas e podcasts preferidos.

## Conceitos de Orientação a Objetos Utilizados
- **Abstração:** Criamos as classes `Audio`, `Musica` e `Podcast` para representar entidades abstratas, capturando características essenciais.
- **Herança:** Utilizamos herança ao estender a classe `Audio` para criar `Musica` e `Podcast`, aproveitando e especializando funcionalidades existentes.
- **Encapsulamento:** Aplicamos o encapsulamento mantendo os atributos privados e acessando-os por meio de métodos getters e setters, controlando o acesso aos dados.
- **Polimorfismo:** Demonstramos polimorfismo ao usar o método `getClassificacao`, permitindo comportamentos distintos com base na classe concreta passada como parâmetro na classe `MusicasPreferidas`.
- **Organização em Pacotes:** Estruturamos o código em pacotes, facilitando a manutenção e a compreensão da estrutura do projeto.

## Funcionalidades
- Criação da classe `Audio` com métodos para curtir e reproduzir, controlando `totalCurtidas` e `totalReproducoes`.
- Classes `Musica` e `Podcast` estendendo `Audio`, adicionando atributos específicos.
- Classe `Principal` para instanciar e simular interações com músicas e podcasts.
- Classe `MusicasPreferidas` com polimorfismo, avaliando e exibindo mensagens com base na classificação.

Sinta-se à vontade para experimentar e entender os fundamentos poderosos da orientação a objetos neste projeto! 🚀🎶🔊
