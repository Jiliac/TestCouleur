package forme;

import hough.Vector;

public class Cercle extends Forme{
	
	@Override
	public boolean isIn(Vector p) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Cercle(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public boolean isInDroite(Vector p) {
		if (a == 0 && p.getPosY() == b)
			return true;
		else if (p.getPosX() == (p.getPosY() - b) / a)
			return true;
		else
			return false;
	}
}
