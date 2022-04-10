package appcode;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Appframe extends JFrame {
	//Apppanel label1;
	Appframe(){
	//	label1=new Apppanel();
	//Jthis this = new Jthis();
	this.setTitle("ErgoFit");//set title 
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close but run in background
	this.setVisible(true); 
	this.setSize(420,420);
	
	ImageIcon imageicon = new ImageIcon("exer2.gif");
	JLabel label=new JLabel(imageicon);
	
	label.setBounds(500, 43, 46, 14);
	this.getContentPane().add(label);
	
	this.setIconImage(imageicon.getImage());
	this.getContentPane().setBackground(new Color(255,255,255));
	//this.add(label1);
    //this.pack();
}
}
