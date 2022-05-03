package main;

import model.Tree;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(5);
		tree.insert(3);
		tree.insert(7);
		tree.insert(2);
		tree.insert(1);
		tree.insert(4);
		tree.insert(6);
		tree.insert(9);
		tree.insert(8);
		tree.insert(0.3);
		System.out.println(tree.delete(10));
		System.out.println(tree.delete(4));
		System.out.println(tree.delete(2));
		System.out.println(tree.delete(7));
		System.out.println(tree.delete(5));
		System.out.println(tree.delete(0.1+0.1+0.1));
		
		
		System.out.println("Size: " + tree.size());
		System.out.println("Leafts: " + tree.countLeafts());
		
		System.out.println(tree.inOrder());
		System.out.println("END");
	}
	
}
