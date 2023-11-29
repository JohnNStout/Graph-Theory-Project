package objects;

public class Interface {
	/**
	 * The integer ID of the Interface
	 */
	int id;
	/**
	 * The speed in MB of the Interface
	 */
	int speed;

	/**
	 * Constructor for an Interface
	 * @param id - the interger ID of an Interface
	 * @param speed - the speed in MB of an Interface
	 */
	public Interface(int id, int speed){
		this.id = id;
		this.speed = speed;
	}
	
	/**
	 * toString override method
	 * @override
	 */
	public String toString() {
		return "Interface " + id + "\n  Speed: " + speed + "MB" + "\n";
	}
	
}
