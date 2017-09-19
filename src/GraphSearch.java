import java.util.LinkedList;
import java.util.Queue;

class GraphNode{
		int data; boolean visited=false; GraphNode[] children = new GraphNode[2];
		
		public GraphNode(int data){
			this.data = data;
			this.visited = false;
		}
		@Override
		public String toString() {
			return "Node : " + data;
		}
	}
	
	
public class GraphSearch {

	public static void main(String[] args) {

		GraphNode root = new GraphNode(4);
		root.children[0] = new GraphNode(2);
		root.children[1] = new GraphNode(6);
		
		root.children[0].children[0]= new GraphNode(1);
		root.children[0].children[1] = new GraphNode(3);
		
		root.children[1].children[0]= new GraphNode(5);
		root.children[1].children[1] = new GraphNode(7);
		
	//	dfsGraphSearch(root);
		bfsGraphSearch(root);
		
	}
	
	public static void bfsGraphSearch(GraphNode root){
		if(root == null)
			return;
		
		Queue<GraphNode> queue = new LinkedList<>(); 
		queue.offer(root);
		root.visited = true;
		while(!queue.isEmpty()){
			GraphNode node = queue.poll();
			System.out.println(node);
			for(int i =0; i < 2; i++){
				if(node.children[i] != null)
					queue.offer(node.children[i]);
			}
		}
	}
	
	public static void dfsGraphSearch(GraphNode root){
		if(root == null)
			return;
		
		System.out.println(root);
		root.visited = true;
		
		for (GraphNode n : root.children) {
			if(n!=null && !n.visited)
				dfsGraphSearch(n);
		}
		
	}

}
