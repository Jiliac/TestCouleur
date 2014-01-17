package Comparaison;

public class Cercle extends FormeStandard{
	int rayon;
	
	public Cercle(int rayon){
		this.rayon = rayon;
	}
	
	public int getDistanceProjete(Point p) {
		int rayonPoint = p.distance(new Point(0,0));
		return Math.abs(rayonPoint-rayon);
	}

}
