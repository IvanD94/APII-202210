package model;

public class SingleListDoble {
	
	private NodeSingleListDoble first;
	private NodeSingleListDoble last;
	
	public SingleListDoble() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(int value) {
		if (first == null) {
			first = new NodeSingleListDoble(value);
			last = first;
		} else {
			NodeSingleListDoble newNode = new NodeSingleListDoble(value);
			last.setNext(newNode);
			last = newNode;			
		}
	}
	
	@Override
	public String toString() {
		if (first == null) {
			return "[]";
		}
		
		return "[" + first + "]";
	}
	
	public boolean search(int item) {
		if (first == null) {
			return false;
		} else {
			return first.searchNode(item);
		}
	}
	
	public boolean delete(int item) {
		if (first == null) {
			return false;
		} else if (first.getValue() == item) {
			if (first.getNext() == null) {
				first = null;
				last = null;
			} else {				
				first = first.getNext();
			}
			return true;
		} else {
			NodeSingleListDoble temp = first;
			while (temp.getNext() != null) {
				if (temp.getNext().getValue() == item) {
					if (temp.getNext().getNext() == null) {
						last = temp;
					}
					temp.setNext(temp.getNext().getNext());
					return true;
				}
				temp = temp.getNext();
			}
			return false;			
		}
	}
	
}
