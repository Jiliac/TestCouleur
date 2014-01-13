import java.util.ArrayList;

public class ListePoints extends ArrayList<Point> {

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
	
	public Point getPlusProche(ListePoint lp){
		
	}
	
	public int comparaison(ListePoint lp){
		/*
		 * I get plus proche
		 * II caculer moyenne des distances et la retourner
		 */
	}
}
