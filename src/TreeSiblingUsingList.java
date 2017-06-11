import java.util.LinkedList;
import java.util.Queue;

public class TreeSiblingUsingList {
	
	public static void main(String[] args){
		Node n1 = new Node(10);
		n1.left = new Node(5);
		n1.right = new Node(15);
		n1.left.left = new Node(1);
		n1.left.right = new Node(7);
		n1.right.left = new Node(12);
		n1.right.right = new Node(18);
		
		System.out.println(n1);
		createSiblingLink(n1);
		System.out.println(n1);
	}

	public static void createSiblingLink(Node root){
		/**
		 * 1) Create a queue contains only parents at each level
		 * 2) Find the length of the queue
		 * 3) poll the items until the length from the queue and create a siblinglink and add the childs to queue
		 * 4) Set the siblings
		 * 
		 */
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		while(!queue.isEmpty()){
			int length = queue.size();
			Node youngerSibling = null;
			for (int i = 0; i < length; i++) {
				Node parent = queue.poll();
				if(youngerSibling != null){
					if(parent.left != null)
						youngerSibling.sibling = parent.left;
					else if (parent.right != null)
						youngerSibling.sibling = parent.right;
				}
				
				if(parent.right != null)
					youngerSibling = parent.right;
				else if(parent.left != null)
					youngerSibling = parent.left;
				
				if(parent.left!=null)
					queue.offer(parent.left);
				if(parent.right!=null){
					queue.offer(parent.right);
				}
				
				if(parent.left != null && parent.right != null)
					parent.left.sibling = parent.right;
			}
		}
	}
}