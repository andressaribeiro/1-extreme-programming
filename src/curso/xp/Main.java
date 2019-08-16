package curso.xp;

import curso.xp.service.Jogo;
import curso.xp.service.JogoImpl;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    static Jogo jogo = new JogoImpl();



    public static void main(String[] args) throws InterruptedException {


        JFrame frame = new JFrame();
        JButton button = new JButton();
        frame.add(button);
        frame.setVisible(true);
        button.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {


                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    jogo.direita();
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    jogo.esquerda();
                }
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    jogo.pulo();
                }
            }
        });

        gameLoop();
    }

    public static void gameLoop() throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
            jogo.tick();
            System.out.println(jogo.tela());


        }
    }
}
