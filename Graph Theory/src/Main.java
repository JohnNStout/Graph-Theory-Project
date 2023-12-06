import java.util.Scanner;
public class Main{
public static void main(String[] args) {
	
	//initialize all nodes
	Node nodeA = new Node("A");
	Node nodeB = new Node("B");
	Node nodeC = new Node("C");
	Node nodeD = new Node("D");
	Node nodeE = new Node("E");
	Node nodeF = new Node("F");
	//Get users input for which graph to calculate Dijkstra's on
	String network = "";
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter which network to test. A, B, or C");
	network = keyboard.nextLine();
	keyboard.close();
	
	//Adding edges for Network A
	if(network.contains("A")) {
	nodeA.addAdjacentNode(nodeB, 2);
	nodeA.addAdjacentNode(nodeC, 5);
	nodeB.addAdjacentNode(nodeD, 2);
	nodeC.addAdjacentNode(nodeD, 10);
	}
	
	//Adding edges for Network B
	if(network.contains("B")) {
	nodeA.addAdjacentNode(nodeB, 2);
	nodeA.addAdjacentNode(nodeC, 1);
	nodeB.addAdjacentNode(nodeE, 1);
	nodeC.addAdjacentNode(nodeD, 3);
	nodeB.addAdjacentNode(nodeD, 4);
	nodeC.addAdjacentNode(nodeE, 6);
	nodeD.addAdjacentNode(nodeF, 1);
	nodeE.addAdjacentNode(nodeF, 4);
	}
	
	//Adding edges for Network C
	if(network.contains("C")) {
		nodeA.addAdjacentNode(nodeB, 5);
		nodeA.addAdjacentNode(nodeC, 8);
		nodeB.addAdjacentNode(nodeE, 10);
		nodeC.addAdjacentNode(nodeD, 5);
		nodeB.addAdjacentNode(nodeD, 3);
		nodeC.addAdjacentNode(nodeE, 2);
		nodeD.addAdjacentNode(nodeF, 8);
		nodeE.addAdjacentNode(nodeF, 6);
		nodeA.addAdjacentNode(nodeD, 3);
		nodeA.addAdjacentNode(nodeE, 2);
		nodeB.addAdjacentNode(nodeF, 1);
		nodeC.addAdjacentNode(nodeF, 6);

		}
	//Runs the algorithm and prints out results.
	Node.calculateShortestPath(nodeA);
	Node.printNodesMap();
	
}



}
