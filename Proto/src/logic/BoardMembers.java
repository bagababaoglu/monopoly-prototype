package logic;

public class BoardMembers  {
	
		
	private boolean isProperty=false;
     private String name;
     private boolean isSold=false;
     private int price;
   public BoardMembers (String nm) {
	   this.name=nm;
   }
   
   public void buyProperty(Property p) {
	   
	   
   }
   public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public boolean isProperty() {
		return isProperty;
	}

	public void setProperty(boolean isProperty) {
		this.isProperty = isProperty;
	}
   
   public boolean isSold() {
	return isSold;
}



public void setSold(boolean isSold) {
	this.isSold = isSold;
}



public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

public boolean isGo() {
	   if (this.getName().equals("Go")) {
		   return true;
	   }else {
		   
		   return false;
	   }}

public boolean isChance() {
	   if (this.getName().equals("Chance")) {
		   return true;
	   }else {
		   
		   return false;
	   }
	   
	   
   }
public boolean isCommunityChest () {
	   if (this.getName().equals("CC")) {
		   return true;
	   }else {
		   
		   return false;
	   }
	   
	   
}public boolean isRollOnce() {
	   if (this.getName().equals("RO")) {
		   return true;
	   }else {
		   
		   return false;
	   }
	   
	   
   }public boolean isSqueezePlay() {
	   if (this.getName().equals("SP")) {
		   return true;
	   }else {
		   
		   return false;
	   }
	   
	   
   }public boolean isFreeParkingSlot() {
	   if (this.getName().equals("FPS")) {
		   return true;
	   }else {
		   
		   return false;
	   }
	   
	   
   }


   
   
}
