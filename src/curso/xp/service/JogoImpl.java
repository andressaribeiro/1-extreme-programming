package curso.xp.service;

public class JogoImpl implements Jogo {


    private String character = "#";

    private int currentPosition = 0;

    @Override
    public void sobe() {

    }

    @Override
    public void desce() {

    }

    @Override
    public void esquerda() {

        String spaces = "\n\n\n\n\n";

        for(int i = 0; i < currentPosition - 1; i++){
            spaces = spaces.concat(" ");
        }

        System.out.println(spaces.concat(character));

        currentPosition = currentPosition - 1;

    }

    @Override
    public void direita() {

        String spaces = "\n\n\n\n\n";

        for(int i = 0; i <= currentPosition; i++){
            spaces = spaces.concat(" ");
        }

       System.out.println(spaces.concat(character));

        currentPosition = currentPosition + 1;

    }

    @Override
    public void pulo() {

    }

    @Override
    public void tick() {

    }

    @Override
    public String tela() {
        return character;
    }
}
