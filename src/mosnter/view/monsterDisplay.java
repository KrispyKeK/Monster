package mosnter.view;

import javax.swing.JOptionPane;


public class monsterDisplay {
	//allows for the window in java
	public void displayText(String textToDisplay) {
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	//receives responses from the user
	public String getResponse(String questionAsked) {
		String response = "";
		response += JOptionPane.showInputDialog(null,questionAsked);
		return response;
	}
}
