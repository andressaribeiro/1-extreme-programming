package curso.xp;

import curso.xp.service.Jogo;
import curso.xp.service.JogoImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class JogoImplTest {

    private Jogo jogo;

    @Before
    public void iniciarJogo() {
         jogo = new JogoImpl();
    }

    @Test
    public void testTick() {
        tela("       \n" +
             "       \n" +
             "       \n" +
             "@     #\n" +
             "#######\n");

        jogo.tick();
        jogo.tick();

        tela("       \n"
                + "       \n"
                + "       \n"
                + "@   #  \n"
                + "#######\n");
    }

    private void tela(String expected) {
        Assert.assertEquals(
                expected, tela());
    }

    @Test
    public void testPulo() {
        jogo.pulo();

        Assert.assertEquals(
                "       \n"
                        + "       \n"
                        + "@      \n"
                        + "      #\n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "       \n"
                        + "       \n"
                        + "       \n"
                        + "@    # \n"
                        + "#######\n", tela());
    }

    @Test
    public void testObstaculoComPulo() {
        Assert.assertEquals(
                "       \n"
                        + "       \n"
                        + "       \n"
                        + "@     #\n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "       \n"
                        + "       \n"
                        + "       \n"
                        + "@    # \n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "       \n"
                        + "       \n"
                        + "       \n"
                        + "@   #  \n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "       \n"
                        + "       \n"
                        + "       \n"
                        + "@  #   \n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "       \n"
                        + "       \n"
                        + "       \n"
                        + "@ #    \n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "       \n"
                        + "       \n"
                        + "       \n"
                        + "@#     \n"
                        + "#######\n", tela());

        jogo.pulo();

        Assert.assertEquals(
                "       \n"
                        + "       \n"
                        + "@      \n"
                        + "#      \n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "       \n"
                        + "       \n"
                        + "       \n"
                        + "@     #\n"
                        + "#######\n", tela());
    }

    @Test
    public void testObstaculoComColisao() {
        jogo.tick();
        jogo.tick();
        jogo.tick();
        jogo.tick();
        jogo.tick();
        jogo.tick();

        Assert.assertEquals(
                "       \n"
                        + "       \n"
                        + "       \n"
                        + "x      \n"
                        + "#######\n", tela());
    }

    private String tela() {
        return jogo.tela();
    }

}