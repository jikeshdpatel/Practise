
public class TreeTravesals {

	public static void main(String[] args) {

		Node2 root = new Node2(4);
		root.left = new Node2(2);
		root.left.left = new Node2(1);
		root.left.right = new Node2(3);
		
		root.right = new Node2(6);
		root.right.left = new Node2(5);
		root.right.right = new Node2(7);
		inOrderTravesal(root);
		System.out.println("-------------");
		preOrderTravesal(root);
		System.out.println("-------------");
		postOrderTravesal(root);
	}

	public static void inOrderTravesal(Node2 root){
		if(root == null)
			return;
		
		inOrderTravesal(root.left);
		System.out.println(root);
		inOrderTravesal(root.right);
	}
	
	public static void preOrderTravesal(Node2 root){
		if(root == null)
			return;
		
		System.out.println(root);
		preOrderTravesal(root.left);
		preOrderTravesal(root.right);
	}
	
	public static void postOrderTravesal(Node2 root){
		if(root == null)
			return;
		
		postOrderTravesal(root.left);
		postOrderTravesal(root.right);
		System.out.println(root);
	}
	
}

class Node2{
	int data;
	Node2 left, right;
	public Node2(int data){
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
}
