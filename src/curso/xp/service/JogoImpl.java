package curso.xp.service;

public class JogoImpl implements Jogo {


    private String character = "@";

    private int currentPosition = 6;

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

        this.currentPosition--;
    }

    @Override
    public void pulo() {

    }

    @Override
    public void tick() {
        System.out.println(this.tela());
    }

    @Override
    public String tela() {
        String spaces = "       \n";
        String primeirosEspacos = character;
        String ultimosEspacos = "";

        for (int i = 0; i < currentPosition; i++) {
            primeirosEspacos = primeirosEspacos.concat(" ");
        }

        for (int i = currentPosition; i < 7; i++) {
            ultimosEspacos = ultimosEspacos.concat(" ");
        }

        String obstaculo =  primeirosEspacos + "#" + ultimosEspacos;

        return  spaces + spaces + spaces + obstaculo + "\n#######\n";
    }
}
