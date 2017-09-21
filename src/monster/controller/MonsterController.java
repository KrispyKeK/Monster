package monster.controller;
import monster.model.MarshmallowMonster;
import java.util.*;
import mosnter.view.monsterDisplay;
public class MonsterController {
	private monsterDisplay popup;
	public MonsterController() {
		popup = new monsterDisplay();
		}
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
	public void scanner(MarshmallowMonster currentMonster) {
		Scanner in = new Scanner(System.in);
		int con = 0;
		int inpNum = 5;
		while(con == 0) {
			System.out.print("What do you want to eat: ");
// 	  	    String inp = in.nextLine();
			String inp = popup.getResponse("What do you want to eat: ");
			if (inp.contains("eye")) {
//				System.out.println("\n" + "I have " + currentMonster.getEyeCount() + " " + inp);
				popup.displayText("I have " + currentMonster.getEyeCount() + " eyes");
//				System.out.print("\n" + "How much of " + inp + " do you want to eat: ");
				String inpNumYe = popup.getResponse("How much do you want to it: ");
				try {
				 	inpNum = Integer.parseInt(inpNumYe);
				}
				catch(Exception e) {
					System.out.println("Whatcu want kid");
					popup.displayText("Watchu want kid");
				}
				int negEye = currentMonster.getEyeCount() - inpNum;
				if (negEye >= 0) {
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
		popup.displayText("How ya doing");
		String answer = popup.getResponse("Watchu eating for lunch?");
		popup.displayText("You typed in " + answer);
	}	
}
