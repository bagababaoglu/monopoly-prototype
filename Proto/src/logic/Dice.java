package logic;
import java.util.Random;


public class Dice {

	private int fdie;
	private int sdie;
	Random randomGenerator = new Random();
	private boolean isDouble;
	
	public Dice () {
		
	}
	public void roll () {
		
		int randomInt = randomGenerator.nextInt(6)+1;
		this.fdie=randomInt;
		randomInt = randomGenerator.nextInt(6)+1;
		this.sdie=randomInt;
		if (fdie==sdie) {
			this.isDouble=true;
		}
	}
	
	public int getSum() {
		return fdie+sdie;
		
	}
	public int getFdie() {
		return fdie;
	}
	public void setFdie(int fdie) {
		this.fdie = fdie;
	}
	public int getSdie() {
		return sdie;
	}
	public void setSdie(int sdie) {
		this.sdie = sdie;
	}
	public boolean isDouble() {
		return isDouble;
	}
	public void setDouble(boolean isDouble) {
		this.isDouble = isDouble;
	}
	
	
	
}
