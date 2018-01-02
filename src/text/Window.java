package text;

import javax.swing.JLabel;

public class Window {
	
	javax.swing.JFrame window = new javax.swing.JFrame();

	public Window() {
		
		window.setBounds( 0, 0, 300, 200);
		window.setVisible(true);
		window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		
		javax.swing.JLabel label = new JLabel("title");
		label.setFont(new java.awt.Font(null, 0,30));
		window.setForeground(java.awt.Color.BLACK);
		
		window.add(label);
		
	}

}
