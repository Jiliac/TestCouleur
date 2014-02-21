package hough;

public class Vector {
	private int x, y;
	private int count;

	public Vector(int x, int y) {
		this.x = x;
		this.y = y;
		count = 0;
	}

	public int getPosX() {
		return x;
	}

	public int getPosY() {
		return y;
	}

	public void iterate() {
		count++;
	}

	public int getCount() {
		return count;
	}
}
