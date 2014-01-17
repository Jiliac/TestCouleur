import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Comparaison.ListePoints;
import Comparaison.Point;

public class Segmentation {

	public BufferedImage segmenter() {
		BufferedImage img = null;// Création d'une image BufferedImage
		try {
			// la méthode statique read de la classe javax.imageio.ImageIO
			// renvoie
			// une instance de la classe BufferedImage (qui étend la classe
			// abstraite Image).
			img = ImageIO.read(new File("test8.jpg"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int x = 0; x < img.getWidth(); x++) {
			for (int y = 0; y < img.getHeight(); y++) {// parcourir l'image
				Color c = new Color(img.getRGB(x, y));// prendre des valeurs RGB
														// de chaque pixel
				int r = c.getRed();
				int g = c.getGreen();
				int b = c.getBlue();

				float[] hsb = Color.RGBtoHSB(r, g, b, null); // convertir RGB en
																// HSB
				float h = hsb[0]; // prendre la valeur teinte

				if (h < 0.35 && h > 0.12) {
					System.out.println("h change" + h);
					int rgb = new Color(0, 255, 0).getRGB();
					img.setRGB(x, y, rgb); // remplir cette zone par une couleur
											// homogène

				}
			}
		}

		File outputfile = new File("output8_1.jpg");
		try {
			ImageIO.write(img, "jpg", outputfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}

	public ListePoints getFrontiere() {
		
		// I - recupere deux categorie (on pourrait en faire plus)
		
		BufferedImage img = this.segmenter();
		int categorie[][] = new int[img.getWidth()][img.getHeight()];
		
		
		for (int x = 0; x < img.getWidth(); x++) {
			for (int y = 0; y < img.getHeight(); y++) {// parcourir l'image
				Color c = new Color(img.getRGB(x, y));// prendre des valeurs RGB
														// de chaque pixel
				int r = c.getRed();
				int g = c.getGreen();
				int b = c.getBlue();

				float[] hsb = Color.RGBtoHSB(r, g, b, null); // convertir RGB en
																// HSB
				float h = hsb[0]; // prendre la valeur teinte

				if (h < 0.35 && h > 0.12) 
					categorie[x][y] = 1;
				else
					categorie[x][y] = 2;
			}
		}
		
		// II - set une frontiere

		ListePoints frontiere = new ListePoints();

		int i = categorie[0][0];
		for (int y = 0; y < categorie.length; y++) {
			for (int x = 0; x < categorie[y].length; x++) {
				if (i != categorie[x][y]) {
					frontiere.add(new Point(x, y));
					i = categorie[x][y];
				}
			}
		}
		
		return frontiere;
	}
}