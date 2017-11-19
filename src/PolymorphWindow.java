import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    ArrayList <Polymorph> p = new ArrayList <Polymorph>();
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 Random t = new Random();
   	

   	 for (int i = 0; i < 20; i++) {
   		 int r = t.nextInt(6);
   		int s = t.nextInt(500);
   		int u = t.nextInt(500);
   		int v = t.nextInt(100);
   		int w = t.nextInt(100);
   		 if(r == 0) {
   			 p.add(new RedPolymorph(s, u, v, w));
   		 }
   		 else if(r == 1) {
  			 p.add(new BluePolymorph(s, u, v, w));
  		 }
   		 else if(r == 2){
  			 p.add(new MovingPolymorph(s, u, v, w));
  		 }
   		else if(r == 3){
 			 p.add(new CirclePolymorph(s, u, v, w));
 		 }
   		else if(r == 4){
   			MousePolymorph m = new MousePolymorph(s, u, v, w);
			 p.add(m);
		   	 window.addMouseMotionListener(m);
		 }
	}
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for (Polymorph i : p) {
   		 i.draw(g);
   		 i.update();
		
	} 
	
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();

   	 
    }
}
