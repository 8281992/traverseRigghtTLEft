package traversalRightToLeft;

public class traverseRightToLeft {

	public static void main(String[] args) {
		Node node=new Node(8);
node.left=new Node(3);
node .left.left=new Node(1);
node.left.right=new Node(6);
node.left.right.left=new Node(4);
node.left.right.right=new Node(7);

node.right=new Node(10);
node.right.right=new Node(14);
node.right.right.left=new Node(13);
traverseRightToLeft( node);
	}

	public static Object traverseRightToLeft(Node node) {
		
		if(node==null)
			return null;
		
		Object o=traverseRightToLeft(node.right);
		
		Object o1=traverseRightToLeft(node.left);
		if(o==null && o1==null)
			System.out.println(node.key);
		
		return new Object();
				
	}
}
