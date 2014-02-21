package Comparaison;

public class Point {

	/********** les bases ****************/

	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getPosX() {
		return x;
	}

	public int getPosY() {
		return y;
	}

	/************* plus de methodes **********/

	public int distance(Point p) {
		return ((int) Math.sqrt((this.x - p.getPosX()) * (this.x - p.getPosX())
				+ (this.y - p.getPosY()) * (this.y - p.getPosY())));
	}
	
	public Point moins(Point p){
		return new Point(this.x-p.getPosX(),this.y-p.getPosY());
	}

}
