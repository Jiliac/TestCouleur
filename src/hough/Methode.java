package hough;

import java.util.ArrayList;

import forme.*;

public class Methode {

	ArrayList<Vector> frontiere;
	ArrayList<Forme> espaceFormes;

	public Methode(ArrayList<Vector> fr) {
		frontiere = fr;
		espaceFormes = VectorToForme(fr);
	}

	public ArrayList<Forme> VectorToForme(ArrayList<Vector> alp) {
		ArrayList<Forme> retour = new ArrayList<Forme>();
		for (Vector vector : alp) {
			retour.add(new Droite(vector));
		}
		return retour;
	}

	public Forme meilleursForme(int minX, int maxX, int minY, int maxY) {
		ArrayList<Vector> aAnalyser = new ArrayList<Vector>();

		// on parcourt les points de l'espace des Formes pour trouver le point
		// representant la meilleurs Forme
		for (int y = minY; y <= maxY; y++) {
			for (int x = minX; x <= maxX; x++) {
				Vector vect = new Vector(x, y);
				aAnalyser.add(vect);
				for (Forme Forme : espaceFormes) {
					if (Forme.isIn(vect))
						vect.iterate();
				}
			}
		}

		// on sélectionne le bon point
		Vector retour = new Vector(0, 0);
		for (Vector vect : aAnalyser) {
			if (retour.getCount() < vect.getCount())
				retour = vect;
		}

		return new Droite(retour);
	}

}
