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
	
	//[3, 4, 5, 6] 
	@Override
	public String toString() {
		String ans = value + "";
		
		if (next != null) {
			ans += ", " + next;
		}
		
		return ans;
	}
		

}
