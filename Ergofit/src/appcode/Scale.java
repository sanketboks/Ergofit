package appcode;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import static java.util.concurrent.TimeUnit.*;
public class Scale extends JFrame {

  Image image;
  Image exer2;
  Image neck;
  Image eye;
  Image noi;
  static int i=0;
  Insets insets;
  static JLabel label;
  private BufferedImage bf;
  JFrame j;

  public Scale() {
    super();
    ImageIcon icon = new ImageIcon("exer2.GIF");
    ImageIcon icon1= new ImageIcon("eyeexer.gif");
    ImageIcon icon2= new ImageIcon("neck3.gif");
    ImageIcon icon3= new ImageIcon("null");


    exer2 = icon.getImage();
    eye =icon1.getImage();
    neck=icon2.getImage();
    noi=icon3.getImage();
  }
  
  public void update(Graphics g){
      paint(g);
}

public void paint(Graphics g){

   bf = new BufferedImage( this.getWidth(),this.getHeight(), BufferedImage.TYPE_INT_RGB);

try{
animation(bf.getGraphics());
g.drawImage(bf,0,0,null);
}catch(Exception ex){

}
}

  public void animation(Graphics g) {
    super.paint(g);
    if (insets == null) {
      insets = getInsets();
    }
    g.drawImage(image, insets.left, insets.top, this);
  }

  public synchronized  void go() {
    // Sleep first to see original
   
    Image original = exer2;
    Image orignal1=eye;
    Image orignal2=neck;
    Image noim=noi;
   {
	   //round 1
    if(i==0)

    {
    	//Exercise 1
    image = orignal1.getScaledInstance(400, -1, Image.SCALE_DEFAULT);
	// label.setText("It's time for fun");

    repaint();
    rest();
    //Exercise 2
    image = original.getScaledInstance(400, -1, Image.SCALE_DEFAULT);
	 label.setText("It's time for fun");
	 label.setHorizontalTextPosition(JLabel.CENTER);
	 label.setVerticalTextPosition(JLabel.BOTTOM);
	 label.setVerticalAlignment(JLabel.BOTTOM);
	  label.setHorizontalAlignment(JLabel.CENTER);

    repaint();
    rest();
	
	//image = noim.getScaledInstance(400, -1, Image.SCALE_DEFAULT);
	/* * label.setText("Daily do exercise");
	 * label.setHorizontalTextPosition(JLabel.CENTER);
	 * label.setVerticalTextPosition(JLabel.BOTTOM);
	 * label.setVerticalAlignment(JLabel.CENTER);
	 * label.setHorizontalAlignment(JLabel.CENTER); repaint(); rest();
	 */
	 repaint();
	    
	
    
    
    }
    //round 2
    if(i>0)
    {
    	
    image = orignal2.getScaledInstance(400, -1, Image.SCALE_DEFAULT);
    repaint();
    rest();
    // Up slow
    image = orignal1.getScaledInstance(400, -1, Image.SCALE_DEFAULT);
    repaint();
   rest();
   
  
    }
   System.out.println(System.currentTimeMillis());
   }
   image = noim.getScaledInstance(400, -1, Image.SCALE_DEFAULT);
   label.setText("You're awesome");
   label.setHorizontalTextPosition(JLabel.CENTER);
	 label.setVerticalTextPosition(JLabel.CENTER);
	 label.setVerticalAlignment(JLabel.CENTER);
	  label.setHorizontalAlignment(JLabel.CENTER);
  
   
  
   // System.exit(0);
   
   
  }

  private void rest() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException ignored) {
    }
  }
  

  public static void main(String args[]) {
    Scale f = new Scale();
    f.setSize(400, 400);
    f.setTitle("ErgoFit");//set title 
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close but run in background
	f.setVisible(true); 
	f.setState(Frame.ICONIFIED);
	 label=new JLabel(); 
	 label.setText("Look away from system");
	 label.setHorizontalTextPosition(JLabel.CENTER);
	 label.setVerticalTextPosition(JLabel.BOTTOM);
	 label.setVerticalAlignment(JLabel.BOTTOM);
	  label.setHorizontalAlignment(JLabel.CENTER);
	 f.add(label);
	//f.pack();
	//this.setSize(420,420);
   // f.show();
	
    //f.go();
    final ScheduledExecutorService scheduler =Executors.newScheduledThreadPool(1);

    	        final Runnable beeper = new Runnable() {
    	                public void run() {
    	                	
    	                	f.setState(Frame.NORMAL);

    	                	
    	                	f.go();
    	                	i++;
    	                	
    	                	f.setState(Frame.ICONIFIED);
    	                	
    	                }
    	            };
    	        final ScheduledFuture<?> beeperHandle =
    	            scheduler.scheduleAtFixedRate(beeper, 20, 20, SECONDS);
    	        scheduler.schedule(new Runnable() {
    	                public void run() { beeperHandle.cancel(true);
    	               }
    	            }, 216000, SECONDS);
    	   
    
    
    
  }
}
           
         

    
    