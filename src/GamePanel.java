import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private static final int RECT_X = 20;
	   private static final int RECT_Y = RECT_X;
	   private static final int RECT_WIDTH = 100;
	   private static final int RECT_HEIGHT = RECT_WIDTH;

	   @Override
	   protected void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      // draw the rectangle here
	      g.drawRect(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
	   }
}
