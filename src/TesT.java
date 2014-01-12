import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class TesT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file = new File("_MG_0143.JPG");
		try {
			getImageColor(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getImageColor(File imagePath) throws IOException {
		BufferedImage image;
		ArrayList<Point> type1 = new ArrayList<Point>(), type2 = new ArrayList<Point>();

		image = ImageIO.read(imagePath);

		int color;
		for (int r = 0; r < image.getHeight(); r += 1) {
			for (int c = 0; c < image.getWidth(); c += 1) {
				color = image.getRGB(c, r);
				Point p = new Point(c,r);
				if( color > -4000000)
					type1.add(p);
				else
					type2.add(p);					
			}
		}
		for(Point p : type1){
			image.setRGB(p.getPosX(), p.getPosY(), -4000000);
		}
		for(Point p : type2){
			image.setRGB(p.getPosX(), p.getPosY(), 0);
		}
		
	}

}
