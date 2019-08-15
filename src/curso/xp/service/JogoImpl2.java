package curso.xp.service;

public class JogoImpl implements Jogo {


    private String character = "@";

    private int currentPosition = 0;

    @Override
    public void sobe() {

    }

    @Override
    public void desce() {

    }

    @Override
    public void esquerda() {

        this.currentPosition--;
        System.out.println(this.tela());

    }

    @Override
    public void direita() {

        this.currentPosition++;
        System.out.println(this.tela());

    }

    @Override
    public void pulo() {

    }

    @Override
    public void tick() {

    }

    @Override
    public String tela() {
        String spaces = "       \n";
        String primeirosEspacos = "";
        String ultimosEspacos = "";

        for (int i = 0; i < currentPosition; i++) {
            primeirosEspacos.concat(" ");
        }

        for (int i = currentPosition; i < 7; i++) {
            ultimosEspacos.concat(" ");
        }

        String lineCharacter = primeirosEspacos + character + ultimosEspacos;

        return spaces + spaces + spaces + lineCharacter + "\n#######\n";
    }
}
