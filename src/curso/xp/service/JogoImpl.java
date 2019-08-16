package curso.xp.service;

public class JogoImpl implements Jogo {

    private String bunny = "@";

    private int currentPosition = 6;

    private boolean pulando = false;

    String linhaDoPulo = "      \n";

    @Override
    public void pulo() {
        pulando = true;
        linhaDoPulo = bunny + "     \n";
    }

    @Override
    public void tick() {
        andarObstaculo();
    }

    private void andarObstaculo() {
        if (this.currentPosition == -1) {
            this.currentPosition = 6;
        }
        this.currentPosition--;
    }

    @Override
    public String tela() {
        String espacos = "       \n";
        String chao = "\n#######\n";

        if (!pulando) {
            linhaDoPulo = espacos;
        }

        pulando = false;

        String linhaDoObstaculo = bunny + "     #";

        String primeirosEspacos = "";
        String ultimosEspacos = "";

        for (int i = 0; i < currentPosition; i++) {
            primeirosEspacos = primeirosEspacos.concat(".");
        }

        for (int i = currentPosition; i < 6; i++) {
            ultimosEspacos = ultimosEspacos.concat("-");
        }

        String linhaBase = primeirosEspacos + "#" + ultimosEspacos;

        return espacos + espacos + linhaDoPulo + linhaBase + chao;
    }

}
