package main;

import model.Tree;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(1);
		tree.insert(3);
		tree.insert(5);
		tree.insert(8);
		tree.insert(11);
		System.out.println("Leafts: " + tree.countLeafts());

		tree.insert(2);
		tree.insert(2.5);
		
		System.out.println("Size: " + tree.size());
		System.out.println("Leafts: " + tree.countLeafts());
		System.out.println("END");
	}
	
}
