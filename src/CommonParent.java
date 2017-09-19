
public class CommonParent {

	public static void main(String[] args) {
		Node n1 = new Node(10);
		n1.left = new Node(5);
		n1.right = new Node(15);
		n1.left.left = new Node(1);
		n1.left.right = new Node(7);
		n1.right.left = new Node(12);
		n1.right.right = new Node(18);
		
		System.out.println(n1);
		//createSiblingLink(n1);
		System.out.println(getCommonParent(n1,1, 7));
		System.out.println(n1);
	}
	
	public static Node getCommonParent(Node root, int val1, int val2){
		if(val1 > val2){
			val1 = val1 + val2 - (val2 = val1);
		}
		
		while(root.left != null || root.right != null){
			if(val1 <= root.val && val2 >= root.val){
				return root;
			}else if(val1 < root.val && val2 < root.val){
				if(root.left == null)
					return null;
				root = root.left;
			}else if(val1 > root.val && val2 > root.val){
				if(root.right == null)
					return null;
				root = root.right;
			}
		}
		
		return null;
	}

}
