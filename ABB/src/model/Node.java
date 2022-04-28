package model;

public class Node {
	
	private Node left;
	private Node right;
	private double value;
	
	public Node(double value) {
		this.setValue(value);
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public boolean isLeaft() {
		return left == null && right == null;
	}

	public int countNodes() {
		int count = 1;
		
		if (right != null) {
			count += right.countNodes();
		}
		
		if (left != null) {
			count += left.countNodes();
		}
		
		return count;
	}

	public int countLeafts() {
		int count = 0;
		
		if(isLeaft()) {
			count = 1;
		}else {			
			if (right != null) {
				count += right.countLeafts();
			}
			
			if (left != null) {
				count += left.countLeafts();
			}
		}
		
		return count;
	}
	
}
