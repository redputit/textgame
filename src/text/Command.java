package text;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Command extends JPanel implements KeyListener  {
	
	public Command() {
		setFocusable(true);
		addKeyListener(this);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		char key = arg0.getKeyChar();
		
		switch(key) {
			case 'a'://attack
				
			case 'b'://bush
				
			case 'c':
				 
			case 'd'://dash
				
			case 'e':
				
			case 'f':
				
			case 'g':
				
			case 'h':
		}
		// TODO 自動生成されたメソッド・スタブ
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}