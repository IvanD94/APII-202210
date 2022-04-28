package model;

public class Tree {
	
	private Node root;
	
	public void insert(double value) {
		Node newNode = new Node(value);
		
		if (root == null) {
			root = newNode;
		} else {
			insert(root, newNode);
		}
		
	}
	
	private void insert(Node current, Node newNode) {
		if(newNode.getValue() >= current.getValue()) {
			if(current.getRight() == null) {
				current.setRight(newNode);
			} else {
				insert(current.getRight(), newNode);
			}
		} else {
			if(current.getLeft() == null) {
				current.setLeft(newNode);
			} else {
				insert(current.getLeft(), newNode);
			}
		}
	}
	
	public int size() {
		if (root == null) {
			return 0;
		} else {
			return root.countNodes();
		}
	}
	
	public int countLeafts() {
		if (root == null) {
			return 0;
		} else {
			return root.countLeafts();
		}
	}	

}
