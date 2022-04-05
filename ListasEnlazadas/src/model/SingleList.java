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
}
