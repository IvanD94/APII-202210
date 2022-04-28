package model;

public class NodeSingleList {

	private int value;
	private NodeSingleList next;

	public NodeSingleList(int value) {
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public NodeSingleList getNext() {
		return next;
	}

	public void setNext(NodeSingleList next) {
		this.next = next;
	}

	public void addNext(int value) {
		if (next == null) {
			next = new NodeSingleList(value);
		} else {
			next.addNext(value);
		}
	}

	// [3, 4, 5, 6]
	@Override
	public String toString() {
		String ans = value + "";

		if (next != null) {
			ans = next.toString() + ", " + value;
		}

		return ans;
	}

	public boolean searchNode(int item) {
		if (value == item) {
			return true;
		} else if (next == null) {
			return false;
		} else {
			return next.searchNode(item);
		}
	}

	public boolean deleteNode(int item) {
		if (next == null) {
			return false;
		} else if (next.getValue() == item) {
			next = next.getNext();
			return true;
		} else {
			return next.deleteNode(item);
		}
	}

}
