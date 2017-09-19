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
		System.out.println("He ate his own bloops!" + "\n");
		sample.setHasBloop(false);
		System.out.println(sample);
		scanner(sample);
	}
	public void scanner(MarshmallowMonster currentMonster) {
		Scanner in = new Scanner(System.in);
		int inpNum = 0;
		int con = 0;
		while(con == 0) {
			System.out.print("What do you want to eat: ");
			String inp = in.nextLine();
			if (inp.contains("eye")) {
				System.out.println("\n" + "I have " + currentMonster.getEyeCount() + " " + inp);
				System.out.print("\n" + "How much of " + inp + " do you want to eat: ");
				inpNum = in.nextInt();	
				int negEye = currentMonster.getEyeCount() - inpNum;
				if (negEye >= 0) {
					System.out.println(currentMonster.getName() + " ate his own " + inp + " He now have " + negEye + " eyes." + "\n");
					currentMonster.setEyeCount(negEye);
				}
				else {
					System.out.println("You can't do that!" + "\n");
				}
			}
			
			else if (inp.contains("arm")) {
				System.out.println("\n" + "I have " + currentMonster.getArmCount() + " " +inp);
				System.out.print("\n" + "How much of " + inp + " do you want to eat: ");
				inpNum = in.nextInt();
				int negArm = currentMonster.getArmCount() - inpNum;
				if (negArm >= 0 ) {
					System.out.println(currentMonster.getName() + " ate his own " + inp + " He now have " + negArm + " arms" + "\n");
					currentMonster.setArmCount(negArm);
				}
				else {
					System.out.println("You can't do that!" + "\n");
				}
			}
			
			else if (inp.contains("tentacle")) {
				System.out.print("\n" + "How much of " + inp + " do you want to eat: ");
				inpNum = in.nextInt();
				double negTent = currentMonster.getTentacleAmount() - inpNum;
				if (negTent >= 0) {
					System.out.println(currentMonster.getName() + " ate his own " + inp + " He now have " + negTent + " tentacles" + "\n");
					currentMonster.setTentacleAmount(negTent);
				}
				else {
					System.out.println("You can't do that!");
				}
			}
			else {
				System.out.println("What the heck");
			}
			popup.displayText("How ya doing");
			String answer = popup.getResponse("Watchu eating for lunch?");
			popup.displayText(answer);
		}
	}	
}
