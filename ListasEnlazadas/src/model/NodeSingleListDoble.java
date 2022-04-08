package model;

public class NodeSingleListDoble {

	private int value;
	private NodeSingleListDoble next;

	public NodeSingleListDoble(int value) {
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public NodeSingleListDoble getNext() {
		return next;
	}

	public void setNext(NodeSingleListDoble next) {
		this.next = next;
	}

	@Override
	public String toString() {
		String ans = value + "";

		if (next != null) {
			ans += ", " + next;
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
