package model;

public class Node {

	public static final double TOLERANCE = 0.000001;
	
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

		if (isLeaft()) {
			count = 1;
		} else {
			if (right != null) {
				count += right.countLeafts();
			}

			if (left != null) {
				count += left.countLeafts();
			}
		}

		return count;
	}
	
	public Node getMin() {
		if (left == null) {
			return this;
		} else {
			return left.getMin();
		}
	}

	public boolean searchNode(double searched) {
		if (Math.abs(searched - value) < TOLERANCE) {
			return true;
		} else if (searched < value && left != null) {
			return left.searchNode(searched);
		} else if (searched > value && right != null) {
			return right.searchNode(searched);
		}

		return false;
	}

	public String inOrder() {
		String msg = "";
		
		if (left != null) {
			msg += left.inOrder() + ", ";
		}
		
		msg += value +"";
		
		if (right != null) {
			msg += ", " + right.inOrder();
		}
		
		return msg;
	}
	
	public Node delete(double toDelete) {
		
		if (Math.abs(value - toDelete) < TOLERANCE) {
			if (isLeaft()) {
				return null;
			} else if(left == null || right == null) { // Un solo hijo
				if (left != null) {
					return left;
				} else {
					return right;
				}
			} else {
				Node succesor = right.getMin();
				value = succesor.getValue();
				right = right.delete(value);
				return this;
			}
		} else {
			if (toDelete < value) {
				if (left != null) {
					left = left.delete(toDelete);					
				}
			} else {
				if (right != null) {
					right = right.delete(toDelete);
				}
			}
			
			return this;
		}
		
	}

}
