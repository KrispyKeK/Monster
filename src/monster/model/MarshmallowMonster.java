package monster.model;

public class MarshmallowMonster {
	
	//Declaration section for the data members
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	public MarshmallowMonster() {
		//unless we specify values all data members are a zero, false, or null
	}
	public MarshmallowMonster(String name, int eyeCount, int arms, double tentacleAmount, boolean hasBloop) {
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = arms;
		this.tentacleAmount = tentacleAmount;
		this.hasBloop = hasBloop;
	}
	public String toString() {
		String desc =  "Greetings Traveler, please end my suffering. My name is " + name +" and I have have " + eyeCount;
		desc += " eyes and I have " + armCount + " arms, and I have " + tentacleAmount + " tentacles, and my bloop existance is " + hasBloop;
		desc += ". Please end me!";
		return desc;
	}
}
