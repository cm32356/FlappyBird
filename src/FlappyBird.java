import java.util.*;

import javax.swing.*;

public class FlappyBird {
	public static void main (String [] args) {
		int width = 800;
		int height = 800;
		
		JFrame frame = new JFrame("FrameDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GamePanel panel = new GamePanel();
		
		
		
		

		//4. Size the frame.
		frame.add(panel);
		frame.setSize(width, height);

		//5. Show it.
		frame.setVisible(true);
		
		Bird bird = new Bird();
		panel.add(bird);
		
		
		
		
		
	
	}
	
	public static String PrintMyName (){
		String name = "Carlos";
		return name;
	}
}
