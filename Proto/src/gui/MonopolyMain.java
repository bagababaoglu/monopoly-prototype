package gui;

import javax.swing.JLabel;
import logic.Game;
import logic.Dice;
import logic.Player;
import logic.BoardMembers;

import gui.GameBoard;



public class MonopolyMain {
	public static void main(String[] args) {
		
		 
        GameBoard test1=new GameBoard();
         Player p1=new Player("1");
         Player p2 =new Player ("2");
         Game newg=new Game (p1,p2);

      
         Dice die =new Dice();
         die.roll();
        // p1.move(die.getSum());
         Player cur =newg.getCurPlayer();
         newg.play(cur, die);
         System.out.println(p1.getLoc()+" " + die.getSum());
        
      
   		 
       
         
         
         
         
         
         
     /*    while (true) {
        	 try {
				Thread.sleep(1000);
			     System.out.println(test1.getNewGame().curPlayer.getLoc());   
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 
        	 
         }
         
}
	
	*/
	
	
         
	
	}}	
	

