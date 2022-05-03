package main;

import java.util.Iterator;

import model.BasicRunnable;
import model.BasicThread;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		Thread[] hilos = new BasicThread[10];
		Thread[] hilos2 = new Thread[10];
		
		for (int i = 0; i < hilos.length; i++) {
			hilos[i] = new BasicThread(i);
			hilos[i].setPriority(i+1);
			hilos[i].start();
			
			hilos2[i] = new Thread(new BasicRunnable(i));
			hilos2[i].start();
		}
		
		System.out.println("END");
		
		//System.exit(0);
		
	}

}
