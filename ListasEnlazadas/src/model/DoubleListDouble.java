package model;

public class DoubleListDouble {

	private NodeDoubleList first;
	private NodeDoubleList last;

	public DoubleListDouble() {
		// TODO Auto-generated constructor stub
	}

	public void add(int value) {
		NodeDoubleList newNode = new NodeDoubleList(value);

		if (first == null) { // Lista vacia
			first = newNode;
			last = newNode;
		} else {

			last.setNext(newNode);
			newNode.setPrev(last);

			last = newNode;

		}
	}

	public boolean search(int value) {
		boolean found = false;

		NodeDoubleList temp = first;
		while (temp != null) {
			if (temp.getValue() == value) {
				return true;
			} else {
				temp = temp.getNext();
			}
		}

		return found;
	}

	public boolean delete(int value) {
		boolean deleted = false;

		NodeDoubleList temp = first;
		while (temp != null && !deleted) {
			if (temp.getValue() == value) {
				if (temp == first && temp == last) {
					first = null;
					last = null;
				} else if (temp == first) {
					first = first.getNext();
					first.setPrev(null);
				} else if (temp == last) {
					last = last.getPrev();
					last.setNext(null);
				} else {
					temp.getPrev().setNext(temp.getNext());
					temp.getNext().setPrev(temp.getPrev());
				}
				deleted = true;
			} else {
				temp = temp.getNext();
			}
		}

		return deleted;
	}

	@Override
	public String toString() {

		String ans = "[]";

		if (first != null) {
			ans = "[";
			NodeDoubleList temp = first;
			while (temp.getNext() != null) {
				ans += temp.getValue() + ", ";
				temp = temp.getNext();
			}
			ans += temp.getValue() + "]";

		}

		return ans;
	}

}
