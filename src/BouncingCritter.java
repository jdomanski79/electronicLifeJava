
public class BouncingCritter {
	String direction;
	
	public BouncingCritter () {
		this.direction = ELife.randomElement(ELife.directionNames);
	}
	
	public Action act (View view) {
		if (view.look(this.direction != " "))
			this.direction = view.find(" ") || "s";
		return new Action("move", this.direction);
	}
}
