import java.util.LinkedList;
import java.util.Queue;

public class DfsTree {

	public static void main(String[] args) {
		Node n1 = new Node(10);
		n1.left = new Node(5);
		n1.right = new Node(15);
		n1.left.left = new Node(1);
		n1.left.right = new Node(7);
		n1.right.left = new Node(12);
		n1.right.right = new Node(18);
		
		dfsSearchTree(n1);
		bfsSearchTree(n1);
		
	}
	
	public static void dfsSearchTree(Node root){
		
		if(root == null)
			return;
		if(root.left != null)
			dfsSearchTree(root.left);
		if(root.right != null)
			dfsSearchTree(root.right);
		
		System.out.println(root.val);
	}

	public static void bfsSearchTree(Node root){
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		
		while(!queue.isEmpty()){
			Node parent = queue.poll();
			System.out.println(parent.val);
			if(parent.left != null)
				queue.offer(parent.left);
			
			if(parent.right != null)
				queue.offer(parent.right);
		}
	}
}
