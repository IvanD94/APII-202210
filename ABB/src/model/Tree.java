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
	
	public boolean search(double value) {
		if (root != null) {
			return root.searchNode(value);
		} else {
			return false;
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
	
	public String inOrder() {
		if (root == null) {
			return "[]";
		}else {
			return "[" + root.inOrder() + "]"; 
		}
	}
	
	public boolean delete(double toDelete) {
		
		if (root == null) {
			return false;
		}else {
			boolean found = search(toDelete);
			if (found) {
				root = root.delete(toDelete);
			}
			return found;
		}
		
	}

}
