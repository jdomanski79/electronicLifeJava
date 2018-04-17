
public class Grid {
	String[] space;
	int width;
	int height;
	/**
	 * @param args
	 */
	Grid (int width, int height) {
		this.space = new String[width * height];
		this.width = width;
		this.height = height;
	}
	
	public boolean isInside(Vector vector){
		return vector.getX() >= 0 && vector.getX() < this.width &&
				vector.getY() >= 0 && vector.getY() < this.height;
	}
	
	public String get(Vector vector){
		return this.space[vector.getX() + this.width * vector.getY()];
	}
	
	public void set (Vector vector, String value){
		this.space[vector.getX() + this.width * vector.getY()] = value; 
	}
	
	public static void main(String[] args) {
		// testing
		Grid grid = new Grid(5,5);
		System.out.println(grid.get(new Vector(1,1)));
		
		grid.set(new Vector(1,1), "X");
		System.out.println(grid.get(new Vector(1,1)));

	}

}
