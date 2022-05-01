package model;

import java.time.LocalTime;

public class BasicRunnable implements Runnable {
	
	private int id;
	public BasicRunnable(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		LocalTime start = LocalTime.now();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Desde el runnable " + id + " " + start);
		
	}
	
	

}
