package appcode;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Apppanel extends JPanel {
	
		final int PANEL_WIDTH = 500;
		final int PANEL_HEIGHT = 500;
		Image exer2;
		Apppanel(){
			this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
			this.setBackground(Color.white);
			 exer2= new ImageIcon("exer2.gif").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
			//Image newImage = exer2.
			/*
			 * JLabel label=new JLabel(); label.setText("Relax Your Eyes");
			 * label.setHorizontalTextPosition(JLabel.CENTER);
			 * label.setVerticalTextPosition(JLabel.TOP);
			 * label.setVerticalAlignment(JLabel.CENTER);
			 * label.setHorizontalAlignment(JLabel.CENTER);
			 */
			
		}
		public void paint(Graphics g) {
			
			super.paint(g);
			Graphics2D gd =(Graphics2D)g;
			gd.drawImage(exer2, 0, 0, null);
		}
		
		
		
		
		
	
	

}
