package logic;
import java.util.Scanner;

public class Game {

	private Player player1;
	private Player player2;
	private Board board;
	public Player curPlayer;
	
	
	public Game(Player p1, Player p2) {
		this.board =new Board();
		this.player1=p1;
		this.player2=p2;
		this.curPlayer=p1;
	}
	
	

	public Player getCurPlayer() {
		return curPlayer;
	}



	public void setCurPlayer(Player curPlayer) {
		this.curPlayer = curPlayer=player1;
	}



	public Player otherPlayer(Player p1) {
		if (p1.equals(player1)) {
			return player2;
		}else {
			return player1;
		}
		
	}
	
	public boolean checkWinner (Player p) {
		if(p.getPropCount()==12) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public void play (Player p1, Dice d) {
	     
		 int a =d.getSum();
		 p1.move(a);
			 
		 
	}
	
	
	
	


	public Player getPlayer1() {
		return player1;
	}


	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}


	public Player getPlayer2() {
		return player2;
	}


	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}


	public Board getBoard() {
		return board;
	}


	public void setBoard(Board board) {
		this.board = board;
	}
	
	
		
		
		
		
		
		
		
		
		

	

}
