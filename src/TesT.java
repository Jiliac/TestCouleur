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

	
	
	// methode prototype du projet
	public static void getImageColor(File imagePath) throws IOException {

		// I - recupere deux categorie (on pourrait en faire plus)

		BufferedImage image = ImageIO.read(imagePath);
		int categorie[][] = new int[image.getWidth()][image.getHeight()];

		
		int color;
		for (int r = 0; r < image.getHeight(); r += 1) {
			for (int c = 0; c < image.getWidth(); c += 1) {
				color = image.getRGB(c, r);
				if (color > -4000000)
					categorie[c][r] = 1;
				else
					categorie[c][r] = 2;
			}
		}

		// II - set une frontiere

		ArrayList<Point> frontiere = new ArrayList<Point>();

		int i = categorie[0][0];
		for (int y = 0; y < categorie.length; y++) {
			for (int x = 0; x < categorie[y].length; x++) {
				if (i != categorie[x][y]) {
					frontiere.add(new Point(x, y));
					i = categorie[x][y];
				}
			}
		}

		/*
		 * III - comparer a une forme
		 * 
		 * 
		 * III - preambule: pour determiner la dimension generale des formes
		 * auxquelles on compare il faudrait creer un indice de dispersion generale
		 * 
		 * III - a - pour chaque forme, pour chaque point, on le raproche d'un
		 * point de la forme; on associe une distance à ce point
		 * 
		 * III - b - on calcule un indice de "distance" à la forme est on
		 * determine la forme qui est la plus proche
		 */

	}

}
