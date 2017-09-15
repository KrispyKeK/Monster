package monster.controller;
import monster.model.MarshmallowMonster;
import java.util.*;

public class MonsterController {
	public void start() {
		MarshmallowMonster sample = new MarshmallowMonster("World Ender",2,4,3,true);
		System.out.println(sample + "\n");
		System.out.println("He ate his own bloops!" + "\n");
		sample.setHasBloop(false);
		System.out.println(sample);
		scanner(sample);
	}
	public void scanner(MarshmallowMonster currentMonster) {
		Scanner in = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " wants know what to eat next.");
		System.out.print("World ender wants to eat his own arms, how many should he eat: ");
		int inp = in.nextInt();
		System.out.println("");
		int logic = currentMonster.getArmCount() - inp;
		if (logic < 0) {
			System.out.println("He can't eat that many arms!");
		}
		else {
			currentMonster.setArmCount(currentMonster.getArmCount() - inp);
			System.out.println("Now " + currentMonster.getName() + " have " + currentMonster.getArmCount() + " arms.");
		}
	}
}
