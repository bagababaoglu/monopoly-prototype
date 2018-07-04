package gui;
import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import logic.Game;
import logic.Dice;
import logic.Player;
import logic.Property;
import logic.BoardMembers;
	public class GameBoard extends JFrame implements ActionListener {
		
		
		private JPanel contentPane;
		Game newGame=new Game (new Player ("1"), new Player ("2"));
		JButton btnNewButton;
		JButton btnRollDice;
		JButton btnEndTurn;
		JButton btnBuy;
		JLabel lblDie;
		JLabel lblDie_1;
		JPanel panel_22;
		JPanel panel_23;
		JLabel p10;
		JLabel p11;
		JLabel p12;
		JLabel p13;
		JLabel p14;
		JLabel p15;
		JLabel p16;
		JLabel p17;
		JLabel p18;
		JLabel p19;
		JLabel p110;
		JLabel p111;
		JLabel p112;
		JLabel p113;
		JLabel p114;
		JLabel p115;
		JLabel p116;
		JLabel p117;
		JLabel p118;
		JLabel p119;
		JLabel p20;
		JLabel p21;
		JLabel p22;
		JLabel p23;
		JLabel p24;
		JLabel p25;
		JLabel p26;
		JLabel p27;
		JLabel p28;
		JLabel p29;
		JLabel p210;
		JLabel p211;
		JLabel p212;
		JLabel p213;
		JLabel p214;
		JLabel p215;
		JLabel p216;
		JLabel p217;
		JLabel p218;
		JLabel p219;
		JLabel curLocp1;
		JLabel curLocp2;
		JLabel[] playerpos= new JLabel[40];
		JLabel mn1;
		JLabel mn2;
		JLabel aa1;
		JLabel aa2;
		
	    
	    
		    
    
	    
	    
	 
	        	
	      public JLabel[] getPlayerpos() {
			return playerpos;
		}



		public void setPlayerpos(JLabel[] playerpos) {
			this.playerpos = playerpos;
		}

		 public void actionPerformed(ActionEvent e)
		    {
		        Object source = e.getSource();
		        Player cur =newGame.getCurPlayer();
		        Dice die =new Dice();
		        	if(source == btnRollDice)
			        {
			        		die.roll();
			        		lblDie.setText(""+die.getFdie());
			        		lblDie_1.setText(""+die.getSdie());
			        		mn1.setText(""+newGame.getPlayer1().getMoney()+"$");
			        		mn2.setText(""+newGame.getPlayer2().getMoney()+"$");
			        		newGame.play(cur,die);
			        	    move(cur, die);
			        		
			        	
			         		        		
			        	}else if(source==btnNewButton) {
			        		newGame =new Game(new Player("Player 1"), new Player ("Player 2"));
			        		initialize();
			        		
			        	}else if(source==btnEndTurn) {
			        		
			        			cur=newGame.otherPlayer(cur);
			        			
			        	
			        		
			        		
			        	}else if (source==btnBuy) {
			        		BoardMembers loc=newGame.getBoard().getBm()[cur.getLoc()];
			        		if (loc.isProperty()&&!(loc.isSold())&&cur.getMoney()>loc.getPrice()) {
			        			cur.buyProperty((Property)loc);
			        			
			        		}
			        	}
			        	
		        }


		public void move(Player p1, Dice die) {
	    	 
           	   if(newGame.getPlayer1().equals(p1) ){
           		
           		   int oldloc=((p1.getLoc()-die.getSum()))%20;
                   int newloc=p1.getLoc();
             	  	JLabel old= playerpos[oldloc];
             	  	JLabel new1=playerpos[newloc];
             		   old.setVisible(false);
             		   new1.setVisible(true);
             		   
           		   
           	   }else {
           		 int oldloc=(((p1.getLoc()-die.getSum()))%20)+20;
                 int newloc=p1.getLoc()+20;
           	  	JLabel old= playerpos[oldloc];
           	  	JLabel new1=playerpos[newloc];
           		   old.setVisible(false);
           		   new1.setVisible(true);
         		   
           		   
           	   }
	    	  
	    	  
	      }
	    
	  
		    
	         
	    	   
	 
	    
	    public Game getNewGame() {
			return newGame;
		}

		public void setNewGame(Game newGame) {
			this.newGame = newGame;
		}
       
		public  GameBoard()
	    {
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.setSize(1400, 810);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(60, 179, 113));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			initialize();
		/*	
			p10.setVisible(true);
			p11.setVisible(true);
			p12.setVisible(true);
			p13.setVisible(true);
			p29.setVisible(true);
			p14.setVisible(true);
			p15.setVisible(true);
			p210.setVisible(true);
			p16.setVisible(true);
			p110.setVisible(true);
			p17.setVisible(true);
			p18.setVisible(true);
			p19.setVisible(true);
			p211.setVisible(true);
			p110.setVisible(true);
			p111.setVisible(true);
			p112.setVisible(true);
			p113.setVisible(true);
			p114.setVisible(true);
			p115.setVisible(true);
			p116.setVisible(true);
			p117.setVisible(true);
			p118.setVisible(true);
			p212.setVisible(true);
			p119.setVisible(true);
			p20.setVisible(true);
			p21.setVisible(true);
			p22.setVisible(true);
			p23.setVisible(true);
			p24.setVisible(true);
			p25.setVisible(true);
			p26.setVisible(true);
			p27.setVisible(true);
			p28.setVisible(true);
			p213.setVisible(true);
			p214.setVisible(true);
			p215.setVisible(true);
			p216.setVisible(true);
			p217.setVisible(true);
			p218.setVisible(true);
			p219.setVisible(true);
			*/
			playerpos[0]=p10;
			playerpos[1]=p11;
			playerpos[2]=p12;
			playerpos[3]=p13;
			playerpos[4]=p14;
			playerpos[5]=p15;
			playerpos[6]=p16;
			playerpos[7]=p17;
			playerpos[8]=p18;
			playerpos[9]=p19;
			playerpos[10]=p110;
			playerpos[11]=p111;
			playerpos[12]=p112;
			playerpos[13]=p113;
			playerpos[14]=p114;
			playerpos[15]=p115;
			playerpos[16]=p116;
			playerpos[17]=p117;
			playerpos[18]=p118;
			playerpos[19]=p119;
			playerpos[20]=p20;
			playerpos[21]=p21;
			playerpos[22]=p22;
			playerpos[23]=p23;
			playerpos[24]=p24;
			playerpos[25]=p25;
			playerpos[26]=p26;
			playerpos[27]=p27;
			playerpos[28]=p28;
			playerpos[29]=p29;
			playerpos[30]=p210;
			playerpos[31]=p211;
			playerpos[32]=p212;
			playerpos[33]=p213;
			playerpos[34]=p214;
			playerpos[35]=p215;
			playerpos[36]=p216;
			playerpos[37]=p217;
			playerpos[38]=p218;
			playerpos[39]=p219;
	
			
			
			
			
				playerpos[1]=p11;
				playerpos[1].setText("");
				
			
			
			
		}
		  
		        
		    
	   
		 public void initialize() {
			 JPanel panel = new JPanel();
				panel.setBackground(new Color(250, 128, 114));
				panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel.setBounds(0, 0, 150, 145);
				contentPane.add(panel);
				panel.setLayout(new BorderLayout(0, 0));
				
				JLabel lblFreeParking = new JLabel("Free Parking");
				lblFreeParking.setForeground(new Color(255, 255, 255));
				lblFreeParking.setBackground(new Color(250, 128, 114));
				lblFreeParking.setHorizontalAlignment(SwingConstants.CENTER);
				lblFreeParking.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel.add(lblFreeParking, BorderLayout.CENTER);
				
				p110 = new JLabel("P1");
				p110.setHorizontalAlignment(SwingConstants.CENTER);
				p110.setForeground(Color.WHITE);
				p110.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel.add(p110, BorderLayout.WEST);
				p110.setVisible(false);
				
				p210 = new JLabel("P2");
				p210.setHorizontalAlignment(SwingConstants.CENTER);
				p210.setForeground(Color.WHITE);
				p210.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel.add(p210, BorderLayout.EAST);
				p210.setVisible(false);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(new Color(199, 21, 133));
				panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_1.setBounds(0, 505, 150, 120);
				contentPane.add(panel_1);
				panel_1.setLayout(new BorderLayout(0, 0));
				
				JLabel lblStCharlesPalace = new JLabel("St. Charles Palace");
				lblStCharlesPalace.setForeground(new Color(255, 255, 255));
				lblStCharlesPalace.setHorizontalAlignment(SwingConstants.CENTER);
				lblStCharlesPalace.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_1.add(lblStCharlesPalace, BorderLayout.NORTH);
				
				JLabel label_4 = new JLabel("140$");
				label_4.setHorizontalAlignment(SwingConstants.CENTER);
				label_4.setForeground(Color.WHITE);
				label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_1.add(label_4, BorderLayout.SOUTH);
				
				p16 = new JLabel("P1");
				p16.setHorizontalAlignment(SwingConstants.CENTER);
				p16.setForeground(Color.WHITE);
				p16.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_1.add(p16, BorderLayout.WEST);
				p16.setVisible(false);
				
				p26 = new JLabel("P2");
				p26.setHorizontalAlignment(SwingConstants.CENTER);
				p26.setForeground(Color.WHITE);
				p26.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_1.add(p26, BorderLayout.EAST);
				p26.setVisible(false);
				
				JPanel panel_2 = new JPanel();
				panel_2.setBackground(new Color(199, 21, 133));
				panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_2.setBounds(0, 145, 150, 120);
				contentPane.add(panel_2);
				panel_2.setLayout(new BorderLayout(0, 0));
				
				JLabel lblVirginiaAve = new JLabel("Virginia Ave");
				lblVirginiaAve.setForeground(new Color(255, 255, 255));
				lblVirginiaAve.setHorizontalAlignment(SwingConstants.CENTER);
				lblVirginiaAve.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_2.add(lblVirginiaAve, BorderLayout.NORTH);
				
				JLabel label_8 = new JLabel("160$");
				label_8.setHorizontalAlignment(SwingConstants.CENTER);
				label_8.setForeground(Color.WHITE);
				label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_2.add(label_8, BorderLayout.SOUTH);
				
				p19 = new JLabel("P1");
				p19.setHorizontalAlignment(SwingConstants.CENTER);
				p19.setForeground(Color.WHITE);
				p19.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_2.add(p19, BorderLayout.WEST);
				p19.setVisible(false);
				
				p29 = new JLabel("P2");
				p29.setHorizontalAlignment(SwingConstants.CENTER);
				p29.setForeground(Color.WHITE);
				p29.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_2.add(p29, BorderLayout.EAST);
				p29.setVisible(false);
				
				JPanel panel_3 = new JPanel();
				panel_3.setBackground(new Color(199, 21, 133));
				panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_3.setBounds(0, 265, 150, 120);
				contentPane.add(panel_3);
				panel_3.setLayout(new BorderLayout(0, 0));
				
				JLabel lblStatesAve = new JLabel("States Ave");
				lblStatesAve.setForeground(new Color(255, 255, 255));
				lblStatesAve.setHorizontalAlignment(SwingConstants.CENTER);
				lblStatesAve.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_3.add(lblStatesAve, BorderLayout.NORTH);
				
				JLabel label_6 = new JLabel("140$");
				label_6.setHorizontalAlignment(SwingConstants.CENTER);
				label_6.setForeground(Color.WHITE);
				label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_3.add(label_6, BorderLayout.SOUTH);
				
				p18 = new JLabel("P1");
				p18.setHorizontalAlignment(SwingConstants.CENTER);
				p18.setForeground(Color.WHITE);
				p18.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_3.add(p18, BorderLayout.WEST);
				p18.setVisible(false);
				
				p28 = new JLabel("P2");
				p28.setHorizontalAlignment(SwingConstants.CENTER);
				p28.setForeground(Color.WHITE);
				p28.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_3.add(p28, BorderLayout.EAST);
				p28.setVisible(false);
				
				JPanel panel_4 = new JPanel();
				panel_4.setBackground(new Color(128, 0, 0));
				panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_4.setBounds(0, 385, 150, 120);
				contentPane.add(panel_4);
				panel_4.setLayout(new BorderLayout(0, 0));
				
				JLabel lblChance = new JLabel("Chance");
				lblChance.setForeground(new Color(255, 255, 255));
				lblChance.setHorizontalAlignment(SwingConstants.CENTER);
				lblChance.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_4.add(lblChance, BorderLayout.NORTH);
				
				p17 = new JLabel("P1");
				p17.setHorizontalAlignment(SwingConstants.CENTER);
				p17.setForeground(Color.WHITE);
				p17.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_4.add(p17, BorderLayout.WEST);
				p17.setVisible(false);
				
				p27 = new JLabel("P2");
				p27.setHorizontalAlignment(SwingConstants.CENTER);
				p27.setForeground(Color.WHITE);
				p27.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_4.add(p27, BorderLayout.EAST);
				p27.setVisible(false);
				
				JPanel panel_5 = new JPanel();
				panel_5.setBackground(new Color(135, 206, 235));
				panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_5.setBounds(0, 625, 150, 145);
				contentPane.add(panel_5);
				panel_5.setLayout(new BorderLayout(0, 0));
				
				JLabel lblRollOnce = new JLabel("Roll Once");
				lblRollOnce.setForeground(new Color(255, 255, 255));
				lblRollOnce.setBackground(new Color(135, 206, 235));
				lblRollOnce.setHorizontalAlignment(SwingConstants.CENTER);
				lblRollOnce.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_5.add(lblRollOnce, BorderLayout.CENTER);
				
				p15 = new JLabel("P1");
				p15.setHorizontalAlignment(SwingConstants.CENTER);
				p15.setForeground(Color.WHITE);
				p15.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_5.add(p15, BorderLayout.WEST);
				p15.setVisible(false);
				
				p25 = new JLabel("P2");
				p25.setHorizontalAlignment(SwingConstants.CENTER);
				p25.setForeground(Color.WHITE);
				p25.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_5.add(p25, BorderLayout.EAST);
				p25.setVisible(false);
				
				JPanel panel_6 = new JPanel();
				panel_6.setBackground(new Color(0, 0, 255));
				panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_6.setBounds(150, 625, 120, 145);
				contentPane.add(panel_6);
				panel_6.setLayout(new BorderLayout(0, 0));
				
				JLabel lblVermontAve = new JLabel("Conneticut Ave");
				lblVermontAve.setForeground(new Color(255, 255, 255));
				lblVermontAve.setHorizontalAlignment(SwingConstants.CENTER);
				lblVermontAve.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_6.add(lblVermontAve, BorderLayout.NORTH);
				
				JLabel label_3 = new JLabel("120$");
				label_3.setHorizontalAlignment(SwingConstants.CENTER);
				label_3.setForeground(Color.WHITE);
				label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_6.add(label_3, BorderLayout.SOUTH);
				
				p14 = new JLabel("P1");
				p14.setHorizontalAlignment(SwingConstants.CENTER);
				p14.setForeground(Color.WHITE);
				p14.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_6.add(p14, BorderLayout.WEST);
				p14.setVisible(false);
				
				p24 = new JLabel("P2");
				p24.setHorizontalAlignment(SwingConstants.CENTER);
				p24.setForeground(Color.WHITE);
				p24.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_6.add(p24, BorderLayout.EAST);
				p24.setVisible(false);
				
				JPanel panel_7 = new JPanel();
				panel_7.setBackground(new Color(0, 0, 255));
				panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_7.setBounds(270, 625, 120, 145);
				contentPane.add(panel_7);
				panel_7.setLayout(new BorderLayout(0, 0));
				
				JLabel label = new JLabel("Vermont Ave");
				label.setForeground(new Color(255, 255, 255));
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_7.add(label, BorderLayout.NORTH);
				
				JLabel label_2 = new JLabel("100$");
				label_2.setHorizontalAlignment(SwingConstants.CENTER);
				label_2.setForeground(Color.WHITE);
				label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_7.add(label_2, BorderLayout.SOUTH);
				
				p13 = new JLabel("P1");
				p13.setHorizontalAlignment(SwingConstants.CENTER);
				p13.setForeground(Color.WHITE);
				p13.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_7.add(p13, BorderLayout.WEST);
				p13.setVisible(false);
				
				p23 = new JLabel("P2");
				p23.setHorizontalAlignment(SwingConstants.CENTER);
				p23.setForeground(Color.WHITE);
				p23.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_7.add(p23, BorderLayout.EAST);
				p23.setVisible(false);
				
				JPanel panel_8 = new JPanel();
				panel_8.setBackground(new Color(0, 255, 255));
				panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_8.setBounds(390, 625, 120, 145);
				contentPane.add(panel_8);
				panel_8.setLayout(new BorderLayout(0, 0));
				
				JLabel lblCommunityText = new JLabel("Community Chest");
				lblCommunityText.setForeground(new Color(255, 255, 255));
				lblCommunityText.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblCommunityText.setHorizontalAlignment(SwingConstants.CENTER);
				panel_8.add(lblCommunityText, BorderLayout.NORTH);
				
				p12 = new JLabel("P1");
				p12.setHorizontalAlignment(SwingConstants.CENTER);
				p12.setForeground(Color.WHITE);
				p12.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_8.add(p12, BorderLayout.WEST);
				p12.setVisible(false);
				
				p22 = new JLabel("P2");
				p22.setHorizontalAlignment(SwingConstants.CENTER);
				p22.setForeground(Color.WHITE);
				p22.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_8.add(p22, BorderLayout.EAST);
				p22.setVisible(false);
				
				JPanel panel_9 = new JPanel();
				panel_9.setBackground(new Color(0, 0, 255));
				panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_9.setBounds(510, 625, 120, 145);
				contentPane.add(panel_9);
				panel_9.setLayout(new BorderLayout(0, 0));
				
				JLabel lblOrientalAve = new JLabel("Oriental Ave");
				lblOrientalAve.setForeground(new Color(255, 255, 255));
				lblOrientalAve.setBackground(new Color(0, 0, 255));
				lblOrientalAve.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblOrientalAve.setHorizontalAlignment(SwingConstants.CENTER);
				panel_9.add(lblOrientalAve, BorderLayout.NORTH);
				
				JLabel label_1 = new JLabel("100$");
				label_1.setForeground(new Color(255, 255, 255));
				label_1.setHorizontalAlignment(SwingConstants.CENTER);
				label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_9.add(label_1, BorderLayout.SOUTH);
				
				p11 = new JLabel("P1");
				p11.setHorizontalAlignment(SwingConstants.CENTER);
				p11.setForeground(Color.WHITE);
				p11.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_9.add(p11, BorderLayout.WEST);
				p11.setVisible(false);
				
				p21 = new JLabel("P2");
				p21.setHorizontalAlignment(SwingConstants.CENTER);
				p21.setForeground(Color.WHITE);
				p21.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_9.add(p21, BorderLayout.EAST);
				p21.setVisible(false);
				
				JPanel panel_10 = new JPanel();
				panel_10.setBackground(new Color(220, 20, 60));
				panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_10.setBounds(630, 625, 150, 145);
				contentPane.add(panel_10);
				panel_10.setLayout(new BorderLayout(0, 0));
				
				JLabel lblGo = new JLabel("GO");
				lblGo.setBackground(new Color(220, 20, 60));
				lblGo.setHorizontalAlignment(SwingConstants.CENTER);
				lblGo.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_10.add(lblGo, BorderLayout.CENTER);
				
				p10 = new JLabel("P1");
				p10.setHorizontalAlignment(SwingConstants.CENTER);
				p10.setForeground(Color.WHITE);
				p10.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_10.add(p10, BorderLayout.WEST);
				p10.setVisible(true);
				
				p20 = new JLabel("P2");
				p20.setHorizontalAlignment(SwingConstants.CENTER);
				p20.setForeground(Color.WHITE);
				p20.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_10.add(p20, BorderLayout.EAST);
				p20.setVisible(true);
				
				JPanel panel_11 = new JPanel();
				panel_11.setBackground(new Color(0, 255, 0));
				panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_11.setBounds(630, 505, 150, 120);
				contentPane.add(panel_11);
				panel_11.setLayout(new BorderLayout(0, 0));
				
				JLabel lblPennsylvaniaAve = new JLabel("Pennsylvania Ave");
				lblPennsylvaniaAve.setForeground(new Color(255, 255, 255));
				lblPennsylvaniaAve.setHorizontalAlignment(SwingConstants.CENTER);
				lblPennsylvaniaAve.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_11.add(lblPennsylvaniaAve, BorderLayout.NORTH);
				
				JLabel label_14 = new JLabel("320$");
				label_14.setHorizontalAlignment(SwingConstants.CENTER);
				label_14.setForeground(Color.WHITE);
				label_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_11.add(label_14, BorderLayout.SOUTH);
				
				p119 = new JLabel("P1");
				p119.setHorizontalAlignment(SwingConstants.CENTER);
				p119.setForeground(Color.WHITE);
				p119.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_11.add(p119, BorderLayout.WEST);
				p119.setVisible(false);
				
				p219 = new JLabel("P2");
				p219.setHorizontalAlignment(SwingConstants.CENTER);
				p219.setForeground(Color.WHITE);
				p219.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_11.add(p219, BorderLayout.EAST);
				p219.setVisible(false);
				
				JPanel panel_12 = new JPanel();
				panel_12.setBackground(new Color(128, 0, 0));
				panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_12.setBounds(630, 385, 150, 120);
				contentPane.add(panel_12);
				panel_12.setLayout(new BorderLayout(0, 0));
				
				JLabel lblChance_1 = new JLabel("Chance");
				lblChance_1.setForeground(new Color(255, 255, 255));
				lblChance_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblChance_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_12.add(lblChance_1, BorderLayout.NORTH);
				
				p118 = new JLabel("P1");
				p118.setHorizontalAlignment(SwingConstants.CENTER);
				p118.setForeground(Color.WHITE);
				p118.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_12.add(p118, BorderLayout.WEST);
				p118.setVisible(false);
				
				p218 = new JLabel("P2");
				p218.setHorizontalAlignment(SwingConstants.CENTER);
				p218.setForeground(Color.WHITE);
				p218.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_12.add(p218, BorderLayout.EAST);
				p218.setVisible(false);
				
				JPanel panel_13 = new JPanel();
				panel_13.setBackground(new Color(0, 255, 0));
				panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_13.setBounds(630, 265, 150, 120);
				contentPane.add(panel_13);
				panel_13.setLayout(new BorderLayout(0, 0));
				
				JLabel lblNorthCarolinaAve = new JLabel("North Carolina Ave");
				lblNorthCarolinaAve.setForeground(new Color(255, 255, 255));
				lblNorthCarolinaAve.setHorizontalAlignment(SwingConstants.CENTER);
				lblNorthCarolinaAve.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_13.add(lblNorthCarolinaAve, BorderLayout.NORTH);
				
				JLabel label_13 = new JLabel("300$");
				label_13.setHorizontalAlignment(SwingConstants.CENTER);
				label_13.setForeground(Color.WHITE);
				label_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_13.add(label_13, BorderLayout.SOUTH);
				
				p117 = new JLabel("P1");
				p117.setHorizontalAlignment(SwingConstants.CENTER);
				p117.setForeground(Color.WHITE);
				p117.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_13.add(p117, BorderLayout.WEST);
				p117.setVisible(false);
				
				p217= new JLabel("P2");
				p217.setHorizontalAlignment(SwingConstants.CENTER);
				p217.setForeground(Color.WHITE);
				p217.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_13.add(p217, BorderLayout.EAST);
				p217.setVisible(false);
				
				JPanel panel_14 = new JPanel();
				panel_14.setBackground(new Color(0, 255, 0));
				panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_14.setBounds(630, 145, 150, 120);
				contentPane.add(panel_14);
				panel_14.setLayout(new BorderLayout(0, 0));
				
				JLabel lblPacificAve = new JLabel("Pacific Ave");
				lblPacificAve.setForeground(new Color(255, 255, 255));
				lblPacificAve.setHorizontalAlignment(SwingConstants.CENTER);
				lblPacificAve.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_14.add(lblPacificAve, BorderLayout.NORTH);
				
				JLabel label_12 = new JLabel("300$");
				label_12.setHorizontalAlignment(SwingConstants.CENTER);
				label_12.setForeground(Color.WHITE);
				label_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_14.add(label_12, BorderLayout.SOUTH);
				
				p116 = new JLabel("P1");
				p116.setHorizontalAlignment(SwingConstants.CENTER);
				p116.setForeground(Color.WHITE);
				p116.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_14.add(p116, BorderLayout.WEST);
				p116.setVisible(false);
				
				p216 = new JLabel("P2");
				p216.setHorizontalAlignment(SwingConstants.CENTER);
				p216.setForeground(Color.WHITE);
				p216.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_14.add(p216, BorderLayout.EAST);
				p216.setVisible(false);
				
				JPanel panel_15 = new JPanel();
				panel_15.setBackground(new Color(255, 69, 0));
				panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_15.setBounds(630, 0, 150, 145);
				contentPane.add(panel_15);
				panel_15.setLayout(new BorderLayout(0, 0));
				
				JLabel lblSqueezePlay = new JLabel("Squeeze Play");
				lblSqueezePlay.setForeground(new Color(255, 255, 255));
				lblSqueezePlay.setBackground(new Color(255, 69, 0));
				lblSqueezePlay.setHorizontalAlignment(SwingConstants.CENTER);
				lblSqueezePlay.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_15.add(lblSqueezePlay, BorderLayout.CENTER);
				
				p115= new JLabel("P1");
				p115.setHorizontalAlignment(SwingConstants.CENTER);
				p115.setForeground(Color.WHITE);
				p115.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_15.add(p115, BorderLayout.WEST);
				p115.setVisible(false);
				
				p215 = new JLabel("P2");
				p215.setHorizontalAlignment(SwingConstants.CENTER);
				p215.setForeground(Color.WHITE);
				p215.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_15.add(p215, BorderLayout.EAST);
				p215.setVisible(false);
				
				JPanel panel_16 = new JPanel();
				panel_16.setBackground(new Color(255, 165, 0));
				panel_16.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_16.setBounds(150, 0, 120, 145);
				contentPane.add(panel_16);
				panel_16.setLayout(new BorderLayout(0, 0));
				
				JLabel lblStJamesPalace = new JLabel("St. James Palace");
				lblStJamesPalace.setForeground(new Color(255, 255, 255));
				lblStJamesPalace.setHorizontalAlignment(SwingConstants.CENTER);
				lblStJamesPalace.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_16.add(lblStJamesPalace, BorderLayout.NORTH);
				
				JLabel label_9 = new JLabel("180$");
				label_9.setHorizontalAlignment(SwingConstants.CENTER);
				label_9.setForeground(new Color(255, 255, 255));
				label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_16.add(label_9, BorderLayout.SOUTH);
				
				p111= new JLabel("P1");
				p111.setHorizontalAlignment(SwingConstants.CENTER);
				p111.setForeground(Color.WHITE);
				p111.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_16.add(p111, BorderLayout.WEST);
				p111.setVisible(false);
				
				p211 = new JLabel("P2");
				p211.setHorizontalAlignment(SwingConstants.CENTER);
				p211.setForeground(Color.WHITE);
				p211.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_16.add(p211, BorderLayout.EAST);
				p211.setVisible(false);
				
				JPanel panel_17 = new JPanel();
				panel_17.setBackground(new Color(0, 255, 255));
				panel_17.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_17.setBounds(270, 0, 120, 145);
				contentPane.add(panel_17);
				panel_17.setLayout(new BorderLayout(0, 0));
				
				JLabel label_7 = new JLabel("Community Chest");
				label_7.setForeground(new Color(255, 255, 255));
				label_7.setHorizontalAlignment(SwingConstants.CENTER);
				label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_17.add(label_7, BorderLayout.NORTH);
				
				p112 = new JLabel("P1");
				p112.setHorizontalAlignment(SwingConstants.CENTER);
				p112.setForeground(Color.WHITE);
				p112.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_17.add(p112, BorderLayout.WEST);
				p112.setVisible(false);
				
				p212 = new JLabel("P2");
				p212.setHorizontalAlignment(SwingConstants.CENTER);
				p212.setForeground(Color.WHITE);
				p212.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_17.add(p212, BorderLayout.EAST);
				p212.setVisible(false);
				
				JPanel panel_18 = new JPanel();
				panel_18.setBackground(new Color(255, 165, 0));
				panel_18.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_18.setBounds(390, 0, 120, 145);
				contentPane.add(panel_18);
				panel_18.setLayout(new BorderLayout(0, 0));
				
				JLabel lblTennesseeAve = new JLabel("Tennessee Ave");
				lblTennesseeAve.setForeground(new Color(255, 255, 255));
				lblTennesseeAve.setHorizontalAlignment(SwingConstants.CENTER);
				lblTennesseeAve.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_18.add(lblTennesseeAve, BorderLayout.NORTH);
				
				JLabel label_10 = new JLabel("180$");
				label_10.setHorizontalAlignment(SwingConstants.CENTER);
				label_10.setForeground(new Color(255, 255, 255));
				label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_18.add(label_10, BorderLayout.SOUTH);
				
				p113 = new JLabel("P1");
				p113.setHorizontalAlignment(SwingConstants.CENTER);
				p113.setForeground(Color.WHITE);
				p113.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_18.add(p113, BorderLayout.WEST);
				p113.setVisible(false);
				
				p213= new JLabel("P2");
				p213.setHorizontalAlignment(SwingConstants.CENTER);
				p213.setForeground(Color.WHITE);
				p213.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_18.add(p213, BorderLayout.EAST);
				p213.setVisible(false);
				
				JPanel panel_19 = new JPanel();
				panel_19.setBackground(new Color(255, 165, 0));
				panel_19.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_19.setBounds(510, 0, 120, 145);
				contentPane.add(panel_19);
				panel_19.setLayout(new BorderLayout(0, 0));
				
				JLabel lblNewYorkAve = new JLabel("New York Ave");
				lblNewYorkAve.setForeground(new Color(255, 255, 255));
				lblNewYorkAve.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewYorkAve.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_19.add(lblNewYorkAve, BorderLayout.NORTH);
				
				JLabel label_11 = new JLabel("200$");
				label_11.setHorizontalAlignment(SwingConstants.CENTER);
				label_11.setForeground(new Color(255, 255, 255));
				label_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel_19.add(label_11, BorderLayout.SOUTH);
				
				p114 = new JLabel("P1");
				p114.setHorizontalAlignment(SwingConstants.CENTER);
				p114.setForeground(Color.WHITE);
				p114.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_19.add(p114, BorderLayout.WEST);
				p114.setVisible(false);
				
				p214 = new JLabel("P2");
				p214.setHorizontalAlignment(SwingConstants.CENTER);
				p214.setForeground(Color.WHITE);
				p214.setFont(new Font("Tahoma", Font.PLAIN, 18));
				panel_19.add(p214, BorderLayout.EAST);
				p214.setVisible(false);
				
			
				JPanel panel_20 = new JPanel();
				panel_20.setBackground(new Color(0, 255, 255));
				panel_20.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_20.setBounds(220, 185, 100, 150);
				contentPane.add(panel_20);
				panel_20.setLayout(new BorderLayout(0, 0));
				
				JLabel lblCommunityChest = new JLabel("Community Chest");
				lblCommunityChest.setForeground(new Color(255, 255, 255));
				lblCommunityChest.setHorizontalAlignment(SwingConstants.CENTER);
				lblCommunityChest.setFont(new Font("Tahoma", Font.PLAIN, 11));
				panel_20.add(lblCommunityChest, BorderLayout.CENTER);
				
				JPanel panel_21 = new JPanel();
				panel_21.setBackground(new Color(128, 0, 0));
				panel_21.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_21.setBounds(460, 435, 100, 150);
				contentPane.add(panel_21);
				panel_21.setLayout(new BorderLayout(0, 0));
				
				JLabel lblChance_2 = new JLabel("Chance");
				lblChance_2.setForeground(new Color(255, 255, 255));
				lblChance_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblChance_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
				panel_21.add(lblChance_2, BorderLayout.CENTER);
				
				btnRollDice= new JButton("Roll Dice");
				btnRollDice.setBounds(830, 712, 90, 50);
				contentPane.add(btnRollDice);
				btnRollDice.addActionListener(this);
				
				btnBuy = new JButton("Buy");
				btnBuy.setBounds(935, 712, 90, 50);
				contentPane.add(btnBuy);
				btnBuy.addActionListener(this);
				
				JLabel lblMonopoly = new JLabel("Monopoly");
				lblMonopoly.setFont(new Font("Tahoma", Font.PLAIN, 45));
				lblMonopoly.setBounds(287, 341, 203, 93);
				contentPane.add(lblMonopoly);
				
				lblDie = new JLabel("Die1");
				lblDie.setBounds(830, 665, 45, 40);
				lblDie.setFont(new Font("Tahoma", Font.PLAIN, 16));
				contentPane.add(lblDie);
				
				lblDie_1 = new JLabel("Die 2");
				lblDie_1.setBounds(875, 665, 45, 40);
				lblDie_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				contentPane.add(lblDie_1);
				
				JLabel lblPlayer = new JLabel("Player 1");
				lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 30));
				lblPlayer.setBounds(900, 30, 120, 30);
				contentPane.add(lblPlayer);
				
				JLabel lblPlayer_1 = new JLabel("Player 2");
				lblPlayer_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
				lblPlayer_1.setBounds(1125, 30, 120, 30);
				contentPane.add(lblPlayer_1);
				
				
				btnNewButton = new JButton("New Game");
				btnNewButton.setBounds(822, 509, 308, 145);
				contentPane.add(btnNewButton);
				btnNewButton.addActionListener(this);
				
				btnEndTurn = new JButton("End Turn");
				btnEndTurn.setBounds(1040, 712, 90, 50);
				contentPane.add(btnEndTurn);
				btnEndTurn.addActionListener(this);
				
				JLabel label_5 = new JLabel("Money");
				label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
				label_5.setBounds(844, 71, 90, 40);
				contentPane.add(label_5);
				
				JLabel label_15 = new JLabel("Money");
				label_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
				label_15.setBounds(1108, 71, 90, 40);
				contentPane.add(label_15);
				
				mn1 = new JLabel("");
				mn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				mn1.setBounds(924, 79, 90, 24);
				contentPane.add(mn1);
				
				mn2 = new JLabel("");
				mn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
				mn2.setBounds(1191, 79, 90, 24);
				contentPane.add(mn2);
				
				JLabel lblAssets = new JLabel("Assets");
				lblAssets.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblAssets.setBounds(844, 119, 76, 30);
				contentPane.add(lblAssets);
				
				JLabel label_17 = new JLabel("Assets");
				label_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
				label_17.setBounds(1108, 115, 76, 30);
				contentPane.add(label_17);
				
				aa1 = new JLabel("");
				aa1.setBounds(844, 162, 126, 192);
				contentPane.add(aa1);
				
				aa2 = new JLabel("");
				aa2.setBounds(1086, 156, 126, 192);
				contentPane.add(aa2);
				btnEndTurn.addActionListener(this);
				
				mn1.setText(""+newGame.getPlayer1().getMoney()+"$");
        		mn2.setText(""+newGame.getPlayer2().getMoney()+"$");
				setVisible(true);
	        }
}


	
	
	
	
	

