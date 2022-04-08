package main;

import model.LinkList;
import model.SingleList;

public class Main {

	public static void main(String[] args) {
		SingleList list = new SingleList();
		System.out.println(list.delete(0));
		System.out.println(list.toStIterr() + "\n");
		list.addRecur(3);
		System.out.println(list.delete(0));
		System.out.println(list.delete(3));
		System.out.println(list.toStIterr() + "\n");
		list.addRecur(4);
		list.addRecur(5);
		list.addRecur(6);
		System.out.println(list.delete(0));
		System.out.println(list.delete(5));
		System.out.println(list.delete(6));
		System.out.println(list.toStIterr() + "\n");
		list.addIter(7);
		System.out.println(list.toStIterr() + "\n");
		
		System.out.println("End");
	}

	public void createGenList() {
		LinkList<Integer> list = new LinkList<Integer>();
	}
	
}
