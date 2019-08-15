package curso.xp;

import curso.xp.service.Jogo;
import curso.xp.service.JogoImpl;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {




    public static void main(String[] args) {

        Jogo jogo = new JogoImpl();

        jogo.tela();

        JFrame frame = new JFrame();
        JButton button = new JButton();
        frame.add(button);
        frame.setVisible(true);
        button.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                System.out.flush();

                if(e.getKeyCode() == 39){
                   jogo.direita();
                }
                if(e.getKeyCode() == 37) {
                    jogo.esquerda();
                }

//                System.out.println(jogo.tela());
            }
        });
    }
}
