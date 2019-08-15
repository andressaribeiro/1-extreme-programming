package curso.xp;

import org.junit.Assert;
import org.junit.Test;

import curso.xp.service.Acoes;
import curso.xp.service.AcoesImpl;
import curso.xp.service.Jogo;
import curso.xp.service.JogoImpl;

import static org.junit.Assert.assertTrue;

public class JogoImplTest {

    private Jogo acoes = new JogoImpl();
    @Test
    public void testVaiParaEsquerda() {
        String telaInicial = acoes.tela();
        Assert.assertEquals(
                     "        \n"
                            + "        \n"
                            + "        \n"
                            + "        \n"
                            + "        \n", telaInicial.length());

        acoes.esquerda();

        String telaDepoisQueFoiPraEsquerda = acoes.tela();
        Assert.assertEquals("shuahsua", telaDepoisQueFoiPraEsquerda);
    }

    @Test
    public void testVaiParaDireita() {
        String telaInicial = acoes.tela();
        Assert.assertEquals("shuahsua", telaInicial);

        acoes.direita();

        String telaDepoisQueFoiPraDireita = acoes.tela();
        Assert.assertEquals("shjaiuhsuas", telaDepoisQueFoiPraDireita);
    }

    @Test
    public void testNaoApareceRastrosQuandoSeMove() {

    }

}