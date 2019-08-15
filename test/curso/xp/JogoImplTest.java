package curso.xp;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import curso.xp.service.Acoes;
import curso.xp.service.AcoesImpl;
import curso.xp.service.Jogo;
import curso.xp.service.JogoImpl;

import static org.junit.Assert.assertTrue;

public class JogoImplTest {

    private Jogo jogo = new JogoImpl();

    @Test
    @Ignore
    public void testVaiParaEsquerda() {
        Assert.assertEquals(
                     "       \n"
                            + "       \n"
                            + "       \n"
                            + "@      \n"
                            + "#######\n", jogo.tela());

        jogo.esquerda();

        Assert.assertEquals(
                "       \n"
                + "       \n"
                + "       \n"
                + "@      \n"
                + "#######\n", jogo.tela());
    }

    @Test
    @Ignore
    public void testVaiParaDireita() {
        jogo.direita();

        Assert.assertEquals(
                "       \n"
                + "       \n"
                + "       \n"
                + " @     \n"
                + "#######\n", jogo.tela());
    }

    @Test
    @Ignore
    public void testPulaUmEspaco() {
        jogo.pulo();

        Assert.assertEquals(
                "       \n"
                + "       \n"
                + " @     \n"
                + "       \n"
                + "#######\n", jogo.tela());
    }

}