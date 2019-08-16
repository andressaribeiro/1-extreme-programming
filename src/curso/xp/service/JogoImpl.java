package curso.xp.service;

public class JogoImpl implements Jogo {


    private String character = "@";

    private int currentPosition = 6;

    private boolean pulando = false;

    @Override
    public void pulo() {
        pulando = true;
    }

    @Override
    public void tick() {
        if (this.currentPosition == -1) {
            this.currentPosition = 6;
        }
        this.currentPosition--;
    }

    @Override
    public String tela() {
        String espacos = "      \n";
        boolean estaColidindo = currentPosition == 0;
        String linhaDoPulo = "";

        if(pulando) {
            boolean pulandoDuranteColisao = estaColidindo && pulando;
            linhaDoPulo = pulandoDuranteColisao ? "\n" : "\n ";
        }
        String primeirosEspacos = character + linhaDoPulo;
        String ultimosEspacos = "";

        for (int i = 0; i < currentPosition; i++) {
            primeirosEspacos = primeirosEspacos.concat(" ");

        }

        for (int i = currentPosition; i < 7; i++) {
            ultimosEspacos = ultimosEspacos.concat(" ");
        }

        String obstaculo =  primeirosEspacos + "#" + ultimosEspacos;

        pulando = false;

        return  espacos + espacos + espacos + obstaculo + "\n#######\n";
    }
}
