package Comparaison;
import java.util.ArrayList;

public class ListePoints extends ArrayList<Point> {

	/******* getter des carac' simple de la liste *******/

	public Point getCentre() {
		long sommeX = 0, sommeY = 0;
		for (Point p : this) {
			sommeX += p.getPosX();
			sommeY += p.getPosY();
		}
		int size = this.size();
		return new Point((int) (sommeX / size), (int) (sommeY / size));
	}

	public int getRayon() {
		Point centre = this.getCentre();
		long sommeRayon = 0;
		for (Point p : this)
			sommeRayon += centre.distance(p);
		return (int) (sommeRayon / this.size());
	}

	/*********** calcule de la meilleurs forme ************/

	public int comparaison(FormeStandard fs) {
		ListePoints listeToAnalyse = this.centrageListe();
		int sommeDiff = 0;
		for (Point p : listeToAnalyse)
			sommeDiff += fs.getDistanceProjete(p);
		return (int) (sommeDiff / this.size());
	}
	
	public int comparaisonCercle(){
		return this.comparaison(new Cercle(this.getRayon()));
	}
	
	public ListePoints centrageListe() {
		Point centre = this.getCentre();
		ListePoints lp = new ListePoints();
		for (Point p : this)
			lp.add(p.moins(centre));
		return lp;
	}
}
