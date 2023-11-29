package objects;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Router {
	
	/**
	 * The number of interfaces of the Router
	 */
	protected int numInterfaces;
	/**
	 * The Interfaces of the Router
	 */
	protected ArrayList<Interface> interfaces;
	/**
	 * The ID of the last Interface of the Router
	 */
	private int currentID;
	
	/**
	 * Default contstructor for Router, creates a
	 *   Router with no Interfaces
	 */
	public Router(){
		numInterfaces = 0;
		this.interfaces = new ArrayList<Interface>();
		currentID = 1;
	}
	
	/**
	 * Constructor for Router, creating a Router
	 *   with the given Interface array
	 * @param interfaces - the Interface array to
	 *   use for the Router's Interfaces
	 */
	public Router(Interface[] interfaces){
		numInterfaces = interfaces.length;
		
		this.interfaces = new ArrayList<Interface>();
		
		for (Interface i:interfaces) {
			this.interfaces.add(i);
		};
		
		this.interfaces.sort(null);
		
		currentID = 1 + numInterfaces;
	}
	
	/**
	 * Constructor for Router, creating a Router
	 *   with the given Interface ArrayList
	 * @param interfaces - the ArrayList to
	 *   use for the Router's Interfaces
	 */
	public Router(ArrayList<Interface> interfaces){
		numInterfaces = interfaces.size();
		
		this.interfaces = new ArrayList<Interface>();
		
		this.interfaces = interfaces;
		
		this.interfaces.sort(null);
		
		currentID = 1 + numInterfaces;
	}
	
	/**
	 *Constructor for Router, given a number of Interfaces
	 *   all with the same speed; Interfaces will be assigned
	 *   successive lower-case letters of the alphabet, beginning
	 *   with a
	 * @param numInterfaces - the number of interfaces on the router
	 * @param speed - the speed of all the interfaces
	 */
	public Router(int numInterfaces, int speed){
		this.numInterfaces = numInterfaces;
		
		this.interfaces = new ArrayList<Interface>();
		
		currentID = 1;
		
		for (int i = 0; i < numInterfaces; i++) {
			interfaces.add(new Interface(currentID, speed));
			currentID++;
		}
		
	}
	
	/**
	 * Constructor for Router, given a number of Interfaces
	 *   and an array of speeds, each corresponding to an
	 *   Interface
	 * @param numInterfaces - the number of Interfaces in
	 *   the Router
	 * @param speeds - the speeds of each Interface, must be
	 *   the same number of speeds as interfaces
	 * @throws IllegalArgumentException - throws exception
	 *   if the number of Interfaces and number of speeds
	 *   do not match
	 */
	public Router (int numInterfaces, int[] speeds) throws IllegalArgumentException {
		if (numInterfaces != speeds.length) {
			throw new IllegalArgumentException("The number of interfaces must match the number of speeds");
		}
		
		this.numInterfaces = numInterfaces;
		
		this.interfaces = new ArrayList<Interface>();
		
		currentID = 1;
		
		for (int i = 0; i < numInterfaces; i++) {
			interfaces.add(new Interface(currentID, speeds[i]));
			currentID++;
		}
		
	}
	
	/**
	 * Accessor method for an Interface
	 * @param id - the letter ID of an Interface
	 * @return i - the Interface with ID of id
	 */
	public Interface getInterface(int id) {
		for (Interface i:interfaces) {
			if (i.id == id) {
				return i;
			}
		}
		return null;
	}
	
	/**
	 * Accessor method for the fastest Interface,
	 *   returns Interface A if all have the same speed
	 * @return
	 */
	public Interface getFastestInterface() {
		if (interfaces.size() == 0) {
			return null;
		}
		
		Interface fastestInterface = interfaces.get(0);
		for (int i = 0; i < numInterfaces; i++) {
			if (interfaces.get(0).speed > fastestInterface.speed) {
				fastestInterface = interfaces.get(i);
			}
		}
		
		return fastestInterface;
	}
	
	/**
	 * toString override method
	 * @override
	 */
	public String toString() {
		String out = "";
		
		for (Interface i:interfaces) {
			out += i;
		}
		
		return out;
		
	}

	
}
