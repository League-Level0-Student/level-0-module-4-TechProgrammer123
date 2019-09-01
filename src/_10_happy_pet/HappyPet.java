package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What do you pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make  your pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Food", "Water", "Cuddle" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
System.out.println(task);
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	
if(task == 0) {
	food();
}
if(task == 1) {
	water();
}
if(task== 2) {
	cuddle();
}
}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
static void food () {
	JOptionPane.showMessageDialog(null, "Your pet is happily eating its food!");
			happinessLevel+=1;
}
static void water() {
	JOptionPane.showMessageDialog(null, "Your pet is happily drinking water!");
	happinessLevel+=1;
}
static void cuddle() {
	JOptionPane.showMessageDialog(null, "Your pet is now cuddling with you!");
	happinessLevel+=1;
}


}