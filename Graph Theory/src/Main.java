import java.util.HashMap;
import java.util.Map;

public class Main{
public static void main(String[] args) {

	Node nodeA = new Node("A");
	Node nodeB = new Node("B");
	Node nodeC = new Node("C");
	Node nodeD = new Node("D");
	
	nodeA.addAdjacentNode(nodeB, 2);
	nodeA.addAdjacentNode(nodeC, 5);
	nodeB.addAdjacentNode(nodeD, 2);
	nodeC.addAdjacentNode(nodeD, 10);
	
	Node.calculateShortestPath(nodeA);
	Node.printNodesMap();
	
}



}
