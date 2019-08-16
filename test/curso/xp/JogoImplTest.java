package curso.xp;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import curso.xp.service.Jogo;
import curso.xp.service.JogoImpl;

public class JogoImplTest {

    private Jogo jogo = new JogoImpl();

    @Test
    @Ignore
    public void testPulo() {
        jogo.pulo();

        Assert.assertEquals(
                "       \n"
                + "       \n"
                + "@      \n"
                + "      #\n"
                + "#######\n", jogo.tela());

        jogo.tick();

        Assert.assertEquals(
                "       \n"
                + "       \n"
                + "       \n"
                + "@    # \n"
                + "#######\n", jogo.tela());

    }
    @Test
    @Ignore
    public void testObstaculoComPulo() {
        Assert.assertEquals(
                "       \n"
                + "       \n"
                + "       \n"
                + "@     #\n"
                + "#######\n", jogo.tela());

        jogo.tick();

        Assert.assertEquals(
                "       \n"
                + "       \n"
                + "       \n"
                + "@    # \n"
                + "#######\n", jogo.tela());

        jogo.tick();

        Assert.assertEquals(
                "       \n"
                + "       \n"
                + "       \n"
                + "@   #  \n"
                + "#######\n", jogo.tela());

        jogo.tick();

        Assert.assertEquals(
                "       \n"
                        + "       \n"
                        + "       \n"
                        + "@   #  \n"
                        + "#######\n", jogo.tela());

        jogo.direita();

        Assert.assertEquals(
                "       \n"
                + "       \n"
                + "       \n"
                + " @#    \n"
                + "#######\n", jogo.tela());

        jogo.pulo();

        Assert.assertEquals(
                "       \n"
                + "       \n"
                + " @     \n"
                + " #     \n"
                + "#######\n", jogo.tela());

        jogo.direita();

        Assert.assertEquals(
                "       \n"
                + "       \n"
                + "       \n"
                + "#@     \n"
                + "#######\n", jogo.tela());

        jogo.direita();

        Assert.assertEquals(
                "       \n"
                + "       \n"
                + "       \n"
                + " @     \n"
                + "#######\n", jogo.tela());


    }

}