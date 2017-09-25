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
	//just a crap ton of getters and s
	public String getName() {
		return name;
	}
	public int getEyeCount() {
		return eyeCount;
	}
	public int getArmCount() {
		return armCount;
	}
	public double getTentacleAmount() {
		return tentacleAmount;
	}
	public boolean hasBloop() {
		return hasBloop;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEyeCount(int eyeCount) {
		this.eyeCount = eyeCount;
	}
	public void setArmCount(int armCount) {
		this.armCount = armCount;
	}
	public void setTentacleAmount(double tentacleAmount) {
		this.tentacleAmount = tentacleAmount;
	}
	public void setHasBloop(boolean hasBloop) {
		this.hasBloop = hasBloop;
	}
	//a method to convert stuff in senteces to display to the user
	public String toString() {
		String desc =  "Greetings Traveler, please end my suffering. My name is " + name +" and I have have " + eyeCount;
		desc += " eyes and I have " + armCount + " arms, and I have " + tentacleAmount + " tentacles, and my bloop existance is " + hasBloop;
		desc += ". Please end me!" + "\n";
		return desc;
	}
}
