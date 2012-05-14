import java.util.*;

public class BinaryTree{
	/*
				3
			   / \
			  11 -3
			 / \   \
			0  -1   5
			 \   \  /
			 18  25 7
			     /
				-10
	 */
	private static Node build_binary_tree(){
		Node root=new Node(3);
		root.left=new Node(11);
		root.right=new Node(-3);
		root.left.left=new Node(0);
		root.left.right=new Node(-1);
		root.right.right=new Node(5);
		root.left.left.right=new Node(18);
		root.left.right.right=new Node(25);
		root.right.right.left=new Node(7);
		root.left.right.right.left=new Node(-10);
		return root;
	}
	
	public static void main(String[] args){
		Node root=build_binary_tree();
		get_pre_order(root);
		System.out.println();
		System.out.println("depth: "+get_depth(root));
		System.out.println("tree has value -1: "+has_value(root, -1));
		System.out.println("tree has value 10: "+has_value(root, 10));
		
		LinkedList<Node> in_order=get_in_order(root);
		for(Node node : in_order){
			System.out.print(node.value+" ");
		}
		System.out.println();
		
	}
	
	// output pre_order to console
	/*
		A walk in which each parent node is traversed before its children is called a pre-order walk
	*/
	private static void get_pre_order(Node node){
		//TODO
	}
	
	// return the depth of the tree
	private static int get_depth(Node node){
		//TODO
		return 0;
	}
	
	// return if the tree has a node with a specific value
	private static boolean has_value(Node node, int value){
		//TODO
		return false;
	}
	
	/*
		a walk in which a node's left subtree, then the node itself, and then finally its right sub tree are traversed is called an in-order traversal.
	*/
	// return an in_order nodes in LinkedList
	// try use a linkedlist as a stack instead of a recursive function
	// I think this is difficult, you may need to spend some time...
	private static LinkedList<Node> get_in_order(Node root){
		LinkedList<Node> ret=new LinkedList<Node>();
		//TODO
		return ret;
	}

}

class Node{
	public Node left;
	public Node right;
	public int value;
	public Node(int value){this.value=value;}
}