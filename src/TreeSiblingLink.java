import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeSiblingLink {

	public static void main(String[] args) {
		Node n1 = new Node(10);
		n1.left = new Node(5);
		n1.right = new Node(15);
		n1.left.left = new Node(1);
		n1.left.right = new Node(7);
		//n1.right.left = new Node(12);
		n1.right.right = new Node(18);
		
		System.out.println(n1);
		createSibligLink(n1);
		System.out.println(n1);
	}

	public static void createSibligLink(Node root){
	    //TODO root == null
	    if(root == null)
	        return;
	    Queue<Node> queue  = new LinkedList<Node>(); //Maintains the parents at the same level
	    queue.add(root);
	    Node leftBranchRight = null;
	    //LinkedList<Node> levelList = new LinkedList<Node();
	    
	    List<Node> remNodes = new ArrayList<Node>(); //has the list of childs to be added as parents for the next iteration
	    
	    while(!queue.isEmpty()){
	        Node parent = (Node) queue.poll();
	        
	        //Atleast left or right child need to be present else go to next parent (which is at the same level)
	        if(parent.left == null && parent.right == null)
	            continue;
	            
	        if(parent.left != null){
                remNodes.add(parent.left);
	            if(parent.right != null)
	            	parent.left.sibling = parent.right;
	            if(leftBranchRight != null)
	                leftBranchRight.sibling = parent.left;
	        }else{
	            if(parent.right != null)
	            	leftBranchRight.sibling = parent.right;
	        }
	        
	        if(parent.right != null){
	        	//Add the childs to a list to be used latter on to refil the queue
                remNodes.add(parent.right);
	        }  
	        
	        if(!queue.isEmpty()){ 
	            //If queue is not empty means there is a siblink exists
	        	if(parent.right != null)
	        		leftBranchRight = parent.right;
	        	else if(parent.left != null)
	        		leftBranchRight = parent.left;
	        }else{
	            //If queue is empty refil it from the temp storage of sibling list
	            for(Node remNode : remNodes){
	                queue.add(remNode);
	            }
	            //clear the list so next 
	            remNodes.clear();
	        }
	        
	    }
	}
}

class Node{
    int val;
    Node left;
    Node right;
    Node sibling;
    
    public Node(int val){
        this.val = val;
    }

	@Override
	public String toString() {
		return "Node [val=" + val + ", left=" + left + ", right=" + right + ", sibling=" + sibling + "]";
	}
}