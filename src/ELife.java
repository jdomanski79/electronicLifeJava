
public class ELife {
	// trzeba użyć map?
	//public final ArrayList<String> directions;
//	var directions = {
//			  "n":  new Vector( 0, -1),
//			  "ne": new Vector( 1, -1),
//			  "e":  new Vector( 1,  0),
//			  "se": new Vector( 1,  1),
//			  "s":  new Vector( 0,  1),
//			  "sw": new Vector(-1,  1),
//			  "w":  new Vector(-1,  0),
//			  "nw": new Vector(-1, -1)
//			};
	public static String[] directionNames = "n ne e se s sw w nw".split(" ");
	
	public static String randomElement (String[] array) {
		return array[(int) (Math.random() * array.length)];
	}
	
	public static void main(String[] args) {
		
		
		
		

	}

}
