package brickbreaker;
import java.awt.event.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton pl =new JButton("Play");
		JButton dm =new JButton("Demo");
		JButton st =new JButton("Settings");
		JButton ex =new JButton("Exit");
		obj.add(pl);obj.add(dm);obj.add(st);obj.add(ex);
                pl.addActionListener(new ActionListener(){  
                 public void actionPerformed(ActionEvent e){  
                Gameplay gamePlay = new Gameplay();
               
                     obj.add(gamePlay);
		   
        }  
    });
                         st.addActionListener(new ActionListener(){  
                 public void actionPerformed(ActionEvent e){  
                settings sett = new settings();
               
                    // obj.add(sett);
		   
        }  
    });         dm.addActionListener(new ActionListener(){  
                 public void actionPerformed(ActionEvent e){  
                demo dem = new demo();
               
                     obj.add(dem);
		   
        }  
    });         ex.addActionListener(new ActionListener(){  
                 public void actionPerformed(ActionEvent e){  
                       obj.dispose();

        }  
    });
	}

}