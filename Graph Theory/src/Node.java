
import java.util.Map;
import java.util.HashMap;
public class Node {

	private String name;
	private String path="";
	private Map<Node, Integer> adjacentNodes = new HashMap<>();
	
	//Constructor for a new node
	public Node(String name) {
		this.name=name;
	}
	//Adds an adjacency to the map of that node
	public void addAdjacentNode(Node node, int weight) {
		adjacentNodes.put(node, weight);
	}
	//Adds node to the path of a given node
	public void updatePath(String previousNode) {
		path=path +", " + previousNode;
	}
}
