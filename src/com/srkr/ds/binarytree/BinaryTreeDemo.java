package com.srkr.ds.binarytree;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
	}
}

class BinaryTree {
	Node root;

	void inOrderTraversal(Node node) {
		if (node != null) {
			inOrderTraversal(node.left); // recursively calling left child
			System.out.print(node.data + " "); // print root_node data
			inOrderTraversal(node.right); // recursively calling right child
		}
	}
	
	void preOrderTraversal(Node node) {
		if (node != null) {
			System.out.print(node.data + " "); // print root_node data
			inOrderTraversal(node.left); // recursively calling left child
			inOrderTraversal(node.right); // recursively calling right child
		}
	}
	
	void postOrderTraversal(Node node) {
		if (node != null) {
			inOrderTraversal(node.left); // recursively calling left child
			inOrderTraversal(node.right); // recursively calling right child
			System.out.print(node.data + " "); // print root_node data
		}
	}
}

public class BinaryTreeDemo {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left  = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		System.out.print("In-Order Traversal :  ");
		tree.inOrderTraversal(tree.root);
		System.out.println();
		
		System.out.print("Pre-Order Traversal :  ");
		tree.preOrderTraversal(tree.root);
		System.out.println();
		
		System.out.print("Post-Order Traversal :  ");
		tree.postOrderTraversal(tree.root);

	}
}