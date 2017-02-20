import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	Bird bird = new Bird();

	   @Override
	   protected void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      
	      g.setColor(Color.cyan);
	      g.fillRect(0, 0, 800, 600);
	     
	      g.setColor(Color.orange);
	      g.fillRect(0, 500, 800, 100);
	      
	      g.setColor(Color.red);
	      g.fillRect(bird.x, bird.y, bird.width, bird.height);
	      
	      g.setColor(Color.green);
	      g.fillRect(0, 475, 800, 25);
	      
	           
	   }

	public void add(Bird bird2) {
		bird = bird2;
		// TODO Auto-generated method stub
		
	}
}
