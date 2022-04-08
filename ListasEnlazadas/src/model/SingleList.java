package model;

public class SingleList {
	
	private NodeSingleList first;
	
	public SingleList() {
		// TODO Auto-generated constructor stub
	}
	
	public void addIter(int value) {
		NodeSingleList newNode = new NodeSingleList(value);
		if(first == null) {
			first = newNode;
		} else {
			NodeSingleList temp = first;
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
	}

	public void addRecur(int value) {
		if (first == null) {
			first = new NodeSingleList(value);
		} else {
			first.addNext(value);
		}
	}
	
	public String toStIterr() {
		if (first == null) {
			return "[]";
		}
		
		String ans = "[";
		NodeSingleList temp = first;
		while (temp != null) {
			ans += temp.getValue() + ", ";
			temp = temp.getNext();
		}
		return ans.substring(0, ans.length()-2) + "]";
		
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
			first = first.getNext();
			return true;
		} else {
			return first.deleteNode(item);
		}
	}
	
	public boolean deleteIter(int item) {
		if (first == null) {
			return false;
		} else if (first.getValue() == item) {
			first = first.getNext();
			return true;
		} else {
			NodeSingleList temp = first;
			while (temp.getNext() != null) {
				if (temp.getNext().getValue() == item) {
					temp.setNext(temp.getNext().getNext());
					return true;
				}
				temp = temp.getNext();
			}
			return false;			
		}
	}
	
}
