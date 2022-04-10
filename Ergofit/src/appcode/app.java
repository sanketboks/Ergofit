package appcode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class app {

	public static void main(String[] args) {
		
		//new Appframe();
		// TODO Auto-generated method stub
		/*
		 * JFrame frame = new JFrame(); frame.setTitle("ErgoFit");//set title
		 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close but run in
		 * background frame.setVisible(true); frame.setSize(420,420);
		 */
		
		/*
		 * ImageIcon imageicon = new ImageIcon("logo2.png");
		 * 
		 * frame.setIconImage(imageicon.getImage());
		 * frame.getContentPane().setBackground(new Color(255,255,255));
		 * 
		 */		
		
		ImageIcon Exer1=new ImageIcon("exer2.gif");
		// Toolkit t=Toolkit.getDefaultToolkit();
		  Image i=Exer1.getImage();  
		
			/*
			 * Image newImage = i.getScaledInstance(668, 43, Image.SCALE_DEFAULT); JLabel
			 * label=new JLabel(); label.setText("Relax Your Eyes"); Graphics g =
			 * newImage.getGraphics(); g.drawImage(i, 0, 0, 668, 43, null);
			 */       
			/*
			 * label.setHorizontalTextPosition(JLabel.CENTER);
			 * label.setVerticalTextPosition(JLabel.TOP);
			 * label.setVerticalAlignment(JLabel.CENTER);
			 * label.setHorizontalAlignment(JLabel.CENTER);
			 */
       
		
	}

}
