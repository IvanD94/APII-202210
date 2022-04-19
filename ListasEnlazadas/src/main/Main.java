package main;

import model.DoubleList;
import model.LinkList;
import model.SingleList;

public class Main {

	public static void main(String[] args) {
		DoubleList list = new DoubleList();
		System.out.println(list.search(0) + "\n");
		System.out.println(list.delete(0) + "\n");
		System.out.println(list + "\n");
		list.add(3);
		System.out.println(list.search(0));
		System.out.println(list.search(3) + "\n");
		System.out.println(list.delete(0));
		System.out.println(list.delete(3) + "\n");
		System.out.println(list + "\n");
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list.search(0));
		System.out.println(list.search(5) + "\n");
		System.out.println(list.delete(0));
		System.out.println(list.delete(5));
		System.out.println(list.delete(6) + "\n");
		System.out.println(list + "\n");
		list.add(7);
		list.add(8);
		System.out.println(list + "\n");
		
		System.out.println("End");
	}

	public void createGenList() {
		LinkList<Integer> list = new LinkList<Integer>();
	}
	
}
