
import java.util.Map;
import java.util.HashMap;

public class Node {

	private String name;
	private String path="";
	//map of a nodes edges
	private Map<Node, Integer> adjacentNodes = new HashMap<>();
	//map of all nodes and the minimum total weight
	public static Map<Node, Integer> Nodes = new HashMap<>();
	//Constructor for a new node
	public Node(String name) {
		this.name=name;
		Nodes.put(this, -1);
	}
	//Adds an adjacency to the map of that node
	public void addAdjacentNode(Node node, int weight) {
		adjacentNodes.put(node, weight);
	}
	//Adds node to the path of a given node
	public void updatePath(String previousNode) {
		path=path +", " + previousNode;
	}
	
	
	public static void calculateShortestPath(Node sourceNode) {
		Nodes.replace(sourceNode, 0);
		Nodes.forEach((k, v) -> {
		      k.adjacentNodes.forEach((x,y) ->{
		    	  if(Nodes.get(x) < 0) {
		    		  Nodes.replace(x, y);
		    	  }
		    	  else if (Nodes.get(x)> y+v) {
		    	  Nodes.replace(x, y+v);
		    	  } 
		    	  
		      });
		    });
	}
	public static void printNodesMap() {
		Nodes.forEach((k,v)->{
			System.out.println(k.name + v);
		});
	}
}


