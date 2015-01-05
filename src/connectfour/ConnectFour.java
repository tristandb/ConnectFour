package connectfour;

import java.awt.EventQueue;

import connectfour.gui.Gui;

public class ConnectFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectFour ConnectFour = new ConnectFour();
		
	}
	
	public ConnectFour(){
		// Launch GUI
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
