package logic;

public class Board {

	private BoardMembers [] bm=new BoardMembers[20];
	
	 
	public Board () {
		GenerateBoardMembers();
	}
	
	 public void GenerateBoardMembers() {
		   
		   bm[0]=new BoardMembers("Go");
		   bm[1]=new Property( 100, "Blue", "Oriental Ave");
		   bm[2]=new BoardMembers("CC");
		   bm[3]=new Property( 100, "Blue", "Vermont Ave");
		   bm[4]=new Property( 120, "Blue", "Connecticut Ave");
		   bm[5]=new BoardMembers("RO");
		   bm[6]=new Property( 140, "Pink", "St. Charles Place");
		   bm[7]=new BoardMembers("Chance");
		   bm[8]=new Property( 140, "Pink", "States Ave");
		   bm[9]=new Property( 160, "Pink", "Virginia Ave");
		   bm[10]=new BoardMembers("FPS");
		   bm[11]=new Property( 180, "Orange", "St. James Place");
		   bm[12]=new BoardMembers("CC");
		   bm[13]=new Property( 180, "Orange", "Tennessee Ave");
		   bm[14]=new Property( 200, "Orange", "New York Ave");
		   bm[15]=new BoardMembers("SP");
		   bm[16]=new Property( 300, "Green", "Pacific Ave");
		   bm[17]=new Property(300, "Green", "North Carolina Ave");
		   bm[18]=new BoardMembers("Chance");
		   bm[19]=new Property ( 320, "Green", "Pennsylvania Ave");
		   
		  
	   }

	public BoardMembers[] getBm() {
		return bm;
	}

	public void setBm(BoardMembers[] bm) {
		this.bm = bm;
	}

	 
	 
	 
}
