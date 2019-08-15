package curso.xp;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import curso.xp.service.Acoes;
import curso.xp.service.AcoesImpl;

public class Main {




    public static void main(String[] args) {

        Acoes acoes = new AcoesImpl();

        acoes.tela();

        JFrame frame = new JFrame();
        JButton button = new JButton();
        frame.add(button);
        frame.setVisible(true);
        button.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                System.out.flush();

                if(e.getKeyCode() == 39){
                   acoes.direita();
                }
                if(e.getKeyCode() == 37) {
                    acoes.esquerda();
                }

                System.out.println(acoes.tela());
            }
        });
    }
}
