
import java.util.Map;
import java.util.Vector;
import java.util.Collections;
import java.util.HashMap;

public class Node {

	private String name;
	private String path="";
	//map of a nodes edges
	private Map<Node, Integer> adjacentNodes = new HashMap<>();
	//map of all nodes and the minimum total weight
	public static Map<Node, Integer> Nodes = new HashMap<>();

	//vector of nodes visited
	public static Vector<Node> nodesAvailable = new Vector<Node>();
	//Sorted vector of info for nice printing
	public static Vector<String> Sorted = new Vector<String>();

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
	
	//The algorithm
	public static void calculateShortestPath(Node sourceNode) {
	
		nodesAvailable.add(sourceNode);
		Nodes.replace(sourceNode, 0);
		sourceNode.path=sourceNode.name;
		for(int i=0; i < nodesAvailable.size(); i++) {
			int w= i;
			nodesAvailable.get(i).adjacentNodes.forEach((k,v)->{
				if(Nodes.get(k)==-1) {
					Nodes.replace(k, v+Nodes.get(nodesAvailable.get(w)));
					k.path= nodesAvailable.get(w).path+ k.name;
				}
				else if(v+Nodes.get(nodesAvailable.get(w))<= Nodes.get(k)) {
					Nodes.replace(k, v+Nodes.get(nodesAvailable.get(w)));
					k.path= nodesAvailable.get(w).path+ k.name;

				}
				nodesAvailable.add(k);
			});
		}
	}
	//Adds the info to the vector, sorts it, and prints it out	
	public static void printNodesMap() {
		
		Nodes.forEach((k,v)->{
			if(v!=-1) {
			Sorted.add("Router:" + k.name + " Shortest path weight:" + v + " Path:" + k.path);
			}
		});
		Collections.sort(Sorted);
		for(int g=0; g<Sorted.size(); g++) {
			System.out.println(Sorted.get(g));
		}
	}
}


