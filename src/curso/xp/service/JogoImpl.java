package curso.xp.service;

public class JogoImpl implements Jogo {


    private String character = "#";


    private String tela ="";

    private int currentPosition = 0;

    @Override
    public void sobe() {

    }

    @Override
    public void desce() {

    }

    @Override
    public void esquerda() {

        tela = "";

        String spaces = "";

        for(int i = 0; i < currentPosition - 1; i++){
            tela = tela.concat(" ");
        }

        tela.concat(character);

//        System.out.println(spaces.concat(character));

        currentPosition = currentPosition - 1;

    }

    @Override
    public void direita() {

//        String spaces = "";

        tela = "";
        for(int i = 0; i <= currentPosition; i++){
            tela = tela.concat(" ");
        }

//       System.out.println(tela.concat(character));

        tela.concat(character);

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
        return tela;
    }
}
