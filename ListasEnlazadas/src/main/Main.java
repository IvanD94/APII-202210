package main;

import model.SingleList;

public class Main {

	public static void main(String[] args) {
		SingleList list = new SingleList();
		System.out.println(list.toStIterr() + "\n");
		list.addRecur(3);
		System.out.println(list.toStIterr() + "\n");
		list.addRecur(4);
		list.addRecur(5);
		list.addRecur(6);
		System.out.println(list.toStIterr() + "\n");
		System.out.println("End");
	}
	
}
