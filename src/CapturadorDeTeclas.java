import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CapturadorDeTeclas {

	public static void main(String[] args) {
		System.out.println("Bunny");
		System.out.println("PRESSIONE ENTER PARA COMEÇAR");
		JFrame frame = new JFrame();
		JButton button = new JButton();
		frame.add(button);
		frame.setVisible(true);

		button.addKeyListener(
				new KeyAdapter(){

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					for (int i = 0; i < 8; i++) {
						System.out.println("\n");
					}
					System.out.println("JOGO INICIADO");
				}
//				System.out.println(e.getKeyCode());
			}
		});
	}

}