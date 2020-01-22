package _11_own_adventure;

import javax.swing.JOptionPane;

public class ChooseYourAdventure {
public static void main(String[] args) {
	//Hide under a strong object = 0
	//Use a fire extinguisher = 1
	//Break and jump = 2
	int option1 = JOptionPane.showOptionDialog(null, "You are on an unknown island with very little food and a water filter. What will you do?", "Choose an option", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Conquer a pirate ship", "Use the washed up boat", "Break and jump through a window" }, null);
	System.out.println(option1);
	if (option1 == 2) {
		JOptionPane.showMessageDialog(null, "You have died because you had jumped into a ocean  of alligators surrounding the island ");
				
		
		
		
	}
	if (option1 == 1) {
		JOptionPane.showMessageDialog(null, "You have died because your in a earthquake not a fire.");
		
		
		
	}
	if (option1 == 0) {
		int option2 = JOptionPane.showOptionDialog(null, "Which Object", "Choose an option", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Fold up table", "Fire extinguisher for making softer landing for objects above you", "A steel desk" }, null);
		
		
		if (option2 == 0) {
			JOptionPane.showMessageDialog(null, "You have died because the fold up table could not hold up the debri that was falling down.");
		}
		if (option2 == 1) {
			JOptionPane.showMessageDialog(null, "no.");
		}
		if (option2 == 2) {
			int yesNo = JOptionPane.showOptionDialog(null, "You have survived. Would you like to exit building", "Choose an option", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Yes", "No"}, null);
			if (yesNo == 0) {
				JOptionPane.showMessageDialog(null, "You have safely exited the building");
			}
			if (yesNo == 1) {
				JOptionPane.showMessageDialog(null, "no.");
			}
			
		}
	}
	


	
}
}
