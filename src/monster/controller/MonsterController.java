package monster.controller;
//importing from the monster.model file
import monster.model.MarshmallowMonster;
//importing the entirety of util, which includes the scanner
import java.util.*;
//imports the display file to allow the user to view text on a window popup
import mosnter.view.monsterDisplay;
public class MonsterController {
	private monsterDisplay popup;
	//basically creating a keyword for popup window named popup
	public MonsterController() {
		popup = new monsterDisplay();
		}
	//just another start method
	public void start() {
		MarshmallowMonster sample = new MarshmallowMonster("World Ender",2,4,3,true);
		System.out.println(sample);
//		System.out.println("He ate his own bloops!" + "\n");
		popup.displayText("He ate his own bloops!");
		sample.setHasBloop(false);
//		System.out.println(sample);
		popup.displayText(sample.toString());
		scanner(sample);
	}
	//a method to interact with the monster
	public void scanner(MarshmallowMonster currentMonster) {
		Scanner in = new Scanner(System.in);
		//integers that maintain the code as well
		int con = 0;
		int inpNum = 5;
		// a while loop that maintains the loop
		while(con == 0) {
			System.out.print("What do you want to eat: ");
// 	  	    String inp = in.nextLine();
			String inp = popup.getResponse("What do you want to eat: ");
			if (inp.contains("eye")) {
//				System.out.println("\n" + "I have " + currentMonster.getEyeCount() + " " + inp);
				popup.displayText("I have " + currentMonster.getEyeCount() + " eyes");
//				System.out.print("\n" + "How much of " + inp + " do you want to eat: ");
				String inpNumYe = popup.getResponse("How much do you want to it: ");
				// a try and catch to prevent trash input
				try {
				 	inpNum = Integer.parseInt(inpNumYe);
				}
				catch(Exception e) {//exception e allows for any errors
					System.out.println("Whatcu want kid");
					popup.displayText("Watchu want kid");
				}
				// some logic to prevent negative eyes
				int negEye = currentMonster.getEyeCount() - inpNum;
				if (negEye >= 0) { //using if and else to invoke logic into math
//					System.out.println(currentMonster.getName() + " ate his own " + inp + " He now have " + negEye + " eyes." + "\n");
					popup.displayText(currentMonster.getName() + " ate his own " + inp + " He now have " + negEye + " eyes.");
					currentMonster.setEyeCount(negEye);
				}
				else {
//					System.out.println("You can't do that!" + "\n");
					popup.displayText("You can't do that!");
				}
			}
			
			else if (inp.contains("arm")) {
//				System.out.println("\n" + "I have " + currentMonster.getArmCount() + " " +inp);
				popup.displayText("I have " + currentMonster.getArmCount() + " " +inp);
//				System.out.print("\n" + "How much of " + inp + " do you want to eat: ");				
				String numYeTwo = popup.getResponse("How much of " + inp + " do you want to eat: ");
				try {
					inpNum = Integer.parseInt(numYeTwo);
				}
				catch(Exception E) {
					System.out.println("Really kid?");
				}
				int negArm = currentMonster.getArmCount() - inpNum;
				if (negArm >= 0 ) {
					popup.displayText(currentMonster.getName() + " ate his own " + inp + " He now have " + negArm + " arms");
//					System.out.println(currentMonster.getName() + " ate his own " + inp + " He now have " + negArm + " arms" + "\n");
					currentMonster.setArmCount(negArm);
				}
				else {
					popup.displayText("You can't do that!");
//					System.out.println("You can't do that!" + "\n");
				}
			}
			
			//this uses doubles instead of int
			else if (inp.contains("tentacle")) {
				System.out.print("\n" + "How much of " + inp + " do you want to eat: ");
				inpNum = in.nextInt();
				double negTent = currentMonster.getTentacleAmount() - inpNum;
				if (negTent >= 0) {
					System.out.println(currentMonster.getName() + " ate his own " + inp + " He now have " + negTent + " tentacles" + "\n");
					currentMonster.setTentacleAmount(negTent);
					con++;
				}
				else {
					System.out.println("You can't do that!");
				}
			}
			else {
				System.out.println("What the heck");
				popup.displayText("Yo mang, stop this nonsense");
			}
		}		
		// just a fun pop up
		popup.displayText("How ya doing");
		String answer = popup.getResponse("Watchu eating for lunch?");
		popup.displayText("You typed in " + answer);
	}
	//helper methods that checks for true and includes a try.catch exception
	private boolean isValidInteger(String sample) {
		boolean valid = false;
		try {
			Integer.parseInt(sample);
			valid = true;
		}
		catch(Exception e) {
			popup.displayText("Bruh not like this");
		}
		return valid;
	}
	private boolean isValidDouble(String sampleDouble){
		boolean valid = false;
		try {
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch(Exception e) {
			popup.displayText("Just hang yourself");
		}
		return valid;
	}
	//the only one that isn't a number
	private boolean isValidBoolean(String sampleBoolean) {
		boolean valid = true;
		try {
			Boolean.parseBoolean(sampleBoolean);
			valid = true;
		}
		catch(Exception e) {
			popup.displayText("You should honestly invest in huniepop");
		}
		return valid;
	}
}
