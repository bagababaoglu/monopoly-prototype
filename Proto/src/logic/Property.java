package logic;

public class Property extends BoardMembers {

	
	
	private String color;
	
	
	public Property ( int p, String cl, String n) {
		super(n);
		super.setPrice(p);
		this.color=cl;
		super.setSold(false);
		super.setProperty(true);
	}

	

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	
	
	
}
