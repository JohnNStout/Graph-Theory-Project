package test;

import objects.*;

public class Test {

	public static void main(String[] args) {
		printTest();
	}
	
	public static void printTest() {
		System.out.println("Interface print test:");
		Interface i = new Interface('a', 100);
		System.out.println(i);
		
		System.out.println("Router print test:");
		Router r = new Router(30, 100);
		System.out.println(r);
	}
	
}
