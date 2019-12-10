import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MetroMap extends JPanel {
	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	
		public MetroMap() {
			try {                
				image = ImageIO.read(new File("metroTokyo.png"));
			} catch (IOException ex) {
	            // handle exception...
			}
	    }
	
	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);            
	    }
}
