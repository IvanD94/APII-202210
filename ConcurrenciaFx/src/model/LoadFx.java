package model;

import java.io.IOException;

import application.SampleController;

public class LoadFx extends Thread {
	
	private SampleController mainThread;
	
	public LoadFx(SampleController mainThread) {
		this.mainThread = mainThread;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Load");
			Thread.sleep(5000);
			mainThread.ul.loadUsers();
			System.out.println("End");
			mainThread.loadEnded();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
