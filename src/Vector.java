
public class Vector {

	private int x;
	private int y;
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	Vector(int x, int y){
		this.x = x;
		this.y = y;
	}
	/**
	 * @param other
	 */
	public Vector plus (Vector other) {
		return new Vector(this.x + other.x, this.y + other.y);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v = new Vector (1,1);
		System.out.println(v.plus(new Vector(-1,-1)));
	}

}
