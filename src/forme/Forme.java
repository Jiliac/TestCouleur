package forme;

import hough.Vector;

public  abstract class Forme {
	int a, b;

	public Forme(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Forme(Vector vector) {
		this(vector.getPosX(), vector.getPosY());
	}
	
	public abstract boolean isIn(Vector p);
}
