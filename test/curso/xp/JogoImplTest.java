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
        tela("0      \n"
                     + "       \n"
                     + "       \n"
                     + "       \n"
                     + "@     #\n"
                     + "#######\n");

        jogo.tick();
        jogo.tick();

        tela("2      \n"
                     + "       \n"
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
                "0      \n"
                        + "       \n"
                        + "       \n"
                        + "@      \n"
                        + "      #\n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "1      \n"
                        + "       \n"
                        + "       \n"
                        + "       \n"
                        + "@    # \n"
                        + "#######\n", tela());
    }

    @Test
    public void testObstaculoComPulo() {
        Assert.assertEquals(
                "0      \n"
                        + "       \n"
                        + "       \n"
                        + "       \n"
                        + "@     #\n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "1      \n"
                        + "       \n"
                        + "       \n"
                        + "       \n"
                        + "@    # \n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "2      \n"
                        + "       \n"
                        + "       \n"
                        + "       \n"
                        + "@   #  \n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "3      \n"
                        + "       \n"
                        + "       \n"
                        + "       \n"
                        + "@  #   \n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "4      \n"
                        + "       \n"
                        + "       \n"
                        + "       \n"
                        + "@ #    \n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "5      \n"
                        + "       \n"
                        + "       \n"
                        + "       \n"
                        + "@#     \n"
                        + "#######\n", tela());

        jogo.pulo();

        Assert.assertEquals(
                "6      \n"
                        + "       \n"
                        + "       \n"
                        + "@      \n"
                        + "#      \n"
                        + "#######\n", tela());

        jogo.tick();

        Assert.assertEquals(
                "7      \n"
                        + "       \n"
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
                "6      \n"
                        + "       \n"
                        + "       \n"
                        + "       \n"
                        + "x      \n"
                        + "#######\n", tela());
    }

    private String tela() {
        return jogo.tela();
    }
    
}