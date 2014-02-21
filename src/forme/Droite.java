package forme;

import hough.Vector;

public class Droite extends Forme{


	public Droite(Vector vector) {
		super(vector);
		// TODO Auto-generated constructor stub
	}

	public boolean isIn(Vector p) {
		if (a == 0 && p.getPosY() == b)
			return true;
		else if (p.getPosX() == (p.getPosY() - b) / a)
			return true;
		else
			return false;
	}
}
