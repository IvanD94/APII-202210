package model;

public class DoubleList {

	private NodeDoubleList first;

	public DoubleList() {
		// TODO Auto-generated constructor stub
	}

	public void add(int value) {
		NodeDoubleList newNode = new NodeDoubleList(value);

		if (first == null) { // Lista vacia
			first = newNode;
		} else {
			NodeDoubleList temp = first;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}

			temp.setNext(newNode);
			newNode.setPrev(temp);
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
		while (temp != null) {
			if (temp.getValue() == value) {
				if (temp == first) {
					if (first.getNext() == null) {
						first = null;
					} else {
						first = first.getNext();
						first.setPrev(null);
					}	
				} else {
					if (temp.getNext() != null) {
						temp.getPrev().setNext(temp.getNext());
						temp.getNext().setPrev(temp.getPrev());
					} else {
						temp.getPrev().setNext(null);
					}
				}
				return true;
			} else {
				temp = temp.getNext();
			}
		}

		return deleted;
	}
	
	@Override
	public String toString() {
		
		String ans  = "[]";
		
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
