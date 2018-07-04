package logic;

public class Player {

	private String name;
	private int money;
	private Property [] properties;
	private int propCount=0;
	private int loc;
	
	
	
	
	
	public Player (String Name) {
		this.name=Name;
		this.money=3200;
		properties =new Property[12];
		loc =0;
		
	}
	public void passGo () {
		money=money + 200;
	}
	
	
	
	/*public boolean isPlayed() {
		return isPlayed;
	}
	public void setPlayed(boolean isPlayed) {
		this.isPlayed = isPlayed;
	}*/
	public void move (int a) {
		
		
		if(loc+a>=20) {
			passGo();
			loc=(loc+a)%20;
		}
		else {
			
			loc=loc+a;
		}
		
	}
	
	
	public void buyProperty(Property p) {
		int pp=p.getPrice();
		if (p.isSold()) {
			//print that the pp is sold
			
		}else if (pp<=money) {
			
			p.setSold(true);
			properties[propCount]=p;
			propCount++;
			money=money-pp;
			
		}else {
			
			//print that not enough money
			
			
		}	
	} 
	
	
	
	


	public int getLoc() {
		return loc;
	}




	public void setLoc(int loc) {
		this.loc = loc;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getMoney() {
		return money;
	}




	public void setMoney(int money) {
		this.money = money;
	}




	public int getPropCount() {
		return propCount;
	}




	public void setPropCount(int propCount) {
		this.propCount = propCount;
	}
	
	
	
}
