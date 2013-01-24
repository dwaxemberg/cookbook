package cook_book;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

public class MainGUI extends JFrame {
	/**
	 * Necessary because JFrame is serializable
	 */
	private static final long serialVersionUID = 1L;
	private SpringLayout layout;
	
	public MainGUI() {
		initialize();
	}
	
	private void initialize() {
		this.setSize(1024, 768);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((d.width-this.getWidth())/ 2, 0);
		layout = new SpringLayout();
		this.getContentPane().setLayout(layout);
		if (hasOpenCookBook()) {
			//reopen the cookbook
		}
		else {
			//create a new "untitled" cookbook
		}
		this.setVisible(true);
	}
	
	private boolean hasOpenCookBook() {
		
		
		return false;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MainGUI();
	}

}
